package com.gillotroux;

public class RobotStatique{
	private int position;
	private int direction;
	
	
	public RobotStatique(int position,int direction){
		this.position=position;
		this.direction=direction;
	}
	
	@SuppressWarnings("unused")
	private void avance(){throw new UnsupportedOperationException();}
	
}