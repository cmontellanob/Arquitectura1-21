/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facade;

/**
 *
 * @author Carlos
 */
public class Facade {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ObtenerFacade cliente1 = new ObtenerFacade();
        cliente1.buscar("02/07/2021", "08/07/2021", "Sucre", "Santa Cruz");

        ObtenerFacade cliente2 = new ObtenerFacade();
        cliente2.buscar("02/07/2021", "08/07/2021", "Sucre", "La Paz");
    }

}
