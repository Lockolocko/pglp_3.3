/**
 * Package de Gillot-Roux
 */
package com.gillotroux;
/**
 * Classe Robot.
 * @author Lockolocko
 *
 */
public class Robot {
    /**
     * Position.
     */
    private int position;
    /**
     * Direction.
     */
    private int direction;
/**
 * Constructeur.
 * @param position2
 * @param direction2
 */
    public Robot(final int position2, final int direction2) {
        this.position = position2;
        this.direction = direction2;
    }
/**
 * Avance.
 */
    public void avance() {
    }
    /**
     * Ascesseur position.
     * @return position
     */
    public int getPos() {
        return this.position;
    }
    /**
     * Set position.
     * @param position2
     */
    public void setPos(final int position2) {
        this.position = position2;
    }
    /**
     * Ascesseur direction.
     * @return direction
     */
    public int getDir() {
        return this.direction;
    }
/**
 * Donne position.
 * @return position
 */
    public int getPosition() {
        return this.position;
    }
}
