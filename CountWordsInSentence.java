package com.bjsxt.doitmyself.test;


/**
 * 2015、7、22
 * 华为机试很深刻的一点是：
 * Map、Set都是无序的。。。
 * 要是要求你去掉重复的字母或者顺序
 * 第一次出现的有重复的保留下来
 * 如：122222aab2
 *   输出：12ab
 *  这个时候你用Map是得不到想要的效果的。。
 *  以前怎么就没注意呢。。太不小心了。
 */
/**
 * 7、23改正这个bug
 * Map是无序的
 * 不过用LinkedHashMap就是有序了。
 * 这个一定要记住
 * TreeSet也是一样的道理。
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
		//Map map = new HashMap(); 原来的代码
		Map map = new LinkedHashMap();

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
		String s = "1222aab2"; // 待测试的字符串
		String ss = s.toLowerCase();
		System.out.println(ss);
		Map<Character, Integer> result = getCharMaps(ss);
		System.out.println(result);// 打印出字符串中各字符出现的次数！
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

		//第一种遍历hashmap的方法
	/*	Iterator ite=map.entrySet().iterator();
		while(ite.hasNext()){
			Map.Entry entry=(Map.Entry) ite.next();
			Character cc= (Character)entry.getKey();
			Integer num=(Integer) entry.getValue();
			System.out.println(cc + "有 " + num + " 个");
		}
		//第二种遍历hashmap的方法
		Set key = map.keySet();
		for (Iterator iterator = key.iterator(); iterator.hasNext();) {
			Character name = (Character) iterator.next();
			int countNum = map.get(name);
			System.out.println(name + "有 " + countNum + " 个");
		}
	*/
