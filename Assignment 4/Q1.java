/*
Create a Java class to represent an Employee with data members such as eid, name
and salary. Use a parameterised constructor to initialize the employee object and use
a suitable method to display the employee details.
*/
import java.util.*;
class Employee{
	int eid;
	String name;
	float salary;
	
	public Employee(int eid, String name, float salary){
		this.eid = eid;
		this.name = name;
		this.salary = salary;
	}
	
	public void displayData(){
		System.out.print("Employee Id: "+this.eid+"\nName: "+this.name+"\nSalary: "+this.salary);
	}
	
	public static void main(String []args){
		Employee e1 = new Employee(16, "Sunil", 2000);
		e1.displayData();
	}
}