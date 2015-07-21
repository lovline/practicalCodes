package com.bjsxt.doitmyself.test;

public class HanoiTowers {

	/**
	 * 汉诺塔问题解决
	 * 将N个盘子要从A->C，首先要将上面的N-1个盘子
	 * 从A->B，再把第N个盘子由A->C；
	 * 同理，要将第N-1个盘子从B->C，首先要把上面的
	 * N-2个盘子由B->A，再把第N-1个盘子由B->C。
	 * 这样循环下来。
	 * @param args
	 */
	public static void main(String[] args) {
		int nDisks=3;
		moveDish(nDisks,'A','B','C');
		
	}

	private static void moveDish(int level, char from, char inter, char to) {
		if(level==1){
			System.out.println("从 "+from+"移动盘子1号到"+to);
		}
		else{
			moveDish(level-1, from, to,inter);
			System.out.println("从 "+from+"移动盘子"+level+"号到"+to);
			moveDish(level-1,inter,from, to);
		}
	}


}
