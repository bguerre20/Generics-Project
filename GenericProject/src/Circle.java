//Bryan Guerre
//10-15-2014
//Using generics in an array list 
//inputs - none
//outputs - necessary geometric objects and information about them showing working methods

public class Circle extends Measurable<Circle>
{
	double radius;
	
	//constructor with default radius of 1
	public Circle(double rad)
	{
		this.radius = rad;
	}
	
	//getter for radius variable
	public double getRadius()
	{
		return radius;
	}

	//setter for radius variable
	public void setRadius(double radius)
	{
		this.radius = radius;
	}

	//method to return the area of this circle object
	public double getArea()
	{
		return (2 * Math.PI * Math.pow(this.radius, 2));
	}
	
	//method to return the permiter of this circle object
	public double getPerimeter()
	{
		return (2 * Math.PI * this.radius);
	}
	
	//method to return the diameter of this object
	public double getDiameter()
	{
		return (2 * this.radius);
	}

	@Override
	double getMeasure()
	{
		// TODO Auto-generated method stub
		return getArea();
	}
	public String toString()
	{
		return getArea() + "";
	}
}
