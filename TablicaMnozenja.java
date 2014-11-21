import java.util.Scanner;

public class TablicaMnozenja {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
        int num;
		System.out.println("Unesite broj ");
		num = in.nextInt();
		int m;
		
		for( m=1; m<=num;m++){
			System.out.printf("%4d", m);
			
		}
		for( int n=1; n<=num;n++){
			       	 
	        	   	     System.out.println("");    
	           int a;
	        	   	     for( a=1; a<=n;a++){
	        	   	    	System.out.print(n*a);
	        	   	     }
			
			
			
						
		
		}
		
		
	
	
	}
}
