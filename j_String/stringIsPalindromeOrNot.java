class Name{
public static boolean isPalindromeString(String str){
String rev=" ";
boolean ans=false;
		for(int i=str.length()-1;i>=0;i--){
		rev=rev+str.charAt(i);
		}
if(str.equals(rev)){
ans=true;
}
return ans;
}
public static void main(String[] args){
String str="dsd";
str=str.toLowerCase();
boolean a=isPalindromeString(str);
System.out.println(a);
}
}

class Name2{
	public static boolean isPalindrome(String s)
{
		String rev = "";
		boolean ans = false;
		for (int i = s.length() - 1; i >= 0; i--) {
			rev = rev + s.charAt(i);
		}
		if (s.equals(rev)) {
			ans = true;
		}
		return ans;
	}
	public static void main(String[] args)
	{
		String str = "dsd";
		str = str.toLowerCase();
		boolean A = isPalindrome(str);
		System.out.println(A);
	}
}

