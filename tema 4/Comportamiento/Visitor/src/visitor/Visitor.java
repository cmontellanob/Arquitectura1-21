/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visitor;

/**
 *
 * @author Carlos
 */
public class Visitor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ProductoNormal producto1=new ProductoNormal();
        producto1.setPrecio(100);
        ProductoDescuento producto2=new ProductoDescuento();
        producto2.setPrecio(100);
        Iva iva=new Iva();
        double resultado1=producto1.aceptar(iva);
        double resultado2=producto2.aceptar(iva);
        
        System.out.println(resultado1);
        System.out.println(resultado2);
        
        
        
        
    }
    
}
