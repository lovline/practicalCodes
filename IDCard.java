package com.bjsxt.testRegExp;
import java.net.IDN;
import java.util.Scanner;

/**
 * 身份证校验
 *输入：18位身份证号码
 *输出：是否合法
 *规则：
 *身份证校验码的计算方法
 *1、将前面的身份证号码17位数分别乘以不同的系数。从第一位到第十七位的系数
 *分别为：7－9－10－5－8－4－2－1－6－3－7－9－10－5－8－4－2。
 *2、将这17位数字和系数相乘的结果相加。
 *3、用加出来和除以11，看余数是多少？
 *4、余数只可能有0－1－2－3－4－5－6－7－8－9－10这11个数字。
 *其分别对应的最后一位身份证的号码为1－0－X －9－8－7－6－5－4－3－2。
 *5、通过上面得知如果余数是3，就会在身份证的第18位数字上出现的是9。
 *如果对应的数字是10，身份证的最后一位号码就是罗马数字x。
 * @author Administrator
 */

public class IDCard {

	public static void main(String[] args) {
		System.out.println("Enter 18 bits ID number:");
		Scanner scanner = new Scanner(System.in);
		String idNum = scanner.nextLine();
		if(isValid(idNum)){
			System.out.println("Your id number is valid");
		}
		else{
			System.out.println("Your id number is NOT valid");
		}
		
	}

	private static boolean isValid(String idNum) {
		if (idNum.length() != 18){
			return false;
		}
		String _17bits = idNum.substring(0, idNum.length()-1);
		String lastBit = idNum.substring(idNum.length()-1, idNum.length());
		lastBit = lastBit.toLowerCase();
		if(lastBit.equals("x") && !isDigit(_17bits)){
			return false;
		}
		else if(!lastBit.equals("x") && !isDigit(idNum)){
			return false;
		}
		else{
			return isLegal(idNum);
		}
	}

	private static boolean isLegal(String idNum) {
		int[] times = {7,9,10,5,8,4,2,1,6,3,7,9,10,5,8,4,2};
		String _17bits = idNum.substring(0, idNum.length()-1);
		int sum = 0;
		int i = 0;
		for(Character x : _17bits.toCharArray()){
			sum += (Character.digit(x, 10) * times[i]);
			i ++;
		}
		int remaining = sum % 11;
		char[] mapping = {'1','0','X','9','8','7','6','5','4','3','2'};
		char correctBit = mapping[remaining];
		char lastBit = idNum.charAt(idNum.length()-1);
		return correctBit == lastBit;
	}

	private static boolean isDigit(String s) {
		for(Character c:s.toCharArray()){
			if (!Character.isDigit(c)){
				return false;
			}
		}
		return true;
	}

}
