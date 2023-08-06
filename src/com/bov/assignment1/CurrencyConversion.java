package com.bov.assignment1;




/* Currency Conversion: Design a program that converts an amount of money from one currency to another. 
Prompt the user to enter the amount and the exchange rate. 
Use variables to store the input values and the converted amount. */


import java.util.Scanner;

public class CurrencyConversion{
	public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);
			double rupeeToDollar = 0.012;
			double dollarToRupee = 83.333;
			double rupeeToUAEDirham = 0.045;
			double uaeDirhamToRupee = 22.222;
			double rupeeToSwissFranc = 0.011;
			double swissFrancToRupee = 90.9090;
			double rupeeToJapaneseYen = 1.75;
			double japaneseYenToRupee = 0.5714;
			double rupeeToEuro = 0.011;
			double euroToRupee = 90.9090;
			double result;
			int choice;
			System.out.println("Enter your conversion choice from below: \n 1. Rupee to Dollar \n 2. Dollar to Rupee \n 3. Rupee to UAE Dirham \n 4. UAE Dirham to Rupee \n 5. Rupee To Swiss Franc \n 6. Swiss Franc To Rupee \n 7. Rupee to Japanese Yen \n 8. Japanese Yen to Rupee \n 9. Rupee to Euro \n 10. Euro to Rupee \n Enter your choice: ");
			
			choice = sc.nextInt();
			switch(choice)
			{
				case 1:
				System.out.println("Enter Rupee value to convert to Dollar: ");
				double rupeeVal1 = sc.nextDouble();
				result = rupeeVal1 * rupeeToDollar;
				System.out.println("The currency value after conversion from rupee to dollar is : "+result);
				break;
				
				case 2:
				System.out.println("Enter Dollar value to convert to Rupee: ");
				double dollarVal = sc.nextDouble();
				result = dollarVal * dollarToRupee;
				System.out.println("The currency value after conversion from Dollar to Rupee is : "+result);
				break;
				
					case 3:
				System.out.println("Enter Rupee value to convert to UAE Dirham: ");
				double rupeeVal = sc.nextDouble();
				result = rupeeVal * rupeeToUAEDirham;
				System.out.println("The currency value after conversion from rupee to UAE Dirham is : "+result);
				break;
				
				case 4:
				System.out.println("Enter UAE Dirham value to convert to Rupee: ");
				double uaeDirhamVal = sc.nextDouble();
				result = uaeDirhamVal * uaeDirhamToRupee;
				System.out.println("The currency value after conversion from UAE Dirham to Rupee is : "+result);
				break;
				
			
				
				case 5:
				System.out.println("Enter Rupee value to convert to Swiss Franc: ");
				double rupeeVal2 = sc.nextDouble();
				result = rupeeVal2 * rupeeToSwissFranc;
				System.out.println("The currency value after conversion from Rupee to Swiss Franc is : "+result);
				break;
				
				case 6:
				System.out.println("Enter Swiss Franc value to convert to Rupee: ");
				double swissFrancVal = sc.nextDouble();
				result = swissFrancVal * swissFrancToRupee;
				System.out.println("The currency value after conversion from Swiss Franc to Rupee is : "+result);
				break;
				
				
				case 7:
				System.out.println("Enter Rupee value to convert to Japanese Yen: ");
				double rupeeVal3 = sc.nextDouble();
				result = rupeeVal3 * rupeeToJapaneseYen;
				System.out.println("The currency value after conversion from Rupee to Japanese Yen is : "+result);
				break;
				
				case 8:
				System.out.println("Enter Japanese Yen value to convert to Rupee: ");
				double japaneseYenVal = sc.nextDouble();
				result = japaneseYenVal * japaneseYenToRupee;
				System.out.println("The currency value after conversion from Japanese Yen to Rupee is : "+result);
				break;
				
				case 9:
				System.out.println("Enter Rupee value to convert to Euro: ");
				double rupeeVal4 = sc.nextDouble();
				result = rupeeVal4 * rupeeToEuro;
				System.out.println("The currency value after conversion from Rupee to Euro is : "+result);
				break;
				
				case 10:
				System.out.println("Enter Euro value to convert to Rupee: ");
				double euroVal = sc.nextDouble();
				result = euroVal * euroToRupee;
				System.out.println("The currency value after conversion from Euro to Rupee is : "+result);
				break;
				
				default:
				System.out.println("Incorrect answer.");
			}
	}
}


