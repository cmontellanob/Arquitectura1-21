/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cursosalumnos;

import java.util.Scanner;

/**
 *
 * @author Carlos
 */
public class CursosAlumnos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner sc = new Scanner(System.in);
        // TODO code application logic here
        int op = 0;
        FachadaCursos fc=new FachadaCursos(new Curso());
        while (op != 5) {
            System.out.println("1.- Añadir alumno");
            System.out.println("2.- Eliminar alumno");
            System.out.println("3.- Mostrar Alumnos");
            System.out.println("4.- Mostrar lista de acciones realizadas");
            System.out.println("5.- Salir");
            System.out.println("Elegir opción");
            op = sc.nextInt();
            switch (op) {
                case 1:
                    fc.addAlumno(new Alumno("111-52","654654","Juan","Perez"));
                    break;
                case 2:

                    System.out.println("introduzca CU dealumno a eliminar");
                    String cu = sc.next();

                    fc.removeAlumno(cu);
                    break;
                case 3:
                    fc.listarAlumnos();
                    break;
                case 4:
                    fc.mostrarAcciones();
                    break;    

            }

        }
    }
    
}
