/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abiertocerrado;

/**
 *
 * @author Carlos
 */
public class AbiertoCerrado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        Vehiculo[] arrayVehiculo = {new Vehiculo(Color.Rojo, "1125-EFR", "Toyota", TipoVehiculo.Auto),
        new Vehiculo(Color.Azul, "3125-AFD", "Nissan", TipoVehiculo.Camioneta),
        new Vehiculo(Color.Rojo, "212-PAU", "Volswaguen", TipoVehiculo.Vagoneta),
        new Vehiculo(Color.Rojo, "1138-TIP", "Fiat", TipoVehiculo.Vagoneta)};
        
        imprimirPrecioPromedio(arrayVehiculo);
        
    }
    public static void imprimirPrecioPromedio(Vehiculo[] arrayVehiculo)
    {
        for (Vehiculo vehiculo :arrayVehiculo)
        {
            if (vehiculo.getMarca().equals("Toyota")) 
                System.out.println("25000");
            if (vehiculo.getMarca().equals("Nissan")) 
                System.out.println("15000");
            if (vehiculo.getMarca().equals("Volswaguen")) 
                System.out.println("5000");
            if (vehiculo.getMarca().equals("Fiat")) 
                System.out.println("3000");
            
        }
    }
    
}
