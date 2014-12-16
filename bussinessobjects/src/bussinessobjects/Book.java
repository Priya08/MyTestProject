package bussinessobjects;

public class Book {
	private String title;
	private String author;
	private int pages;
	//creating a constructor with argument. this means the current object.
	//this is the second method to assign/creating the object in run time
	//if the datamembers are public we can create a book object and call the object with refernce to that 
	//eg: Book b1 = new Book(); b1.new Book();
	public Book (String author,String title,int pages ){
		this.author = author;
		this.title = title;
		this.pages = pages;
	}
	public Book(){
		this.author = "null";
		this.title = "null";
		this.pages = 0;
		
	}
	public String getAuthor(){
		this.author = "author";
		return author;
	}
	
	public static void main(String[] args) {
		/*int x = 0;
		Book [] mybook = new Book[4];
		while(x<5){
		mybook[x] = new Book();
		x= x+1;
		if(x==0){
			mybook[x].title = "Java Guru";
		}
		*/
		Book Book1 = new Book("Dennis Richee","C", 120);
		Book Book2 = new Book("Chetan Bhagat","vision2020", 420);
		Book Book3 = new Book("Java geeks","Head first Java", 320);
		Book Book4 = new Book("Yashvanth ","C++", 120);
		Book Book5 = new Book("Ruby author","Ruby", 120);
		Book[] myBooks = {Book1, Book2,Book3,Book4};
		}
	
	String userAuthor = this.getAuthor();
	//System.out.println("the author name" + userAuthor);
	
	
}
