package ioBasic;

import java.io.*;

public class PrintWriterMain {
	public static void main(String[] args) throws IOException {
		
		PrintWriter pw = new PrintWriter(System.out, true);
		pw.println("This is a string");
		
		int i = 823;
		pw.println(i);
		
		double d = 4.5e-8;
		pw.println(d);
	}
}
