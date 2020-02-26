package com.gillotroux;

import java.util.ArrayList;

import org.junit.Test;



public class TestRobot{
	
	@Test
	public void test(){
		ArrayList<Robot> robots=new ArrayList<Robot>();
		robots.add(new RobotType1(5,1));
		robots.add(new RobotType2(5,1));
		
		for(int i=0;i<robots.size();i++){
			robots.get(i).avance();
		}
		for(int i=0;i<robots.size();i++){
			System.out.println("Position du Robot type"+(i+1)+" : "+robots.get(i).getPosition());
		}
		
	}

}