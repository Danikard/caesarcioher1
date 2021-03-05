package com.company;
import java.util.Scanner;
import static com.company.encrypt.encrypt;
import static com.company.decrypt.decrypt;

public class Main {

    public static void main(String[] args) {

        System.out.println("welcome to encrypt & decrypt");
        Scanner cipher= new Scanner(System.in);
        System.out.println("enter Text : ");
        String message=cipher.nextLine();

        Scanner key =new Scanner(System.in);
        System.out.println("enter Key: ");
        Integer n = key.nextInt();


        String encryptText=encrypt(message,n);
        String decryptText=decrypt(message, n);
        System.out.println(encryptText);
        System.out.println(decryptText);
    }
}
