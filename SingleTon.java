package com.xd.summary.doitmyself;
/**
 * �������ģʽ
 * ��֤һ�������ڴ��еĶ���Ψһ��
 * ���磺������ȡһ�������ļ�ʱ�����������ļ���װ�ɶ���
 * �᷽������������ݣ���Ҫ��֤��������������ͬһ�������ļ�����
 * @author LW
 */
	//����ʽ
	/**
	 * ���裺
	 * 1.˽�л��ṹ����
	 * 2.����˽�в���̬�ı������
	 * 3.���幫�в���̬�ķ��������ظö���
	 * @author Administrator
	 *
	 */
	class Single{
		private Single(){}
		private static Single single = new Single();
		public static Single getInstance(){
			return single;
		}
	}
	
	//����ʽ���ӳټ��ط�ʽ��
	class Single2{
		private Single2(){}
		private static Single2 single2 = null;
		public static Single2 getInstance(){
			if(single2 == null){
				single2 = new Single2();
			}
			return single2;
		}
	}

