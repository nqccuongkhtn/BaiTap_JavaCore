//https://ngockhuong.com/tutorials/loat-bai-tap-java-core-ve-hinh-bang-cac-va-dau-sao.html
package baitap_vehinh;

public class baitap3 {

	public static void main(String[] args) {
		for(int i=4;i>-5;i--)
		{
			for(int j=0;j<9;j++)
			{
				if(Math.abs(4-Math.abs(j))<=Math.abs(i))
				{
					System.out.print("*");
				}
				else
					System.out.print(" ");
			}
			System.out.println();
		}

	}

}
