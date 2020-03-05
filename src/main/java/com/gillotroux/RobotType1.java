/**
 * Package de Gillot-Roux
 */
package com.gillotroux;

public class RobotType1 extends Robot {
    public RobotType1(int position, int direction) {
        super(position, direction);
    }

    public void avance() {
        super.position = super.position + (direction * 10);
    }

}