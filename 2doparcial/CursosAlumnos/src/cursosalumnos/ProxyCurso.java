/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cursosalumnos;

import java.util.ArrayList;

/**
 *
 * @author Carlos
 */
public class ProxyCurso implements ICurso {
    ArrayList<Operacion> operaciones;
    Curso curso;    

    public ProxyCurso(Curso curso) {
        this.curso = curso;
        operaciones=new ArrayList<Operacion>();
    }
    
    
    @Override
    public void addAlumno(Alumno alumno) {
        curso.addAlumno(alumno);
        operaciones.add(new Operacion(Accion.insertar));
    }

    @Override
    public void removeAlumno(String cu) {
       curso.removeAlumno(cu);
       operaciones.add(new Operacion(Accion.eliminar));
    }

    @Override
    public void listarAlumnos() {
       curso.listarAlumnos();
       operaciones.add(new Operacion(Accion.mostrar));
    }
    
    public void mostrarAcciones()
    {
        for(Operacion o:operaciones)
        {
            System.out.println(o);
        }
    }
    
}
