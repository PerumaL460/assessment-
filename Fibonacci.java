package com.zohogame;

public class Fibonacci {

    public static void main(String[] args) {
        int number=10;
        int a=0;
        int b=1;
        System.out.println(a);
        for(int i=0;i<number;i++){
            int temp=0;
            temp=a;
            a=b;
            b=temp;
            a=a+b;
            System.out.println(a);
        }
    }
}


