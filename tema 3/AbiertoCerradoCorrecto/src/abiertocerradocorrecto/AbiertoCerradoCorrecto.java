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
public class AbiertoCerradoCorrecto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
             Vehiculo[] arrayVehiculo = {new Toyota(Color.Rojo, "1125-EFR",  TipoVehiculo.Auto),
        new Nissan(Color.Azul, "3125-AFD",  TipoVehiculo.Camioneta),
        new Volswaguen(Color.Rojo, "212-PAU",  TipoVehiculo.Vagoneta),
        new Fiat(Color.Plomo, "1138-TIP",  TipoVehiculo.Auto)
             };
        
        imprimirPrecioPromedio(arrayVehiculo);
   
    }
     public static void imprimirPrecioPromedio(Vehiculo[] arrayVehiculo)
    {
        for (Vehiculo vehiculo :arrayVehiculo)
        {
         System.out.println(vehiculo.preciopromedio());   
                        
        }
    }
    
}
