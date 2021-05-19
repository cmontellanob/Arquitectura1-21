/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flyweight;

/**
 *
 * @author Carlos
 */
public class Flyweight {

    /**
     *  private static final String colors[] = {"Red", "Orange", "Blue", "Yellow", "Pink"};
*/
     private static final String colors[] = {"Red", "Orange", "Blue", "Yellow", "Pink"};

    public static void main(String[] args) {

        for (int i = 0; i < 200; ++i) {
            AngryBird angrybird = (AngryBird) BirdFactory.getAngryBird(getRandomColor());

            angrybird.draw();
        }
    }

    private static String getRandomColor() {
        return colors[(int) (Math.random() * colors.length)];
    }
    
}
