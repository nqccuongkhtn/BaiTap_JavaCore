package baitap_vehinh;

public class bai9 {

	public static void main(String[] args) {
		for( int i=0;i<=6;i++)
		{
			for(int j=1;j<=11;j++)
			{
				if((Math.ceil(11*1.0/2)+i)==j || j==(Math.ceil(11*1.0/2)-i))
				{
					System.out.print("*");
				}
				else
					System.out.print("#");
			}
			System.out.println();
		}
	}

}
