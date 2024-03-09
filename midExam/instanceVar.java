class Test{
	//static int x=10;
	int x=10;
	void display(){
		System.out.println(x);
	}	
}
class Demo{
	public static void main(String args[]){
		Test obj1,obj2;
		obj1=new Test();
		//System.out.println(obj1);
		++obj1.x;
		System.out.println("x in object 1-->");
		obj1.display();
		//System.out.println(obj1);
		obj2=new Test();
		System.out.println("x in object2-->");
		obj2.display();
	}
}
