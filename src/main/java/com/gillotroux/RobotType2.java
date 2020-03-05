/**
 * Package de Gillot-Roux
 */
package com.gillotroux;

public class RobotType2 extends Robot {
    public RobotType2(int position, int direction) {
        super(position, direction);
    }

    public void avance() {
        super.position = super.position + (direction * 5);
    }

}