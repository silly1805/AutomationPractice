package forloop;

public class intergers {

	//public static void main(String[] args) {
	// int v= 0 , r = 871999;
	//	 for(;r != 0; r /=10, ++v ) {
	//		  }
//	 System.out.println("number of digits :"+v);
	//	 }
	//public static void main(String[] args) {
	//int v=871999,r=0;
	//for(;v !=0;v /=10) {
	//	int digit=v%10;
	//	r=r*10+digit;
	//	}
	//	System.out.println("reversed number"+r);
	//}
   // public static void main(String[] args) {
	//	int r,sum=0,temp;
	//int n=8719;
	//temp=n;
	//	for(;n>0;){
	//	r=n%10;
	//	  sum=(sum*10)+r;
	//	n=n/10;
	//			}
	//if (temp==sum)
	//	System.out.println("palindrome number");
	//	else 
	//	System.out.println("not palindrome");}
		public static void main(String[] args) {
			int n=11;
			int i=0;
		    for(int j =1 ; j<=n/2;j++) {
		    	if (n%j==0) {
		    		i++;
		    		    	}
		                }
		    if (i>1) {
		    	System.out.println("the number is not prime");
		    }
		    else {
		    	System.out.println("the number is prime");
		    }
		}
		
				
		}
	
    
		

