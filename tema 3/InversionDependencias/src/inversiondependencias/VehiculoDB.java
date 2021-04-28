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
public class VehiculoDB {
    ConexionMYSQL conn;
    Vehiculo vehiculo;

    public VehiculoDB(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
        conn=new ConexionMYSQL();
    }
    
    public void guardarDB()
    {
        conn.conectarse();
       String sql="INSERT INTO Vehiculo (color,placa,tipovehiculo) values ";
       ///comandos para conectarme ala BD
       System.out.println("se inserto con éxito");
    }
    public void eliminarDB(Vehiculo vehiculo)
    {
        //
    }
}
