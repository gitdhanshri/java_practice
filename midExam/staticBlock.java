class Test{
	//static int x=10;
	//static int x=10;
	static{
	System.out.println("Inside Static first block-->");
	}
	static void display(){
		System.out.println(x);
	}
	static{
	System.out.println("Inside Static Third block ");
	}
	static{
	System.out.println("Inside Static Second block-->");
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
