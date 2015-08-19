package com.xd.summary.doitmyself;

import java.io.*;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
		System.out.println(props); //注意顺序是乱的
	 	
		try {
			//通过名称（ip字符串or主机名）来获取一个ip对象
			InetAddress ia = InetAddress.getByName("www.baidu.com");
			System.out.println("address:"+ia.getHostAddress());
			System.out.println("name:"+ia.getHostName());
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//UDP通信
		//udp的发送端（客户端）
		try {
			//1.建立upd的socket服务。
			DatagramSocket ds = new DatagramSocket(8888);
			//2.明确要发送的具体数据。
			String text = "udp传输。。。";
			byte[] buf = text.getBytes();
			//3.将数据封装成数据包。
			DatagramPacket dp = new DatagramPacket(buf, buf.length,
					InetAddress.getByName("127.0.0.1"),10000);
			//4.用socket服务的send方法将数据包发送出去。
			ds.send(dp);
			//5.关闭资源。
			ds.close();
		} catch (SocketException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//upd的接收端（服务器端）
		try {
			//1.创建upd的socket服务
			DatagramSocket ds = new DatagramSocket(10000);
			//2.定义数据包，用于存储接收到的数据，先定义字节数组，数据包会吧数据存储在字节数组中
			byte[] buf = new byte[1024];
			DatagramPacket dp = new DatagramPacket(buf, buf.length);
			//3.通过socket服务的接收方法将接收到的数据存储在数据包中。
			ds.receive(dp); //该方法是阻塞式的方法。
			//4.通过数据包的方法获取数据包中的具体数据内容，比如ip,端口，数据等等。
			String ip = dp.getAddress().getHostAddress();
			int port = dp.getPort();
			String text = new String(dp.getData(),0,dp.getLength());
			System.out.println(ip+"--"+port+"--"+text);
			//5.关闭资源
			ds.close();
		} catch (SocketException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//TCP通信
		//socket客户端
		try {
			Socket s = new Socket("127.0.0.1",10002);
			OutputStream os = s.getOutputStream();//获取了socket流中的输出流对象
			os.write("tcp演示 哥们我又来了".getBytes());
			s.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//socket服务器端
		try {
			ServerSocket ss = new ServerSocket(10002);
			Socket s = ss.accept();//获取客户端对象
			String ip = s.getInetAddress().getHostAddress();
			System.out.println(ip+"....connected");
			//通过可以获取到的socket对象中的socket流和具体的客户端进行通讯
			InputStream is = s.getInputStream();//读取客户端的数据
			byte[] buf = new byte[1024];
			int len = is.read(buf);
			String text = new String(buf,0,len);
			System.out.println(text);
			//如果通讯结束，关闭资源。 注意：要先关客户端，再关服务器端。
			s.close();
			ss.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//字符串和正则表达式的应用
		Pattern pattern = Pattern.compile("([a-z]+)");
		String s = "woejf123ojfafj987";
		Matcher matcher = pattern.matcher(s);
		String str = "";
		while(matcher.find()){
			str+=matcher.group(1);
		}
		System.out.println(str);
		*/
/*		String str = "12 34   56   89 10";
		String[] numStr = str.split(" {1,}");
		String[] numStr = str.split("\\s+");
		for(String num:numStr){
			System.out.println(num);
		}
		
		int[][] arr = new int[][]{{1,2},{3,4},{5,6}};
		System.out.println(arr.length); //3
		System.out.println(arr[0].length);  //2
		
		StringBuffer sb = new StringBuffer("12 34 56 78 45");
		String str = sb.toString();		
		sb.reverse();
		System.out.println(sb);  //54 87 65 43 21
		String[] aa = str.split(" {1,}");
		for(int i=0;i<aa.length;i++){
			System.out.print(aa[aa.length-i-1]+"\t");
			//45 78	56 34 12
		}
*/		
	}

}
