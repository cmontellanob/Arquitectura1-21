/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sustitucionliskov;

/**
 *
 * @author Carlos
 */
public class SustitucionLiskov {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Vehiculo v=new Vehiculo(Color.Rojo,"ECT-1422",TipoVehiculo.Auto);
        System.out.println(v.getDatos());
        
        Toyota t=new Toyota(Color.Rojo,"ECT-1422",TipoVehiculo.Auto);
        //t.setModelo("MX-2000");
        System.out.println(t.getDatos());
        
    }
    
}
