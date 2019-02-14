/*
//STATIC
package com.chainsys.staticdemo;

public class StaticDemo {
	static int count;
	 static void doCount(){ //static assigned here takes the value as 1,2,...
		 count++;
		 System.out.println("Count is:"+count);
	 }
public static void main(String[] args) {
	doCount();//1
	doCount();//2
}
}

//NON STATIC
package com.chainsys.staticdemo;

public class StaticDemo {
	 int count;
	  void doCount(){//static assigned here takes the value as 1,2,...
		 count++;
		 System.out.println("Count is:"+count);
	 }
public static void main(String[] args) {
	StaticDemo st=new StaticDemo(); //must create an object
	st.doCount();//1
	st.doCount();//2
}
}
*/


package com.chainsys.staticdemo;

public class StaticDemo {
	  int count;
	  static void doCount(){//static assigned here takes the value as 1,2,...
		StaticDemo st=new StaticDemo();
		  st.count++;
		  System.out.println("Count is:"+st.count);
	 }
public static void main(String[] args) {
	//StaticDemo st=new StaticDemo();
	doCount();//1
	doCount();//1
}
}