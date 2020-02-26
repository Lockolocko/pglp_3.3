package com.gillotroux;

public class Robot {
	protected int position;
	protected int direction;
	
	public Robot(int position,int direction){
		this.position=position;
		this.direction=direction;
	}
	
	public void avance(){}
	public int getPosition(){
		return this.position;
	}
	
}
