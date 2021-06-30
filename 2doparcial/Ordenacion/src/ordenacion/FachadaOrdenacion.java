/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ordenacion;

/**
 *
 * @author Carlos
 */
public class FachadaOrdenacion {

    private Contexto contexto=new Contexto();

    public void llenar() {
        contexto.llenar();
    }

    public void ordenar(String metodo) {
        switch (metodo) {
            case "Burbuja":
                contexto.setEstrategia(new Burbuja());
                break;
            case "QuickSort":
                contexto.setEstrategia(new QuickSort());
                break;
            case "Seleccion":
                contexto.setEstrategia(new Seleccion());
                break;
        }
        long startTime = System.currentTimeMillis();

        contexto.ejecutar();
        long endTime = System.currentTimeMillis() - startTime;
        
        System.out.println("Tiempo de Ejecucion: " + endTime + " Milisegundos");


    }

    public void mostrar() {
        contexto.mostrar();
    }

}
