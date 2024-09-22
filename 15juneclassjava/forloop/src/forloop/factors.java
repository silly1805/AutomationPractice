package forloop;

public class factors {

//	public static void main(String[] args) {
//     int n=50;
//     System.out.println("factorsof"+n+"area:");
//     for(int i = 1;i<= n ; ++i) {
//    	 if (n%i==0) {
//    		 System.out.println(i+" ");
//     }
//     }
//     }
	  public static void main(String[] args) {
      int num=-20;
      System.out.println("factors "+num+"area:");
      for (int i=num;i<=-(num);++i) {
    	  if (i==0) {
    		  continue;}
    	  else {
    		  if(num%i==0) {
    			  System.out.println(i+" ");
    		  }
    	  }
      }
      }
	}


