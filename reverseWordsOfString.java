class Reverse{
public static void reversetheString(char str[]){
int size=str.length;
int start=0;
for(int end=0;end<size;end++){
if(str[end]==' '){
reverse(str,start,end-1);
start=end+1;
}
}
//reverse(str,start,size-1);
reverse(str,0,size-1);
//System.out.println(str);
}
public static void reverse(char str[] ,int low ,int high){
while(low<=high){
char temp=str[low];
str[low]=str[high];
str[high]=temp;
low++;
high--;
}
}
public static void main(String args[]){
String s="Dhanshri Baswade";
char[] s2=reversetheString(s);
System.out.println(s2);
}
}
