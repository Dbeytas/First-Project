package Primitives;

public class UnaryPractice{

    public static void main(String[] args) {

        int studentNumber = 25;
        System.out.println(studentNumber++);//using post increment//show the studentNumber first (25) and increasing for me next time
       // System.out.println(studentNumber);//shows 26 and it is still 26
        studentNumber++;
        System.out.println(studentNumber);

        int count = 5;
        System.out.println(count++);//post increment ,++ made it 6
        System.out.println(++count);//I am increasing one more time ++,it is going to be 7
        //==============================
        int number = 8;
        System.out.println(number--);//shows 8 it is 7
        System.out.println(number--);//shows 7 it is 6
        System.out.println(--number);//shows 5 it is 5

        number++;//6
        System.out.println( number++ + number++);//6+7 = 13//shows 13 number is 8
        System.out.println(number);//8

        int result = --number + --number + 2 -number++ * 2;//7+6+2-6 *2= 3
        System.out.println(result);//result is 3
        System.out.println();//number is 7

        int a = ++number;//
        System.out.println(a);
        System.out.println(number);









    }
}
