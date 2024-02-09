class Human{
private int age;
private int marks;
private String name;
//Private String surname;
public int getAge(){
System.out.println("Age is-->");
return age;
}
public void setAge(int age){
System.out.println("Enter age->");
//this.age=age;
//return age;
}
public String getName(){
System.out.println("Name is-->");
return name;
}
public void  setName(String name){
System.out.println(" Enter Name -->");
//this.name=name;
//return name;
}
//Constructer
public Human(){
System.out.println("In Constructer\n");

}
public Human(int a,String n){
System.out.println("In Constructer\n");
age=a;
name=n;
}
	public static void main(String a[]){
	//Human obj1=new Human();
	Human obj2=new Human(22 ,"sister");
	//System.out.println(obj1.getName()+"  :   "+obj1.getAge());
	System.out.println(obj2.getName()+"  :   "+obj2.getAge());
	/*obj1.setAge(30);
	obj1.setName("shri");*/
	Human obj1=new Human();
	}
}
