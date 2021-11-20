package Primitives;

public class RemainderPractice1 {
    public static void main(String[] args) {
        //modulus--> %-->remainder (left over after division)

        int number1 = 45;
        int number2 = 6;
        int remainder1 = number1  % number2;
        System.out.println("Remainder1 is >> "+ remainder1);
        //Find the sum of digits from given number//i need the separate this digits and then find the sum of this digits
        //123 -->1+2+3=6==>sout (sum is  >> <sum>)//we are going to modulus operator
        //12 % 10 =>2
        //123 % 10=>3
        int myNumber = 123;
        int digit3 = myNumber %10;//I will use the modulus to take the last number (3)
        myNumber= myNumber/10;//I am going to update my number dividing by ten(12)
        int digit2 = myNumber%10;//I Will usu modulus to take the last number(2)
        myNumber = myNumber /10;//I am going to update my number dividing by ten
        int digit1 = myNumber % 10;
        System.out.println(digit1);
        System.out.println(digit2);
        System.out.println(digit3);

        double sum = digit1 +digit2 +digit3;
        System.out.println("The sum is =" + sum);


         {

        }








    }
}
