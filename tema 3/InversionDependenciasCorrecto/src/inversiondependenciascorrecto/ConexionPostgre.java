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
public class ConexionPostgre implements IConexion {
    
    public void conectarse()
    {
        System.out.println("se conecto a la base de datos POSTGRESQL");
    }
            
    
}
