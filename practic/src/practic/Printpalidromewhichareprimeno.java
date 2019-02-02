package practic;

public class Printpalidromewhichareprimeno {

	public static void main(String[] args) 
	{
		int count,rem,sum,no,no2;
		for(int i=2;i<=1000;i++)
		{
			count=0;
			for(int j=1;j<=i;j++)
			{
				if(i%j==0)
				{
					count++;
				}
			}
			if(count==0)
			{
				rem=0;sum=0;no=i;no2=i;
				while(no>0)
				{
					rem=no%10;
					sum=sum*10+rem;
					no=no/10;
				}
				if(no2==sum)
				{
					System.out.println(no2+" is prime and palidrom");
				}
				
			}
		}
		

	}

}
