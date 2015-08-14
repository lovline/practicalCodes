package com.xd.summary.doitmyself;
/**
 * 模板方法设计模式
 * 当功能内部一部分实现是确定，一部分实现是不确定时，
 * 这时可以把不确定的部分暴露出去，让子类自己去实现。
 * @author Administrator
 *
 */
abstract class ModeMethod {
	//此功能如果不需要复写，可以加final限定
	public final void getTime(){ 
		long start = System.currentTimeMillis();
		code(); //不确定方法提取出来，通过抽象方法实现
		long end = System.currentTimeMillis();
		System.out.println("毫秒是："+(end - start));
	}
	//抽象不确定的功能，让子类复写实现。
	public abstract void code();
}

class ModeDemo extends ModeMethod{
	public void code(){
		for(int y=0;y<100;y++){
			System.out.println("y");
		}
	}
}

