/*
Create a class representing a student with fields for name, age, and roll number.
Implement a default constructor that initializes the student with default values. Then
create a parameterized constructor to set these values when a new student object is
created. Use a static variable to keep count of number of student objects are created
and display it using a method. Initialize multiple students to demonstrate the use of
different constructor.
*/

class Student{
	String name;
	int age;
	int roll;
	static int count = 0;
	
	public Student(){
		this.name = "Guest User";
		this.age = 0;
		this.roll = 0;
		count++;
	}
	
	public Student(String name, int age, int roll){
		this.name = name;
		this.age = age;
		this.roll = roll;
		count++;
	}
	public void display()
	{
		System.out.println("Name: "+this.name+"\nAge: "+this.age+"\nRoll: "+this.roll);
	}
}

class Stud{
	public static void main(String []args){
		Student s1 = new Student();
		s1.display();
		Student s2 = new Student("Sunil", 21, 16);
		s2.display();
		System.out.println("Total Number Of Students Is: "+Student.count);
	}
}
