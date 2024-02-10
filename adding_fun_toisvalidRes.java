class Number{
public static void main(String args[]){
	String arr[]={"2022bit049","2022bit50","2022bit051"};
	String s="2022bme819";
	// final result  that ->Number Valid or Not->
	 System.out.println(getValidRegistrationNumber(s));
	   
	}
	//1 st function checcking valid restration number
	 public static boolean getValidRegistrationNumber(String s){//1
if(valid_Length(s)==true&&valid_first_four_Digit(s)==true&&validBranch(s)==true&& last_Three_Digit(s)==true)
	{
	return true;
	}
	else{
	return false;
        }
        }
        	//   3 rd function Cheacking for valid length of String 
	public static boolean valid_Length(String s){//2
	if(s.length()==10){
	return true;
	}
	return false;
	}
	
	public static int count_Res_1_50(String s){//
	   return 0;
	}
	// 4 th fun->Cheacking for valid branch or not
	public static boolean validBranch(String s){//3
	if((s.charAt(4)=='b'&&s.charAt(5)=='i'&&s.charAt(6)=='t')||(s.charAt(4)=='b'&&s.charAt(5)=='c'&&s.charAt(6)=='s') ||(s.charAt(4)=='b'&&s.charAt(5)=='c'&&s.charAt(6)=='h')||    (s.charAt(4)=='b'&&s.charAt(5)=='m'&&s.charAt(6)=='e')){
	return true;
	}
	return false;
	}
		//5 th function to check  four digits of string are digit or Character 
	public static boolean valid_first_four_Digit(String s){//5
	if(s.charAt(0)=='2'&& s.charAt(1)=='0'){
	if((s.charAt(2)=='1'||s.charAt(2)=='0'&&s.charAt(3)>='0')||(s.charAt(2)=='2'&&s.charAt(3)<='4'))
	{
	return  true;
	}
	}
        return false;
	}
	//6 th function to check last  three digits of string are digit or Character 
	public static boolean  last_Three_Digit(String s){
    			if(Character.isDigit(s.charAt(7))==true){
    			
    			if(Character.isDigit(s.charAt(8))==true){
    			
    			if(Character.isDigit(s.charAt(9))==true){
    			
			if((s.charAt(7)>='0'&&s.charAt(8)>='0'&&s.charAt(9)>='0')){
			return  true;
			}
			else{
				return false;
			}
			}else{
				return false;
			}
			}
			else{
				return false;
			}
			}
	return false;
       }

}
	/*System.out.println(Character.isDigit(s.charAt(7)));
	System.out.println(Character.isDigit(s.charAt(8)));
	System.out.println(Character.isDigit(s.charAt(9)));
		String s1="2022bcsaaa";
*/
