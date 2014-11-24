package com.helloworldstudios.robotvr.util;

public class Camera {

	public Vector2f pos;
	public Camera(){
		this.pos = new Vector2f(0f,0f);
	}
	
	public void tick(){
		
	}

	public void changeView(float dx, float dy) {
		this.pos.x+=dx;
		this.pos.y+=dy;
		
	}
}
