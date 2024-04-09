class Demo{
	public static void main(String args[]){
		int i=0;
		int j=0;
		try{
			j=18/i;
			System.out.println(args[0]);
			
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Array index out of Bound-->\n");
			System.out.println(e);
				
		}
		catch(ArithmeticException e){
			System.out.println("Exception get handled ");
			System.out.println("Arithmetic Exception-->\n"+e);
				
		}
		catch(Exception e){
			System.out.println("Exception Catch Block ");
			System.out.println(e);
		}
		//System.out.println(j);
	}
}
