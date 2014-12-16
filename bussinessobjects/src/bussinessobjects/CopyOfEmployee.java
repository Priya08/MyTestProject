package bussinessobjects;

public class CopyOfEmployee extends Person {
	protected String SSN;
	public CopyOfEmployee(String f,String l, int a, char g, String SSN ){
	this.FirstName =f;
	this.LastName =l;
	this.gender = g;
	this.age = a;
	
}
	CopyOfEmployee e1 = new CopyOfEmployee("Priya", "Pera", 20, 'f',"224-37-1278");
	@Override
	public void setAge(int age) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public int getAge() {
		// TODO Auto-generated method stub
		return this.age;
	}
}
