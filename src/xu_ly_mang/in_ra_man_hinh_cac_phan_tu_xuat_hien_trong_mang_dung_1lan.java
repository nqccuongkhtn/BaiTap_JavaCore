//Nhập một mảng số nguyên a0, a1, a2, …, an-1. In ra màn hình các phần tử xuất hiện trong mảng đúng 1 lần.
package xu_ly_mang;

import java.util.Scanner;

public class in_ra_man_hinh_cac_phan_tu_xuat_hien_trong_mang_dung_1lan {

	private static Scanner scanner =new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Nhap vao so luong phan tu mang: ");
		int n = in_ra_man_hinh_cac_phan_tu_xuat_hien_trong_mang_dung_1lan.scanner.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			System.out.println("Nhap vao phan tu thu "+(i+1));
			arr[i]=in_ra_man_hinh_cac_phan_tu_xuat_hien_trong_mang_dung_1lan.scanner.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			kiemTraSoLanXuatHien(n,arr[i],arr);
		}
	}
	public static void kiemTraSoLanXuatHien(int n,int dt,int arr[])
	{
		int dem=0;
		for(int i=0;i<n;i++)
		{
			if(arr[i]==dt)
			{
				dem++;
			}
		}
		if(dem==1)
		{
			System.out.println(dt+" xuat hien 1 lan trong mang");
		}
	}

}
