package javahigh.runtimetest;

import java.io.IOException;

public class RuntimeDemo02 {

	public static void main(String[] args) {
		Runtime run = Runtime.getRuntime();
		Process pro = null;
		try {
			pro = run.exec("notepad.exe");  //���ü��±�����
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		try {
			Thread.sleep(3000);		//3�붨ʱ
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		pro.destroy();
	}
}
