//Program to find multiple occurance of the given word in a String using Matcher methods
package com.stackroute.pe4;

import java.util.Collection;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CountWordOccurance {
    Scanner scan;
    public static void main(String args[])
    {
        CountWordOccurance count=new CountWordOccurance();
        count.getCount();
    }
    public void getCount()
    {
        scan=new Scanner(System.in);
        System.out.println("Enter a string input");
        String input=scan.nextLine();//Reads a string
        System.out.println("Enter a word to be searched");
        String findString=scan.nextLine();//Reads the string whose index is to be found
        int count=0;
        Pattern pattern=Pattern.compile(findString,Pattern.CASE_INSENSITIVE);
        Matcher matcher=pattern.matcher(input);

        while(matcher.find())
        {
            count++;
            System.out.println("Found " +count+ " : " +matcher.start()+"-"+matcher.end());
        }

    }
}
