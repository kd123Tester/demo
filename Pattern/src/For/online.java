package For;

public class online {

	public static void main(String[] args) {
		pattern1(5);
	}

	static  void pattern1(int n) 	{
		
		for(int row=1; row<=n;row++)
		{
		
		for(int col=1;col<=n-row+1;col++)
		{
			
		 System.out.print("*");
		 
		}
			System.out.println();
		}
}

}
