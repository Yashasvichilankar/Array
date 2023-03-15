class AddMatrix
{
public static void main(String args[])
{
int a[][]={{1,2,3},{4,5,6},{7,8,9}};

int b[][]={{4,3,2},{1,3,6},{5,8,1}};

int row=a.length;
int column=b.length;

int c[][]=new int [row][column];
 
 for(int i=0;i<row;i++)
  {
    for(int j=0;j<column;j++)
     {
       c[i][j]=a[i][j]+b[i][j];
     }
}
System.out.println("Addition of the given matrix: ");

  for(int i=0;i<row;i++)
  {
    for(int j=0;j<column;j++)
     {
       System.out.println(c[i][j]+" ");

     }
 System.out.println();
  }
 System.out.println();
}
}

