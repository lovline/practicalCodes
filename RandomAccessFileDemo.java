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
	            //д���������double����
	            rf.writeDouble(i * 1.414);
	        }
	        rf.close();
	        rf = new RandomAccessFile("d:/random.txt", "rw");
	        //ֱ�ӽ��ļ�ָ���Ƶ���5��double���ݺ���
	        rf.seek(5 * 8);
	        //���ǵ�6��double����
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
		raf.write("��ΰ".getBytes());
		raf.writeInt(120);
		raf.close();
	}

	private static void read() throws IOException  {
		RandomAccessFile raf = new RandomAccessFile("d:/random.txt", "r");//ֻ��ģʽ
		//ָ��ָ��λ��
		//raf.seek(0);//ʵ�������ȡ�ļ��е����ݣ�ע�⣺��������й��ɡ�
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
		//rw��������ļ������ڻᴴ���ļ������ļ��Ѵ��ڣ����ᴴ����
		//���Բ����������һ������
		RandomAccessFile raf = new RandomAccessFile("d:/random.txt", "rw");//rw ��дģʽ
		//���ļ���д�������Ϣ
		raf.write("������".getBytes());
		System.out.println("������".getBytes().length); //��ռ�ֽڳ���
		raf.writeInt(23);
		raf.close();
	}
	
	

}
