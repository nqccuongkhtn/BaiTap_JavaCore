package baitap_vehinh;

public class bai10 {

	public static void main(String[] args) {
		for(int i=4;i>=0;i--)
		{
			boolean kt=true;
			int so=i+1;
			for(int j=1;j<=9;j++)
			{
				if(Math.abs(5-j)<=i)
				{
					System.out.print(so);
					if(so==1)
						kt=false;
					if(kt)
					so--;
					else
						so++;
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}
