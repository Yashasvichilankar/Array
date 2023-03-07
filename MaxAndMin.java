import java.util.Scanner;

public class MaxAndMin {
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		int arr[]=new int [2];
		System.out.println("Enter elements in array: ");
		int max=Integer.MAX_VALUE;
		int min=Integer.MIN_VALUE;
		for(int i=0; i<arr.length; i++)
		{
			arr[i]=sc.nextInt();
			if (arr[i]<min)
			{
				min=arr[i];
			}
			if(arr[i]>max)
			{
				max=arr[i];
			}
		}
		System.out.println("Maximum value from the above element is: "+max);
		System.out.println("Minimum value from the above element is: "+min);
		
	}

}
