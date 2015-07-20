package com.bjsxt.testRegExp;
/**
 * 找出输⼊入⽂文件中所有满⾜这个字符两边正好是3个大写字母的小写字母
 * 输入文件地址：https://github.com/zhutao2015/intern-test/blob/master/test1/input.txt
 */
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.print.attribute.standard.Finishings;

public class SmallLetter {

	public static void main(String[] args) throws IOException {
		FileReader reader = new FileReader("C:/Users/Administrator.KCIII4TVX3OWXML/Desktop/input.txt");
		BufferedReader br = new BufferedReader(reader);
		String letters = "";
		while(true){
			String s = br.readLine();
			if (s == null){
				break;
			}
			letters += getMatch(s);
		}
		System.out.println(letters);
	}

	private static String getMatch(String s) {
		String regex = "[^A-Z][A-Z]{3}([a-z])[A-Z]{3}[^A-Z]";
		String matches = "";
		matches += _findMatch(regex, s);
		return matches;
	}
	
	private static String _findMatch(String regex, String s){
		Pattern pattern = Pattern.compile(regex);
		Matcher m = pattern.matcher(s);
		String matches = "";
		while(m.find()){
			matches += m.group(1);
		}
		return matches;
	}

}
