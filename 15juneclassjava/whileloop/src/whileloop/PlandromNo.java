package whileloop;

public class PlandromNo {

//	public static void main(String[] args) {
//	int v,sum=0,tem;
//	 int r=121;
//	    tem=r;
//	    while (r>0) {
//	    	v = r%10;
//	    	sum=(sum*10)+v;
//	    			r=r/10;
//	    			}
//	  if(tem==sum)
//		  System.out.println("palindrome numer");
//	 , else
//		  System.out.println("not palindrome");
//	}
//     public static void main(String[] args) {
//    	int n =33;
//    	int i=2;
//    	while(i<=n /2) {
//    		if (n%i==0) {
//    			
//    			break;
//    		}
//    		++i;
//    		}
//    	if (i>1) {
//    		System.out.println(n+"is a number is prime");
//    	}
//    	else {
//    		System.out.println(n+"the number is not prime");
//    	}
//    	}
	public static void main(String[] args) {
		int num=871,originalNumber,remainder,result=0;
		originalNumber = num ;
		while (originalNumber !=0) {
			remainder = originalNumber%10;
			result +=Math.pow(remainder,3);
			originalNumber/=10;
			}
		if (result == num)
			System.out.println(num+"is an armstrong numer");
		else 
			System.out.println(num+"is not an armstrong numer");
	}
}
