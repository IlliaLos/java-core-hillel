package org.example.lesson3;

public class DataTypes {

    public static void main(String[] args) {
        // Integers
        byte a = 8;
        System.out.println("Byte is: " + a);
        short b = 99;
        System.out.println("Short is: " + b);
        int c = 2124354;
        System.out.println("Integer is: " + c);
        long d = 99999999999L;
        System.out.println("Long is: " + d);

        // Real numbers
        float floatNumber = 3;
        System.out.println("Float is: " + floatNumber);
        float floatNumberTwo = 3f;
        System.out.println("Float is: " + floatNumberTwo);
        double doubleNumber = 456.123d;
        System.out.println("Double is: " + doubleNumber);

        //Char
        char theLetterA = 'a';
        System.out.println("Char is: " + theLetterA);
        char theLetterAcode = 97;
        System.out.println("Chat is: " + theLetterAcode);
        char theLetterAsUnicode = '\u0061';
        System.out.println("Chat is: " + theLetterAsUnicode);

        //Boolean
        boolean isTrue = true;
        boolean isFalse = false;

        // Overflow
        System.out.println("***** Overflow *****");
        int maxInt = Integer.MAX_VALUE;
        System.out.println(maxInt);
        int j = maxInt + 1;
        System.out.println(maxInt + " + 1 = " + j);

        System.out.println("****");
        int newInteger = 10;
        System.out.println(newInteger);

        int myInt = Integer.MAX_VALUE;
        byte myByte = (byte) myInt;
        System.out.println("MyByte: " + myByte);


        int first = 11;
        double second = 2;
        System.out.println("result: " + first / second);

        // Relational oprators
        boolean boolResultCheck = 5 == 3;
        System.out.println(boolResultCheck);
        boolean notEqual = 5 != 3;
        System.out.println(notEqual);
        boolean isGreater = 5 > 3;
        System.out.println(isGreater);

        System.out.println("*******");
        System.out.println((5 > 3) && (1 > 5));
        System.out.println((1 > 3) || (1 > 5));
        System.out.println(!(5 == 5));

        // Unary operators
        int aa = 12;
        int bb = 12;

        System.out.println("Value of a:" + aa);
        int aResult = ++aa;
        System.out.println("After increment:" + aResult);

        System.out.println("Value of b:" + bb);
        int bResult = --bb;
        System.out.println("After increment:" + bResult);


        String str = "anything";
        boolean result;

        result = str instanceof String;
        System.out.println(result);

        int februaryDays = 28;
        String februaryResult;

        februaryResult = (februaryDays == 28) ? "Not a leap year" : "Leap year";
        System.out.println(februaryResult);
    }
}
