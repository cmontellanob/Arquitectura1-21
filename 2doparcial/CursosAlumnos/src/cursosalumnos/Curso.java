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
public class Curso implements ICurso {
    private ArrayList<Alumno> lista =new ArrayList<Alumno>() ;
    
    public void addAlumno(Alumno alumno)
    {
        lista.add(alumno);
    }
    public void removeAlumno(String cu)
    {
        for (Alumno a :lista)
        {
            if (a.getCu().equals(cu))
            {
                lista.remove(a);
            }
        }
       
    }
    public void listarAlumnos()
    {
    for (Alumno a :lista)
        {
         System.out.println(a);
        }
    }
}
