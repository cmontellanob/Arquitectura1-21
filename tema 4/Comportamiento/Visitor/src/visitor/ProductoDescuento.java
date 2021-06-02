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
public class ProductoDescuento implements IVisitable {
    private double precio;

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public double aceptar(IVisitor visitor) {
        return visitor.visitar(this);
    }
    
   
}
