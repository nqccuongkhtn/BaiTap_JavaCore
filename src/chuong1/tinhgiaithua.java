package chuong1;

import java.util.Scanner;

public class tinhgiaithua {

	private static Scanner scanner=new Scanner(System.in);
	public static void main(String[] args) {
		int n,giaithua=1;
		System.out.println("Nhap vao so can tinh giai thua: ");
		n=tinhgiaithua.scanner.nextInt();
		for(int i=n;i>0;i--)
		{
			giaithua=giaithua*i;
		}
		System.out.println("Ketqua: "+giaithua+"");
	}

}
