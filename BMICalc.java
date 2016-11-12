import java.util.Scanner;
import java.util.InputMismatchException;

public class BMICalc 
{
	static float shareBMI;
	static float height=0;
	static float weight=0;
	public static void printIntroduction()
	{
		System.out.println("This is a BMI calculator");
	}
	
	public static void getBMI()
	{	
		
		boolean result=false;
		do
		{
		try
		{	
			test1();
			result=true;
		}
		catch (InputMismatchException a)
		{
			System.out.println("You didn't enter an integer.");
		}
		catch(ArithmeticException a)
		{
			System.out.println("Enter a number that's different to 0.");
		}
		} while(!result);
			height*=0.3937;
		
			weight*=2.2046;
			float BMI=bmiFor(height , weight);
		
	}
	public static float bmiFor(float H, float W)
	{
		float BMindex=W*703/(H*H);
		shareBMI=BMindex;
		return BMindex;
	}
	public static String getStatus(float BMIndex)
	{
		String bmindex=null;
		if(BMIndex<18.5)
		{
			bmindex="Underweight";
		}
		if(BMIndex>18.5 && BMIndex<25)
		{
			bmindex="Normal";
		}
		if(BMIndex>25 && BMIndex<30)
		{
			bmindex="Overweight";
		}
		if(BMIndex>30)
		{
			bmindex="Obese";
		}
		return bmindex;
		
		
	}
	public static void ReportResults(int no, float BMI)
	{
		System.out.println("The person with number: " +no +" , has a Body weight index of: " +Math.round(BMI) +" and is: " + getStatus(shareBMI));
	}
	public static void main(String [] args)
	{
		printIntroduction();
		getBMI();
		ReportResults(1, shareBMI);
		
	}
	public static void test1() throws InputMismatchException, ArithmeticException
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your height in sm:");
		height=sc.nextFloat();
		if(height==0)
			throw new ArithmeticException();
		System.out.println("Enter your weight in kg:");
		weight=sc.nextFloat();
		if(weight==0)
			throw new ArithmeticException();
	}
}
