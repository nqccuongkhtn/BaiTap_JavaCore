package chuong1;

import java.util.ArrayList;
import java.util.Scanner;

public class dayfibonacci {
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
		n=dayfibonacci.scanner.nextInt();
		}while(n<=2);
		for(int i=3;i<=n;i++)
		{
			fn=arr.get(i-1)+arr.get(i-2);
			arr.add(fn);
		}
		System.out.println("So Fibonacci thu n: "+arr.get(n)+"");
	}

}
