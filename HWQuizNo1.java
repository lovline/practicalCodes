package com.bjsxt.doitmyself.test;

import java.util.Scanner;
/**
 * ��Ϊ������Ŀһ
 * ȥ���ظ��ַ�
 * ��һ�γ��ֵĲ�ɾ��
 * ���룺122222aab2
 * �����12ab
 * @author Administrator
 *
 */

public class HWQuizNo1 {
       public static void main(String[] args){
    	   Scanner sc=new Scanner(System.in);
    	   String str=sc.next();
    	   StringBuffer sb=new StringBuffer();
    	   //StringBuilder sb=new StringBuilder();
    	   for(int i=0;i<str.length();i++){
    		   boolean flag=false;
    		   //����ǰ��ÿ�����Ƚϣ����һ���Ļ���ǰ���Ѿ����ֹ���
    		   //�ͽ���־λ�ı䣬����ӵ��ɱ��ַ�����������
    		   for(int j=0;j<i;j++){
    			   if(str.charAt(i)==str.charAt(j)){
    				   flag=true;
    			   }
    		   }
    		   if(!flag){
    			   sb.append(str.charAt(i));
    		   }
    	   }
    	   System.out.println(sb);
   }
 
}
