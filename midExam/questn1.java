import java.util.Scanner;  // Import the Scanner class
class Father{
	String name;
	int age=48;
	Scanner myObj = new Scanner(System.in);  // Create a Scanner object
	    		String userName = myObj.nextLine();  // Read user input									
	void setName(){	
    		System.out.println("Enter username");	
    		userName = myObj.nextLine();  // Read user input									
		//System.out.println("I am Working Tommorow "+name);	
	}
	void getName(){
		System.out.println("Name is -->"+userName);
	}
}
class child{
	public static void main(String args[]){
		Father f1=new Father();
		System.out.println("Refference of Object-->"+f1);
		System.out.println("HashCode -->"+f1.hashCode());
		f1.setName();
	}
}
/*
import java.util.Scanner;  // Import the Scanner class

class Main {
  public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in);  // Create a Scanner object
    System.out.println("Enter username");

    String userName = myObj.nextLine();  // Read user input
    System.out.println("Username is: " + userName);  // Output user input
  }
}

*/
