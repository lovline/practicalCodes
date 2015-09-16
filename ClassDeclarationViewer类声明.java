package com.xd.summary.doitmyself;

import java.lang.ProcessBuilder.Redirect.Type;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import java.lang.reflect.TypeVariable;

/**
 * 通常类的声明包括常见的修饰符
 * 		public protected private abstract static final 
 *  类的名称、类的泛型参数、类的继承类（实现的接口）和类的注释
 *  本例采用反射方法获得这些信息
 * @author lovline
 */
public class ClassDeclarationViewer {
	public static void main(String[] args) throws ClassNotFoundException {
		Class<?> clazz = Class.forName("java.util.ArrayList");
		System.out.println("类的标准名称："+clazz.getCanonicalName());
		System.out.println("类的修饰符："+Modifier.toString(clazz.getModifiers()));
		//输出类的泛型参数
		TypeVariable<?>[] typeVariables = clazz.getTypeParameters();
		System.out.println("类的泛型参数有：");
		if(typeVariables.length != 0){
			for(TypeVariable<?> typeVariable : typeVariables){
				System.out.println(typeVariable+"\t");
			}
		}
		//获得该类对象的所有构造方法
		Constructor[] constructors = clazz.getConstructors();
		System.out.println("类的构造方法：");
		if(constructors.length != 0){
			for(Constructor constructor : constructors){
				System.out.println("\t"+constructor);
			}
		}else{
			System.out.println("空");
		}
		//输出类所实现的所有接口
		java.lang.reflect.Type[] interfaces = clazz.getGenericInterfaces();
		System.out.println("类所实现的接口有：");
		if(interfaces.length != 0){
			for(java.lang.reflect.Type type : interfaces){
				System.out.println("\t"+type);
			}
		}else{
			System.out.println("\t"+"空");
		}
		//输出类的直接继承类，如果是继承Object则返回空
		java.lang.reflect.Type superClass = clazz.getGenericSuperclass();
		System.out.println("类的直接继承类有：");
		if(superClass != null){
			System.out.println(superClass);
		}else{
			System.out.println("空");
		}
		//输出类的所有注释信息，有些注释信息是不能用反射获得的
		Annotation[] annotations = clazz.getAnnotations();
		System.out.println("类的注解：");
		if(annotations.length != 0){
			for(Annotation annotation : annotations){
				System.out.println("\t"+annotation);
			}
		}else{
			System.out.println("空");
		}

	}

}
