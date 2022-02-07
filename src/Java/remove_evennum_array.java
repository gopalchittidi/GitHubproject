package Java;

public class remove_evennum_array {
	public static void main(String[] args) {
		int [] arr = new int[] {5,8,10,3,11,15,14,9};
		for(int i = 0; i<arr.length; i++)
		System.out.println(arr[i]+" ");
		//System.out.println();
		System.out.println("Even number:");
		for(int i = 0; i<arr.length; i++)
			if(arr[i]%2==0) {
				System.out.println(arr[i]+" ");
			}
		//System.out.println();
		System.out.println("Odd number:");
		for(int i = 0; i<arr.length; i++)
			if(arr[i]%2!=0) {
				System.out.println(arr[i]+" ");
}
	}
}


