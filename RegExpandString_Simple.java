package com.tushengkeji.regexp;

public class RegExpandString_Simple {

	public static void main(String args[]) {
		// 正则表达式切割
		// splitShow("Monday,tuesday,third",",");
		// splitShow("Moday.tureday.third","\\."); //按照 . 切
		// splitShow("Moday tuesday third"," +");//按照空格切
		// splitShow("abcdefg","");//直接切割
		// splitShow("C:\\windows\\system","\\\\"); //文件路径的切割
		// splitShow("dafakkafafgjjfafaaa","([a-z])\\1+"); //叠词的切割

		// 正则表达式替换
		// replaceAllShow("afafa461341af134634131afawfafa","\\d","#");
		// replaceAllShow("afafa461341af134634131afawfafa","\\d{5,}","#");
		replaceAllShow("afafa461341af134634131afawfafa", "\\d{5,10}", "#");// 将数字替换成　#

		// 去掉一个字符串里面重复的字符，这个怪有用
		replaceAllShow("aaabbbcddd", "([a-z])\\1+", "$1");// 去掉连接重复的，只保留一个
	}

	/*
	 * 正则表达式的切割
	 */
	public static void splitShow(String str, String regex) {
		String result[] = str.split(regex);
		for (String s : result)
			System.out.print(s + "\t");
	}

	/*
	 * 正则表达式的替换
	 */
	public static void replaceAllShow(String str, String regex, String newstr) {
		str = str.replaceAll(regex, newstr);
		System.out.print(str + "\t");
	}
}
