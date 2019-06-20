package chuong1;

import java.util.ArrayList;

public class UCLN_BCNN {

	public static void main(String[] args) {
		ucln();
		bcnn();
	}
	public static void bcnn()
	{
		int a=30,b=18;
		int max=(a>=b)?a:b;
		while(true)
		{
			if(max%a==0&&max%b==0)
			{
				System.out.println("BCNN :"+max+"");
				break;
			}
			max++;
		}
	}
	public static void ucln()
	{
		int a=30,b=18;
		ArrayList<Integer> arr1=new ArrayList<Integer>();
		ArrayList<Integer> arr2=new ArrayList<Integer>();
		for(int i=1;i<=a/2;i++)
		{
			if(a%i==0)
			{
				arr1.add(i);
			}
		}
		for(int i=1;i<=b/2;i++)
		{
			if(b%i==0)
			{
				arr2.add(i);
			}
		}
		if(a<b)
		{
			for(int i=arr1.size()-1;i>=0;i--)
			{
				for(int j=0;j<arr2.size();j++)
				{
					if(arr1.get(i)==arr2.get(j))
					{
						System.out.println("UCLN: "+arr1.get(i)+"");
						i=0;
						break;
					}
				}
			}
		}
		else if(a>b)
		{
			for(int i=arr2.size()-1;i>=0;i--)
			{
				for(int j=0;j<arr1.size();j++)
				{
					if(arr2.get(i)==arr1.get(j))
					{
						System.out.println("UCLN: "+arr2.get(i)+"");
						i=0;
						break;
					}
				}
			}
		}
		if(a==b)
		{
			System.out.println("UCLN :"+a+"");
		}
	}
}
