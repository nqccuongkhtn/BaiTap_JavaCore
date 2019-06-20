package chuong1;

import java.util.ArrayList;
import java.util.Scanner;

public class fibonacci_nhohon_n_languyento {
	private static Scanner scanner=new Scanner(System.in);
	public static void main(String[] args) {
		
		ArrayList<Integer> arr=new ArrayList<Integer>();
		int n,fn;
		arr.add(0);
		arr.add(1);
		arr.add(1);
		do
		{
		System.out.print("Nhap vao n: ");
		n=fibonacci_nhohon_n_languyento.scanner.nextInt();
		}while(n<=2);
		for(int i=3;i<=n;i++)
		{
			fn=arr.get(i-1)+arr.get(i-2);
			if(fn>=n)
				break;
			arr.add(fn);
			if(ktSoNguyenTo(fn))
			System.out.println("So Fibonacci nho hon n va la so nguyen to: "+arr.get(i)+"");
		}

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
