public class Main
{
	public static void main(String args[])
{
	int may[][]=new int [5][5];
	int row=0;
	int col=2;
	may[row][col]=1;
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
		if(may[row][col] != 0)
	{
		row += 2;
		col--;
	   may[row][col]=i;
	}
	if( may[row][col] == 0)
	{
		may[row][col] = i;
	}

	}
	for(int i=0; i<may.length; i++)
	{
		for(int j=0; j<may[i].length; j++)
		{
			System.out.print(may[i][j] +"\t");
		     
		}
		System.out.print("\n");
	}
}
}