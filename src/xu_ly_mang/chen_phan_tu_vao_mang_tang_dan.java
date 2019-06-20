package xu_ly_mang;

import java.util.Scanner;

public class chen_phan_tu_vao_mang_tang_dan {

	private static Scanner scanner=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Nhap vao so luong phan tu mang: ");
		int n = chen_phan_tu_vao_mang_tang_dan.scanner.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			System.out.println("Nhap vao phan tu thu "+(i+1));
			arr[i]=chen_phan_tu_vao_mang_tang_dan.scanner.nextInt();
		}
		for(int i=0;i<n-1;i++)
		{
			for(int j=i;j<n;j++)
			{
				if(arr[j]<arr[i])
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println("Mang sau khi sap xep: ");
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println("\nNhap phan tu muon chen vao mang: ");
		int k=chen_phan_tu_vao_mang_tang_dan.scanner.nextInt();
		int arr2[]=new int[n+1];
		for(int i=0;i<n;i++)
		{
			arr2[i]=arr[i];
		}
		arr2[n]=k;
		for(int i=0;i<n;i++)
		{
			for(int j=i;j<=n;j++)
			{
				if(arr2[j]<arr2[i])
				{
					int temp=arr2[i];
					arr2[i]=arr2[j];
					arr2[j]=temp;
				}
			}
		}
		System.out.println("Mang sau khi chen: ");
		for(int i=0;i<=n;i++)
		{
			System.out.print(arr2[i]+" ");
		}
	}


}
