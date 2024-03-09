class college
{
	int college_id =786;
	int y=2024;
	college(){
	 	System.out.println("inside constructor of college-->"+this);
	 }
	
	 {
		System.out.println("inside init of college-->"+this);
	 }
	
	static {
		System.out.println("inside college static");
	}
	

	 public String toString(){ //it retrun the object of class
		return "shruti="+y;
	}
	//if we dont write object return type for college it will take diffrenent address kyuki baap baap hota hai vo beta ka surname mhi leta beta baap ka surname leta hai
}
class SGGS extends college {
	 static int x=86;
				 int y=20524;
				 int z=2027;
				 
				 {
					 System.out.println("inside init of SGGS-->"+this);
					 System.out.println(y);
					 System.out.println(college_id);
				 }
				 
				 SGGS(){
				 System.out.println("inside constructor of sggs-->"+this);
				 }
				 
				  static {
					System.out.println("inside sggs static");
				}
		
		
				public String toString(){ //it retrun the object of class
				return "hi="+y;
				}
	 public static void main(String args[]){
			 System.out.println("inside main");
			 
			 SGGS sggs1=new SGGS();//this will point out both class object
			 
			college c1=new college();//this will point out only college class object so init and constructor is execute once more 
			
			 System.out.println("inside ssgs1-->"+sggs1);//retrun instance variable of sggs obj
			System.out.println("inside c1-->"+c1);//return college object
			System.out.println(sggs1.y);
	 }	
		
}
