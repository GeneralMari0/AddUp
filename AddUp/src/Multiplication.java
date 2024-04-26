
public class Multiplication  extends Calcuation<Float>
{
	
	public static float multiply(float num1, float num2)
	{
		float result = num1*num2;
		stack.push(num1+" * "+num2+" = "+result);
		
		return result;
	}

}
