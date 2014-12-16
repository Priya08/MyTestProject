package bussinessobjects;

import org.testng.annotations.Test;

//abstract means we should not allow user to create a instance of the same class
// if we declare class as abstract  we cannot create person p1 = new person();
abstract public class Person {
	protected String FirstName;
	protected String LastName;
	protected int age;
	protected char gender;
	protected int PhoneNumber;
	abstract public void setAge(int age);
	abstract public int getAge();
	@Test
	public Person(){
		System.out.println("Parent class");
	}

}
