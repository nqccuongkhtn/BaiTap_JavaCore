package chuong1;

import java.util.Scanner;

public class sothuannghich {

	private static Scanner scanner=new Scanner(System.in);
	public static void main(String[] args) {
		
		soThuanNghich();
	}
	public static void soThuanNghich()
	{
		for(int i=100000;i<=999999;i++)
		{
			StringBuilder sb=new StringBuilder(Integer.toString(i));  
			sb.reverse();
			int dao=Integer.parseInt(sb.toString());
			if(dao==i)
			{
				System.out.println(i);
			}
		}
	}
}
