package com.chainsys.collections;

import java.util.TreeSet;

public class TestHashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<String> books=new TreeSet<>();
        books.add("Oracle");    //It will allow only unique values
        books.add("Java");             
        books.add("Oracle");
        books.add("Oracle");
        books.add("Java");
        books.add("Null");
//        books.add(null); //cannot insert null values in tree set
        for(String book:books)
        {
        	System.out.println(book);
        }
	}
}
