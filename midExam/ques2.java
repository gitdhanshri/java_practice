class Num{
	public static void main(String args[]){
	int num=0b1010;
	/*System.out.printf("in decimal-->%d",num);
	//System.out.printf("\nin decimal-->%i",num);
	System.out.printf("\nin hexadecimal-->%o",num);	
	System.out.printf("\nin Octal-->%x",num);
	System.out.printf("\nin Binary-->%s",Integer.toBinaryString(num));
	*/
	String s1="RamRam";
	int n=65;
	float f=15.1234f;
	System.out.printf("String=%s%nnum=%d%nHexadecimal=%x%nfloat=%f\n",s1,n,n,f);
	String string=String.format("s1=%s,n=%d,f=%f",s1,n,f);
	System.out.println(string);	
	string=string+"yes";
	System.out.println(string);
	double m1=100f;
	byte b1=121;
	System.out.println(m1);
	System.out.println(b1);
	double PI=3.1414;
	System.out.println(PI);
	}
}
