package package1;

public class Sort1 {
	public void main(String[] args) {
		/*
		 * 
		 */try {
				myMultiplication();//===========
				
				
			}
			catch(ArithmeticException e){			
				System.out.println("ESther myArithmeticException: " );
				System.out.println("\n"+ e.getMessage());			
			} 
			catch(Exception e){			
				System.out.println("Error: " + e.toString());
				System.out.println("\n"+ e.getMessage());
				e.printStackTrace();//===========			
			}finally {
//				System.out.println("\nThis will run any time");  
			}
	}//END of main 
	/*
	 * 
	 */
	public static void myMultiplication() {	
		System.out.println("  myMultiplication: " );
		first: for(int i = 1; i< 8; i++)
	     {
			for(int j = 1; j< 13; j++)
		     {//break and continue do the same thing sometime depend on how they are used
				if(i == 3) {
//					continue;//means skip the 3 * j for the entire 12 inner loop
					break;//this means stop but in this case is doing the same thing as continue because of the nested loops
//					continue first;//same thing still
//					break first;// this break outer loop therefore the inner loop also 
//					return;
				}
               System.out.printf("%d * %d = %d \n",i, j, i*j);  
		         
		     }
           System.out.println("\n");  
//           System.out.println("\n the address i is     " + $i);  
			
	     }
	}//END of myMultiplication

}
