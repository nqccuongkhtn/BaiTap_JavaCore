//https://ngockhuong.com/tutorials/loat-bai-tap-java-core-ve-hinh-bang-cac-va-dau-sao.html
package baitap_vehinh;

public class baitap5 {

	public static void main(String[] args) {
		for(int i=5;i>=1;i--)
		{
			int k=i;
			for(int j=0;j<9;j++)
			{
				if((j+i)%2!=0&&j>=5-i&&k>=1)
				{
					System.out.print(6-k);
					k--;
				}
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}

}
