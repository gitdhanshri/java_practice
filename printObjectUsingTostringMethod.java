class PrintObjectAddress{
	public  String toString(){
		return ""+getClass().getName()+"@"+Integer.toHexString(hashCode());
	} 
	public static void main(String args[]){
		ArraysFillMethod a =new ArraysFillMethod();
		ArraysFillMethod a2 =new ArraysFillMethod();
		System.out.println("Address of Object 1-->"+a);
		System.out.println("Address of Object 2-->"+a2);
	}
}
