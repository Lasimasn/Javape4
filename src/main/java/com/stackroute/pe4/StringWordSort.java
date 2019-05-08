//Program to setup a String variable containing a paragraph and extract words from it and sort them into alphabetical order
package com.stackroute.pe4;

import java.lang.reflect.Array;
import java.util.*;

public class StringWordSort {
    Scanner scan;
    public static void main(String args[])
    {
        StringWordSort sort=new StringWordSort();
        sort.stringSort();
    }
    public void stringSort()
    {

        scan=new Scanner(System.in);
        String text;
        System.out.println("Enter the paragraph");
        text=scan.nextLine();//Input string from console
        text=text.replaceAll("\\."," ");//Removes fullstop from the paragraph
        List<String> listname=new ArrayList<String>();
        listname= Arrays.asList(text.split(" "));//Splits the string into a list
            Collections.sort(listname);//Sorts the string
        String liststring=String.join(" ",listname);//Converts list back to string
        System.out.println(liststring);


    }
}
