package xu_ly_mang;

import java.util.Scanner;

public class in_ra_so_lan_xuat_hien_cua_cac_phan_tu {

	private static Scanner scanner=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.print("Nhap so luong phan tu mang: ");
		int n=in_ra_so_lan_xuat_hien_cua_cac_phan_tu.scanner.nextInt();
		int arr[]=new int[n];
		int j=0,dem=0;
		for(int i=0;i<n;i++)
		{
			System.out.println("Nhap vao phan tu thu "+(i+1));
			arr[i]=in_ra_so_lan_xuat_hien_cua_cac_phan_tu.scanner.nextInt();
		}
		while(j!=n)
		{
			dem=0;
			int vt=-1;
			for(int i=0;i<n;i++)
			{
				if(arr[i]==arr[j])
				{
					if(vt==-1)
					{
						vt=i;
						if(j>vt)
							break;
					}
					dem++;
				}
			}
			if(j<=vt)
			System.out.println("so lan xuat hien cua "+arr[j]+" la "+dem);
			dem=0;
			j++;
		}
		
	}

}
