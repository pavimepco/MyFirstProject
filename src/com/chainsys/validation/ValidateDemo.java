package com.chainsys.validation;

public class ValidateDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String email="pavigmail.com";
		if(email.indexOf('@')!=-1 && email.indexOf('.')!=-1){
			System.out.println("Valid");
		}
		else
		{
			System.out.println("Invalid");
		}
		String mobile="12345678900";
		if(mobile.length()==10)
		{
			System.out.println("Valid");
		}
		else{
			System.out.println("Invalid");
		}
	}	
}

/*package com.chainsys.validation;

public class ValidateDemo {
	boolean isValidString(String input)
	{
	boolean isValid=false;
	if(!input.equals(null)&& input.trim().length()!=0)
	{
		isValid=true;
	}
	return isValid;
	}
	
	boolean isValidEmail(String email)
	{
	boolean isValid=false;
	if(email.indexOf('@')!=-1 && email.indexOf('.')!=-1)
	{
		isValid=true;
	}
	return isValid;
	}
	
	boolean isValidMobile(String mobile)
	{
	boolean isValid=false;
	if(mobile.length()==10)
	{
	    isValid=true;
	}
	return isValid;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
	}
}	*/