
public class Modulus extends Calcuation<Float>
{
	
	public static float mod(float num1, float num2)
	{
		float result = num1 % num2;
		stack.push(num1+" % "+num2+" = "+result);
		
		return result;
	}

}
