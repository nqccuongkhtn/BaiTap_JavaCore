package chuong1;

import java.util.Scanner;

public class tongcacchuso {
	
	private static Scanner scanner=new Scanner(System.in);
	public static void main(String[] args) {
		int tong=0;
		System.out.print("Nhap vao so nguyen n: ");
		int n=tongcacchuso.scanner.nextInt();
		while(n!=0)
		{
			tong =tong+n%10;
			n=n/10;
		}
		System.out.println(tong);
	}

}
