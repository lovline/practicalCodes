package com.xd.summary.doitmyself;
/**
 * �ڲ���������ڲ����ܽ�
 * @author Administrator
 *
 */
//InnerClassAndAnonymousInnerClass
/*	Java �ڲ��� 
	�����֣���Ա�ڲ��ࡢ�ֲ��ڲ��ࡢ��̬�ڲ���������ڲ��ࡣ 
	1����Ա�ڲ��ࣺ ����Ϊ�ⲿ���һ����Ա���ڣ����ⲿ������ԡ��������С�
	ע�⣺��Ա�ڲ����в��ܶ��徲̬����,�����Է����ⲿ������г�Ա��
*/	
/*	public class Outer{
		private static int i = 1;
		private int j=10;
		private int k=20;
		public static void outer_f1(){
		    //do more something
		}
		public void outer_f2(){
		    //do more something
		}
	
		//��Ա�ڲ���
		class Inner{
		//static int inner_i =100; //�ڲ����в������徲̬����
		int j=100;//�ڲ������ⲿ���ʵ���������Թ���
		int inner_i=1;
		void inner_f1(){
			int j = 1000;
		    System.out.println(i);//�ⲿ��ı���������ڲ���ı���û��ͬ���ģ������ֱ���ñ����������ⲿ��ı���
		    System.out.println(j);//���ڲ����з����ڲ����Լ��ı���ֱ���ñ�����
		    System.out.println(this.j);//Ҳ�������ڲ�������"this.������"�������ڲ������
		    System.out.println(Outer.this.j);//�����ⲿ�������ڲ���ͬ����ʵ����������"�ⲿ����.this.������"��
		    System.out.println(k);//�ⲿ��ı���������ڲ���ı���û��ͬ���ģ������ֱ���ñ����������ⲿ��ı���
		    outer_f1();
		    outer_f2();
		}
	}
	//�ⲿ��ķǾ�̬�������ʳ�Ա�ڲ���
	public void outer_f3(){
	    Inner inner = new Inner();
	    inner.inner_f1();
	}

	//�ⲿ��ľ�̬�������ʳ�Ա�ڲ��࣬�����ⲿ���ⲿ���ʳ�Ա�ڲ���һ��
	public static void outer_f4(){
	    //step1 �����ⲿ�����
	    Outer out = new Outer();
	    //***step2 �����ⲿ��������ڲ������***
	    Inner inner=out.new Inner();
	    //step3 �����ڲ���ķ���
	    inner.inner_f1();
	}

	public static void main(String[] args){
	    outer_f4();
	}
	}
*/
/*
 * ��Ա�ڲ�����ŵ㣺 ��
 * �ڲ�����Ϊ�ⲿ��ĳ�Ա�����Է����ⲿ���˽�г�Ա�����ԡ�����ʹ���ⲿ������ΪPRIVATE�����Ƕ��ڴ������ڲ����ڲ��໹�ǿɼ��ġ��� ��
 * ���ڲ��ඨ�����ⲿ���в��ɷ��ʵ����ԡ����������ⲿ����ʵ���˱��ⲿ���private��ҪС�ķ���Ȩ�ޡ�
 * ע�⣺�ڲ�����һ������ʱ�ĸ��һ������ɹ����ͻ��Ϊ��ȫ��ͬ������
 * ������һ����Ϊouter���ⲿ������ڲ��������Ϊinner���ڲ��ࡣ������ɺ����outer.class��outer$inner.class���ࡣ
 * 2���ֲ��ڲ��ࣺ ���ڷ����ж�����ڲ��࣬��ֲ��������ƣ��ھֲ��ڲ���ǰ�������η�public��private���䷶ΧΪ�������Ĵ���顣
 * ע�⣺�ֲ��ڲ����в��ɶ��徲̬���������Է����ⲿ��ľֲ�����(�������ڵı���)�����Ǳ���������final�ġ�
 */
/*
public class Outer {
	private int s = 100;
	private int out_i = 1;

	public void f(final int k) {
		final int s = 200;
		int i = 1;
		final int j = 10;
		class Inner { // �����ڷ����ڲ�
			int s = 300;// ���Զ������ⲿ��ͬ���ı���

			// static int m = 20;//�����Զ��徲̬����
			Inner(int k) {
				inner_f(k);
			}

			int inner_i = 100;

			void inner_f(int k) {
				System.out.println(out_i);// ����ڲ���û�����ⲿ��ͬ���ı��������ڲ����п���ֱ�ӷ����ⲿ���ʵ������
				System.out.println(k);// *****���Է����ⲿ��ľֲ�����(�������ڵı���)�����Ǳ���������final��*****
				// System.out.println(i);
				System.out.println(s);// ����ڲ����������ⲿ��ͬ���ı�����ֱ���ñ��������ʵ����ڲ���ı���
				System.out.println(this.s);// ��"this.������" ���ʵ�Ҳ���ڲ������
				System.out.println(Outer.this.s);// ���ⲿ"�ⲿ������.this.������"
													// ���ʵ����ⲿ�����
			}
		}
		new Inner(k);
	}

	public static void main(String[] args) {
		// ���ʾֲ��ڲ�����������ⲿ�����
		Outer out = new Outer();
		out.f(3);
	}

}
*/
/*	ע�⣺
	�����ⲻ��ֱ�����ɾֲ��ڲ��ࣨ��֤�ֲ��ڲ�������ǲ��ɼ��ģ���Ҫ��ʹ�þֲ��ڲ���ʱ��Ҫ���ɶ��󣬶�����÷������ڷ����в��ܵ�����ֲ��ڲ��ࡣͨ���ڲ���ͽӿڴﵽһ��ǿ�Ƶ�����ϣ��þֲ��ڲ�����ʵ�ֽӿڣ����ڷ����з��ؽӿ����ͣ�ʹ�ֲ��ڲ��಻�ɼ�������ʵ����Ŀɼ��ԡ�

	3����̬�ڲ��ࣺ ��̬�ڲ��ඨ�������У��κη����⣬��static���塣
	ע�⣺��̬�ڲ����п��Զ��徲̬���߷Ǿ�̬�ĳ�Ա
	public class Outer {
	 private static int i = 1;
	 private int j = 10;
	 public static void outer_f1(){
	 
	 }
	 public void outer_f2(){
	 
	 }
	// ��̬�ڲ��������public,protected,private����
	// ��̬�ڲ����п��Զ��徲̬���߷Ǿ�̬�ĳ�Ա
	 static class Inner{
	  static int inner_i = 100;
	  int inner_j = 200;
	  static void inner_f1(){
	   System.out.println("Outer.i"+i);//��̬�ڲ���ֻ�ܷ����ⲿ��ľ�̬��Ա
	   outer_f1();//������̬�����;�̬����
	  }
	  void inner_f2(){
	//   System.out.println("Outer.i"+j);//��̬�ڲ��಻�ܷ����ⲿ��ķǾ�̬��Ա
	//   outer_f2();//�����Ǿ�̬�����ͷǾ�̬����
	  } 
	 
	 }
	 
	 public void outer_f3(){
	//  �ⲿ������ڲ���ľ�̬��Ա���ڲ���.��̬��Ա
	  System.out.println(Inner.inner_i);
	  Inner.inner_f1();
	//  �ⲿ������ڲ���ķǾ�̬��Ա:ʵ�����ڲ��༴��
	  Inner inner = new Inner();
	  inner.inner_f2();
	 
	 }
	 public static void main(String[] args) {
	  new Outer().outer_f3();
	 }

	}

	ע�⣺*******���ɣ�new��һ����̬�ڲ��಻��Ҫ�ⲿ���Ա�����Ǿ�̬�ڲ���ͳ�Ա�ڲ�������𡣾�̬�ڲ���Ķ������ֱ�����ɣ�
	Outer.Inner in=new Outer.Inner()��
	������Ҫͨ�������ⲿ����������ɡ�����ʵ����ʹ��̬�ڲ����Ϊ��һ�������ࡣ��̬�ڲ��಻����private�����ж��塣*******

	���ӣ�
	���������࣬ӵ����ͬ�ķ�����
	class People
	{
	  run();
	}
	class Machine{
	   run();
	}
	��ʱ��һ��robot�ࣺ
	class Robot extends People implement Machine.
	��ʱrun()����ֱ��ʵ�֡�
	ע�⣺������ӿڣ������ǽӿ���ӿڣ���������������ͻ��ʱ�򣬴�ʱ����ʹ���ڲ�����ʵ�֡��ýӿڲ�����ȫ��ʵ�ֶ�̳У��ýӿ�����ڲ������ʵ�������Ķ�̳С�

	4�������ڲ��� 
	�����ڲ�����һ������ľֲ��ڲ��࣬����ͨ��������ʵ�ֽӿڡ�
	IA������Ϊ�ӿڡ�
	IA I=new IA(){};

	�����ڲ�����ص㣺

	1��һ�������ڼ̳����������ʵ�ֽӿڣ�������Ҫ���Ӷ���ķ�����ֻ�ǶԼ̳з��������Ȼ��Ǹ��ǡ�
	2��ֻ��Ϊ�˻��һ������ʵ��������Ҫ֪����ʵ�����͡�
	3������û�����壬Ҳ���ǲ���Ҫʹ�õ���
*/
public class InnerClassAndAnonymousInnerClass {
	private static int i = 1;
	private int j = 10;
	public static void outer_f1() {
	}
	public void outer_f2() {
	}
	// ��̬�ڲ��������public,protected,private����
	// ��̬�ڲ����п��Զ��徲̬���߷Ǿ�̬�ĳ�Ա
	static class Inner {
		static int inner_i = 100;
		int inner_j = 200;

		static void inner_f1() {
			System.out.println("Outer.i" + i);// ��̬�ڲ���ֻ�ܷ����ⲿ��ľ�̬��Ա
			outer_f1();// ������̬�����;�̬����
		}

		void inner_f2() {
			// System.out.println("Outer.i"+j);//��̬�ڲ��಻�ܷ����ⲿ��ķǾ�̬��Ա
			// outer_f2();//�����Ǿ�̬�����ͷǾ�̬����
		}
	}

	public void outer_f3() {
		// �ⲿ������ڲ���ľ�̬��Ա���ڲ���.��̬��Ա
		System.out.println(Inner.inner_i);
		Inner.inner_f1();
		// �ⲿ������ڲ���ķǾ�̬��Ա:ʵ�����ڲ��༴��
		Inner inner = new Inner();
		inner.inner_f2();

	}

	public static void main(String[] args) {
		new InnerClassAndAnonymousInnerClass().outer_f3();
	}

}

/*	ע��һ�������ڲ���һ������new�ĺ��棬��������ʵ��һ���ӿڻ�ʵ��һ���࣬û�����������ݶ�̬������ʹ���丸�����������Ǿֲ��ڲ��࣬
 * ��ô�ֲ��ڲ�����������ƶ�������Ч�������ڲ�����Ψһһ���޹��췽���ࡣ�󲿷������ڲ��������ڽӿڻص��õġ�
 * �����ڲ����ڱ����ʱ����ϵͳ�Զ�����Out$1.class�����һ���������ʱ�������ǽӿڣ���ô�����е�����Ϊʵ������ӿڵ��ࡣ
 * �������ڲ����޹��췽����������ʹ�÷�Χ�ǳ������ޡ�����Ҫ�������ʱʹ�þֲ��ڲ��࣬��˾ֲ��ڲ����Ӧ����ԱȽ϶ࡣ
 * �����ڲ����в��ܶ��幹�췽�������һ���������ʱ�������ǽӿڣ���ô�����е�����Ϊʵ������ӿڵ��ࡣ

	________________________________________________________________________________

	�ڲ����ܽ᣺
	1.���ȣ����ڲ�����Ϊ�ⲿ���һ������ĳ�Ա������������������Ա�ķ�յȼ���private ,protected,Ĭ��(friendly),public
	                                                      �������Ա�����η�:   static,final,abstract
	2.�Ǿ�̬�ڲ���nested inner class,�ڲ���������һ���ⲿ���ָ��this,��ˣ������Է����ⲿ���һ����Դ����Ȼ����private��
	  �ⲿ������ڲ���ĳ�Ա����Ҫȡ���ڲ���Ķ���,����ȡ�����ڲ����Ա�ķ�װ�ȼ���
	  �Ǿ�̬�ڲ��಻�ܰ����κ�static��Ա.
	3.��̬�ڲ��ࣺstatic inner class,���ٰ����ⲿ���thisָ�룬�������ⲿ��װ��ʱ��ʼ��.
	  ��̬�ڲ����ܰ���static���static��Ա.
	  ��̬�ڲ���ֻ�ܷ����ⲿ��static��Ա.
	  �ⲿ����ʾ�̬�ڲ���ĳ�Ա��ѭһ���෨�档����static��Ա��������.��Ա���ɷ��ʣ����ڷ�static��Ա��ֻ��
	    �ö���.��Ա���з���

	4.���ڷ����е��ڲ��������ڲ���ֻ�ܷ��ʿ��л򷽷��е�final������

	���Ա������static , non-static��ͬ���ڲ���Ҳ��������
	non-static �ڲ����ʵ�����������ⲿ��ķ����д�����ͨ���ⲿ���ʵ��������(OuterClassInstanceName.new innerClassName(ConstructorParameter)),���ҿ�ֱ�ӷ����ⲿ�����Ϣ,�ⲿ������ͨ��OuterClassName.this������
	static �ڲ����ʵ��, ֱ�Ӵ������ɣ�û�ж��ⲿ��ʵ�������á�
	�ڲ��಻��static����non-static���ж��ⲿ�������
	non-static �ڲ��಻������static��Ա

	�����е��ڲ���ֻ������ʷ����е�final�ֲ������ͷ�����final�����б�����˵�����е��ڲ�����ڲ���ûʲ�����𡣵������е��ڲ��಻���ڷ���������ʣ������в�������static�ڲ���
	�����ڲ�������̳��Խӿ�,����ʵ��ָ���ӿڵķ���,���޲��� 
	�����ڲ�������̳�����,�������밴����Ĺ��캯���Ĳ�������
*/
	
