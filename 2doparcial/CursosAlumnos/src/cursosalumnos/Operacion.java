/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cursosalumnos;

/**
 *
 * @author Carlos
 */
public class Operacion {
    Accion accion;
    long fechahora; 

    public Operacion(Accion accion) {
        this.accion = accion;
        this.fechahora = System.currentTimeMillis();;
    }

    @Override
    public String toString() {
        return "Operacion{" + "accion=" + accion + ", fechahora=" + fechahora + '}';
    }
    
}
