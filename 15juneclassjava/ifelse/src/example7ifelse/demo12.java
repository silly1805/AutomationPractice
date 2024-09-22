package example7ifelse;

public class demo12 {

        public static void main(String[] args) {
        	char ch = 'i';
        	if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
        		System.out.println(ch + "is vowel");
        	else
        		System.out.println(ch+"is consonant");
   
        
        	 int num = 25;
       	  if (num<=45) {
       		  if (num>=15) {
       		System.out.println("you area not fail");  
       	  }else { 
       		  System.out.println("you are pass");
       	  } 
       	}else {
       		System.out.println("you area pass in first class");
       		}
       	  System.out.println("**********Even number b/n 1 to 50**************");
       	  for(int i=75;i>=60;i--) {
       		  if (i%2!=0) {
       			  System.out.println(i);
       		  }
       	  }
        
        
        
        
        
        
        
        }
}