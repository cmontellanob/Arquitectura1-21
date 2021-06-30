/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ordenacion;

import java.util.Scanner;

/**
 *
 * @author Carlos
 */
public class Ordenacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // TODO code application logic here
        int op = 0;
        FachadaOrdenacion fc=new FachadaOrdenacion();
        while (op != 4) {
            System.out.println("1.- llenar arreglo");
            System.out.println("2.- ordenar");
            System.out.println("3.- Mostrar");
            System.out.println("4.- Salir");

            System.out.println("Elegir opción");
            op = sc.nextInt();
            switch (op) {
                case 1:
                    fc.llenar();
                    break;
                case 2:
                    System.out.println("1.- Burbuja");
                    System.out.println("2.- Quick Sort");
                    System.out.println("3.- Seleccion");
                    int opmetodo = 0;
                    String metodo="Burbuja";
                    opmetodo=sc.nextInt();
                    switch (opmetodo){
                        case 1:
                            metodo="Burbuja";
                            break;
                        case 2:
                            metodo="QuickSort";
                            break;
                        case 3:
                            metodo="Seleccion";
                            break;    
                    }
                    fc.ordenar(metodo);
                    break;
                case 3:
                    fc.mostrar();
                    break;

            }

        }

    }

}
