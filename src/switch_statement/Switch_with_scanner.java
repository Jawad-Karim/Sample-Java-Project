package switch_statement;

import java.util.Scanner;

public class Switch_with_scanner {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("please enter a number for day");
		int dayNo = sc.nextInt();
		String day = "";

		switch(dayNo) {
		case 1: day = "monday"; break;
		case 2: day = "tuesday"; break;
		case 3: day = "wednestday"; break;
		case 4: day = "thurshday"; break;
		case 5: day = "friday"; break;
		case 6: day = "saturday"; break;
		case 7: day = "sunday"; break;

		default: System.out.println("incorrect day number");
		}
		System.out.println("day is : "+ day);
		//***************************************************************

		Scanner sc1 = new Scanner(System.in);
		System.out.println("\nplease enter a number for month");
		int monthNo = sc1.nextInt();

		switch(monthNo) {
		case 1: 
			System.out.println("selected month is : january");
			break;
			
		case 2: 
			System.out.println("selected month is : february"); 
			break;
			
		case 3: 
			System.out.println("selected month is : march"); 
			break;
			
		case 4: 
			System.out.println("selected month is : april"); 
			break;
			
		case 5: 
			System.out.println("selected month is : may"); 
			break;
			
		case 6: 
			System.out.println("selected month is : june"); 
			break;
			
		case 7: 
			System.out.println("selected month is : july"); 
			break;
			
		case 8: 
			System.out.println("selected month is : august"); 
			break;
			
		case 9: 
			System.out.println("selected month is : september"); 
			break;
			
		case 10: 
			System.out.println("selected month is : october"); 
			break;
			
		case 11: 
			System.out.println("selected month is : november"); 
			break;
			
		case 12: 
			System.out.println("selected month is : december"); 
			break;
			
			default:
				System.out.println("incorrect month number");
		}
	}
}
