package methodas;

public class methods {

	public static void main(String[] args) {
		int num = 100;
		getfactors(num);
		primenumber(12,50);
		methods ref =new methods();
		System.out.println("reverse number is :"+ref.reversenumber(871999));
		
		
	}
   static void getfactors(int num)
   {
	   for (int i =1;i<=(num/2);i++)
	   {
		   if (num%i==0) {
			   System.out.println(i+" ");
		   }
	   }
	  System.out.println(num);
	   
   }
	static void primenumber(int start ,int end) {
		System.out.println("prime number"+start+"to"+end);
		for(;start<=end;start++) {
			int ct=0;
			for (int i =1;i<=start;i++) {
				if (start%i==0) {
					ct++;
				}
			}
			if (ct==2) {
				System.out.println("prime number"+start);
			}
		}
		
	}
	
	
	
	public int reversenumber(int num) {
		System.out.println("original nymber is:"+num);
		int rev=0,rem;
		while(num>0) {
			rem=num%10;
			rev=rev*10+rem;
			num=num/10;
	}
		return rev;
	}
	
	
}


















/* WAP to factor of any given number

WAP to print prime number between given range

WAP to get reverse number of given number
*/