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
		for(int x=0;x<width;x++){
			for (int y=0;y<height;y++){
				tiles[x+(y*width)] =(byte) (x%2);
			}
		}
	}
	public void render(float[] mvp){
		// This is not the floor!
		for(int x=0;x<width;x++){
			for (int y=0;y<height;y++){
				if(tiles[x+(y*width)]==0)continue;
		        GLES20.glUniform1f(main.mIsFloorParam, 0f);
		
		        // Set the Model in the shader, used to calculate lighting
		        GLES20.glUniformMatrix4fv(main.mModelParam, 1, false, main.mModelCube, 0);
		
		        // Set the ModelView in the shader, used to calculate lighting
		        GLES20.glUniformMatrix4fv(main.mModelViewParam, 1, false,main. mModelView, 0);
		
		        // Set the position of the cube
		        GLES20.glVertexAttribPointer(main.mPositionParam, main.COORDS_PER_VERTEX, GLES20.GL_FLOAT,
		                false, 0, main.mCubeVertices);
		
		        // Set the ModelViewProjection matrix in the shader.
		        Matrix.translateM(main.mModelViewProjection, 0, x, y, 0);
		        GLES20.glUniformMatrix4fv(main.mModelViewProjectionParam, 1, false, main.mModelViewProjection, 0);
		        Matrix.translateM(main.mModelViewProjection, 0, -x, -y, 0);
		        // Set the normal positions of the cube, again for shading
		        GLES20.glVertexAttribPointer(main.mNormalParam, 3, GLES20.GL_FLOAT,
		                false, 0, main.mCubeNormals);
		
		
		
		      
		         GLES20.glVertexAttribPointer(main.mColorParam, 4, GLES20.GL_FLOAT, false,
		                    0, main.mCubeColors);
		       
		        GLES20.glDrawArrays(GLES20.GL_TRIANGLES, 0, 36);
			}
			}
	}
}
