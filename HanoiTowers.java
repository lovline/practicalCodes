package com.bjsxt.doitmyself.test;

public class HanoiTowers {

	/**
	 * ��ŵ��������
	 * ��N������Ҫ��A->C������Ҫ�������N-1������
	 * ��A->B���ٰѵ�N��������A->C��
	 * ͬ��Ҫ����N-1�����Ӵ�B->C������Ҫ�������
	 * N-2��������B->A���ٰѵ�N-1��������B->C��
	 * ����ѭ��������
	 * @param args
	 */
	public static void main(String[] args) {
		int nDisks=3;
		moveDish(nDisks,'A','B','C');
		
	}

	private static void moveDish(int level, char from, char inter, char to) {
		if(level==1){
			System.out.println("�� "+from+"�ƶ�����1�ŵ�"+to);
		}
		else{
			moveDish(level-1, from, to,inter);
			System.out.println("�� "+from+"�ƶ�����"+level+"�ŵ�"+to);
			moveDish(level-1,inter,from, to);
		}
	}


}
