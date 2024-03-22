class Factorial{
	long getFactorial(long num){
		if(num==0){
			return 1;
		}	
		else {
		return num*getFactorial(num-1);
		}
	}
	public static void main(String args[]){
	Factorial f1=new Factorial();
	System.out.println(f1.getFactorial(7));
	}
}
