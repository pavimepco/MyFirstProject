package com.chainsys.string;

public class StringManipulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String input1="Chain-Sys";
        String input2=new String("chain-sys");//new memory
        System.out.println(input1.length());
        System.out.println(input1.toLowerCase());
        System.out.println(input1.toUpperCase());
        if(input1.equals(input2)) 
        {	
         System.out.println("String matches");
	    }
        else{
        	System.out.println("Doesnt match");
            }
        if(input1.equalsIgnoreCase(input2))//It doesnt see whether the string is in lowercase or not
        {	
         System.out.println("String matches");
	    }
        else{
        	System.out.println("Doesnt match");
            }
	}
}

/*
//StringBuffer
package com.chainsys.string;

public class StringManipulation {

	public static void main(String[] args) {

StringBuffer stringBuffer=new StringBuffer("Welcome");
System.out.println(stringBuffer.length());
System.out.println(stringBuffer.append("home"));
System.out.println(stringBuffer);
	}
}


//StringBuilder
package com.chainsys.string;

public class StringManipulation {

	public static void main(String[] args) {

StringBuilder sb=new StringBuilder("Welcome");
System.out.println(sb.length());
System.out.println(sb.append("home"));
System.out.println(sb);
	}
}
*/
