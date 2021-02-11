package com.org.app;

public class BiggestFiveValues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int num = Integer.parseInt(args[0]);
	        int i = 4;
	        while(i!=0)
	        {
	            
	            int num1 = Integer.parseInt(args[i]); //20
	            if( num < num1)
	            {
	                num = Integer.parseInt(args[i]);
	            }
	            i--;
	        }
	        System.out.println("Biggest of: "+num);
	}

}
