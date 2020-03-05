/**
 * Package de Gillot-Roux
 */
package com.gillotroux;
/**
 * Classe RobotType1.
 * @author Lockolocko
 *
 */
public class RobotType1 extends Robot {
    /**
     * Constante.
     */
    private final int dix = 10;
    /**
     * Constructeur.
     * @param position2
     * @param direction2
     */
    public RobotType1(final int position2, final int direction2) {
        super(position2, direction2);
    }
/**
 * Avance.
 */
    public void avance() {
        super.setPos(super.getPos() + (super.getDir() * dix));
    }
}
