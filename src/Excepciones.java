/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hp
 */
public class Excepciones extends Exception {

    /**
     * Creates a new instance of <code>Excepciones</code> without detail
     * message.
     */
    public Excepciones() {
    }

    /**
     * Constructs an instance of <code>Excepciones</code> with the specified
     * detail message.
     *
     * @param msg the detail message.
     */
    public Excepciones(String msg) {
        super(msg);
    }
}
