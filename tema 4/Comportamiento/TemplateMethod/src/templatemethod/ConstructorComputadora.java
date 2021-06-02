/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package templatemethod;

/**
 *
 * @author Carlos
 */
public abstract class ConstructorComputadora {

    public Computadora ConstruirComputadora() {
        addTarjeta();
        setupTarjetaMadre();
        addProcesador();
        return new Computadora();
    }

    public abstract void addTarjeta();

    public abstract void setupTarjetaMadre();

    public abstract void addProcesador();

}
