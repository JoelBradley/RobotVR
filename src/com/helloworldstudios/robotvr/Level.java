package com.helloworldstudios.robotvr;



import java.io.IOException;
import java.nio.FloatBuffer;

import android.opengl.GLES20;
import android.opengl.Matrix;

public class Level {

	byte[] tiles;
	private MainActivity main;
	int width =10, height =10;
	//private Model model;
	FloatBuffer[] vbos;
	int vboVertexHandle,vboNormalHandle;
	int cubeTexture = 0;
	public Level(MainActivity m){
		this.main =m;
		cubeTexture = MainActivity.loadTexture(m, R.raw.wall);
//		m.loadTextures();
//		try {
//			model = OBJLoader.loadModel(main.getResource(R.raw.bunny));
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		vbos = OBJLoader.createVBO(model);
        
		this.tiles = new byte[width*height];
		
		this.loadLevelFromFile(R.raw.arena);
	}
	public void loadLevelFromFile(int path){
		String data = main.readRawTextFile(path);
		
		int x=-1;
		int y=0;

		String[] split = data.split("@");
		String[] header  = split[0].split(",");
		this.width = Integer.parseInt(header[0])+2;
		this.height = Integer.parseInt(header[1])+2;
		this.tiles = new byte[width*height];
		for(int i =0;i<split[1].length();i++){
			if (split[1].charAt(i) ==';'){
				x=-1;
				y+=1;
				continue;
			}
			try{
			if(split[1].charAt(i)=='3'){
				tiles[x+(y*width)] =3;
			}else{
				tiles[x+(y*width)] =0;
			}
			}catch(Exception e){
				
			}
			x+=1;
		}
	}
	public void render(float[] mvp){
		// Set the active texture unit to texture unit 0.
        GLES20.glActiveTexture(GLES20.GL_TEXTURE0);
        
        // Bind the texture to this unit.
        GLES20.glBindTexture(GLES20.GL_TEXTURE_2D, cubeTexture);
        
        // Tell the texture uniform sampler to use this texture in the shader by binding to texture unit 0.
        GLES20.glUniform1i(main.mTextureUniformHandle, 0);   
		Matrix.setIdentityM(main.mModelCube, 0);
		for(int x=0;x<width;x++){
			for (int y=0;y<height;y++){
				if(tiles[x+(y*width)]==0)continue;
		        GLES20.glUniform1f(main.mIsFloorParam, 0f);
		        GLES20.glUniformMatrix4fv(main.mModelParam, 1, false, main.mModelCube, 0);
		        
		        
		        GLES20.glVertexAttribPointer(main.mPositionParam, main.COORDS_PER_VERTEX, GLES20.GL_FLOAT,
		                false, 0, main.mCubeVertices);
		        GLES20.glEnableVertexAttribArray(main.mPositionParam); 
		        
		        Matrix.translateM(main.mModelViewProjection, 0, -x, -0.2f, -y);
		        GLES20.glUniformMatrix4fv(main.mModelViewProjectionParam, 1, false, main.mModelViewProjection, 0);
		        Matrix.translateM(main.mModelViewProjection, 0, x, 0.2f, y);
		        
		        GLES20.glVertexAttribPointer(main.mNormalParam, 3, GLES20.GL_FLOAT,
		                false, 0, main.mCubeNormals);
		       GLES20.glEnableVertexAttribArray(main.mNormalParam);
		       GLES20.glVertexAttribPointer(main.mColorParam, 4, GLES20.GL_FLOAT, false,
		                    0, main.mCubeColors);
		       GLES20.glEnableVertexAttribArray(main.mColorParam);
		         
//		       GLES20.glVertexAttribPointer(main.mTextureCoordinateHandle, 2, GLES20.GL_FLOAT, false, 
//		        		0, cubeTexture);
//		        GLES20.glEnableVertexAttribArray(main.mTextureCoordinateHandle);
		         
		       GLES20.glDrawArrays(GLES20.GL_TRIANGLES, 0, 36);
			}
			
			}
		renderFloor(mvp);
		
//		GLES20.glUniform1f(main.mIsFloorParam, 0f);
//        GLES20.glUniformMatrix4fv(main.mModelParam, 1, false, main.mModelLevel, 0);
//        
//        
//        GLES20.glVertexAttribPointer(main.mPositionParam, main.COORDS_PER_VERTEX, GLES20.GL_FLOAT,
//                false, 0, vbos[0]);
//        Matrix.translateM(main.mModelViewProjection, 0, -16, 0, -16);
//        GLES20.glUniformMatrix4fv(main.mModelViewProjectionParam, 1, false, main.mModelViewProjection, 0);
//        Matrix.translateM(main.mModelViewProjection, 0, 16, 0, 16);
//        
//        GLES20.glVertexAttribPointer(main.mNormalParam, 3, GLES20.GL_FLOAT,
//                false, 0, vbos[1]);
//         
//       GLES20.glVertexAttribPointer(main.mColorParam, 4, GLES20.GL_FLOAT, false,
//                    0, vbos[2]);
//       
//         
//         
//       //GLES20.glDrawArrays(GLES20.GL_TRIANGLES, 0, 36);
//       GLES20.glDrawArrays(GLES20.GL_TRIANGLES, 0, model.getFaces().size()*3);
	 
	}
	private void renderFloor(float[] mvp) {
		// TODO Auto-generated method stub
		
	}
}
