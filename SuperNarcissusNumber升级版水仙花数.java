package controllers;

import java.util.ArrayList;

/**
 * 升级版的水仙花数
 * 100---1000000
 * n位数，各个位上的数字的n次方幂之和等于它本身
 * 如153=1^3+5^3+3^3;
 * @author zhutaoTeacher.Done.
 *
 */
public class SuperNarcissusNumber {
	public static boolean isShuixian(int x){
		//要想到用arraList记录不确定位数的整数
		//这样list的元素为各个位的数字，size（）为n次幂
		ArrayList<Integer> bits = new ArrayList<Integer>();
		int y = x;
		while(true){
			int z = y / 10;
			if (z > 0){
				bits.add(y % 10);
			}
			else{
				bits.add(y % 10);
				break;
			}
			y = y / 10;
		}
		int bitsNum = bits.size();
		int sum = 0;
		for(int i=0; i<bitsNum; i++)
			sum += Math.pow(bits.get(i), bitsNum);
		return sum == x;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=100; i<1000000; i++){
			if (isShuixian(i)){
				System.out.print(i+"\t");
			}
		}
		

	}

}
