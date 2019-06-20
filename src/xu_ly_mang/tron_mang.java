
//Nhập 2 mảng số thực a0, a1, a2, …, am-1 và b0, b1, b2, …, bn-1. 
//Giả sử 2 mảng này đã được sắp xếp tăng dần. Hãy tận dụng tính sắp xếp của 2 dãy và tạo dãy c0,c1, c2, …,
//cm+n-1 là hợp của 2 dãy trên sao cho ci cũng có thứ tự tăng dần.
package xu_ly_mang;

import java.util.Scanner;

public class tron_mang {

	private static Scanner scanner=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Nhap vao so luong phan tu mang th1: ");
		int n = tron_mang.scanner.nextInt();
		float arr[]=new float[n];
		for(int i=0;i<n;i++)
		{
			System.out.println("Nhap vao phan tu thu "+(i+1));
			arr[i]=tron_mang.scanner.nextFloat();
		}
		sapxepmang(arr,n);
		System.out.println("Nhap vao so luong phan tu mang th2: ");
		int n1 = tron_mang.scanner.nextInt();
		float arr1[]=new float[n1];
		for(int i=0;i<n1;i++)
		{
			System.out.println("Nhap vao phan tu thu "+(i+1));
			arr1[i]=tron_mang.scanner.nextFloat();
		}
		sapxepmang(arr1,n1);
		float merge[]=new float[n+n1];
		int nn=n-1,n1n1=n1-1;;
		
		for(int i=n+n1-1;i>=0;i--)
		{
			if(nn>-1&&n1n1>-1)
			{
				if(arr[nn] > arr1[n1n1])
				{
					merge[i]=arr[nn--];
					
				}
				else
				{
					merge[i]=arr1[n1n1--];
				}
			}
			else
			{
				if(nn==-1)
				{
					merge[i]=arr1[n1n1--];
				}
				else
				{
					merge[i]=arr[nn--];
				}
			}
		}
		System.out.println("Mang sau khi sap xep: ");
		for(int i=0;i<n+n1;i++)
		{
			System.out.print(merge[i]+" ");
		}
	}
	public static void sapxepmang(float arr[],int n)
	{
		for(int i=0;i<n-1;i++)
		{
			for(int j=i;j<n;j++)
			{
				if(arr[j]<arr[i])
				{
					float temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
	}

}
