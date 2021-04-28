/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package segregacioninterfaz;

/**
 *
 * @author Carlos
 */
public class SegregacionInterfaz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Loro l1=new Loro("Pico verde");
        l1.comer();
        l1.volar();
        Pinguino p=new Pinguino(1);
        p.comer();
        p.nadar();
    }
    
}
