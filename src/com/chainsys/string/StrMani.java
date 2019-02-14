package com.chainsys.string;
public class StrMani {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String[] students={"Sid","Ishu","Mahe"};        
        String s="Ish";
        boolean isFound=false;
        for(String temp:students) //for each     		
		if(temp.equalsIgnoreCase(s))
		{
			isFound=true;
			break;
		}
	if(isFound)
	{
		System.out.println("Found");
	}
		else
		{
			System.out.println("Not Found");	
			
		}
	}
}
