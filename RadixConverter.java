package com.bjsxt.doitmyself.test;

public class RadixConverter {

	/**
	 * 我们在编写程序的时候，经常要用到进制之间的转换，但是转换方法很多，我们也不可能做到很准确的记忆，再次就给大家总结一下
	 * java中的进制直接的相互转换，希望对大家有用。
	 * 
	 * java中进行二进制，八进制，十六进制，十进制间进行相互转换 十进制转成十六进制： Integer.toHexString(int i)
	 * 十进制转成八进制 Integer.toOctalString(int i) 十进制转成二进制 Integer.toBinaryString(int
	 * i) 十六进制转成十进制 Integer.valueOf("FFFF",16).toString() 八进制转成十进制
	 * Integer.valueOf("876",8).toString() 二进制转十进制
	 * Integer.valueOf("0101",2).toString()
	 * java.lang.Integer类可以直接将2,8,16进制直接转换为10进制 Integer.parseInt(String s, int
	 * radix) 使用第二个参数指定的基数，将字符串参数解析为有符号的整数。 examples parseInt("0", 10) returns 0
	 * parseInt("473", 10) returns 473 parseInt("-0", 10) returns 0
	 * parseInt("-FF", 16) returns -255 parseInt("1100110", 2) returns 102
	 * parseInt("2147483647", 10 ) returns 2147483647 parseInt("-2147483648", 10
	 * ) returns -2147483648 parseInt("2147483648", 10 ) throws a
	 * NumberFormatException parseInt("99", 8 ) throws a NumberFormatException
	 * parseInt("Kona", 10 ) throws a NumberFormatException parseInt("Kona", 27
	 * ) returns 411787 进制转换如何写（二，八，十六）不用算法 Integer.toBinaryString
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
