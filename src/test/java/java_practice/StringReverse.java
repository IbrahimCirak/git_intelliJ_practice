package java_practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class StringReverse {

    public static void main(String[] args){

//        Scanner scan = new Scanner(System.in);
//        System.out.println("Enter a string");
//        String str = scan.nextLine();
//
//        String reverse= "";
//        for (int i= str.length()-1; i>=0;i--){
//            reverse=reverse + str.charAt(i);
//        }
//        System.out.println(reverse);

//        System.out.println(reverse("hello 123"));
//
//        String str = "hello world 1 2 3";
//        String[] str1= str.split(" ");
//        for(int i= str1.length-1; i>=0;i--){
//            System.out.print(str1[i]+" ");
//        }
        System.out.println(wordReverse("hello world how are you?"));
    }

    public static String reverse(String str){
        String reverse="";

        for(int i= str.length()-1;i>=0;i--){
            reverse= reverse + str.charAt(i);
        }

        return reverse;

    }

    public static String wordReverse(String str){

        String[] str1= str.split(" ");
        String temp="";
        for(int i= str1.length-1; i>=0; i--) {
            temp = temp + str1[i] +" ";
        }
        return temp;
    }
//clean up



}

