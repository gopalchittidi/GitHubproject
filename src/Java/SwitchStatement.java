package Java;

import java.util.Scanner;

public class SwitchStatement {
	public static void main(String [] args) {
		Scanner  s = new Scanner(System.in);
		for(int i=1;i<=5;i++)
		{
			System.out.println("Enter Your Course Name:");
			String Course= s.next();
			switch(Course.toUpperCase()) 
			{
			case "MANUAL":
			System.out.println("Wlecome to Tutorial:"+ Course);
			break;
			case "SELENIUM":
				System.out.println("Wlecome to Tutorial:"+ Course);
				break;
			case "JAVA":
				System.out.println("Wlecome to Tutorial:"+ Course);
				break;
			case "WEB_TECHONOLOGIES":
				System.out.println("Wlecome to Tutorial:"+ Course);
				break;
			case "PYTHON":
				System.out.println("Wlecome to Tutorial:"+ Course);
				break;
			default:
				System.out.println("we are sorry we don't have Course:"+Course);
			}
			
			
		}
		
	}

}
