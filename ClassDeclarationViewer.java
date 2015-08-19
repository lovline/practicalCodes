package com.xd.summary.doitmyself;

import java.lang.ProcessBuilder.Redirect.Type;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import java.lang.reflect.TypeVariable;

/**
 * ͨ����������������������η�
 * 		public protected private abstract static final 
 *  ������ơ���ķ��Ͳ�������ļ̳��ࣨʵ�ֵĽӿڣ������ע��
 *  �������÷��䷽�������Щ��Ϣ
 * @author lovline
 */
public class ClassDeclarationViewer {
	public static void main(String[] args) throws ClassNotFoundException {
		Class<?> clazz = Class.forName("java.util.ArrayList");
		System.out.println("��ı�׼���ƣ�"+clazz.getCanonicalName());
		System.out.println("������η���"+Modifier.toString(clazz.getModifiers()));
		//�����ķ��Ͳ���
		TypeVariable<?>[] typeVariables = clazz.getTypeParameters();
		System.out.println("��ķ��Ͳ����У�");
		if(typeVariables.length != 0){
			for(TypeVariable<?> typeVariable : typeVariables){
				System.out.println(typeVariable+"\t");
			}
		}
		//��ø����������й��췽��
		Constructor[] constructors = clazz.getConstructors();
		System.out.println("��Ĺ��췽����");
		if(constructors.length != 0){
			for(Constructor constructor : constructors){
				System.out.println("\t"+constructor);
			}
		}else{
			System.out.println("��");
		}
		//�������ʵ�ֵ����нӿ�
		java.lang.reflect.Type[] interfaces = clazz.getGenericInterfaces();
		System.out.println("����ʵ�ֵĽӿ��У�");
		if(interfaces.length != 0){
			for(java.lang.reflect.Type type : interfaces){
				System.out.println("\t"+type);
			}
		}else{
			System.out.println("\t"+"��");
		}
		//������ֱ�Ӽ̳��࣬����Ǽ̳�Object�򷵻ؿ�
		java.lang.reflect.Type superClass = clazz.getGenericSuperclass();
		System.out.println("���ֱ�Ӽ̳����У�");
		if(superClass != null){
			System.out.println(superClass);
		}else{
			System.out.println("��");
		}
		//����������ע����Ϣ����Щע����Ϣ�ǲ����÷����õ�
		Annotation[] annotations = clazz.getAnnotations();
		System.out.println("���ע�⣺");
		if(annotations.length != 0){
			for(Annotation annotation : annotations){
				System.out.println("\t"+annotation);
			}
		}else{
			System.out.println("��");
		}

	}

}
