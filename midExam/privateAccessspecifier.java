class person{
	private String name="Dhanshri";
	private int age=21;
	void talk(){
		System.out.println("My Name is -->"+name);
		System.out.println("My is age-->"+age);
	}
}
class Demo{
	public static void main(String agrs[]){
		person Raju=new person();
		Raju.talk();
		person sita=new person();
		sita.talk();
	}
}
