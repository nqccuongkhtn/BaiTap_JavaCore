package chuong1;

import java.util.Scanner;

public class phuongtrinhbac2 {
	private static Scanner scanner=new Scanner(System.in);
	public static void main(String[] args) {
		int a,b,c;
		System.out.println("Giai phuong trinh bac 2");
		System.out.print("Nhap vao tham so a: ");
		a=phuongtrinhbac2.scanner.nextInt();
		System.out.print("Nhap vao tham so b: ");
		b=phuongtrinhbac2.scanner.nextInt();
		System.out.print("Nhap vao tham so c:");
		c=phuongtrinhbac2.scanner.nextInt();
		giaiphuongtrinhbac2(a, b, c);
	}
	public static void giaiphuongtrinhbac2(int a,int b,int c)
	{int denta;
		if(a==0)
		{
			System.out.println("Phuong trinh co nghiem don la: "+-c/(float)b+"");
		}
		else
		{
			denta=(int)Math.pow(b,2)-(4*a*c);
			if(denta<0)
			{
				System.out.println("phuong trinh vo nghiem!");
			}
			if(denta==0)
			{
				System.out.println("Phuong trinh co nghiem kep!");
				System.out.println("Phuong trinh co nghiem x1= x2= "+-b/2*(float)a+"");
			}	
			if(denta>0)
			{
				System.out.println("Phuong trinh co 2 nghiem phan biet!");
				System.out.println("nghiem x1= "+(-b-Math.sqrt(denta))/(2*(float)a)+"");
				System.out.println("nghiem x2= "+(-b+Math.sqrt(denta))/(2*(float)a)+"");
			}
		}
	}
}
