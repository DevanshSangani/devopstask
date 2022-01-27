package basic.inheritance;

import basic.classes.Employee;
import basic.classes.Gender;

public class NonInheritedClass {

	public static void main(String args[]) {
		
		Employee employee = new Employee(1001,"Devansh", Gender.MALE ,24);
		
		System.out.println(employee.getId());
		System.out.println(employee.name);
		System.out.println(employee.getGender());
		System.out.println(employee.getAge());
	}
}
