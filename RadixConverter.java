package com.bjsxt.doitmyself.test;

public class RadixConverter {

	/**
	 * �����ڱ�д�����ʱ�򣬾���Ҫ�õ�����֮���ת��������ת�������ܶ࣬����Ҳ������������׼ȷ�ļ��䣬�ٴξ͸�����ܽ�һ��
	 * java�еĽ���ֱ�ӵ��໥ת����ϣ���Դ�����á�
	 * 
	 * java�н��ж����ƣ��˽��ƣ�ʮ�����ƣ�ʮ���Ƽ�����໥ת�� ʮ����ת��ʮ�����ƣ� Integer.toHexString(int i)
	 * ʮ����ת�ɰ˽��� Integer.toOctalString(int i) ʮ����ת�ɶ����� Integer.toBinaryString(int
	 * i) ʮ������ת��ʮ���� Integer.valueOf("FFFF",16).toString() �˽���ת��ʮ����
	 * Integer.valueOf("876",8).toString() ������תʮ����
	 * Integer.valueOf("0101",2).toString()
	 * java.lang.Integer�����ֱ�ӽ�2,8,16����ֱ��ת��Ϊ10���� Integer.parseInt(String s, int
	 * radix) ʹ�õڶ�������ָ���Ļ��������ַ�����������Ϊ�з��ŵ������� examples parseInt("0", 10) returns 0
	 * parseInt("473", 10) returns 473 parseInt("-0", 10) returns 0
	 * parseInt("-FF", 16) returns -255 parseInt("1100110", 2) returns 102
	 * parseInt("2147483647", 10 ) returns 2147483647 parseInt("-2147483648", 10
	 * ) returns -2147483648 parseInt("2147483648", 10 ) throws a
	 * NumberFormatException parseInt("99", 8 ) throws a NumberFormatException
	 * parseInt("Kona", 10 ) throws a NumberFormatException parseInt("Kona", 27
	 * ) returns 411787 ����ת�����д�������ˣ�ʮ���������㷨 Integer.toBinaryString
	 * Integer.toOctalString Integer.toHexString
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		int a=123456789;
		String aa=Integer.toHexString(a);
		System.out.println(aa);
		String[] aaa=aa.split("");
		for(int i=aaa.length-1;i>=0;i-=2){
			String in=aaa[i-1]+aaa[i];
			System.out.print(in+"\t");
			System.out.print(Integer.valueOf(in,16).toString()+"\t");
		}
		

	}

}
