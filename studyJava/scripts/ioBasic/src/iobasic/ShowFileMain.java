package iobasic;

import java.io.*;

public class ShowFileMain {
	public static void main(String[] args) throws IOException {
		
		int i;
		FileInputStream fin;
		System.out.println(args[0]);
		//System.out.println(args[1]);
		try {
			//System.out.println(args[1]);
			fin = new FileInputStream(args[0]);
		} catch (FileNotFoundException e) {
			System.out.println("File not found!");
			return;
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Usage: showFileMain fileName");
			return;
		}
		
		//i =-1 表示遇到了文件结尾
		do {
			i = fin.read();
			if(i != -1) {
				System.out.print((char)i);
			}
		} while(i != -1);
		
		fin.close();
	}
}
