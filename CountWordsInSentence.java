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
			// 为了不打印重复的，放入map中去掉重复的
			map.put(ss[i], count);
		}

		// 遍历map，打印包含的单词和个数
		Set key = map.keySet();
		for (Iterator iterator = key.iterator(); iterator.hasNext();) {
			String name = (String) iterator.next();
			String countNum = map.get(name).toString();
			System.out.println(name + "有 " + countNum + " 个");
		}

	}
}


class CountCharactersInString {
	public static void main(String args[]) {
		String s = "I am a student.I come from XiDian.I love XiDian."; // 待测试的字符串
		String ss = s.toLowerCase();
		System.out.println(ss);
		Map<Character, Integer> result = getCharMaps(ss);
		System.out.println(result);// 打印出字符串中各字符出现的次数！
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
 
