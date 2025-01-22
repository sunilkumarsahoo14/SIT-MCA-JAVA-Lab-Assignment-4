/*
Write a class to represent a point in 2D space. Implement a constructor that takes x
and y coordinates. Use the ‘this’ keyword to differentiate between instance variables
and constructor parameters. Define a static method in the class to find the distance
between two points.
*/

class Point2D{
	double x;
	double y;
	
	public Point2D(double x, double y){
		this.x = x;
		this.y = y;
	}
	
	public static double calculate(Point2D p1, Point2D p2){
		double x = p1.x - p2.x;
		double y = p1.y - p2.y;
		return math.sqrt(x*x + y*y);
	}
	
	public static void main(String []args){
		Point2D pa = new Point2D(2.0, 3.0);
		Point2D pb = new Point2D(5.0, 7.0);
		double distance = calculate(pa, pb);
		System.out.println(distance);
	}
}