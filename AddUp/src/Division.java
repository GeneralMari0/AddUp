
public class Division extends Calcuation<Float>
{	
	public static float div(float num1, float num2)
	{
		if (num2 == 0) // If second number is 0, print an error and return 0.
		{
			printError("Cannot divide by 0.");
			return 0F;
		}
		else
		{
			float result = num1/num2;
			
			stack.push(num1+" / "+num2+" = "+result);
			
			return result;
		}
	}

}
