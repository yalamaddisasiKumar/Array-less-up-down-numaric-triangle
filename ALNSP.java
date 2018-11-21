import java.util.Scanner;
public class ALNSP {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n,a,r,l;
		System.out.print("N:");
		n=sc.nextInt();
		for(int i=1;i<=n;i++)
			System.out.print(i+"  ");
		System.out.println();
		if(n%2==0){ a=n/2; l=a+1; r=a; } 
		else { a=n/2+1; l=a; r=a-1;}
		for(int i=2;i<=n;i++)
		{
			int v=0;
			for(int j=1;j<=n;j++)
			{
				if(i<=a)
				{
					if(j==1) v=n*2+(n-2)*2-i+2;
					else if(j<i)
						v+=(n-(j-1)*2)*2+((n-(j-1)*2)-2)*2+1;
					else if(j>=i && j<=(n-i+1))
						v++;
					else{ v=v-((n-((n-j+1)*2-1))*2+(n-((n-j+1)*2-1)-2)*2+1 );
					}
					System.out.print(v+" ");
				}
				else
				{
					if(j==1)  v=n*2+(n-2)*2-i+2;
					else if(j<l)
						v+=(n-(j-1)*2)*2+((n-(j-1)*2)-2)*2+1;
					else if(j>=l && j<=n-r)
						v--;
					else v=v-((n-((n-j+1)*2-1))*2+(n-((n-j+1)*2-1)-2)*2+1 );
					System.out.print(v+" ");
				}	
			}
			System.out.println();
			if(i>a){ l--;};
			if(i>=a) r--;		
		}
	}
}
