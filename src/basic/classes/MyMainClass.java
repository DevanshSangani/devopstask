package basic.classes;

public class MyMainClass {
	
	public static void main(String args[]) {
		
		Employee employee = new Employee(1001,"Devansh", Gender.MALE ,24);
		
		System.out.println(employee.getId());
		System.out.println(employee.name);
		System.out.println(employee.gender);
		System.out.println(employee.age);
	}

}
