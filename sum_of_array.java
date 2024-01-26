class testsum{
	public static void main(String args[]){
	 int a[]={10,20,30,40,50};
		 for(int i=0;i<a.length;i++){
		 	System.out.println(a[i]);
		 	
		 }
		int sum=0,average;
		for(int i=0;i<a.length;i++){
		sum+=a[i];
	
		}
	
	average=sum/a.length;
	System.out.print("sum-->");
	System.out.println(sum);
	System.out.print("Average-->");
	System.out.println(average);
	}
}
