/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package builder;

/**
 *
 * @author Carlos
 */
public class Builder {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SandwichMaker preparadorMiSandwich = new SandwichMaker(new MiSandwichBuilder());
        preparadorMiSandwich.BuildSandwich();
        Sandwich sandwich1 = preparadorMiSandwich.getSandwhich();
        sandwich1.Mostrar();;
        
        SandwichMaker preparadorClubSandwich = new SandwichMaker(new ClubSandwichBuilder());
        preparadorClubSandwich.BuildSandwich();
        Sandwich sandwich2 = preparadorClubSandwich.getSandwhich();
        sandwich2.Mostrar();;

        SandwichMaker preparadorSuperSandwich = new SandwichMaker(new SuperSandwichBuilder());
        preparadorSuperSandwich.BuildSandwich();
        Sandwich sandwich3 = preparadorSuperSandwich.getSandwhich();

        sandwich3.Mostrar();
    }
    
}
