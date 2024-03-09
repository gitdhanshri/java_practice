class employee{
	int id;
	employee(int id1){
		this.id=id1;
	}
}
class check{
	void swap(employee obj1,employee obj2){
		employee temp;
		temp=obj1;
		obj1=obj2;
		obj2=temp;
		d ]=  System.out.println("value of id of obj1-->"+obj1.id+" &"+"value of id of obj2-->"+ obj2.id);
		
	
	}
}
class passObjects{
	public static void main(String args[]){
		employee obj1=new employee(10);
		employee obj2=new employee(20);
		
		check checkobj=new check();
		System.out.println("value of id of obj1-->"+obj1.id+" &"+"value of id of obj2-->"+ obj2.id);
		
		checkobj.swap(obj1,obj2);
		System.out.println("value of id of obj1-->"+obj1.id+"&"+"value of id of obj2-->"+ obj2.id);
	}
}   
