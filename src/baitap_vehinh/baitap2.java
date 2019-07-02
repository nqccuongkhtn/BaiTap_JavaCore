//https://ngockhuong.com/tutorials/loat-bai-tap-java-core-ve-hinh-bang-cac-va-dau-sao.html
package baitap_vehinh;

public class baitap2 {

	public static void main(String[] args) {
		for(int i=0;i<5;i++)
		{
			int dem=1;
			for(int j=0;j<9;j++)
			{
				
				if(Math.abs(4-j)<=i)
				{
					System.out.print(dem);
					dem++;
				}
				else 
					System.out.print(" ");
			}
			System.out.println();
		}
	}

}
