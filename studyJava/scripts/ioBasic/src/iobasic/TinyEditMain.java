package iobasic;

import java.io.*;

public class TinyEditMain {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str[] = new String[100];
		
		System.out.println("Enter lines of text.");
		System.out.println("Enter 'stop' to quit.");
		
		int i = 0;
		for (i = 0; i < 100; i++) {
			str[i] = br.readLine();
			
			if(str[i].equals("stop")) {
				break;
			}
		}
		
		System.out.println("\nHere is your input: ");
		
		for(int j = 0;  j < 100; j++) {
			if(str[j].equals("stop")) {
				break;
			}
			System.out.println(str[j]);
		}
	}
}
