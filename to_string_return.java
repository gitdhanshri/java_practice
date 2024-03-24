class Tostring{
	public String toString(){
		return "Output-of-ToString-Method";
	}
	String chararryToString(char[] arr){
		String str=new String(arr,6,2);
		return str;
	}
	public static void main(String args[]){
		Tostring s1=new Tostring();
		//System.out.println(s1);
		char[] arr={'s','g','g','s','c','l','g','w','s','a','d','g','g','s','a','d','g','g','s','c','l','g','w','s','a','d'};
		String res=s1.chararryToString(arr);
		System.out.println(res);
	}
}
