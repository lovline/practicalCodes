package com.bjsxt.doitmyself.test;

import java.util.Scanner;
/**
 * 华为机试题目一
 * 去除重复字符
 * 第一次出现的不删除
 * 输入：122222aab2
 * 输出：12ab
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
    		   //跟它前面每个数比较，如果一样的话（前面已经出现过）
    		   //就将标志位改变，不添加到可变字符串序列里面
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
