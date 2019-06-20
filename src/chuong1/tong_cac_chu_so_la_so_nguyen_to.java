package chuong1;

import java.util.Scanner;

public class tong_cac_chu_so_la_so_nguyen_to {

		private static Scanner scanner =new Scanner(System.in);
		public static void main(String[] args) {
			int m,tong=0;
			System.out.print("Nhap vao n: ");
			int n=tong_cac_chu_so_la_so_nguyen_to.scanner.nextInt();
			while(n!=0)
			{
				m=n%10;
				n=n/10;
				if(ktSoNguyenTo(m))
					tong+=m;
			
			}
			
				System.out.println("Tong tat ca cac chu so  la so nguyen to: "+tong+"");
		}
		public static boolean ktSoNguyenTo(int n)
		{
			for(int i=2;i<n;i++)
			{
				if(n%i==0)
					return false;
			}
			if(n<2)
				return false;
			return true;
		}

}
