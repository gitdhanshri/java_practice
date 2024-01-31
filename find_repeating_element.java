//import java.util.Scanner;
class repeat_ele{
	public static void main(String[] args){
		int arr[]={0,2,1,3,2,2,2,5};
		int repeating_ele=repeat_ele(arr);
		System.out.println(repeating_ele);
	}
		static int repeat_ele(int arr[]){
			for(int i=0;i<arr.length;i++){
				for(int j=i+1;j<arr.length;j++){
						if(arr[i]==arr[j]){
						 return arr[i];
						}
				   }
			  }
			  return -1;
		  }
	
}

