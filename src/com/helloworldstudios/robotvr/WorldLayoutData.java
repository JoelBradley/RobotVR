package com.helloworldstudios.robotvr;

/**
 * Created by cjr on 6/18/14.
 */
public final class WorldLayoutData {

    public static final float[] CUBE_COORDS = new float[] {
            // Front face
            0.0f, 1.0f, 1.0f,
            0.0f, 0.0f, 1.0f,
            1.0f, 1.0f, 1.0f,
            0.0f, 0.0f, 1.0f,
            1.0f, 0.0f, 1.0f,
            1.0f, 1.0f, 1.0f,

            // Right face
            1.0f, 1.0f, 1.0f,
            1.0f, 0.0f, 1.0f,
            1.0f, 1.0f, 0.0f,
            1.0f, 0.0f, 1.0f,
            1.0f, 0.0f, 0.0f,
            1.0f, 1.0f, 0.0f,

            // Back face
            1.0f, 1.0f, 0.0f,
            1.0f, 0.0f, 0.0f,
            0.0f, 1.0f, 0.0f,
            1.0f, 0.0f, 0.0f,
            0.0f, 0.0f, 0.0f,
            0.0f, 1.0f, 0.0f,

            // Left face
            0.0f, 1.0f, 0.0f,
            0.0f, 0.0f, 0.0f,
            0.0f, 1.0f, 1.0f,
            0.0f, 0.0f, 0.0f,
            0.0f, 0.0f, 1.0f,
            0.0f, 1.0f, 1.0f,

            // Top face
            0.0f, 1.0f, 0.0f,
            0.0f, 1.0f, 1.0f,
            1.0f, 1.0f, 0.0f,
            0.0f, 1.0f, 1.0f,
            1.0f, 1.0f, 1.0f,
            1.0f, 1.0f, 0.0f,

            // Bottom face
            1.0f, 0.0f, 0.0f,
            1.0f, 0.0f, 1.0f,
            0.0f, 0.0f, 0.0f,
            1.0f, 0.0f, 1.0f,
            0.0f, 0.0f, 1.0f,
            0.0f, 0.0f, 0.0f,
    };
    public static final float[] CUBE_TEXCOORDS =
		{												
				// Front face
				0.0f, 0.0f, 				
				0.0f, 1.0f,
				1.0f, 0.0f,
				0.0f, 1.0f,
				1.0f, 1.0f,
				1.0f, 0.0f,				
				
				// Right face 
				0.0f, 0.0f, 				
				0.0f, 1.0f,
				1.0f, 0.0f,
				0.0f, 1.0f,
				1.0f, 1.0f,
				1.0f, 0.0f,	
				
				// Back face 
				0.0f, 0.0f, 				
				0.0f, 1.0f,
				1.0f, 0.0f,
				0.0f, 1.0f,
				1.0f, 1.0f,
				1.0f, 0.0f,	
				
				// Left face 
				0.0f, 0.0f, 				
				0.0f, 1.0f,
				1.0f, 0.0f,
				0.0f, 1.0f,
				1.0f, 1.0f,
				1.0f, 0.0f,	
				
				// Top face 
				0.0f, 0.0f, 				
				0.0f, 1.0f,
				1.0f, 0.0f,
				0.0f, 1.0f,
				1.0f, 1.0f,
				1.0f, 0.0f,	
				
				// Bottom face 
				0.0f, 0.0f, 				
				0.0f, 1.0f,
				1.0f, 0.0f,
				0.0f, 1.0f,
				1.0f, 1.0f,
				1.0f, 0.0f
		};
    public static final float[] CUBE_COLORS = new float[] {
            // front, green
    		0.8f, 0.4f, 0.1f, 1.0f,
    		0.8f, 0.4f, 0.1f, 1.0f,
    		0.8f, 0.4f, 0.1f, 1.0f,
    		0.8f, 0.4f, 0.1f, 1.0f,
    		0.8f, 0.4f, 0.1f, 1.0f,
    		0.8f, 0.4f, 0.1f, 1.0f,
    	

    		0.8f, 0.5f, 0.1f, 1.0f,
    		0.8f, 0.5f, 0.1f, 1.0f,
    		0.8f, 0.5f, 0.1f, 1.0f,
    		0.8f, 0.5f, 0.1f, 1.0f,
    		0.8f, 0.5f, 0.1f, 1.0f,
    		0.8f, 0.5f, 0.1f, 1.0f,

    		0.7f, 0.4f, 0.1f, 1.0f,
    		0.7f, 0.4f, 0.1f, 1.0f,
    		0.7f, 0.4f, 0.1f, 1.0f,
    		0.7f, 0.4f, 0.1f, 1.0f,
    		0.7f, 0.4f, 0.1f, 1.0f,
    		0.7f, 0.4f, 0.1f, 1.0f,

    		0.8f, 0.4f, 0.1f, 1.0f,
    		0.8f, 0.4f, 0.1f, 1.0f,
    		0.8f, 0.4f, 0.1f, 1.0f,
    		0.8f, 0.4f, 0.1f, 1.0f,
    		0.8f, 0.4f, 0.1f, 1.0f,
    		0.8f, 0.4f, 0.1f, 1.0f,

    		0.8f, 0.4f, 0.15f, 1.0f,
    		0.8f, 0.4f, 0.15f, 1.0f,
    		0.8f, 0.4f, 0.15f, 1.0f,
    		0.8f, 0.4f, 0.15f, 1.0f,
    		0.8f, 0.4f, 0.15f, 1.0f,
    		0.8f, 0.4f, 0.15f, 1.0f,

    		0.7f, 0.4f, 0.1f, 1.0f,
    		0.7f, 0.4f, 0.1f, 1.0f,
    		0.7f, 0.4f, 0.1f, 1.0f,
    		0.7f, 0.4f, 0.1f, 1.0f,
    		0.7f, 0.4f, 0.1f, 1.0f,
    		0.7f, 0.4f, 0.1f, 1.0f,
    };

    public static final float[] CUBE_FOUND_COLORS = new float[] {
            // front, yellow
            1.0f,  0.6523f, 0.0f, 1.0f,
            1.0f,  0.6523f, 0.0f, 1.0f,
            1.0f,  0.6523f, 0.0f, 1.0f,
            1.0f,  0.6523f, 0.0f, 1.0f,
            1.0f,  0.6523f, 0.0f, 1.0f,
            1.0f,  0.6523f, 0.0f, 1.0f,

            // right, yellow
            1.0f,  0.6523f, 0.0f, 1.0f,
            1.0f,  0.6523f, 0.0f, 1.0f,
            1.0f,  0.6523f, 0.0f, 1.0f,
            1.0f,  0.6523f, 0.0f, 1.0f,
            1.0f,  0.6523f, 0.0f, 1.0f,
            1.0f,  0.6523f, 0.0f, 1.0f,

            // back, yellow
            1.0f,  0.6523f, 0.0f, 1.0f,
            1.0f,  0.6523f, 0.0f, 1.0f,
            1.0f,  0.6523f, 0.0f, 1.0f,
            1.0f,  0.6523f, 0.0f, 1.0f,
            1.0f,  0.6523f, 0.0f, 1.0f,
            1.0f,  0.6523f, 0.0f, 1.0f,

            // left, yellow
            1.0f,  0.6523f, 0.0f, 1.0f,
            1.0f,  0.6523f, 0.0f, 1.0f,
            1.0f,  0.6523f, 0.0f, 1.0f,
            1.0f,  0.6523f, 0.0f, 1.0f,
            1.0f,  0.6523f, 0.0f, 1.0f,
            1.0f,  0.6523f, 0.0f, 1.0f,

            // top, yellow
            1.0f,  0.6523f, 0.0f, 1.0f,
            1.0f,  0.6523f, 0.0f, 1.0f,
            1.0f,  0.6523f, 0.0f, 1.0f,
            1.0f,  0.6523f, 0.0f, 1.0f,
            1.0f,  0.6523f, 0.0f, 1.0f,
            1.0f,  0.6523f, 0.0f, 1.0f,

            // bottom, yellow
            1.0f,  0.6523f, 0.0f, 1.0f,
            1.0f,  0.6523f, 0.0f, 1.0f,
            1.0f,  0.6523f, 0.0f, 1.0f,
            1.0f,  0.6523f, 0.0f, 1.0f,
            1.0f,  0.6523f, 0.0f, 1.0f,
            1.0f,  0.6523f, 0.0f, 1.0f,
    };

    public static final float[] CUBE_NORMALS = new float[] {
            // Front face
            0.0f, 0.0f, 1.0f,
            0.0f, 0.0f, 1.0f,
            0.0f, 0.0f, 1.0f,
            0.0f, 0.0f, 1.0f,
            0.0f, 0.0f, 1.0f,
            0.0f, 0.0f, 1.0f,

            // Right face
            1.0f, 0.0f, 0.0f,
            1.0f, 0.0f, 0.0f,
            1.0f, 0.0f, 0.0f,
            1.0f, 0.0f, 0.0f,
            1.0f, 0.0f, 0.0f,
            1.0f, 0.0f, 0.0f,

            // Back face
            0.0f, 0.0f, -1.0f,
            0.0f, 0.0f, -1.0f,
            0.0f, 0.0f, -1.0f,
            0.0f, 0.0f, -1.0f,
            0.0f, 0.0f, -1.0f,
            0.0f, 0.0f, -1.0f,

            // Left face
            -1.0f, 0.0f, 0.0f,
            -1.0f, 0.0f, 0.0f,
            -1.0f, 0.0f, 0.0f,
            -1.0f, 0.0f, 0.0f,
            -1.0f, 0.0f, 0.0f,
            -1.0f, 0.0f, 0.0f,

            // Top face
            0.0f, 1.0f, 0.0f,
            0.0f, 1.0f, 0.0f,
            0.0f, 1.0f, 0.0f,
            0.0f, 1.0f, 0.0f,
            0.0f, 1.0f, 0.0f,
            0.0f, 1.0f, 0.0f,

            // Bottom face
            0.0f, -1.0f, 0.0f,
            0.0f, -1.0f, 0.0f,
            0.0f, -1.0f, 0.0f,
            0.0f, -1.0f, 0.0f,
            0.0f, -1.0f, 0.0f,
            0.0f, -1.0f, 0.0f
    };

    public static final float[] FLOOR_COORDS = new float[] {
            200f, 0, -200f,
            -200f, 0, -200f,
            -200f, 0, 200f,
            200f, 0, -200f,
            -200f, 0, 200f,
            200f, 0, 200f,
    };

    public static final float[] FLOOR_NORMALS = new float[] {
            0.0f, 1.0f, 0.0f,
            0.0f, 1.0f, 0.0f,
            0.0f, 1.0f, 0.0f,
            0.0f, 1.0f, 0.0f,
            0.0f, 1.0f, 0.0f,
            0.0f, 1.0f, 0.0f,
    };

    public static final float[] FLOOR_COLORS = new float[] {
            0.2f, 1f, 0.1f, 1.0f,
            0.2f, 1f, 0.1f, 1.0f,
            0.2f, 1f, 0.1f, 1.0f,
            0.2f, 1f, 0.1f, 1.0f,
            0.2f, 1f, 0.1f, 1.0f,
            0.2f, 1f, 0.1f, 1.0f,
    };

}
