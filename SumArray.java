
public class SumArray {
	
	static int arr[]={1,2,3,4,5,6,7,8,9};
		
		
	static int sum()
	{
		int sum=0;
		for(int i=0;i<arr.length;i++)
		
			sum+=arr[i];
			return sum;
		
	}
	public static void main(String[] args)
	{
	System.out.println("Sum of the array is: "+sum());

}
}