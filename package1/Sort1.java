package package1;

public class Sort1 {
	public void main(String[] args) {
		/*
		 * 
		 */try {
				myMultiplication();//===========
				myDivide(5, 0);//===========
				
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
					break;//this means stop  
				}
               System.out.printf("%d * %d = %d \n",i, j, i*j);  
		         
		     }
           System.out.println("\n");
	     }
	}//END of myMultiplication
	/*
	 * 2
	 */
	public static double myDivide(int a, int b) {
		double result = a/b;
		return result;
	}

}//END of class
