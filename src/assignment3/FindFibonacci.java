package assignment3;

public class FindFibonacci {

	public static void main(String[] args) {
		
		int f1= 0;
		int f2= 1;
		int f3;
		
		for(int i=0; i<10; i++) {
			
			f3= f1+f2;
			
			f1=f2;
			
			f2=f3;
			
	
			
			System.out.println(f3);
		}

	}

}
