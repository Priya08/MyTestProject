package bussinessobjects;

public interface Persons {
	// bydefault everything is public in interface and every value is final.
	// we can not modify from out side the value
	public static final String firstName = null;
	public static final String lastName = null;
	public static final int age=0;

	// abstract public int setAgae();
	 //abstract public int getAgae();
	int getAge();
	int setAgae();
	

}
