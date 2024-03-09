class person{
	person(){
		System.out.println("Inside Default Constructor");
	}

	
	void sum(double x,double y){
		
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
