package arry;

public class ascendingdescanding {

	public static void main(String[] args) {
//		int []arr= new int[] {1,2,8,9,10,5,3,7};
//		int temp=0;
//		System.out.println("elements of original array");
//		for(int i=0;i<arr.length;i++) {
//		System.out.println(arr[i]+" ");}
//		for(int i=0;i<arr.length;i++) {
//			for(int j=i+1;j<arr.length;j++) {
//				if(arr[i]<arr[j]) {
//					temp=arr[i];
//					arr[i]=arr[j];
//					arr[j]=temp;
//				}
//			}
//		}
//		System.out.println("elemst of arry in dessending order");
//		for (int i=0;i<arr.length;i++) {
//			System.out.println(arr[i]+" ");
//		}
		
		
		/* asending order*/
		
		int []arr= new int[] {1,2,8,9,10,5,3,7};
		int temp=0;
		System.out.println("elements of original array");
		for(int i=0;i<arr.length;i++) {
		System.out.println(arr[i]+" ");}
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println("elemst of arry in dessending order");
		for (int i=0;i<arr.length;i++) {
			System.out.println(arr[i]+" ");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
}

}
