package com.xidian.tencentTest;

public class AnonymousInnerClass�����ڲ��� {
	public static void main(String[] args){
/*		̸̸Java�������ڲ���
		Java�����ڲ��� 
		�ںܶ�ʱ��������Ҫ������ڲ���ʼ��һ����̬��Map����List��Ȼ�󱣴�һ�³���ֵ�ṩ�����ڲ�����ʹ�á� 
		����ͨ���������ǣ� 
		���ȳ�ʼ��һ��Map�ľ�̬������ 
		Ȼ���ھ�̬����ӳ���ֵ�� */
		private final static Map<String, String> CONSTANT =   
		    new HashMap<String, String>();  
		static {  
		    CONSTANT.put("1", "one");  
		    CONSTANT.put("2", "two");  
		}  
		//��ʵ��������ôд�� 
		private final static Map<String, String> CONSTANT =   
		     new HashMap<String, String>() {  
		    {  
		        put("1", "one");  
		        put("2", "two");  
		    }  
		};  
		//����������ַ�ʽ�Ƚ�İ�������ȿ�һ����Ϥ�ģ� 
		new Thread() {  
		    public void run() {  
		        System.out.println("Thread running!");  
		    };  
		}.start();   
		//ʵ����������δ������˼���ǣ�����һ��Thread�����ಢ��дThread��run()������
		//Ȼ�󴴽�һ���������ʵ��Ȼ�������start()���������������ĸ�Thread������û������
		//�����Խ������ࡣ������û�����ֵ���ֻ�ܴ�����һ�������һ�������ڲ��������ֳ�Ϊ�����ڲ��ࡣ 
		
		//�����ڲ�����﷨Ҳ������ôд�� 
		Thread thread = new Thread() {  
		    public void run() {  
		        System.out.println("Thread running!");  
		    };  
		};   
		thread.start();  
//		Ψһ��������ǲ���ֱ�Ӵ������ಢ�����䷽������������һ��������ĸ�������thread��Ȼ��ͨ���ø������õ������෽���� 
//		�������������ʵ����û������ִ��start()������ʵ����ִ��ʵ���ķ����ֿ��� 
//
//		���ߵ������൱�ڣ� 
		//1  
		new User().setName("Boyce Zhang");  
		//2  
		User user = new User();  
		user.setName("Boyce Zhang");  

		//�����ڲ������һ���﷨������ 
		new Thread() {  
		    public void run() {  
		        System.out.println("Thread running!");  
		    };  
		    {  
		        start();  
		    }  
		};  
//		ʵ��������д�������������������ֲ�������е������෽���� 
//		�ֲ�������ڵ�������ڴ��������ʵ���������������ʽ����ִ�еġ� 
//		�൱�ڣ� 
		public class MyThread extends Thread {  
		    {  
		        start();  
		    }  
		    public void run() {  
		        System.out.println("Thread running!");  
		    };  
		}  
		//�������ַ�ʽ��ִ�е�ʱ������΢�Ĳ��֮�⣬Ч����û��̫������� 
		//����һ����ǰ���ʼ��Map�ķ�ʽ�Ͳ��������: 
		private final static Map<String, String> CONSTANT = new HashMap<String, String>() {  
		    {  
		        put("1", "one");  
		        put("2", "two");  
		    }  
		};  
//		ԭ����ǣ� 
//		������ʵ����һ��HashMap�����ࣨ����û����д����HashMap���κη�������
//		�������������ֲ��������ø���HashMap��put()������ 
//		�������һ��Map�ӿ�����CONSTANTָ��ʵ������HashMap�����ʵ���� 
//		����ǰ�����������֪������ֲ�������е�put()�������ý���HashMap���������౻ʵ�����������������ʽ��ִ�С� 
//
//		��ʵ,����Java���κ����ӿڣ�����������һ��������̳л�ʵ�������磺 
		//��д���෽�����ֲ����������Լ���д���ĸ��෽����  
		List<String> list = new ArrayList<String>() {  
		    public boolean add(String e) {  
		        System.out.println("Cannot add anything!");  
		    }  
		    //������˳����ǰ������ν�����Գ������෶Χ���κ�λ�á�  
		    {  
		        add("Boyce Zhang");  
		    }  
		};  
		//�ֲ��������ø��෽����  
		dao.add(new User(){  
		    {  
		        setName("Boyce Zhang");  
		        setAge(26);  
		    }  
		});  
		//��д���෽��  
		ThreadLocal<User> threadLocal = new ThreadLocal<User>() {  
		    protected String initialValue() {  
		        return new User("Boyce Zhang", 26);  
		    }  
		};  
//		����������ڲ����ǲ�������ʵ�ֻ���д�丸��ķ����� 
//		����Ҳ����������ľֲ��������ִ���Լ��ķ��������丸��ķ����� 
//		�Ⲣ���������ڲ���������﷨������Java���﷨�������κ��඼���á� 
//
//		����д��������������ʵ����һ���������ִ��ĳЩ������һЩ��ʵ�������ݳ�ʼ��ʲô�ġ� 
//		�����ú���ʵ����һ���࣬��ʹ�������õ�����Ҫ�������õķ�����һ���ģ��磺 
		Map<String, String> map = new HashMap<String, String>();  
		map.put("1", "one");  
		map.put("2", "two");  

//		�����﷨���ŵ���Ǽ򵥣�ʵ����һ�����������һЩ���飬�ȽϷ��㡣 
//		Ч����һ�����Javascript��ļ�ʱ����һ���������б��ʵ����� 
//		��ΪJavascriptû����ĸ������˵Javascript��function�����࣬�����function��
//		���Լ�ʱ�����Ǽ������ִ������function����Java�ľֲ�������ǿ���ѡ��ִ������κη����� 
//
//		��Ȼ����д��Ҳ����ȱ�㣺 
//		ÿһ���ڲ����ʵ���������Եĳ���һ��ָ���ⲿ������ã���̬�ڲ�����⣩������һ�����Ƕ���������˷ѣ�
//		��һ���浱���л��������ʵ��ʱ�ⲿ��Ҳ�ᱻ��֪�����Ĵ��л�������ⲿ��û��ʵ��serialize�ӿ�ʱ���ͻᱨ��
		
		
		
		//ʵ��1:��ʹ�������ڲ�����ʵ�ֳ��󷽷�
		abstract class Person {
		    public abstract void eat();
		}
		 
		class Child extends Person {
		    public void eat() {
		        System.out.println("eat something");
		    }
		}
		 
		public class Demo {
		    public static void main(String[] args) {
		        Person p = new Child();
		        p.eat();
		    }
		}
		//���н����eat something

//		���Կ�����������Child�̳���Person�࣬Ȼ��ʵ����Child��һ��ʵ������������ת��ΪPerson�������
//		���ǣ�����˴���Child��ֻʹ��һ�Σ���ô�����дΪ������һ�������Ǻ��鷳��
//		���ʱ��������������ڲ���

		//ʵ��2�������ڲ���Ļ���ʵ��
		abstract class Person {
		    public abstract void eat();
		}
		 
		public class Demo {
		    public static void main(String[] args) {
		        Person p = new Person() {
		            public void eat() {
		                System.out.println("eat something");
		            }
		        };
		        p.eat();
		    }
		}
		//���н����eat something

//		���Կ���������ֱ�ӽ�������Person�еķ����ڴ�������ʵ����
//		���������ʡ��һ�������д
//		���ң������ڲ��໹�����ڽӿ���
		 
		//ʵ��3���ڽӿ���ʹ�������ڲ���
		interface Person {
		    public void eat();
		}
		 
		public class Demo {
		    public static void main(String[] args) {
		        Person p = new Person() {
		            public void eat() {
		                System.out.println("eat something");
		            }
		        };
		        p.eat();
		    }
		}
		//���н����eat something

//		����������ӿ��Կ�����ֻҪһ�����ǳ���Ļ���һ���ӿڣ���ô�������еķ���������ʹ�������ڲ�����ʵ��
//		��õ���������ڶ��̵߳�ʵ���ϣ���ΪҪʵ�ֶ��̱߳���̳�Thread����Ǽ̳�Runnable�ӿ�

		//ʵ��4��Thread��������ڲ���ʵ��
		public class Demo {
		    public static void main(String[] args) {
		        Thread t = new Thread() {
		            public void run() {
		                for (int i = 1; i <= 5; i++) {
		                    System.out.print(i + " ");
		                }
		            }
		        };
		        t.start();
		    }
		}
		//���н����1 2 3 4 5

		//ʵ��5��Runnable�ӿڵ������ڲ���ʵ��
		public class Demo {
		    public static void main(String[] args) {
		        Runnable r = new Runnable() {
		            public void run() {
		                for (int i = 1; i <= 5; i++) {
		                    System.out.print(i + " ");
		                }
		            }
		        };
		        Thread t = new Thread(r);
		        t.start();
		    }
		}
		//���н����1 2 3 4 5
		
		
	}
}
