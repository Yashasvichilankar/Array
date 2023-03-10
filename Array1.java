import java.util.Arrays;

public class Array1 {
	public static void main(String[] args) {
		int[] arr1={545, 85, 75 ,547, 68, 87, 576, 7};
		String[] arr2={"java","python","C language","c++"};
		
		System.out.println("Numeric original array"+Arrays.toString(arr1));
		Arrays.sort(arr1);
		
		System.out.println("Sorted numeric array: "+Arrays.toString(arr1));
		
		
		System.out.println("Original String array"+Arrays.toString(arr2));
		Arrays.sort(arr2);
	
		
		System.out.println("Sorted String Array"+Arrays.toString(arr2));
		
	}

}
