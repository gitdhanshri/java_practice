class person{
	private String name;
	private int age;
	public void setname(String s){
		this.name=s;
	}
	public void setage(int a){
		this.age=a;
	} 
	public String getname(){
		return name;
	} 
	public int getage(){
		return age;
	} 
}
class method{
	public static void main(String args[]){
		person p1=new person();
		p1.setname("Raju");
		p1.setage(25);
		System.out.println("Name-->"+p1.getname());
		System.out.println("Age-->"+p1.getage());
	}
}
