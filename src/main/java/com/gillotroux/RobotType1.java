package com.gillotroux;

public class RobotType1 extends Robot{
	public RobotType1(int position,int direction){
		super(position,direction);
	}
	
	private void avance(){
		super.position=super.position+(direction*5);
	}
	
}