package com.bjsxt.doitmyself.test;


/**
 * 2015��7��22
 * ��Ϊ���Ժ���̵�һ���ǣ�
 * Map��Set��������ġ�����
 * Ҫ��Ҫ����ȥ���ظ�����ĸ����˳��
 * ��һ�γ��ֵ����ظ��ı�������
 * �磺122222aab2
 *   �����12ab
 *  ���ʱ������Map�ǵò�����Ҫ��Ч���ġ���
 *  ��ǰ��ô��ûע���ء���̫��С���ˡ�
 */
/**
 * 7��23�������bug
 * Map�������
 * ������LinkedHashMap���������ˡ�
 * ���һ��Ҫ��ס
 * TreeSetҲ��һ���ĵ���
 */
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import javax.swing.JOptionPane;

public class CountWordsInSentence {
	public static void main(String[] args) {
		System.out.println("please enter a sentence ...");
		Scanner sc = new Scanner(System.in);
		String[] ss = sc.nextLine().trim().split(" ");
		//Map map = new HashMap(); ԭ���Ĵ���
		Map map = new LinkedHashMap();

		for (int i = 0; i < ss.length; i++) {
			int count = 0;
			for (int j = 0; j < ss.length; j++) {
				if (ss[i].equals(ss[j])) {
					count = count + 1;
				}
			}
			// Ϊ�˲���ӡ�ظ��ģ�����map��ȥ���ظ���
			map.put(ss[i], count);
		}

		// ����map����ӡ�����ĵ��ʺ͸���
		Set key = map.keySet();
		for (Iterator iterator = key.iterator(); iterator.hasNext();) {
			String name = (String) iterator.next();
			String countNum = map.get(name).toString();
			System.out.println(name + "�� " + countNum + " ��");
		}
	

	}
}


class CountCharactersInString {
	public static void main(String args[]) {
		String s = "1222aab2"; // �����Ե��ַ���
		String ss = s.toLowerCase();
		System.out.println(ss);
		Map<Character, Integer> result = getCharMaps(ss);
		System.out.println(result);// ��ӡ���ַ����и��ַ����ֵĴ�����
	}

	public static Map<Character, Integer> getCharMaps(String s) {
		Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();
		for (int i = 0; i < s.length(); i++) {
			Character c = s.charAt(i);
			Integer count = map.get(c);
			map.put(c, count == null ? 1 : count + 1);
		}
		Iterator ite=map.entrySet().iterator();
		while(ite.hasNext()){
			Map.Entry entry=(Map.Entry) ite.next();
			Character cc= (Character)entry.getKey();
			Integer num=(Integer) entry.getValue();
			System.out.print(cc +"\t");
		}
		return map;

	}

}

		//��һ�ֱ���hashmap�ķ���
	/*	Iterator ite=map.entrySet().iterator();
		while(ite.hasNext()){
			Map.Entry entry=(Map.Entry) ite.next();
			Character cc= (Character)entry.getKey();
			Integer num=(Integer) entry.getValue();
			System.out.println(cc + "�� " + num + " ��");
		}
		//�ڶ��ֱ���hashmap�ķ���
		Set key = map.keySet();
		for (Iterator iterator = key.iterator(); iterator.hasNext();) {
			Character name = (Character) iterator.next();
			int countNum = map.get(name);
			System.out.println(name + "�� " + countNum + " ��");
		}
	*/
