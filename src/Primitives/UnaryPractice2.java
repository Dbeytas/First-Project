package Primitives;

public class UnaryPractice2 {
    public static void main(String[] args) {

        int a = 7;
        int b = 4;

        int result = --a +--b + a++ * 2 -b++ * a --;
                   // 6 + 3 + 6 * 2 - 3 * 7==>0
        System.out.println(result);
        System.out.println(a);
        System.out.println(b);

        //each donut is $2
        //Print out how much the customer will pay today for each case
        //DD-->buy 12 donuts, next time you get $1  off
        //or
        //KK -->buy 12 donuts you get $1 off now

        int donutNumber = 12;
        int eachDonut = 2;
        int total = donutNumber * eachDonut;
        System.out.println(total);//DD
        System.out.println("DD -> "+total--);//KK
        System.out.println("KK -> "+--total); //DD









    }
}
