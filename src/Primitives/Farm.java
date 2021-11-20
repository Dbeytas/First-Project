package Primitives;

public class Farm {
    public static void main(String[] args) {
        /*
        in a farm ,there are 12 cows and 23 chickens
        1- find the total legs of the animals in the farm and print out
        2-if each cow cost $2345 and each chicken cost $23.99
        find the total worth of these animals and print out
         */
        int cow = 12;
        int chicken= 23;
        int totalLegs = (12*4)+(23*2);
        System.out.println("Total legs of the animals =" +totalLegs);

        int cowCost =2345;
        double chickenCost = 23.99d;
        double totalWorth =(2345*12)+(23.99*23);
        System.out.println("Total worth of animals = " +totalWorth);






    }
}
