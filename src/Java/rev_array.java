package Java;

public class rev_array {

	public static void main(String[] args) {
	int [] arr = new int[] {1,2,3,4,5,6,7,8,9,10};
	System.out.println("array:");
	for(int i = 0; i<arr.length; i++) {
	System.out.print(arr[i]+" ");
	}
	System.out.println();
	System.out.println("Reverse array with alternate numbers:");
	for(int i=arr.length-1; i>=0; i-=2) {
		System.out.print(arr[i]+ " ");
	}
}
}