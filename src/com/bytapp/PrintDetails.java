package com.bytapp;
import java.io.*;

public class PrintDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileInputStream fin=new FileInputStream("buginfo.dat");
			byte[] bt=new byte[20];
			byte[] bt1=new byte[20];
			byte[]  bt2=new byte[20];
			fin.read(bt);
			fin.read(bt1);
			fin.read(bt2);
			
			String str = new String(bt);
			System.out.println(str);
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}

	}

}
