package com.chainsys.collections;

import java.util.ArrayList;
import java.util.Iterator;

public class TestArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ArrayList<String> list=new ArrayList<>();
        int size=list.size();
        System.out.println(size);
        list.add("Pavi");
        list.add("Anbu");        
        System.out.println(list.get(0));
        System.out.println(list.size());
        
        System.out.println("using for each");
        for(String t:list){
        	System.out.println(t); 	
        }
        
        System.out.println("using for");
        for(int i=0;i<list.size();i++)
        {
        	System.out.println(list.get(i));
        }
        
        System.out.println("using iterator");
        Iterator<String> it=list.iterator();
        while(it.hasNext())
        {
        	System.out.println(it.next());
        }
        
        
	}

}
