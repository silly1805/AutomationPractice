package day1;

public class day1 {

	public static void main(String[] args) {
	int num = 8719; 
	int rev =0;
	while (num != 0) {
		 rev = num % 10;
		 rev = rev * 10 +rev;
		 num = num/10;
	}
	System.out.println("rev no :"+rev);

	}

}
