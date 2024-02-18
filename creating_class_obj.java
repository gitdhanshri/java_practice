class Person{
	String name;
	int age;
	int sum=0;
	void talk(){
		System.out.println("\nHe/She  can Talk");
	}
	void run(){
		System.out.println("\nHe/She  can run");
	}
	
	int sumof_arr_ele(int arr[]){
		for(int i=0;i<arr.length;i++){
			sum=sum+arr[i];
		}
		return 0;
	}
	public static void main(String args[]){
		int arr[]={1,2,3,4,5,6,7,8,9,10};
		Person Raju=new Person();
		Person Ram=new Person();
		Person sita=new Person();
		Person add=new Person();
		Raju.talk();
		/*Ram.talk();
	         Ram.run();
		
		sita.talk();
		sita.run();*/
		add.sumof_arr_ele(arr);
		Raju.sumof_arr_ele(arr);
		Ram.sumof_arr_ele(arr);
		sita.sumof_arr_ele(arr);
		System.out.println( "\nSum of array element   by object Ram--> "+Ram.sum);
		System.out.println( "\nSum of array element   by object sita--> "+sita.sum);
		
	}
}

