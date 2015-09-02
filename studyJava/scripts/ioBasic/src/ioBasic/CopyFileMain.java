package ioBasic;

import java.io.*;

public class CopyFileMain {
	public static void main(String[] args) throws IOException {

		int i;
		FileInputStream fin;
		FileOutputStream fout;

		try {
			// open input file
			try {
				fin = new FileInputStream(args[0]);
			} catch (FileNotFoundException e) {
				System.out.println("Input File not found!");
				return;
			}

			// open output file
			try {
				fout = new FileOutputStream(args[1]);
			} catch (FileNotFoundException e) {
				System.out.println("Error opening output file!");
				return;
			}
			
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Usage: CopyfileMain fromFile toFile");
			return;
		}

		// copy from input to output
		try {
			do {
				i = fin.read();
				if (i != -1) {
					fout.write(i);
				}
			} while (i != -1);
		} catch (IOException e) {
			System.out.println("File Error!");
		}

		fin.close();
		fout.close();
	}
}
