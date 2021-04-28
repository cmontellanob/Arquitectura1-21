/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sustitucionliskovcorrecto;

/**
 *
 * @author Carlos
 */
public class Volswaguen extends Vehiculo {

    public Volswaguen(Color color, String placa, TipoVehiculo tipovehiculo) {
        super(color, placa, tipovehiculo);
    }



    int precioPromedio() {
        return 5000;
    }
    
    int precioMinimo() {
        return 3000;
    }
 
    
}
