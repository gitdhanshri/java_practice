class person{
	private String name;
	private int age;
	person(){
		System.out.println("Inside Default Constructor");
		name="Dhanshri";
		age=21;
	}

	person(String s,int age){
		System.out.println("Inside Paraterised Constructor");
		name=s;
		this.age=age;
		//if class instance variable indentifier and instance varible name are same then prefference will given to Instance Variable 
	}
	void talk(){
	System.out.println("Inside Talk Method");
	System.out.println("My Name is -->"+name);
	System.out.println("My Age is -->"+age);
	}
}
class Demo{
	public static void main(String args[]){
		person Raju=new person();
		Raju.talk();
		person Sita=new person("Shruti",100);
		Sita.talk();
	}
}
