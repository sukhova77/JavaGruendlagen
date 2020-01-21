package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int a = 2;
        int b = 3;

        int c = a + b;
        System.out.println("1summa: " + c);

        a++;
        b = a++;
        b = a;
        a = a +1;
        System.out.println("2a: " + a);
        System.out.println("2B: " + b);

        ++a;
        b = ++a;

        b= a+1;
        System.out.println("3A summa: " + a);
        System.out.println("3B summa: " + b);

        byte bytik = 127;

        bytik = bytik++;
        System.out.println("bytik: " + bytik);

    }
}
