package chuong1;

import java.util.Scanner;

public class n_songuyento_dautien {

	private static Scanner scanner =new Scanner(System.in);
	public static void main(String[] args) {
		int dem=0,i=2;
		System.out.print("Nhap vao so luong so nguyen to muon in ra man hinh: ");
		int n=n_songuyento_dautien.scanner.nextInt();
		while(dem!=n)
		{
			if(ktSoNguyenTo(i))
			{
				System.out.print(i+" ");
				dem++;
			}
			i++;
		}
	}
	public static boolean ktSoNguyenTo(int n)
	{
		for(int i=2;i<n;i++)
		{
			if(n%i==0)
				return false;
		}
		return true;
	}
}
