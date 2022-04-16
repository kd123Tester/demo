package Pattern;

public class Pattern2 {
	public static void main(String[] args) {
		
		int row=6;
		  //outer loop work for rows
		 for(int i=0;i<row;i++)
		{
		  // inner loop work for space
		for(int j=row;j>=0;j--)
		{
			// print space between two star
		    System.out.println("");
		
		}//inner loop for columns
		for(int j=0;j<=i;j++)
		{
		    System.out.print("*");
		}
		    
		}
	}
	

}
