import java.util.Scanner;
class prime{
public static void main(String[] args){
	 int a;
	Scanner obj=new Scanner(System.in);
	 a=obj.nextInt();
	 p_num(a);
	 System.out.println(p_num(a));

}

     static int p_num(int n){
		if(n==1)
		return -1;
					if(n==2||n==3){
					return 1;
					}

		for(int i=5;i<n;i=i+6){
				if(n%i==0||n%(i+2)==0){
				return -1;
				}
			//else{
			 //	return 1;
			//}
		}
		return 1;
	}


}
