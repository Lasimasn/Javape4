//Program that implements Regular Expression to find the presence of the name Harry in a String
package com.stackroute.pe4;

import java.util.Scanner;
import java.util.regex.Pattern;

public class PresenceOfName {
    Scanner scan;
    public static void main(String args[])
    {
        PresenceOfName name=new PresenceOfName();
        name.findName();
    }
    public void findName()
    {
        scan= new Scanner(System.in);
        System.out.println("Enter a String");
        String text=scan.nextLine();//Reads string from console
        System.out.printf("Is Harry Here?");
        //if(Pattern.compile("Harry").matcher(text).find())
        boolean result=text.matches("(?s).*\\bHarry\\b.*");//regex to see if Harry is present in the string
        //boolean result=text.matches("Harry.*");
        if(result)
            System.out.println("True");
        else
            System.out.println("False");
    }
}
