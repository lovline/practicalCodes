package com.xd.summary.doitmyself;
/**
 * 单例设计模式
 * 保证一个类在内存中的对象唯一性
 * 比如：多程序读取一个配置文件时，建议配置文件封装成对象
 * 会方便操作其中数据，又要保证多个程序读到的是同一个配置文件对象。
 * @author LW
 */
	//饿汉式
	/**
	 * 步骤：
	 * 1.私有化结构方法
	 * 2.创建私有并静态的本类对象
	 * 3.定义公有并静态的方法，返回该对象
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
	
	//懒汉式：延迟加载方式。
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

