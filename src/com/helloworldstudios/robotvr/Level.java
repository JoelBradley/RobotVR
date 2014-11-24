package com.helloworldstudios.robotvr;

import android.opengl.GLES20;
import android.opengl.Matrix;

public class Level {

	byte[] tiles;
	private MainActivity main;
	int width =10, height =10;
	public Level(MainActivity m){
		this.main =m;
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
		for(int x=0;x<width;x++){
			for (int y=0;y<height;y++){
				if(tiles[x+(y*width)]==0)continue;
		        GLES20.glUniform1f(main.mIsFloorParam, 0f);
		        GLES20.glUniformMatrix4fv(main.mModelParam, 1, false, main.mModelCube, 0);
		        GLES20.glUniformMatrix4fv(main.mModelViewParam, 1, false,main. mModelView, 0);
		        GLES20.glVertexAttribPointer(main.mPositionParam, main.COORDS_PER_VERTEX, GLES20.GL_FLOAT,
		                false, 0, main.mCubeVertices);
		        Matrix.translateM(main.mModelViewProjection, 0, x, -5, y);
		        GLES20.glUniformMatrix4fv(main.mModelViewProjectionParam, 1, false, main.mModelViewProjection, 0);
		        Matrix.translateM(main.mModelViewProjection, 0, -x, 5, -y);
		        GLES20.glVertexAttribPointer(main.mNormalParam, 3, GLES20.GL_FLOAT,
		                false, 0, main.mCubeNormals);
		         GLES20.glVertexAttribPointer(main.mColorParam, 4, GLES20.GL_FLOAT, false,
		                    0, main.mCubeColors);
		       
		        GLES20.glDrawArrays(GLES20.GL_TRIANGLES, 0, 36);
			}
			}
	}
}
