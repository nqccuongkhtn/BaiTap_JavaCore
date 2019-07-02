//https://ngockhuong.com/tutorials/loat-bai-tap-java-core-ve-hinh-bang-cac-va-dau-sao.html
package baitap_vehinh;

public class baitap6 {

	public static void main(String[] args) {
		System.out.println("**********");
		for(int i=1;i<=4;i++)
		{
			for(int j=0;j<=9;j++)
			{		
				{			
					if(j<=(9/2-i)||j>=(9-(9/2-i)))
					{
						System.out.print("*");
					}
					else
						System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}
