package com.xd.summary.doitmyself;
/**
 * ģ�巽�����ģʽ
 * �������ڲ�һ����ʵ����ȷ����һ����ʵ���ǲ�ȷ��ʱ��
 * ��ʱ���԰Ѳ�ȷ���Ĳ��ֱ�¶��ȥ���������Լ�ȥʵ�֡�
 * @author Administrator
 *
 */
abstract class ModeMethod {
	//�˹����������Ҫ��д�����Լ�final�޶�
	public final void getTime(){ 
		long start = System.currentTimeMillis();
		code(); //��ȷ��������ȡ������ͨ�����󷽷�ʵ��
		long end = System.currentTimeMillis();
		System.out.println("�����ǣ�"+(end - start));
	}
	//����ȷ���Ĺ��ܣ������ิдʵ�֡�
	public abstract void code();
}

class ModeDemo extends ModeMethod{
	public void code(){
		for(int y=0;y<100;y++){
			System.out.println("y");
		}
	}
}

