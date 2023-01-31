package Class15;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Dog {
    String name;//instance variables
    String breed;// instance variables
    String color;//instance variable
    static int noOfLegs=4;//static variable
    void printFood(){
        System.out.println(name);
        String food="Meat";//local
        System.out.println(food);
    }
    void printColor(){
      //  System.out.println(food);error
        System.out.println(name);
    }
    }

