package com.bjsxt.doitmyself.test;
import java.util.ArrayList;  
import java.util.List;  
/**
 * �����ַ������ȣ��ַ���������m����ǰ���������������m��Ԫ��ʱ��
 * m��Ԫ�س��У�ͬʱ����Ԫ�ظ�ֵ��m��Ȼ�����һ��������ѭ����ֱ
 * ���������ֶ����У���������ȫ��Ϊ����0�����֡�������Ӷ��С�
 * ����:  ���룺len=5    str="3,1,2,4,6"   m=7   
 *           �����1,2,6,4,3 
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
        	//�����˼�����Ҫ�����ر��Ǽ����µ�mһ��Ҫѧ�ᡣ
            int temp = (m-1)%ls.size();  
            ret += ls.get(temp);  
            m = Integer.parseInt(ls.get(temp))+temp;  
            ls.remove(temp);  
        }  
        return ret;  
    }  
} 