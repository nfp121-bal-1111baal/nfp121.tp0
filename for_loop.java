import java.util.Iterator;
import java.util.Scanner;
public class for_loop {

	public static void main(String[] args) {
		/*int count = 2;
		for ( ; count <= 12; count += 3 ) 
		System.out.println( "count is: " + count );*/
		
		/*int count = 2;
		for ( ; ; count += 3 ){ 
		System.out.println( "count is: " + count );
		if(count > 12) break;}*/
		
		/*int count = 2;
		for ( ; ; ){ 
		System.out.println( "count is: " + count );
		count += 3;
		if(count > 12) break;}*/
		
		//for ( ; ; ) System.out.println( "count is: " + 1 );
	
		/*for (int i=0; i<15; i++){
			System.out.println( "count is: " + i );
			}*/
		
		
		// for sentinel-controlled loop
		
		/*Scanner scan = new Scanner( System.in );
		double x;
		System.out.print("Enter a value for x or -1 to exit: ") ;
		x = scan.nextDouble();
		for ( ; x >= 0.0 ; ) {
		System.out.println( "Square root of "+x+" is "+Math.sqrt(x)); 
		System.out.print("Enter a value for x or -1 to exit: ") ;
		x = scan.nextDouble(); }*/
		
		//Result-controlled loop
		/*double dollars = 1000.00 ;
	    final  double interest = 0.05;
	    int    year = 0;     

	    while ( dollars < 1000000.00 )
	    {
	      // add another year's interest

	      dollars = dollars + dollars*interest; 

	      year    = year + 1;
	    }*/
		
		
		
		
			
		
		//Nested Loop         Pythagore Triangle
		/*for(int i=1; i<=9; i++) 
			System.out.print("\t"+i);	 
		System.out.println();
		for(int i=1; i<=9; i++) {
			System.out.print(i);
			for(int j=1; j<=9; j++) 
				System.out.print("\t"+i*j);
			System.out.println(); }*/
		
		// Parallel Loop
		/*for(int i=0, j=10; i<=10 && j>=0; i++, j--)
			System.out.println("i = " + i + " j = " + j + "   i*j = " + i*j);*/
		
		
		
		
		
		/*Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
			for (int i = -(n-1); Math.abs(i)<n ;i++) {      //4,3,2,1,0,1,2,3,4
				for (int j = 0; j< (n-1)-Math.abs(i); j++)	//0,1,2,3,4,3,2,1,0
					System.out.print(" ");
				for (int k = 0; k < Math.abs(i)+1; k++) 
					System.out.print("*");
				System.out.println();
			}
			*/
		/*Scanner scan = new Scanner(System.in);
		int b;
		int sum = 0;
		for (int i = 7; i >= 0; i--) {
			do {
			System.out.println("Enter a binary digit number " + i + " : ");
			b = scan.nextInt();
			}while(b != 0 && b!= 1);
			sum += b*(int) Math.pow(2, i);
		}
		System.out.println(sum);	*/
		
		
		
		
		
		
		
		//		* * * * *               0 spaces     5 stars      1 line
		// 		  * * * *               1 space      4 stars      2 line
		//  		* * *               2 spaces     3 stars      3 line
		//  		  * * 				3 spaces     2 stars      4 line
		//  		    *               4 spaces     1 star       5 line
 		// 			  * *               3 spaces     2 stars      6 line
		// 			* * *				2 spaces     3 stars      7 line
		// 		  * * * *				1 space      4 stars      8 line
		//		* * * * *				0 spaces     5 stars      9 line
		
		
		
		/*Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		for (int j = -(int)(n/2); Math.abs(j) <= (int)(n/2); j++) {      //3,2,1,0,1,2,3
			for (int j2 = 0; j2 < Math.abs(j); j2++) //3,2,1,0,1,2,3
				System.out.print(' ');
			for (int i = 0; i < n-2*Math.abs(j); i++)   //1,3,5,7,5,3,1
				System.out.print('*');
			for (int k=0 ; k< Math.abs(j);k++)
				System.out.print(' ');
			System.out.println();
		}
	*/
		/*
		int n =4567;
		int sum =0;
		for (int j = 1; j <= 4; j++) {
			sum += n%10;
			n = (int)((n - n%10)/10);
		}
		
		System.out.println(sum);*/
		
		
		Scanner scan = new Scanner(System.in);
		/*	int n = scan.nextInt();
		double b = n;
		int k =0;
		while(b>1.0) {
			b = b/2;
			k++;
		}
		
		if(b == 1.0)
			System.out.println(n + " is 2 to the power " + k);
		else 
			System.out.println(n + " is not a power of 2");*/

		
		
		/*int n;
		int sum = 0;
		for(int i =7 ;  i>=0 ;  i--){             
			do {
				System.out.println("Enter digit 0 or 1 number " + i);        
				n = scan.nextInt(); 
			}while(n != 0  &&  n!=1);
			
			sum += n*(Math.pow(2, i));                       
		}
		System.out.println(sum);*/
		//  0  0   0   0   1   0  1   1
		
		/*						        
		                   // 4,3,2,1,0,1,2,3,4   
		* * * * *    //       0,1,2,3,4,3,2,1,0   space
		K * * * *			  5,4,3,2,1,2,3,4,5	  *
		K K * * *
		K K K * * 
		K K K K *
		K K K * *
		K K * * *
		K * * * *
		* * * * *
		
		*/
		/*for (int i = -4; i <= 4; i++) {
			for (int j = 0; j < 4-(int)(Math.abs(i)); j++) { 
				System.out.print(" ");	
			}
			for (int k = 0; k < 1+(int)(Math.abs(i)); k++) {
				System.out.print("*");
			}
			System.out.println();
			
		}*/
		
		
//		   *                   // -3,-2,-1,0,1,2,3
//		 * * *				   //  3, 2, 1,0,1,2,3	
//	   * * * * *               //  1, 3, 5,7,5,3,1
//	 * * * * * * *
//	   * * * * *
//	     * * *
//		   *
		/*for (int i = -3; i <= 3; i++) {
			for (int j = 0; j < (int)(Math.abs(i)); j++) { 
				System.out.print(" ");	
			}
			for (int k = 0; k < 7-2*(int)(Math.abs(i)); k++) {
				System.out.print("*");
			}
			System.out.println()
			
		}*/
		//2 2
		
		//4 3 

		/*int i=2;
		for(int j=0; j<40; j %= 5){ // i=2   j=2    
			System.out.print(i-- + " ");  
			++j;
			if((j++ * i) % 3 == 0) continue;  // 
			if((j*i)% 7 == 0) break;
			System.out.println(j++*i-- + " ");    
			i += 4;
			if(i<20) {
				System.out.println();
				continue;
				}
			}
		System.out.println();*/
		
		/*					   //0,1,2,3,4,5
		     *                 //5,4,3,2,1,0
		    * *				   //1,1,1,1,1,1	
		   *   *			   //0,1,3,5,7,9	
		  *     *              //0,1,1,1,1,1
		 *       *
		*		  *          
	
		 */
		
	/*	for(int i =0;i<6;i++) {
			for(int j =0;j<5-i;j++) System.out.print(" ");
			System.out.print("*");
			for(int l=0;l<2*i-1;l++) System.out.print(" ");
			if(i == 0) {System.out.println();;continue;}
			System.out.print("*");
			System.out.println();	
		}
		*/
	}
}
