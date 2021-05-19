/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package composite;

/**
 *
 * @author Carlos
 */
public class ProductoSimple extends ProductoAbstracto {
    
    protected String marca;

    public ProductoSimple(String nombre, double precio,String marca) {
        super(nombre, precio);
        this.marca=marca;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }



 
}
