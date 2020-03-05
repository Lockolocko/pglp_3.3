/**
 * Package de Gillot-Roux
 */
package com.gillotroux;
/**
 * Classe RobotStatique.
 * @author Lockolocko
 *
 */
public class RobotStatique {
    /**
     * Position.
     */
    @SuppressWarnings("unused")
    private int position;
    /**
     * Direction.
     */
    @SuppressWarnings("unused")
    private int direction;
/**
 * Constructeur.
 * @param position2
 * @param direction2
 */
    public RobotStatique(final int position2, final int direction2) {
        this.position = position2;
        this.direction = direction2;
    }
    @SuppressWarnings("unused")
    private void avance() {
        throw new UnsupportedOperationException();
    }

}
