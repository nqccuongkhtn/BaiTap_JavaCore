package baitap_vehinh;

public class bai07 {

	public static void main(String[] args) {
		int ii=0;
		boolean kt=true;
		for(int i=0;i<9;i++)
		{
			for(int j=0;j<ii*2+1;j++)
			{
				if(j%2==0&&j<9)
				{
					System.out.print(ii+1);
				}
				else
				{
					System.out.print("*");
				}
			}
			System.out.println();
			if(ii==4)
			{
				kt=false;
			}
			if(kt)
			{
				ii++;
			}
			else
			{
				ii--;
			}
			
		}

	}

}
