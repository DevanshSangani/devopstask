package basic.inheritance;

import basic.classes.Employee;
import basic.classes.Gender;

public class CapgeminiEmployee extends Employee{
	CapgeminiEmployee(int id, String name, Gender gender, int age){
		super(id,name,gender,age);
	}
	public static void main(String args[]) {
		
			Employee capgeminiEmployee = new CapgeminiEmployee(1001,"Devansh", Gender.MALE, 24);
		
			System.out.println("Name : "+capgeminiEmployee.name);
			
			System.out.println("Age : "+capgeminiEmployee.getAge());
			
			System.out.println(capgeminiEmployee.getGender());
		
	}

}
