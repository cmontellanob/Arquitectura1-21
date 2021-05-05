/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singleton;

/**
 *
 * @author Carlos
 */
public class Singleton {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        SingleObject a =SingleObject.getInstance();
        a.setMensage("este es el valor del mensaje");
        System.out.println(a.getMensage());
        
        SingleObject b =SingleObject.getInstance();
        System.out.println(b.getMensage());
        
    }
    
}
