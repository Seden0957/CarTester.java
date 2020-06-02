/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cartester.java;

import static cartester.java.Car.askAffordability;
/**
 *
 * @author Sebastian Dennie
 */
public class CarTesterJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Car car1 = new Car("Ultima", "Nissan");
        Car car2 = new Car("Sequoiya", "Toyota");
        Car car3 = new Car();

        //Print the details of each car
        System.out.println(car1.toString());
        System.out.println("--------------------------");

        System.out.println(car2.toString());
        System.out.println("--------------------------");

        //toString is called by default, no need to write it!
        System.out.println(car3);
        System.out.println("--------------------------");

        askAffordability(); 
        //feels like something has been done wrong
    }
    
}
