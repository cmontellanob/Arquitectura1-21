package ordenacion;

import static java.lang.Math.random;
import java.util.Random;

public class Contexto {

    private int[] arreglo = new int[1000];

    private IEstrategiaOrdenacion estrategia;

    public void setEstrategia(IEstrategiaOrdenacion estrategia) {
        this.estrategia = estrategia;
    }

    public void llenar() {
        Random random = new Random();

        for (int i = 0; i < 1000; i++) {
            arreglo[i] = random.nextInt(1000 + 1);

        }
    }

    public void mostrar() {
        for (int i = 0; i < 1000; i++) {
            System.out.print(arreglo[i]+" ");

        }
    }

    public void ejecutar() {
        arreglo = this.estrategia.ordernar(arreglo);
    }

}
