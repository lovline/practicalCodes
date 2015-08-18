package com.xd.summary.doitmyself;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.RandomAccess;

public class RandomAccessFileDemo {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		//test();
		write();
		read();
		randomWrite();
	}

	private static void test() throws IOException {
		 RandomAccessFile rf = new RandomAccessFile("d:/random.txt", "rw");
	        for (int i = 0; i < 10; i++) {
	            //写入基本类型double数据
	            rf.writeDouble(i * 1.414);
	        }
	        rf.close();
	        rf = new RandomAccessFile("d:/random.txt", "rw");
	        //直接将文件指针移到第5个double数据后面
	        rf.seek(5 * 8);
	        //覆盖第6个double数据
	        rf.writeDouble(22.222);
	        rf.close();
	        rf = new RandomAccessFile("d:/random.txt", "r");
	        for (int i = 0; i < 10; i++) {
	            System.out.println("Value " + i + ": " + rf.readDouble());
	        }
	        rf.close();
		
	}

	private static void randomWrite() throws IOException {
		RandomAccessFile raf = new RandomAccessFile("d:/random.txt","rw");
		raf.seek(8*4);
		System.out.println("pos:"+raf.getFilePointer());
		raf.write("刘伟".getBytes());
		raf.writeInt(120);
		raf.close();
	}

	private static void read() throws IOException  {
		RandomAccessFile raf = new RandomAccessFile("d:/random.txt", "r");//只读模式
		//指定指针位置
		//raf.seek(0);//实现随机读取文件中的数据，注意：数据最好有规律。
		//System.out.println("pos:"+raf.getFilePointer());
		byte[] buf = new byte[6];
		raf.read(buf);
		String name = new String(buf);
		int age = raf.readInt();
		System.out.println(name+"--"+age);
		System.out.println("pos2:"+raf.getFilePointer());
		raf.close();
		
	}

	private static void write() throws IOException {
		//rw：当这个文件不存在会创建文件，当文件已存在，不会创建，
		//所以不会像输出流一样覆盖
		RandomAccessFile raf = new RandomAccessFile("d:/random.txt", "rw");//rw 读写模式
		//往文件中写入基本信息
		raf.write("唐云龙".getBytes());
		System.out.println("唐云龙".getBytes().length); //所占字节长度
		raf.writeInt(23);
		raf.close();
	}
	
	

}
