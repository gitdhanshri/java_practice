class Test{
	static int x;
	Test(int x){
		this.x=x;
	}
	static void access(){
		System.out.println("Value of X="+x);
	}
}
class Demo{
	public static void main(String args[]){
		Test obj=new Test(55);
		//++obj.x;
		Test.access();
		++obj.x;
		Test.access();
	}
}
