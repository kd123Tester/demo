package Pattern;

public class SpiralPattern {
	//defining method to print the spiral pattern 
	static void Spiralpattern(int size)
	{
		//create two variable row and col to traverse row
		int row=0, col=0;
		int boundary= size-1;
		int sizeLeft= size-1;
		int flag=1;
		
		char move='r';
		
		int[][]matrix= new int [size][size];
		
		for (int i=1;i<size*size+1;i++)
		{
			matrix[row][col]=i;
			switch(move)
			{
			case 'r':
				col+=1;
				break;
				
			case 'l':
				col-=1;
				break;
				
			case 'u':
			row-=1;
				break;
				
			case 'd':
				row+=1;
					break;
				
			}
			if(i==boundary) {
				
				boundary=boundary+sizeLeft;
				
				if(flag!=2) 
				{
					flag=2;
				}
				else
				{
					flag=1;
					sizeLeft-=1;
				}
				switch(move) 
				{
				case 'r':  
		            move = 'd';  
		            break;  
		        // if down, rotate to left  
		        case 'd':  
		            move = 'l';  
		            break;  
		        // if left, rotate to up  
		        case 'l':  
		            move = 'u';  
		            break;  
		        // if up, rotate to right  
		        case 'u':  
		            move = 'r';  
		            break;  
		        }  
		    }  
		    }  
		//printing the spiral matrix or pattern  
		//outer for loop for rows  
		    for (row = 0; row < size; row++)  
		    {  
		        //inner for loop for columns  
		        for (col = 0; col < size; col++)  
		            {  
		                int n = matrix[row][col];  
		                if(n < 10)  
		                    System.out.print(n +" ");  
		                else  
		                    System.out.print(n +" ");  
		            }  
		        System.out.println();  
		    }  
		}  
		//driver Code  
		public static void main(String args[])  
		{  
		//size of the array?s row and column  
		int size = 10;  
		System.out.println("Spiral Matrix or Pattern is: \n");  
		//calling the method that prints the spiral pattern or matrix   
		Spiralpattern(size);  
		}  
				
				
			
		
		
		
		
	}


