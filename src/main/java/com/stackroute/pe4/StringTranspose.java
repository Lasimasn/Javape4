//Program to transpose a given string
package com.stackroute.pe4;

import java.util.*;

public class StringTranspose {
    Scanner scan;
    public static void main (String args[])
    {
        StringTranspose stringTranspose=new StringTranspose();
        stringTranspose.input();
    }
    public void input()
    {
        scan=new Scanner(System.in);
        String text;
        System.out.println("Enter a String");
        text=scan.nextLine();//Reads string from console
        List<String> listname=new ArrayList<String>();
        listname= Arrays.asList(text.split(" "));//Split the string into words on encountering a space.
        for(int i=0;i<listname.size();i++)
        System.out.print(transpose(listname.get(i))+" ");//Transpose the string

    }
    public String  transpose(String s)//Reverse string method
    {
        int len=s.length();
        String reverse="";
        for(int i=len-1;i>=0;i--)
            reverse=reverse+s.charAt(i);
        return reverse;

    }
}
