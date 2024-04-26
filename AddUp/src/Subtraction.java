
public class Subtraction extends Calcuation<Float>
{
	
	public static float sub(float num1, float num2)
	{
		float result = num1+num2;
		stack.push(num1+" - "+num2+" = "+result);
		
		return result;
	}

}
