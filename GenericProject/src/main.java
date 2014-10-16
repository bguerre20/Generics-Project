//Bryan Guerre
//10-15-2014
//Using generics in an array list 
//inputs - none
//outputs - necessary geometric objects and information about them showing working methods
import java.util.ArrayList;

public class main
{

	//main method to test code
	public static void main(String[] args)
	{
		ArrayList<Measurable> circles = new ArrayList<Measurable>();
		System.out.println("Here is an array of 10 randomly generated circles: ");
		circles.add(new Circle(13.2));
		circles.add(new Circle(10));
		circles.add(new Circle(5.7));
		circles.add(new Circle(20));
		circles.add(new Circle(3.2));
		circles.add(new Circle(1.1));
		circles.add(new Circle(5.9));
		circles.add(new Circle(6.6));
		circles.add(new Circle(13));
		circles.add(new Circle(15));
		circles.add(new Circle(11.4));
		circles.add(new Circle(10.2));
		
		//shows what the circles are, decided not to use random number generator because it was creating
		//dupiclates
		for(int i = 0; i < circles.size();i++)
			System.out.println(" " + i + ") " + circles.get(i).toString());

		Circle c = new Circle(0);
		
		System.out.println("\nThe largest circle is: " + c.getLargest(circles) + "");
	}

}
