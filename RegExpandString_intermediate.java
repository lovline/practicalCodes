package com.tushengkeji.regexp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/**
 * 
 * str�г��ִ�������ҳ���Ϊlen����С��������ĸ˳��
 * ���ַ�����Ҫ�����ַ���ÿ��Ԫ����ͬ����
 * û��ʱ���ؿ��ַ���
 * @author Administrator
 *
 */

public class RegExpandString_intermediate {
	
	String str;
	RegExpandString_intermediate(String str)
	{
		this.str = str;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("������һ���ַ������ԣ�");
		String str = in.next();
		RegExpandString_intermediate m = new RegExpandString_intermediate(str);
		System.out.println("������һ���ַ����Ը��ַ����ַ�������ֵĴ�����");
		String ch = in.next();
		System.out.println(m.numberOfOccurence(ch.charAt(0)));
		System.out.println("������һ�����ֲ����ַ�������û�иպó���Ϊ���������ֵ������ַ���");
		int len = in.nextInt();
		m.getMaxSubStr(len);
	}

	public  int numberOfOccurence(char x)
	{
		int n = 0;
		for(int i=0;i<this.str.length();i++)
		{
			if(this.str.charAt(i)==x)
			{
				n++;
			}	
		}
		return n;
   	}
	
	public void getMaxSubStr(int len)
	{
		String regex = "(.)\\1{1,}";
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(this.str);
		ArrayList<String> list = new ArrayList();
		while(m.find())
		{
			list.add(m.group());
		}
		Collections.sort(list);
		//ɾ�����Ȳ���ָ��Ҫ��len���ظ����ַ���
		for(int i=0;i<list.size();i++)
		{
			if(list.get(i).length()!=len)
			{
				list.remove(list.get(i));
			}
		}
		//���ﲻ����list.toString()����[aa,bb,cc]
		String s = "";
		for(int i=0;i<list.size();i++)
		{
			s += list.get(i);
		}
		//System.out.println("ss:"+s);
		String regex2 = "(.)\\1{1,}";
		Pattern p2 = Pattern.compile(regex2);
		Matcher m2 = p2.matcher(s);
		ArrayList<String> list2 = new ArrayList();
		//aa bb cc cc dd ee 
		//aabbccccddee
		while(m2.find())
		{
			list2.add(m2.group());
		}
		
		int count = 0;
		int length = 0;
		for(int i=0;i<list2.size();i++)
		{
			if(count<list2.get(i).length())
			{
				count = list2.get(i).length();
				length = i;
			}
		}	
		char c = list2.get(length).charAt(0);
		for(int i=0;i<len;i++)
		{
			System.out.print(c);
		}
		
		  /*   String a = "abcccccci!ppppc";
        a = a.replaceAll("(.)\\1+", "$1");
        System.out.println(a);
        String b="abdcddddd";
        b = b.replaceAll("(.)\\1+", "$1");
        System.out.println(b);
       
        
        String s = Arrays.toString("sdfsdf sf sdf".split("\\W+")); 
        System.out.println(s);
        String s2 = Arrays.toString("sdfsdf sf sdf".split("n\\W+"));  
        System.out.println(s2); 
        
		
		String string = "asdfb  sdfoiwer  sdfcdf wer sd d sdf  cxvxzcv s ef bob b   b ";  
		StringBuffer s2 = new StringBuffer();  
		Pattern pa = Pattern.compile("[abcd]");  
		Matcher mc = pa.matcher(string);  
		System.out.println();  
		while(mc.find()){  
		    mc.appendReplacement(s2,mc.group().toUpperCase());  
		}  
		mc.appendTail(s2);  
		System.out.println(s2);
		*/
		
		
    }
}