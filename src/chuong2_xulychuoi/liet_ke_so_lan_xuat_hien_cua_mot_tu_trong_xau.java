//Nhập một sâu ký tự. Liệt kê số lần xuất hiện của các từ của sâu đó.
package chuong2_xulychuoi;

import java.util.TreeMap;

public class liet_ke_so_lan_xuat_hien_cua_mot_tu_trong_xau {
	public static final char SPACE=' ';
	public static final char TAB='\t';
	public static final char BREAK_LINE='\n';
	public static void main(String[] args) {
		 String str = "hoc java     co ban den nang cao"
	                + "      \n hoc c++ co ban den nang cao.";
	        System.out.println("---------------------------------");
	        System.out.println(str);
	        System.out.println("---------------------------------");
	        // liệt kê sô lần xuất hiện của các từ trong chuỗi trên
	        System.out.println("Liệt kê số lần xuất hiện của các từ: ");
	        TreeMap<String, Integer> dst=new TreeMap<>();
	        String s="";
	       
	        for(int i=0;i<str.length();i++)
	        {
	        	if(str.charAt(i)!=SPACE && str.charAt(i)!=TAB && str.charAt(i)!=BREAK_LINE)
	        	{
	        		
	        			s=s.concat(Character.toString(str.charAt(i)));
	        	}
	        	else
	        	{
	        		if(s.length()!=0)
	        		{
	        			if(dst.containsKey(s))
	        			{
	        				dst.put(s, dst.get(s)+1);
	        			}
	        			else
	        			dst.put(s, 1);
	        			s="";
	        		}
	        	}
	        }
	        for(String item:dst.keySet())
	        {
	        	System.out.println(item+" "+dst.get(item));
	        }

	}

}
