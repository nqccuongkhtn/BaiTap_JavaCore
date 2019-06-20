package chuong2_xulychuoi;

import java.util.Scanner;

public class dem_so_ky_tu {

	private static Scanner scanner=new Scanner(System.in);
	public static void main(String[] args) {
		String str;
		int dem;
		System.out.println("Nhap vao chuoi S: ");
		str=dem_so_ky_tu.scanner.nextLine();
		str.trim();
		System.out.println(str);
		if(Character.isLetter(str.charAt(0)))
		{
			dem=1;
		}
		else dem=0;
		for(int i=0;i<str.length()-1;i++)
		{
			if((str.charAt(i)==' '||str.charAt(i)=='	')&&Character.isLetter(str.charAt(i+1)))
			{
				dem++;
			}
		}
		System.out.println(dem);
	}
}
