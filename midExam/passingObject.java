class father{
	int balance=108;
	static String surname="patil";
	
	String getSurname(){
		System.out.println("Accesed from class variable-->"+balance);
		return surname;
	}
	public static void main(String args[]){
		father f1=new father();
		System.out.println( "First Call-->"+f1.getSurname());

		f1.balance=600;
		surname="Baswade";
		//System.out.println("In main-2-->"+f1.balance);
		System.out.println("Second Call -->"+f1.getSurname());
	}

}
