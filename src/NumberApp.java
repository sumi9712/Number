import java.util.Scanner;

public class NumberApp {

	public static void main(String[] args)
	{
		System.out.println("Welcome!!");
		int i =0;
		String Numberinwords = "";
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		
				
		i = sc.nextInt();
		
	switch ( i)
	{
		case 1:
			 Numberinwords = "one";
			break;
			
		case 2:
			Numberinwords = "Two";
			break;
			
		case 3:
			Numberinwords = "Three";
			break;
			
		case 4:
			Numberinwords = "Four";
			break;
			
		case 5:
			Numberinwords = "Five";
			break;
			
		case 6:
			Numberinwords = "Six";
			break;
			
		case 7:
			Numberinwords = "Seven";
			break;
			
		case 8:
			Numberinwords = "Eight";
			break;
			
		case 9:
			Numberinwords = "Nine";
			break;
			
		case 10:
			Numberinwords = "Ten";
			break;
			
		
		default:
		Numberinwords = "number not found";
		break;
	}
	  
		System.out.println("Number in words: " + Numberinwords);
		 sc.close();
	}

	
}
