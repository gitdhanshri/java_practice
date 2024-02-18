class Person{
	String name;
	int age;
	int sum=0;
	void talk(){
		System.out.println("\nHe can Talk");
	}
	void run(){
		System.out.println("\nHe  can run");
	}
	public static void main(String args[]){

		Person obj1=new Person();    
		Person obj2=new Person();
		System.out.println("\nhash code of obj1-->"+obj1.hashCode());
		System.out.println("\nhash code of obj2-->"+obj2.hashCode());
		System.out.println("Reference Num of obj1-->"+obj1);
		System.out.println("Reference Num of obj2-->"+obj2);
	
				
		
	}
}

