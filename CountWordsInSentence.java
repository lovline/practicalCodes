package com.bjsxt.doitmyself.test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import javax.swing.JOptionPane;

public class CountWordsInSentence {
	public static void main(String[] args) {
		System.out.println("please enter a sentence ...");
		Scanner sc = new Scanner(System.in);
		String[] ss = sc.nextLine().trim().split(" ");
		Map map = new HashMap();

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
		String s = "I am a student.I come from XiDian.I love XiDian."; // �����Ե��ַ���
		String ss = s.toLowerCase();
		System.out.println(ss);
		Map<Character, Integer> result = getCharMaps(ss);
		System.out.println(result);// ��ӡ���ַ����и��ַ����ֵĴ�����
		System.out.println(result.get('i'));

	}

	public static Map<Character, Integer> getCharMaps(String s) {
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		for (int i = 0; i < s.length(); i++) {
			Character c = s.charAt(i);
			Integer count = map.get(c);
			map.put(c, count == null ? 1 : count + 1);
		}
		return map;

	}

}
 
