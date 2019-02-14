package com.chainsys.calc;

public class CalcTotal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] marks={10,20,30};//0+marks[0]=0+10=10
		int sum=0;             //10+marks[1]=30
		for(int i=0;i<marks.length;i++){
			sum+=marks[i];
		}
		System.out.println(sum);
	}
}
