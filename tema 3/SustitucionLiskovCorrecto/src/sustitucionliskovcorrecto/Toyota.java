/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sustitucionliskovcorrecto;

/**
 *
 * @author Carlos
 */
public class Toyota extends Vehiculo {
    
    private String modelo;

    public Toyota(Color color, String placa, TipoVehiculo tipovehiculo) {
        super(color, placa, tipovehiculo);
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    
    int precioPrecio() {
        return 250000;
    }
    
 
     public String getDatosToyota()
    {
        return "Marca: Toyota \n Color:"+this.getColor()+"\n Tipo Vehiculo:"+this.getTipovehiculo()+"\n Placa:"+this.getPlaca()+"\n Modelo:"+this.modelo;
    }
    
    
 
    
}
