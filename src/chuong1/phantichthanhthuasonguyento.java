package chuong1;

import java.util.Scanner;

public class phantichthanhthuasonguyento {

	private static Scanner scanner=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.print("nhap vao so muon phan tich: ");
		int n=phantichthanhthuasonguyento.scanner.nextInt();
		for(int i=2;i<=n;i++)
		{
			if(n%i==0&&ktSoNguyenTo(i))
			{
				n=n/i;
				if(n!=1)
				System.out.print(i+"*");
				else
					System.out.print(i);
				i--;
			}
			
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
