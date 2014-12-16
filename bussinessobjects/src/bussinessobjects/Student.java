package bussinessobjects;

public class Student {
	private String firstname = null;
	private String lastname= null;
	private String address = null;
	private char gender = ' ';
	private int id = 0;
	public Student(String string, String string2, String string3, String string4){
		System.out.println("Hey constructor is called");
		
	}
	public Student (String first, String last, char gender, int id, String address){
		this.firstname = first;
		this.lastname = last;
		this.gender = gender;
		
	}
	public void printFirstName(){
		System.out.println(firstname);
	}
	public void setFirstNmae(String name){
		firstname= name;
	}
	public void changeFirstName(String name){
		firstname = name;
	}
	public void getFirstNmae(String name){
		firstname= name;
	}
}
