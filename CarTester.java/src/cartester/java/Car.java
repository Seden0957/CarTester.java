/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cartester.java;

/**
 *
 * @author Sebastian Dennie
 */
public class Car {
    //variables for characteristics

    private String carName, carBrand;
    private int year, price,kilometersTravelled, numberOfSeats;


    //constructors
    public Car() {
        carName = "Unknown Vehicle";
        carBrand = "Unknown Brand/Make";
        year = 0;
        price = 0;
    }

    public Car(String crName, String crBrand, int y, int prce, int numSeats, int kiloTrav) {
       carName = crName;
       carBrand = crBrand;
       year = y;
       price = prce;
       numberOfSeats = numSeats;
       kilometersTravelled = kiloTrav;
    }

    //Alternate constructor
    public Car(String crName, String crBrand) {
        //This constructor only uses the name and brand
        //Set the year, seats, kilometres travelled and price to random #s
        int priceLow = 10000;
        int priceHigh = 100000;
        int yearLow = 1970;
        int yearHigh = 2020;
        int seatHigh = 7;
        int seatLow = 2;
        int kiloTravHigh = 50000;
        carName = crName;
        carBrand = crBrand;
        price = (int) (Math.random() * (priceHigh - priceLow)) + priceLow;
        year = (int) (Math.random() * (yearHigh - yearLow)) + yearLow;
        numberOfSeats = (int)(Math.random() *(seatHigh - seatLow)) + seatLow;
        kilometersTravelled = (int)(Math.random() *(kiloTravHigh));
    }
       /**
     * This method allows the user to set the year of the car
     * pre: needs an year value
     * post: sets the year value
     */
    public int getYear(){
        return year;
    }
    /**
     * This method allows the user to set the aggression of the dog
     * pre: needs an year value
     * post: sets the year value
     */
    public void setYear(int yr){
        year = yr;
     }
    
    public static void askAffordability(){
      System.out.println("Can you afford it?");
    }

    //method to display all info of the Dog
    public String toString() {
        String output = "Name: " + carName + "\n";
        output += "Brand: " + carBrand + "\n";
        output += "Year: " + year + "\n";
        output += "Price: " + price + "\n";
        output += "Number of Seats: " + numberOfSeats + "\n";
        output += "Kilometres Travelled: " + kilometersTravelled + "\n";
        //output string is complete, return it
        return output;    
}
}