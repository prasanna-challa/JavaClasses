import java.util.Scanner;
public class MatMul {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][],b[][],c[][],i,j,n,m,p,q,k;
		   Scanner sc=new Scanner(System.in);
		   System.out.println(" enter order of 1st matrix");
		   m=sc.nextInt();
		   n=sc.nextInt();
		   a=new int[m][n];
		   System.out.println(" enter order of 2nd matrix");
		   p=sc.nextInt();
		   q=sc.nextInt();
		   b=new int[p][q];
		   c=new int[m][q];
		   System.out.println(" en elements of 1st matrix");
		   for(i=0;i<m;i++)
		   {
			   for(j=0;j<n;j++)
				   a[i][j]=sc.nextInt();
		   }
		   System.out.println("elements of 1st matrix are: ");
		   for(i=0;i<m;i++)
		   {
			   for(j=0;j<n;j++)
				   System.out.print(a[i][j]+" ");
			   System.out.println();
		   }
		   System.out.println("enter 2nd elements matrix : ");
		   for(i=0;i<p;i++)
		   {
			   for(j=0;j<q;j++)
				   b[i][j]=sc.nextInt();
		   }
		   System.out.println("elements of 2nd matrix are: ");
		   for(i=0;i<p;i++)
		   {
			   for(j=0;j<q;j++)
				   System.out.print(b[i][j]+" ");
			   System.out.println();
		   }
		   if(n==p)
		   {
			  for(i=0;i<m;i++)
			  {
				  for(j=0;j<q;j++)
				  {
					  c[i][j]=0;
					  for(k=0;k<n;k++)
						  c[i][j]+=a[i][k]*b[k][j];
				  }
			  }
			  System.out.println("multiplication results is ");
			  for(i=0;i<m;i++)
			  {
				  for(j=0;j<q;j++)
					  System.out.print(c[i][j]+" ");
				  System.out.println();
			  }
			 
		   }
		   else
		   {
			   System.out.println("multiplication is not possible");
		   }
		   
		 
		
	}

}
