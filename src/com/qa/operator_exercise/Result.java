package com.qa.operator_exercise;

public class Result {
	static double physics = 59.0;
	static double chemistry = 60.0;
	static double biology = 91.0;
	static double total;
	static double percentage;
	
	public static void main(String[] args)
	{
		method3(biology, chemistry, physics);
	}
	public static void method1()
	{
		total = biology + chemistry + physics;
	}
	
	public static void method2()
	{
		method1();
		percentage = (total*100)/450;
		System.out.println("Overall result: "+percentage+"%");
	}
	
	public static void method3(double physGrade, double bioGrade, double chemGrade)
	{
		biology = bioGrade;
		physics = physGrade;
		chemistry = chemGrade;
		
		method2();
		if(((physics/150)*100) >= 60)
		{
			System.out.println("Physics grade: "+ physics + "\nIn %: "+((physics/150)*100)+"%" +"\nYou have passed physics!");
			
		} else
		{
			System.out.println("You got "+((physics/150)*100)+ "% and have failed physics!");
		}
		
		if(((biology/150)*100) >= 60)
		{
			System.out.println("Biology grade: "+ biology + "-"+((biology/150)*100)+"%"+"\nYou have passed biology!");
		} else
		{
			System.out.println("You got "+((biology/150)*100)+ "% and have failed biology!");
		}
		
		if(((chemistry/150)*100) >= 60)
		{
			System.out.println("Physics grade: "+ chemistry + "-"+((chemistry/150)*100)+"%"+"\nYou have passed chemistry!");
		} else
		{
			System.out.println("You got "+((chemistry/150)*100)+ "% and have failed chemistry!");
		}
	}
	
}