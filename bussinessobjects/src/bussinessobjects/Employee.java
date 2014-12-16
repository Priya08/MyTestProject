package bussinessobjects;

public class Employee implements Persons {
	private String firstName;
	private String lastname;
	private String gender; 
	protected String SSN;
	private int age;
	public Employee(String f,String l, int a, char g, String SSN ){
		this.SSN = SSN;
	
	
}
	Employee e1 = new Employee("Priya", "Pera", 20, 'f',"224-37-1278");

	@Override
	public int getAge() {
		// TODO Auto-generated method stub
		return this.age;
	}
	@Override
	public int setAgae() {
		// TODO Auto-generated method stub
		return 0;
	}
}
