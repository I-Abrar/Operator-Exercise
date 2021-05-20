package com.qa.operator_exercise;

public class Calculator {

	public static void main(String[] args)
	{
		double num1 = 10;
		double num2 = 3;
        int str = 4;
		switch(str) 
		{
        case 1:
        	var resultAdd = num1+num2;
            System.out.println("Addition: "+resultAdd);
            break;
        case 2:
        	var resultMinus = num1-num2;
            System.out.println("Subtraction: "+ resultMinus);
            break;
        case 3:
        	var resultMultiply = num1*num2;
            System.out.println("Multiply: "+resultMultiply);
            break;
        case 4:
        	
        	if(num1 < num2)
        	{
        		var resultDivide = num1/num2;
        		System.out.println("Divide: "+resultDivide);
        	}else
        	{
        		 System.out.println("Cannot compute");
        	}
            break;
        default:
            System.out.println("Out of scope!");
            break;
		}
	}

}