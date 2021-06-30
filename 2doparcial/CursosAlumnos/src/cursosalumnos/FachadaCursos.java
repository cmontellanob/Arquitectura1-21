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
public class FachadaCursos {

    private ProxyCurso proxycurso;

    public FachadaCursos(Curso curso) {
        proxycurso = new ProxyCurso(curso);
    }

    public void addAlumno(Alumno alumno) {
        proxycurso.addAlumno(alumno);
    }

    public void removeAlumno(String cu) {
        proxycurso.removeAlumno(cu);

    }

    public void listarAlumnos() {
        proxycurso.listarAlumnos();
    }
    public void mostrarAcciones() {
        proxycurso.mostrarAcciones();
    }

}
