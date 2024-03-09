class person{
	//private String name="Dhanshri";
 	//private int age=20;
	final String name="Dhanshri";
 	final int age=20;
 	person()
 	{
 		name="shruti";
 		age=21;
 	}
	void talk(){
		System.out.println("My name-->"+name);
		System.out.println("My age-->"+age);
	}
}
class Demo{
	public static void main(String args[]){
		person Raju=new person();
		Raju.talk();
		//Raju.age=21;
		//Raju.name="Shruti";
		Raju.talk();
	}
}
