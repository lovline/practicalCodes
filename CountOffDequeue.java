package com.bjsxt.doitmyself.test;
import java.util.ArrayList;  
import java.util.List;  
/**
 * 输入字符串长度，字符串，计数m。从前往后计数，当数到m个元素时，
 * m个元素出列，同时将该元素赋值给m，然后从下一个数计数循环，直
 * 到所有数字都出列，给定的数全部为大于0的数字。输出出队队列。
 * 例如:  输入：len=5    str="3,1,2,4,6"   m=7   
 *           输出：1,2,6,4,3 
 * @author Administrator
 */
  
public class CountOffDequeue {  
  
    public static void main(String[] args) {  
        int len=5;  
        String str="3,1,2,4,6";     
        int m=7;    
        CountOffDequeue hwt = new CountOffDequeue();  
        System.out.println(hwt.getOutString(len, str, m));  
    }  
    public String getOutString(int len, String str, int m) {  
        String ret ="";  
        String[] arr = str.split(",");  
        List<String> ls = new ArrayList<String>();  
        for(int i=0;i<len;i++) {  
            ls.add(arr[i]);  
        }  
        for(int i=0;i<len;i++) {  
        	//这里的思想很重要。。特别是计算新的m一定要学会。
            int temp = (m-1)%ls.size();  
            ret += ls.get(temp);  
            m = Integer.parseInt(ls.get(temp))+temp;  
            ls.remove(temp);  
        }  
        return ret;  
    }  
} 