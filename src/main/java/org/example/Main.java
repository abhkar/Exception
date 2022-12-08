package org.example;

public class Main {
    public static void main(String[] args) {
        int a=5;
        int b=0;
       // try-catch block
        try{
            System.out.println(a/b);
        }catch(ArithmeticException e){
            //e.printStackTrace();
            System.out.println("This is an arithmetic exception !!");
        }
    }
}