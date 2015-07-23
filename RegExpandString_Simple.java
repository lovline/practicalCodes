package com.tushengkeji.regexp;

public class RegExpandString_Simple {

	public static void main(String args[]) {
		// ������ʽ�и�
		// splitShow("Monday,tuesday,third",",");
		// splitShow("Moday.tureday.third","\\."); //���� . ��
		// splitShow("Moday tuesday third"," +");//���տո���
		// splitShow("abcdefg","");//ֱ���и�
		// splitShow("C:\\windows\\system","\\\\"); //�ļ�·�����и�
		// splitShow("dafakkafafgjjfafaaa","([a-z])\\1+"); //���ʵ��и�

		// ������ʽ�滻
		// replaceAllShow("afafa461341af134634131afawfafa","\\d","#");
		// replaceAllShow("afafa461341af134634131afawfafa","\\d{5,}","#");
		replaceAllShow("afafa461341af134634131afawfafa", "\\d{5,10}", "#");// �������滻�ɡ�#

		// ȥ��һ���ַ��������ظ����ַ������������
		replaceAllShow("aaabbbcddd", "([a-z])\\1+", "$1");// ȥ�������ظ��ģ�ֻ����һ��
	}

	/*
	 * ������ʽ���и�
	 */
	public static void splitShow(String str, String regex) {
		String result[] = str.split(regex);
		for (String s : result)
			System.out.print(s + "\t");
	}

	/*
	 * ������ʽ���滻
	 */
	public static void replaceAllShow(String str, String regex, String newstr) {
		str = str.replaceAll(regex, newstr);
		System.out.print(str + "\t");
	}
}
