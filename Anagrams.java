package com.zohogame;

import java.util.Arrays;
import java.util.Scanner;

public class Anagrams {
    static boolean isAnagrams(String str1, String str2) {

        char[] w1 = str1.replaceAll("[/s]", "").toCharArray();
        char[] w2 = str2.replaceAll("[/s]", "").toCharArray();
        Arrays.sort(w1);
        Arrays.sort(w2);
        return Arrays.equals(w1, w2);
    }

    public static void main(String[] args) {
        String str1,str2;
        boolean check;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first String :");
        str1= scanner.nextLine();
        System.out.println("enter the second string :");
        str2=scanner.nextLine();
        check=isAnagrams(str1,str2);
        if(check == true){
            System.out.println(" "+str1+" "+str2 +" "+ "are anagrams");
        }
        else {
            System.out.println(""+str1+" "+str2 +" "+ "are  not anagrams");
        }
    }

}
