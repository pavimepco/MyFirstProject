/*package com.chainsys.exception;

public class ExceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int n=9;
       try{
    	   int res=n/0;
    	   System.out.println(res);
         }
       catch(Exception e)
       {
    	   e.printStackTrace();//trace the exception
       }
	}
}
*/

package com.chainsys.exception;

public class ExceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int [] x={1,2,8};
       int no=8;
       try{
    	   int res=no/0;
    	   System.out.println(res);
    	   System.out.println(x[3]);
         }
       catch(Exception e)
       {
    	   System.out.println("throw exception");
    	   e.printStackTrace();//trace the exception
       }
       finally{
    	   System.out.println("closing resources");
       }
       System.out.println("end of main");
       }
	}