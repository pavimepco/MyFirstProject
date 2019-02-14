package com.chainsys.variables;

public class VariablesDemo {
	static int a;  
	int b; //must create an object
	final int d=1; //once you assign a value it cant be changed

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int c=0;
      
      VariablesDemo var=new VariablesDemo();
      System.out.println(var.d++); //so the val is not increased
      
	}

}
