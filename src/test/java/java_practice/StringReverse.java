package java_practice;

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

        System.out.println(reverse("hello 123"));



    }

    public static String reverse(String str){
        String reverse="";

        for(int i= str.length()-1;i>=0;i--){
            reverse= reverse + str.charAt(i);
        }

        return reverse;

    }
}

