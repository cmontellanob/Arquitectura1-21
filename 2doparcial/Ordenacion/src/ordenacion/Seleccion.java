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
public class Seleccion implements IEstrategiaOrdenacion {

    @Override
    public int[] ordernar(int[] arreglo) {

      for (int i = 0; i < arreglo.length - 1; i++) {
        for (int j = i + 1; j < arreglo.length; j++) {
            if (arreglo[i] > arreglo[j]) {
                // ...intercambiarlos, es decir, mover el actual a la derecha y el de la derecha al actual
                int temporal = arreglo[i];
                arreglo[i] = arreglo[j];
                arreglo[j] = temporal;
            }
        }
    }
      return arreglo;
    }
    
}
