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
public class Alumno {
    private String cu;
    private String ci;
    private String apellidos;
    private String nombres;

    public Alumno(String cu, String ci, String apellidos, String nombres) {
        this.cu = cu;
        this.ci = ci;
        this.apellidos = apellidos;
        this.nombres = nombres;
    }

    public String getCu() {
        return cu;
    }

    public void setCu(String cu) {
        this.cu = cu;
    }

    public String getCi() {
        return ci;
    }

    public void setCi(String ci) {
        this.ci = ci;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    @Override
    public String toString() {
        return "Alumno{" + "cu=" + cu + ", ci=" + ci + ", apellidos=" + apellidos + ", nombres=" + nombres + '}';
    }
    
}
