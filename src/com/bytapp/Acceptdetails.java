package com.bytapp;
import java.io.*;
import java.util.Scanner;

public class Acceptdetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try
		{
			FileOutputStream fs = new FileOutputStream("bugfile");
			Scanner myObj1 = new Scanner(System.in);  
		    System.out.println("Enter developername");

		    String developername = myObj1.nextLine();
		    
		    Scanner myObj2 = new Scanner(System.in);  
		    System.out.println("Enter bugno");

		    String bugno = myObj1.nextLine();
		    
		    Scanner myObj3 = new Scanner(System.in);  
		    System.out.println("Enter bugdescription");

		    String bugdescription = myObj1.nextLine();
		    
		     
		    
		    
		    
		    byte[] bt=developername.getBytes();
		    byte[] bt1= bugno.getBytes();
		    byte[] bt2=bugdescription.getBytes();
		    
		    fs.write(bt);
		    fs.write(bt1);
		    fs.write(bt2);
		    
		   
		 
		    fs.flush();
		    fs.close();
		    
		   
		}
		
		catch(IOException ex)
		{
			System.out.println("IO error"+ex);
		}

	}

}
