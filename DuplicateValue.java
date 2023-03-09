import java.util.Scanner;

public class DuplicateValue {
public static void main(String[] args) {
	
	int a[]=new int[5];
	
	Scanner sc=new Scanner(System.in);
	
	System.out.println("Enter any "+a.length+" numbers:");
	for(int n=0;n<a.length;n++)
	{
		a[n]=sc.nextInt();
	}
	
	System.out.println("Duplicate value in the given array is: ");
	
	for(int i=0;i<a.length;i++)
	{
	
		for(int j=0;j<a.length;j++)
		{
			if(a[i]==a[j])
				System.out.println(a[j]);
		}
	}
	
}
}