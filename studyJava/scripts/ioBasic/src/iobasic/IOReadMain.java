package iobasic;

import java.io.*;


public class IOReadMain {
	public static void main (String[] args) throws IOException {
		char c;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		//read characters
		do {
			c = (char) br.read();
			System.out.println(c);
		} while(c != 'q');
	}
}
