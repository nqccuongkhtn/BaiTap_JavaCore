package xu_ly_mang;

import java.util.Scanner;

public class sapxepmang_tangdan {
	
	private static Scanner scanner=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Nhap vao so luong phan tu mang: ");
		int n = sapxepmang_tangdan.scanner.nextInt();
		float arr[]=new float[n];
		for(int i=0;i<n;i++)
		{
			System.out.println("Nhap vao phan tu thu "+(i+1));
			arr[i]=sapxepmang_tangdan.scanner.nextFloat();
		}
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
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}

}
