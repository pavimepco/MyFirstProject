package com.chainsys.books;

import java.util.HashSet;
import java.util.Scanner;

public class TestBook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		HashSet<Book>bookSet=new HashSet<Book>();
		Book b1=new Book();
		Book b2=new Book();
		
		b1.bookid=10;
		b1.bookname="Java";
        b1.price=500;
        
        b2.bookid=11;
		b2.bookname="C++";
        b2.price=200;
        
        bookSet.add(b1);
        bookSet.add(b2);
        System.out.println("Enter the bookname");
        int amt=scanner.nextInt();
        
        for(Book temp:bookSet)
        {
         if(temp.price<=amt){
           System.out.println(temp.bookid);
           System.out.println(temp.bookname);
           System.out.println(temp.price);
         }
          else
            System.out.println("Invalid");
         }
        	 
        }
	}


