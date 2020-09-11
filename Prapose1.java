class Prapose
{
	int row,col;

	void i()
	{
      for(row=0; row<=4;row++)
      {
      	System.out.print("\t");
      	for(col=0;col<=4;col++)
      	{
      		if((row==0||row==4)||col==2)
      			System.out.print("*");
      	    else
			    System.out.print(" ");  
      	}
      	System.out.println();
      }
      System.out.println();
	}
	void heart()
	{
		for(row=0;row<6;row++)
		{
			System.out.print("\t");
			for(col=0;col<7;col++)
			{
				if((row==0&&col%3!=0)||(row==1&&col%3==0)||(row-col==2)||(row+col==8))
					System.out.print("*");
				else
			    System.out.print(" ");  
      		
			}
			System.out.print("\n");
		}
		System.out.println();

	}
	void u()
	{
		for(row=0;row<5;row++)
		{
			System.out.print("\t");
			for(col=0;col<5;col++)
			{
				if(((row!=4)&&(col==0||col==4))||((row==4)&&col%4!=0))
					System.out.print("*");
			    else
			    System.out.print(" ");  
      		
		    }
		    System.out.println();
		}
		System.out.println();

	}
}

class Prapose1
{
	public static void main(String args [])
	{
		Prapose p=new Prapose();
		System.out.println();
		p.i();
		p.heart();
        p.u();
	}
}
