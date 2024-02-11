import java.util.*;
class 	StringPrint{
public static void main(String args[]){
String s1="geeksforgeeks";
//System.out.println(s1);
s1=s1+"microsoft";
String s2="sggs";
/*System.out.println(s1);
System.out.println(s1.substring(0));
System.out.println(s1.contains("apple"));
System.out.println(s1.contains("microsoft"));
String s2="sggs";
//System.out.println(s2);
//System.out.println(s1.equals(s2));
//System.out.println(Objects.equals(s1, s2));*/
System.out.println("string are lexiographically equal or not-->");
//System.out.println(s1.equals(s2));
String name="DHANSHRI";
String name2="dhanshri";
System.out.println(name.equalsIgnoreCase(name2));
if(name==name2){
System.out.println("Equal Strings");
}
else{
System.out.println(" Not Equal Strings");
}
}
}
