package Primitives;

public class RemainderPractice2 {
    public static void main(String[] args) {
        //find the product of digits from given number
        //436 ==>4 * 5 * 6=120 sout("The product is =" + <product>)
        int myNumber =456;
        int digit3 = myNumber % 10;
        myNumber =myNumber /10;
        int digit2 = myNumber % 10;
        myNumber = myNumber/10;
        int digit1 =myNumber % 10;
        myNumber = myNumber/10;
        System.out.println(digit1);
        System.out.println(digit2);
        System.out.println(digit3);
        double multiple =digit1 * digit2* digit3;
        System.out.println("The product is = " + multiple);
        System.out.println("The product is = "+ (digit1*digit2*digit3));





    }
}
