package Primitives;

public class BooleaPractice {

    public static void main(String[] args) {

        boolean isHungry=true;
        System.out.println(isHungry);

        int number=11;
        System.out.println(number);//

        boolean isLightOn= false;
        System.out.println(isHungry);
        System.out.println(true);
        System.out.println(isHungry==isLightOn);

        isLightOn=isHungry;
        isLightOn=false;
        System.out.println("Last version for ishungry>>"+isHungry);//true
        System.out.println("Last version for is Light>>"+isLightOn);//false



    }
}
