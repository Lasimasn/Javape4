//Program to count the number of occurance of a given character in a string without using loop
package com.stackroute.pe4;
import java.util.Scanner;

public class CountOccuranceOfCharacter {
    Scanner scan;
    public static void main(String args[])
    {
        CountOccuranceOfCharacter countOccurance=new CountOccuranceOfCharacter();
        countOccurance.input();
    }
    public void input()
    {
        scan=new Scanner(System.in);
        System.out.println("Enter a String");
        String string=scan.nextLine();//Reads string from console
        int length= string.length();
        char character;
        System.out.println("Enter a character to be counted");
        character=scan.next().charAt(0);//Read a charcter to be counted

        int index=0,count=0;
        System.out.print("Number of occurance of character:");
        System.out.println(countChar(string,character,length,index,count));//Function to count occurance of the input character
    }
    private static int countChar(String string,char character,int length,int index,int count)
    {
        if(index<length)
        {
            if (character == string.charAt(index)) {
                count++;
            }
            index++;
            count=countChar(string,character,length,index,count);
        }
        return count;

    }
}
