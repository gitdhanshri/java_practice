class Tostring{
	//1 st Method
	public String toString(){
		return "Output-of-ToString-Method";
	}
	//2 nd method 
	String chararryToString(char[] arr){
		String str=new String(arr,6,2);
		return str;
	}
	//3 rd method
	String concat(String s1){
		String s=s1.concat("-Java Core By Own");
		return s;
	}
	//4 th method
	int lengthOfString(String str){
		return str.length();
	}
	//5 th method
	int compare2(String s1,String s2){
		int res=s1.compareTo(s2);
		return res;
	}
	//6 th method
	int compare2IgnoreCase(String s1,String s2){
		int res=s1.compareToIgnoreCase(s2);
		return res;
	
	}
	// 7th method
	boolean equals(String s1,String s2){
		boolean res=s1.equals(s2);
		return res;
	}
	//8 th method
	boolean equalsIgnoreCase(String s1,String s2){
		boolean res=s1.equals("sggs");
		return res;
	}
	//9 th method
	boolean startWith(String s2){
		String s1="Blockchain";
		boolean res=s2.startsWith(s1);
		return res;
	}
	boolean endsWith(String s2){
		String s1="DSA";
		boolean res=s1.endsWith(s2);
		return res;
	}
	int indexOf(String s2){
		String name="is";
		int res=s2.indexOf(name);
		return res;
	}
	int lastIndexOf(String s2){
		String name="is";
		int res=s2.lastIndexOf(name);
		return res;
	
	}
	String replace(char c1,char c2,String s1){
	
	 String res=s1.replace(c1,c2);
	 return res;
	}
	String subString1(int i1,String s1){
		String s2="Software";
		String res=s1.substring(i1);
		return res;
	}
	String subString2(int i1,int i2,String s1){
		String res=s1.substring(i1,i2);
	
		return res;
	}
	//This Method Removes space from  begining& Ending of the gt String
	String trim(String s1){
		String res=s1.trim();
		return res;
	}
	void getChars(){
		String  str="hello, this is a java Book";
		char arr[]=new char[20];
		str.getChars(7,21,arr,0);
		System.out.println(arr);
	
	}
	public static void main(String args[]){
		Tostring s1=new Tostring();
		//System.out.println(s1);
		char[] arr={'s','g','g','s','c','l','w','s','a','d'};
		String res=s1.chararryToString(arr);
		System.out.println(res);
		String res2=s1.concat("Learn ");
		System.out.println(res2);
		String s3="Java"+"  Programming";
		System.out.println(s3);
		System.out.println("Length of String is-->"+s1.lengthOfString(s3));
		System.out.println(s1.compare2("SGGSSCLG","sggsclg"));
		System.out.println(s1.compare2IgnoreCase("SGGS","sggs"));
		System.out.println(s1.equals("shri","shri"));
		String name1="Godawari";
		//String name2="Shri";
		System.out.println(s1.equalsIgnoreCase("SHRI","shri"));
		//System.out.println(s1.startsWith("Dhanshri"));
		System.out.println(s1.endsWith("Enginnering"));
		System.out.println(s1.indexOf("This is My Book"));
		System.out.println(s1.lastIndexOf("This is My Book"));
		System.out.println(s1.replace('i','@',"Hii java progranmming  "));
		System.out.println(s1.subString1(12,"Information Technology"));
		System.out.println(s1.subString2(12,15,"Information Technology"));
		System.out.println("Result of Trim method-->"+s1.trim("   _@Information_1 "));
		s1.getChars();
		//name1.getChars(2,4,arr,0);
	}
}
