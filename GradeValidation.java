package tanzeela;

public class GradeValidation
{
	public static void main(String[] args)
	{
		char grade = 'D';
		switch(grade)
		{
			case 'A' : System.out.println("Excellent");
			         break;
			case 'B' : System.out.println("Good");
			         break;
			case 'C' : System.out.println("Bad");
			         break;
			default : 
			System.out.println("Invalid grade");
		}
	}
}


