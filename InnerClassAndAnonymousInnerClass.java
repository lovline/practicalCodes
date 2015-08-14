package com.xd.summary.doitmyself;
/**
 * 内部类和匿名内部类总结
 * @author Administrator
 *
 */
//InnerClassAndAnonymousInnerClass
/*	Java 内部类 
	分四种：成员内部类、局部内部类、静态内部类和匿名内部类。 
	1、成员内部类： 即作为外部类的一个成员存在，与外部类的属性、方法并列。
	注意：成员内部类中不能定义静态变量,但可以访问外部类的所有成员。
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
	
		//成员内部类
		class Inner{
		//static int inner_i =100; //内部类中不允许定义静态变量
		int j=100;//内部类中外部类的实例变量可以共存
		int inner_i=1;
		void inner_f1(){
			int j = 1000;
		    System.out.println(i);//外部类的变量如果和内部类的变量没有同名的，则可以直接用变量名访问外部类的变量
		    System.out.println(j);//在内部类中访问内部类自己的变量直接用变量名
		    System.out.println(this.j);//也可以在内部类中用"this.变量名"来访问内部类变量
		    System.out.println(Outer.this.j);//访问外部类中与内部类同名的实例变量可用"外部类名.this.变量名"。
		    System.out.println(k);//外部类的变量如果和内部类的变量没有同名的，则可以直接用变量名访问外部类的变量
		    outer_f1();
		    outer_f2();
		}
	}
	//外部类的非静态方法访问成员内部类
	public void outer_f3(){
	    Inner inner = new Inner();
	    inner.inner_f1();
	}

	//外部类的静态方法访问成员内部类，与在外部类外部访问成员内部类一样
	public static void outer_f4(){
	    //step1 建立外部类对象
	    Outer out = new Outer();
	    //***step2 根据外部类对象建立内部类对象***
	    Inner inner=out.new Inner();
	    //step3 访问内部类的方法
	    inner.inner_f1();
	}

	public static void main(String[] args){
	    outer_f4();
	}
	}
*/
/*
 * 成员内部类的优点： ⑴
 * 内部类作为外部类的成员，可以访问外部类的私有成员或属性。（即使将外部类声明为PRIVATE，但是对于处于其内部的内部类还是可见的。） ⑵
 * 用内部类定义在外部类中不可访问的属性。这样就在外部类中实现了比外部类的private还要小的访问权限。
 * 注意：内部类是一个编译时的概念，一旦编译成功，就会成为完全不同的两类
 * 。对于一个名为outer的外部类和其内部定义的名为inner的内部类。编译完成后出现outer.class和outer$inner.class两类。
 * 2、局部内部类： 即在方法中定义的内部类，与局部变量类似，在局部内部类前不加修饰符public或private，其范围为定义它的代码块。
 * 注意：局部内部类中不可定义静态变量，可以访问外部类的局部变量(即方法内的变量)，但是变量必须是final的。
 */
/*
public class Outer {
	private int s = 100;
	private int out_i = 1;

	public void f(final int k) {
		final int s = 200;
		int i = 1;
		final int j = 10;
		class Inner { // 定义在方法内部
			int s = 300;// 可以定义与外部类同名的变量

			// static int m = 20;//不可以定义静态变量
			Inner(int k) {
				inner_f(k);
			}

			int inner_i = 100;

			void inner_f(int k) {
				System.out.println(out_i);// 如果内部类没有与外部类同名的变量，在内部类中可以直接访问外部类的实例变量
				System.out.println(k);// *****可以访问外部类的局部变量(即方法内的变量)，但是变量必须是final的*****
				// System.out.println(i);
				System.out.println(s);// 如果内部类中有与外部类同名的变量，直接用变量名访问的是内部类的变量
				System.out.println(this.s);// 用"this.变量名" 访问的也是内部类变量
				System.out.println(Outer.this.s);// 用外部"外部类类名.this.变量名"
													// 访问的是外部类变量
			}
		}
		new Inner(k);
	}

	public static void main(String[] args) {
		// 访问局部内部类必须先有外部类对象
		Outer out = new Outer();
		out.f(3);
	}

}
*/
/*	注意：
	在类外不可直接生成局部内部类（保证局部内部类对外是不可见的）。要想使用局部内部类时需要生成对象，对象调用方法，在方法中才能调用其局部内部类。通过内部类和接口达到一个强制的弱耦合，用局部内部类来实现接口，并在方法中返回接口类型，使局部内部类不可见，屏蔽实现类的可见性。

	3、静态内部类： 静态内部类定义在类中，任何方法外，用static定义。
	注意：静态内部类中可以定义静态或者非静态的成员
	public class Outer {
	 private static int i = 1;
	 private int j = 10;
	 public static void outer_f1(){
	 
	 }
	 public void outer_f2(){
	 
	 }
	// 静态内部类可以用public,protected,private修饰
	// 静态内部类中可以定义静态或者非静态的成员
	 static class Inner{
	  static int inner_i = 100;
	  int inner_j = 200;
	  static void inner_f1(){
	   System.out.println("Outer.i"+i);//静态内部类只能访问外部类的静态成员
	   outer_f1();//包括静态变量和静态方法
	  }
	  void inner_f2(){
	//   System.out.println("Outer.i"+j);//静态内部类不能访问外部类的非静态成员
	//   outer_f2();//包括非静态变量和非静态方法
	  } 
	 
	 }
	 
	 public void outer_f3(){
	//  外部类访问内部类的静态成员：内部类.静态成员
	  System.out.println(Inner.inner_i);
	  Inner.inner_f1();
	//  外部类访问内部类的非静态成员:实例化内部类即可
	  Inner inner = new Inner();
	  inner.inner_f2();
	 
	 }
	 public static void main(String[] args) {
	  new Outer().outer_f3();
	 }

	}

	注意：*******生成（new）一个静态内部类不需要外部类成员：这是静态内部类和成员内部类的区别。静态内部类的对象可以直接生成：
	Outer.Inner in=new Outer.Inner()；
	而不需要通过生成外部类对象来生成。这样实际上使静态内部类成为了一个顶级类。静态内部类不可用private来进行定义。*******

	例子：
	对于两个类，拥有相同的方法：
	class People
	{
	  run();
	}
	class Machine{
	   run();
	}
	此时有一个robot类：
	class Robot extends People implement Machine.
	此时run()不可直接实现。
	注意：当类与接口（或者是接口与接口）发生方法命名冲突的时候，此时必须使用内部类来实现。用接口不能完全地实现多继承，用接口配合内部类才能实现真正的多继承。

	4、匿名内部类 
	匿名内部类是一种特殊的局部内部类，它是通过匿名类实现接口。
	IA被定义为接口。
	IA I=new IA(){};

	匿名内部类的特点：

	1，一个类用于继承其他类或是实现接口，并不需要增加额外的方法，只是对继承方法的事先或是覆盖。
	2，只是为了获得一个对象实例，不需要知道其实际类型。
	3，类名没有意义，也就是不需要使用到。
*/
public class InnerClassAndAnonymousInnerClass {
	private static int i = 1;
	private int j = 10;
	public static void outer_f1() {
	}
	public void outer_f2() {
	}
	// 静态内部类可以用public,protected,private修饰
	// 静态内部类中可以定义静态或者非静态的成员
	static class Inner {
		static int inner_i = 100;
		int inner_j = 200;

		static void inner_f1() {
			System.out.println("Outer.i" + i);// 静态内部类只能访问外部类的静态成员
			outer_f1();// 包括静态变量和静态方法
		}

		void inner_f2() {
			// System.out.println("Outer.i"+j);//静态内部类不能访问外部类的非静态成员
			// outer_f2();//包括非静态变量和非静态方法
		}
	}

	public void outer_f3() {
		// 外部类访问内部类的静态成员：内部类.静态成员
		System.out.println(Inner.inner_i);
		Inner.inner_f1();
		// 外部类访问内部类的非静态成员:实例化内部类即可
		Inner inner = new Inner();
		inner.inner_f2();

	}

	public static void main(String[] args) {
		new InnerClassAndAnonymousInnerClass().outer_f3();
	}

}

/*	注：一个匿名内部类一定是在new的后面，用其隐含实现一个接口或实现一个类，没有类名，根据多态，我们使用其父类名。因他是局部内部类，
 * 那么局部内部类的所有限制都对其生效。匿名内部类是唯一一种无构造方法类。大部分匿名内部类是用于接口回调用的。
 * 匿名内部类在编译的时候由系统自动起名Out$1.class。如果一个对象编译时的类型是接口，那么其运行的类型为实现这个接口的类。
 * 因匿名内部类无构造方法，所以其使用范围非常的有限。当需要多个对象时使用局部内部类，因此局部内部类的应用相对比较多。
 * 匿名内部类中不能定义构造方法。如果一个对象编译时的类型是接口，那么其运行的类型为实现这个接口的类。

	________________________________________________________________________________

	内部类总结：
	1.首先，把内部类作为外部类的一个特殊的成员来看待，因此它有类成员的封闭等级：private ,protected,默认(friendly),public
	                                                      它有类成员的修饰符:   static,final,abstract
	2.非静态内部类nested inner class,内部类隐含有一个外部类的指针this,因此，它可以访问外部类的一切资源（当然包括private）
	  外部类访问内部类的成员，先要取得内部类的对象,并且取决于内部类成员的封装等级。
	  非静态内部类不能包含任何static成员.
	3.静态内部类：static inner class,不再包含外部类的this指针，并且在外部类装载时初始化.
	  静态内部类能包含static或非static成员.
	  静态内部类只能访问外部类static成员.
	  外部类访问静态内部类的成员，循一般类法规。对于static成员，用类名.成员即可访问，对于非static成员，只能
	    用对象.成员进行访问

	4.对于方法中的内部类或块中内部类只能访问块中或方法中的final变量。

	类成员有两种static , non-static，同样内部类也有这两种
	non-static 内部类的实例，必须在外部类的方法中创建或通过外部类的实例来创建(OuterClassInstanceName.new innerClassName(ConstructorParameter)),并且可直接访问外部类的信息,外部类对象可通过OuterClassName.this来引用
	static 内部类的实例, 直接创建即可，没有对外部类实例的引用。
	内部类不管static还是non-static都有对外部类的引用
	non-static 内部类不允许有static成员

	方法中的内部类只允许访问方法中的final局部变量和方法的final参数列表，所以说方法中的内部类和内部类没什麽区别。但方法中的内部类不能在方法以外访问，方法中不可以有static内部类
	匿名内部类如果继承自接口,必须实现指定接口的方法,且无参数 
	匿名内部类如果继承自类,参数必须按父类的构造函数的参数传递
*/
	
