class Person{
	String name;
	int age;
	void talk(){
		System.out.println("\nName of Person-->"+this.name);
		System.out.println("\nAge of person-->"+age);
	}
	public static void main(String args[]){

	
		Person obj1=new Person();
		Person obj2=new Person();
		Person obj3=new Person();
		obj1.talk();
		System.out.println("referrece of obj1-->"+obj1);
		System.out.println("referrece of obj2-->"+obj2);
		System.out.println("referrece of obj3-->"+obj3);
		obj1.name="Raju";
		obj1.age=22;
	}
}

