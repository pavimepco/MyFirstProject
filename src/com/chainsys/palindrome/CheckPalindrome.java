package com.chainsys.palindrome;

public class CheckPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input1="mom";
		StringBuffer sb=new StringBuffer(input1);
		String revStr=sb.reverse().toString();//to convert stringbuffer to string
		if(input1.equalsIgnoreCase(revStr))
		{
			System.out.println(input1+"is palindrome");
		}
		else
		{
			System.out.println(input1+"is not palindrome");	
		}
		char input2='m';
		if(input1.indexOf(input2)==-1){
			System.out.println(input2+"it is not in"+ input1);
		}
		else{
			System.out.println(input2+"is in"+input1);	
		}
 }
}
/*
 String flag=input1.equalsIgnoreCase(revStr);
 if(flag)
 sop("true");
 else
 sop("false");
 */
