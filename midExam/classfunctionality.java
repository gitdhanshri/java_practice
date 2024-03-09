class Sample{
	int balance=1000;
	public static void main(String agrs[]){
		int balance=23;
		System.out.println(balance);
		Sample f1=new Sample();
		Sample f2=new Sample();
		System.out.println(f1.balance);
		f1.balance=2000;
		System.out.println(f1.balance);
		System.out.println("balance from f2 objec-->"+f2.balance);
		//System.out.println(Sample.balance);
	}
}
