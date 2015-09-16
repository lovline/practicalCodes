package com.tusehgntkeji.quiz02;
/**
 * what to say 
 * very practical methods.
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SortHashMap {
	public static void main(String args[]){
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("d", 2);
		map.put("c", 1);
		map.put("b", 1);
		map.put("a", 3);

		/**
		 * ӳ�����-ֵ�ԣ���Map.entrySet ��������ӳ��� collection ��ͼ��
		 * ���е�Ԫ�����ڴ��ࡣ���ӳ�������õ�Ψһ ������ͨ���� collection 
		 * ��ͼ�ĵ�������ʵ�֡���Щ Map.Entry ����� �ڵ����ڼ���Ч����ȷ�еؽ���
		 * ����ڵ�����������֮���޸��˵ײ�ӳ�䣬��ĳЩӳ�������Ϊ�ǲ�ȷ���ģ�
		 * ����ͨ�� setValue ��ӳ������ִ�в���֮�⡣
		 */
		List<Map.Entry<String, Integer>> infoIds =
		    new ArrayList<Map.Entry<String, Integer>>(map.entrySet());

		
		//����ǰ
		for (int i = 0; i < infoIds.size(); i++) {
		    String id = infoIds.get(i).toString();
		    System.out.print(id+"\t");
		}
		System.out.println();
		System.out.println("************");
		
		//����
		/**
		 * ����ָ���Ƚ���������˳���ָ���б��������
		 * ���б��ڵ�����Ԫ�ض������ʹ��ָ���Ƚ����໥�Ƚ�
		 *��Ҳ����˵�������б��е����� e1 �� e2 Ԫ�أ�c.compare(e1, e2) 
		 * �����׳� ClassCastException���������򱻱�֤���ȶ��ģ�
		 * ��������� sort ������ȵ�Ԫ�ؽ�����������
		 * 
		 * ǿ�ж�ĳ������ collection ������������ �ıȽϺ�����
		 * ���Խ� Comparator ���ݸ� sort �������� Collections.sort
		 * �� Arrays.sort�����Ӷ�����������˳����ʵ�־�ȷ���ơ�������
		 * ʹ�� Comparator ������ĳЩ���ݽṹ�������� set������ӳ�䣩
		 * ��˳�򣬻���Ϊ��Щû����Ȼ˳��Ķ��� collection �ṩ����
		 */
		Collections.sort(infoIds, new Comparator<Map.Entry<String, Integer>>() {   
		    public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {      
		        return (o2.getValue() - o1.getValue()); 
		        //return (o1.getKey()).toString().compareTo(o2.getKey());
		    }
		}); 

		//�����
		for (int i = 0; i < infoIds.size(); i++) {
		    String id = infoIds.get(i).toString();
		    System.out.print(id+"\t");
		}
		//����key����a 3//b 1//c 1//d 2
		//����value����//a 3//d 2//b 1//c 1
		//����value��ֵ�Ӵ�С��������
		//����仰���п���o2.getValue() - o1.getValue()
	}
}
