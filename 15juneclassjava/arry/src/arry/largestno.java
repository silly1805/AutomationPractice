package arry;

public class largestno {

	public static void main(String[] args) {
//		int temp,size;
//		int arr[]=new int[] {1,87,99,56,78,100};
//		size=arr.length;
//		for(int i=0;i<arr.length;i++) {
//			for(int j=i+1;j<arr.length;j++) {
//				if (arr[i]<arr[j]) {
//					temp=arr[i];
//					arr[i]=arr[j];
//					arr[j]=temp;
//				}
//			}
//		}
//		System.out.println("third largest no :-"+arr [size -3]);
//		
//		/* 2nd largest numbe*/
		int temp,size;
		int arr[]=new int[] {1,87,99,56,78,10};
		size=arr.length;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
System.out.println("second largest number:- "+arr [size-2]);		
//		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
