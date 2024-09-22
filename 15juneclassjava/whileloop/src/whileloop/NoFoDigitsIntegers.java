package whileloop;

public class NoFoDigitsIntegers {

//	public static void main(String[] args) {
//		int i=0,n=87199;
//		while (n !=0) {
//			n /=10;
//			++i;
//		}
//		System.out.println("number of degist:"+i);
//		}
	public static void main(String[] args) {
		int i=8718 , v=0;
		while(i !=0) {
		int digit= i%10;
		
		i /=10;
		v=v*10+digit;
		}
		System.out.println("reversed number :"+ v);
	}
	}


