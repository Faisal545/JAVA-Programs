public class magic_Box
{
		// 	This is 5*5 Magic Box code.
		
	public static void main(String args[])
{
	int mag[][]=new int [5][5];
	int row=0;
	int col=2;
	
	mag[row][col]=1;
	
	for(int i=2;i<=25;i++)
	{
		row--;
		col++;
	
		if(row<0&&col>4)
		{
		row=1;
		col=4;
		}
			
		if(row<0)
		{
			row=4;
		}
		
	
		if(col>4)
		{
			col=0;	
		}
	
	
	
		if(mag[row][col] != 0)
		{
			row += 2;
			col--;
	  
	  //  mag[row][col]=i;  	// This is optional line.
	  
		}
		
		if( mag[row][col] == 0)
		{
			mag[row][col] = i;
		}

	}
	
	for(int i=0; i<mag.length; i++)
	{
		for(int j=0; j<mag[i].length; j++)
		{
			System.out.print(mag[i][j] +"\t");
		     
		}
		System.out.print("\n");
	}
}
}