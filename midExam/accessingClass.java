class father{
	String name="Gandhi";
	public static void main(String args[]){
		father f1=new father();
		System.out.println(f1.name);
		System.out.println("Address Of f1 object-->"+f1);
			
		father son=new father();
		System.out.println("Address Of son object-->"+son);
		
		son.name="shri";	
		System.out.println("Name of son-->"+son.name);
		
		father daughter=new father();
		System.out.println("Address Of Daughter object-->"+daughter);
		System.out.println("Name of Daughter-->"+daughter.name);
		
		f1.name="modi";
			
	}
}
