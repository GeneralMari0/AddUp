import java.util.Iterator;
import java.util.Stack;

public abstract class Calcuation<E> 
{
	protected static Stack<String> stack = new Stack<String>(); // Create a String stack to store previous calculations
	private static Iterator<String> value; // Declare a string iterator.
	
	public static void printStack() // Print each element in the stack.
	{	
		value = stack.iterator(); // Get the collection of iterable elements from the stack.
		while(value.hasNext()) // Print each element in the collection.
		{
			System.out.print(value.next() + ", ");
		}
	}
	protected static void printError(String error)
	{
		System.out.println(error);
	}
	
	
}
