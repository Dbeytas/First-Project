package Primitives;

public class CastingPractice2 {
    public static void main(String[] args) {
        //we are not the number,we are playing with the data type
        double number = 3.45;
        float fl1 =(float) number;
        long l1 =(long) fl1;
        int i1 =(int) l1;
        short sh1 = (short) i1;
        byte by1 = (byte) sh1;
        System.out.println(by1);
        System.out.println(Byte.MAX_VALUE);
        System.out.println(Byte.MIN_VALUE);
        System.out.println(Short.MAX_VALUE);
        System.out.println(Short.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);

        int count = 129;
        System.out.println("count is in int type "+ count);//129;
        byte count2 =(byte) count;
        System.out.println("count is in byte type " +count2);//127
        //This is more than capasity of the byte because of the memory size




        }
    }

