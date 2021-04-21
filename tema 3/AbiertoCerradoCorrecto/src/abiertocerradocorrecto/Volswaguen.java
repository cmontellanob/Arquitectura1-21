/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abiertocerradocorrecto;

/**
 *
 * @author Carlos
 */
public class Volswaguen extends Vehiculo {

    public Volswaguen(Color color, String placa, TipoVehiculo tipovehiculo) {
        super(color, placa, tipovehiculo);
    }



    @Override
    int preciopromedio() {
        return 5000;
    }
    
 
    
}
