class 	StringPrint{
public static void main(String args[]){
String s1="geeksforgeeks";
System.out.println(s1);
s1=s1+"microsoft";
System.out.println(s1);
System.out.println(s1.substring(0));
System.out.println(s1.contains("apple"));
System.out.println(s1.contains("microsoft"));
String s2="sggs";
System.out.println(s2);
System.out.println(s1.equals(s2));
String s3="  ";

for(int i=s1.length()-1	;i>=0;i--){
s3=s3+s1[i];
}

}
}
