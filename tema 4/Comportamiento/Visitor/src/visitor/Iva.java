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
public class Iva implements IVisitor{
    double impuestonormal=.13;
    double impuestoreducido=.10;
    
    

    @Override
    public double visitar(ProductoNormal normal) {
       return normal.getPrecio()*impuestonormal;
       
    }

    @Override
    public double visitar(ProductoDescuento reducido) {
        return reducido.getPrecio()*impuestoreducido;
    }
    
}
