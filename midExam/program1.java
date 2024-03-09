class father{
	String name;
	int age;
	void talk(){
		System.out.println("My Name is-->"+name);
		System.out.println("My age is-->"+age);
	}
}
class child{
	public static void main(String args[]){
		father son=new father();
		System.out.println("Hash code =="+son.hashCode());
		son.talk();
		
	}
}
