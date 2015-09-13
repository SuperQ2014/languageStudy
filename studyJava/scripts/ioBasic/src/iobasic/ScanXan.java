package iobasic;

import java.io.*;
import java.util.Scanner;

public class ScanXan {
	public static void main(String[] args) throws IOException {
		Scanner scanner = null;
		
		try {
			scanner = new Scanner(new BufferedReader(new FileReader("input.txt")));
			scanner.useDelimiter(",\\s*");
			while(scanner.hasNext()) {
				System.out.println(scanner.next());
			}
		} finally {
			if (scanner != null) {
				scanner.close();
			}
		}
	}
}
