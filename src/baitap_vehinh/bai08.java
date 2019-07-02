package baitap_vehinh;

public class bai08 {

	public static void main(String[] args) {
		for(int i=0;i<7;i++)
		{
			for(int j=0;j<7;j++)
			{
				if(j==i)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print("0");
				}
			}
			System.out.println();
		}
	}

}

