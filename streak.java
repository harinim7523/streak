package day33;
import java.util.*;
public class streak {
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter s and n");
	int s=sc.nextInt();
	int n=sc.nextInt();
	int i,k,j,c=0,a=0;;
	for(i=1;i<=n;i++)
	{
		k=i;
		for(j=1;j<=n;j++)
		{
			if(k%j==0)
			{
				c++;
				k++;
				
			}
			else
			{
				break;
			}
		}
		if(c==s)
		{
			System.out.println(k-s);
			a++;
		}
		c=0;
		
	}
	System.out.println(a);
}
}
