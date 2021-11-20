package Primitives;

public class CharPractice {

    public static void main(String[] args) {

        char ch1 = 'A';//you have to single '' and single character     value==>Data,storage
        System.out.println(ch1);
        System.out.println("A");//its string because ""
        System.out.println('A');//

        ch1 = '5';//re-assignment-->from ASCII table '5'is decimal of 53
        System.out.println(ch1);
        System.out.println(ch1 * 2);
        char ch2 = ch1;
        System.out.println(ch2);

        char ch3='&';
        System.out.println(ch3);

        char ch4 =79;//this going to work because ASCII TABLE
        System.out.println(ch4);

        char ch5=80;
        System.out.println(ch5);//you can not assign more than one character in single quotation mark

        int numberChar ='T';//its going to ascii as a simbol 9
        System.out.println(numberChar);

        char randomChar=2345;
        System.out.println(randomChar);





    }
}