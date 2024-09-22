package arry;

  public class copy {

	public static void main(String[] args) {
	int [] arr1 = new int [] {1,2,3,4};
	int [] arr2 = new int [arr1.length];
	for (int i =0; i<arr1.length;i++) {
		arr2[i]= arr1[i];
		}
	System.out.print("elements of original array :");
	 for (int i =0 ; i < arr1.length;i++) {
		 System.out.print(arr1[i]+"");
		 }
	 System.out.println();
	 System.out.print("elemnts  of new array:");
	 for(int i = 0; i<arr2.length;i++) {
		 System.out.println(arr2[i]+"");
	 }
		
//		int []arr = new int[] {1,2,8,3,2,2,2,5,1};
//		int[]fr = new int [arr.length];
//		int visited = -1;
//		for (int i=0;i<arr.length;i++) {
//			int count =1;
//	    for (int j = i +1;j<arr.length;j++){
//	    	if (arr [i]==arr[j]) {
//	    		count++;
//	    		fr[j]= visited;
//	    	}
//			}
//	    if (fr[i] != visited);
//	    fr [i]= count;
//			}
//		System.out.println("element | frequency");
//		System.out.println("-------------------");
//		for(int i=0;i<fr.length;i++) {
//			if (fr [i]!=visited);
//			System.out.println(""+arr[i]+"\t|\t"+fr[i]);
//		}
//		System.out.println("-------------------");
//		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}




