class employee{
	int id1,id2;
	employee(int id1,int id2){
		this.id1=id1;
		this.id2=id2;
	}
}
class check{
	void swap(employee obj){
		int temp;
		temp=obj.id1;
		obj.id1=obj.id2;
		obj.id2=temp;
	}
}
class passObjects{
	public static void main(String args[]){
		employee obj1=new employee(10,20);
		//employee obj2=new employee(20);
		
		check checkobj=new check();
		System.out.println(obj1.id1+" &"+ obj1.id2);
		
		checkobj.swap(obj1);
		System.out.println(obj1.id1+" &"+ obj1.id2);
	}
}   
