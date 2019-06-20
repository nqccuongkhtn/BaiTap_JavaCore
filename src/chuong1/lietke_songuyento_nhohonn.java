package chuong1;

import java.util.Scanner;

public class lietke_songuyento_nhohonn {
	private static Scanner scannner=new Scanner(System.in);
	public static void main(String[] args) {
		int n;
		System.out.println("Nhap vao n: ");
		n=scannner.nextInt();
		timSoNguyenTo(n);
	}
	public static void timSoNguyenTo(int n)
	{
		for(int i=2;i<n;i++)
		{
			for(int j=2;j<=i;j++)
			{		
				if(j==i)
				{
					System.out.println(i+" ");
				}
				if(i%j==0)
					break;
				
			}
		}
	}
}
