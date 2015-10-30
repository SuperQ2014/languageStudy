package javahigh.runtimetest;

import java.io.IOException;

public class RuntimeDemo02 {

	public static void main(String[] args) {
		Runtime run = Runtime.getRuntime();
		Process pro = null;
		try {
			pro = run.exec("notepad.exe");  //调用记事本程序
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		try {
			Thread.sleep(3000);		//3秒定时
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		pro.destroy();
	}
}
