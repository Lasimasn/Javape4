//Program to replace all occurance of a given character in a word with another character
package com.stackroute.pe4;

import java.util.Scanner;

public class CharacterReplace {
    Scanner scan;
    public static void main(String args[])
    {
        CharacterReplace replace=new CharacterReplace();
        replace.replaceChar();
    }
    public void replaceChar()
    {
        scan=new Scanner(System.in);
        System.out.println("Enter a string");//Input string
        String word=scan.nextLine();
        System.out.println("Enter the characters to be replaced");
        char char1=scan.nextLine().charAt(0);
        char char2=scan.nextLine().charAt(0);//Characters to be replaced
        System.out.println("Enter the characters to be replaced with");
        char char3=scan.nextLine().charAt(0);
        char char4=scan.nextLine().charAt(0);//Characters to be replaced with
        System.out.println("Original String:"+word);
        System.out.print("String after replacing:");
        System.out.println(word.replace(char1,char3).replace(char2,char4));
    }
}
