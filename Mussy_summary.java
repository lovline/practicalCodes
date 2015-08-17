package com.xd.summary.doitmyself;

import java.io.*;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Mussy_summary {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws InterruptedException 
	 * @throws ParseException 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	char[] ch = {'a','b','c','d','e','f'};
		String str = String.valueOf(ch);
		System.out.println(str);
		str.replace('a', '0');
		System.out.println(str);
		System.out.println(str.replace('a', 'o'));
		str.substring(1,4);
		System.out.println(str);
		System.out.println(str.substring(1,4));
		System.out.println(str.contains("r"));
		System.out.println(str.replaceAll("[a-z]+", "0000"));
		
		StringBuilder sb = new StringBuilder("abcdefg");
		sb.setLength(4);
		System.out.println(sb);
		System.out.println(sb.delete(0, 1));
		System.out.println(sb);
		String s = "abc"+4+'d';
		System.out.println(s);
		
		Integer a = Integer.parseInt("1234");
		System.out.println(a);
		System.out.println(Integer.parseInt("1010", 2));
		
		List list = Arrays.asList("aa","bb","ee");
		ListIterator listIte = list.listIterator();//list特有的迭代器
		while(listIte.hasNext()){
			System.out.println(listIte.next());
		}
		
		LinkedList list = new LinkedList();
		list.add("aaa");
		list.add("ccc");
		//System.out.println(list.peekLast());
		
		/*Properties write = System.getProperties();
		String ss = write.toString();
		try {
			BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(new File("d:\\test.txt")));
			byte[] bb = ss.getBytes();
			bos.write(bb, 0, bb.length);
			bos.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String name = System.getProperty("os.name");
		//System.out.println(name);
		
		Runtime r = Runtime.getRuntime();
		Process p = r.exec("notepad.exe Error.java");
		Thread.sleep(4000);
		p.destroy();
		
		String date = "2015/8/17";
		DateFormat df = new SimpleDateFormat("yyyy/MM/dd");
		Date d = df.parse(date);
		System.out.println(d);
		
		Date d = new Date();
		//DateFormat df = DateFormat.getDateInstance(DateFormat.LONG);
		DateFormat df = DateFormat.getDateTimeInstance(DateFormat.LONG,DateFormat.LONG);
		String date = df.format(d);
		System.out.println(date);
		
		Date d = new Date();
		//DateFormat df = new SimpleDateFormat();
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String date = df.format(d);
		System.out.println(date);
		
		FileWriter fw = new FileWriter(new File("d:\\test.txt"));
		BufferedWriter bf = new BufferedWriter(fw);
		for(int x=0;x<4;x++){
			bf.write(x+"abc");
			bf.newLine();
			bf.flush();
		}
		bf.close();
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String info = "";
		while(null != (info=br.readLine())){
			if("over".equals(info)){
				break;
			}
			bw.write(info.toUpperCase(),0,info.length());
			bw.newLine();
			bw.flush();
		}
		br.close();
		bw.close();
		
		File file = new File("E:/电影天堂");
		System.out.println(file.getAbsolutePath());
		long time = file.lastModified();
		Date d = new Date();
		d.setTime(time);
		System.out.println(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(d));
		System.out.println(File.separatorChar);
		String[] list = file.list();
		for(int i = 0;i<list.length;i++){
			System.out.println(list[i]);
		}
		
		Properties props = new Properties();
		FileInputStream fis = new FileInputStream(new File("d:/a.txt"));
		props.load(fis);
		System.out.println(props); //注意顺序是乱的*/
	 	
		
	}

}
