/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inversiondependenciascorrecto;

/**
 *
 * @author Carlos
 */
public class VehiculoDB {
    IConexion conn;
    Vehiculo vehiculo;

    public VehiculoDB(IConexion conn, Vehiculo vehiculo) {
        this.conn = conn;
        this.vehiculo = vehiculo;
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
