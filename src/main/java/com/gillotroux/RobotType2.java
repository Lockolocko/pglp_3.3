package com.gillotroux;

public class RobotType2 extends Robot{
	public RobotType2(int position,int direction){
		super(position,direction);
	}
	
	private void avance(){
		super.position=super.position+(direction*5);
	}
	
}