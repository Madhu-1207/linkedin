class B
{
	public static void main(String[] args)
	{
		 for(int i=1;i<=n;i++)
    		{
        		for(int j=i-1;j<=n;j++)
        		{
            			System.out.print(" ");
        		}
        		for(int j=i;j<=i;j++)
        		{
            			System.out.print("* ");
        		}
        		System.out.println("");
    		}
		for(int i=n;i>=1;i--)
    		{
        		for(int j=n;j>=i;j--)
        		{
            			System.out.print(" ");
        		}
        		for(int j=i;j>=i;j--)
        		{
            			System.out.print("* ");
        		}
        		System.out.println("");
    		}
		for(int i=1;i<=n;i++)
    		{
        		for(int j=i-1;j<=n;j++)
        		{
            			System.out.print(" ");
        		}
        		for(int j=i;j<=i;j++)
        		{
            			System.out.print("* ");
        		}
        		System.out.println("");
    		} 
	}
}
