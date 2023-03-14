import java.util.Scanner;
class TransposeMatrix
{
public static void main(String args[])
{
int a[][]=new int[3][3];
int b=a.length;

Scanner sc=new Scanner(System.in);

for(int i = 0; i < b; i++)
{
  for(int j = 0; j < b; j++)
  {
    System.out.println("Enter Matrix: "+(i+1)+" "+j);
    a[i][j]=sc.nextInt();
   }
}

 System.out.println("Given Matrix is: ");

for(int i = 0; i < b; i++)
{
  for(int j = 0; j < b; j++)
  {
    System.out.print(a[i][j]+" ");
   }
System.out.println(" ");
}

System.out.println("Transpose Matrix: ");
for(int i = 0; i < b; i++)
{
  for(int j = 0; j < b; j++)
  {
    System.out.print(a[j][i]+" ");
   }
System.out.println(" ");
}

}
}