package com.gillotroux;

public class Robot {
	private int position;
	private int direction;
	
	public Robot(int position,int direction){
		this.position=position;
		this.direction=direction;
	}
	
	private void avance(){}
	public int getPosition(){
		return this.position;
	}
	
}
