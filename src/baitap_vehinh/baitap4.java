//https://ngockhuong.com/tutorials/loat-bai-tap-java-core-ve-hinh-bang-cac-va-dau-sao.html
package baitap_vehinh;

public class baitap4 {

	public static void main(String[] args) {
		for(int i=0;i<10;i++)
		{
			for(int j=0;j<10;j++)
			{
				
				if(j==0&&i!=10&&i!=0)
				{
					System.out.print("*");
				}
				if(j==i&&i!=9)
				{
					System.out.println("*");
					break;
				}
				else
					if(i!=9)
					System.out.print(" ");
				if(i==9)
				{
					System.out.print("*");
				}
			}
		}
	}

}
