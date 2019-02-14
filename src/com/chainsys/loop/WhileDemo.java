//WHILE
/*package com.chainsys.loop;

public class WhileDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=1;
		while(i<3){
			System.out.println(i);
			i++;
		}

	}

}
//DOWHILE
*/
package com.chainsys.loop;

import java.util.Scanner;

public class WhileDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		do{
			System.out.println("Press 1 to continue");
			Scanner s=new Scanner(System.in);
			i=s.nextInt();
		}while(i==1);

	}
;
}
