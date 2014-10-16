//Bryan Guerre
//10-15-2014
//Using generics in an array list 
//inputs - none
//outputs - necessary geometric objects and information about them showing working methods
import java.util.ArrayList;

/**
 * Describes any class whose objects can be measured.
 */
public abstract class Measurable<T>
{
	abstract double getMeasure();

	/**
	 * This method will loop through an array list of measurable types and return the largest one.
	 * @param objects an array list of type measurable 
	 * @return the largest measurable object in the array list
	 */
	public static <T extends Measurable<T>> T getLargest(ArrayList<T> objects)
	{
		//try catch block for possibility of sending an empty array list.
		T largest = null;
		try
		{
			largest = objects.get(0);
			for (int i = 0; i < objects.size(); i++)
			{
				if (largest.getMeasure() <= objects.get(i).getMeasure())
				{
					largest = objects.get(i);
				}
			}
		} 
		catch (Exception e)
		{
			e.printStackTrace();
		}

		return largest;
	}
}