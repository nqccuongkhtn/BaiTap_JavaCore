package chuong1;

import java.util.Scanner;

public class moichuso_laso_nguyento {

	private static Scanner scanner =new Scanner(System.in);
	public static void main(String[] args) {
		int m;
		System.out.print("Nhap vao n: ");
		int n=moichuso_laso_nguyento.scanner.nextInt();
		while(n!=0)
		{
			m=n%10;
			if(!ktSoNguyenTo(m))
				break;
			n=n/10;
		}
		if(n==0)
			System.out.println("Tat ca cac chu so deu la so nguyen to");
		else
			System.out.println("Tat ca cac chu so deu khong la so nguyen to");
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
