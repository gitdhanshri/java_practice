class college
{
	static int college_id =786;
	int y=2024;
	int age=100;
	//college c2;
	//intit block of college
	// System.out.println("Value of x-->"+x);
	{
		System.out.println("inside init  Block of college-->"+this);
	}
	static {
		System.out.println("inside college static");
	}
	college(){
		System.out.println("inside constructor of college-->"+this);
	}
	public String toString(){ //it retrun the object of class
		return "collgeaddress";
	}
}
class SGGS extends college {
	 static int x=86;
	 int z=2027;
	  {
		 System.out.println("inside init of SGGS-->"+this);
		 System.out.println("Value of Y-->"+y);
		 System.out.println("Value of age -->"+age);
		 System.out.println("college id-->"+college_id);
	 }
	 SGGS(){
		 System.out.println("inside constructor of sggs-->"+this);
	 }
	 
	 static {
		System.out.println("inside sggs static BLock  1");
	// System.out.println("Value of Y-->"+y);
		 System.out.println("college id-->"+college_id);
	 }
	 static {
		System.out.println("inside sggs static BLock  2");
	 }
	 public String toString(){
		return "sggsaddress";
	 }
	  public static void main(String args[]){
		 System.out.println("inside main");
		 System.out.println("collge id Number---->"+college_id);
		 SGGS sggs1=new SGGS();
		 //this will point out both class object
		 // System.out.println("collge id Number"+college_id);
		 college c1=new college();
		 //this will point out only college class object 
		 System.out.println("inside ssgs1-->"+sggs1);
		 //retrun instance variable
		 System.out.println(college_id);
	 }
	//college c1=new college();
		
}
