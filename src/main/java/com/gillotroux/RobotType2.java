/**
 * Package de Gillot-Roux
 */
package com.gillotroux;
/**
 * Classe RobotType2.
 * @author Lockolocko
 *
 */
public class RobotType2 extends Robot {
    /**
     * Constante.
     */
    private final int cinq = 5;
    /**
     * Constructeur.
     * @param position2
     * @param direction2
     */
    public RobotType2(final int position2, final int direction2) {
        super(position2, direction2);
    }
/**
 * Avance.
 */
    public void avance() {
        super.setPos(super.getPos() + (super.getDir() * cinq));
    }
}
