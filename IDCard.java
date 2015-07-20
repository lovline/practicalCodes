package com.bjsxt.testRegExp;
import java.net.IDN;
import java.util.Scanner;

/**
 * ���֤У��
 *���룺18λ���֤����
 *������Ƿ�Ϸ�
 *����
 *���֤У����ļ��㷽��
 *1����ǰ������֤����17λ���ֱ���Բ�ͬ��ϵ�����ӵ�һλ����ʮ��λ��ϵ��
 *�ֱ�Ϊ��7��9��10��5��8��4��2��1��6��3��7��9��10��5��8��4��2��
 *2������17λ���ֺ�ϵ����˵Ľ����ӡ�
 *3���üӳ����ͳ���11���������Ƕ��٣�
 *4������ֻ������0��1��2��3��4��5��6��7��8��9��10��11�����֡�
 *��ֱ��Ӧ�����һλ���֤�ĺ���Ϊ1��0��X ��9��8��7��6��5��4��3��2��
 *5��ͨ�������֪���������3���ͻ������֤�ĵ�18λ�����ϳ��ֵ���9��
 *�����Ӧ��������10�����֤�����һλ���������������x��
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
