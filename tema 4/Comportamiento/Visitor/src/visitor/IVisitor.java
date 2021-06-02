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
public interface IVisitor {
    public double visitar (ProductoNormal normal);
    public double visitar (ProductoDescuento reducido);
    
    
}
