package com.chainsys.collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class ToFindBooks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the book names separated with commas");
		String books=scanner.next();
		String[]bookSplit=books.split(",");
		
		System.out.println("Enter the starting letter of book to be searched");
		String searchBookChar=scanner.next();
		
		HashSet<String>bookSet=new HashSet<String>();
		for(String book:bookSplit){
			bookSet.add(book);
		}
		System.out.println("Book set contains:");
		//for(String book:bookSet)
		//{
			System.out.println(bookSet);
		//}
			System.out.println("Books are:");
		
	    Iterator<String>it=bookSet.iterator();
		while(it.hasNext())
		{
			String book=it.next();
			if(book.startsWith(searchBookChar)){
				System.out.println(book);
			}
		}
		scanner.close();
	}	
}	

	/*	HashSet<String>books=new HashSet<String>();
		books.add("CoreJava");
		books.add("MySQL");
		books.add("C");
		books.add("C++");
		for(String book:books)
		{
			System.out.println(book);
		}
		Iterator<String> it=books.iterator();
        while(it.hasNext())
        {
        	System.out.println(it.next());
        }
        String input="R";
        if(books.contains(input))
        {
        	System.out.println("Found");
        }
        else{
        	System.out.println("Not Found");
        }*/
		