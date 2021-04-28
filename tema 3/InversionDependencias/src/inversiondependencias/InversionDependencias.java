/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inversiondependencias;

/**
 *
 * @author Carlos
 */
public class InversionDependencias {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Vehiculo v=new Vehiculo(Color.Rojo,"ECT-1422","Toyota",TipoVehiculo.Auto);
       VehiculoDB vdb=new VehiculoDB(v); 
       vdb.guardarDB();
    }
    
}
