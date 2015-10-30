package javahigh.runtimetest;

public class RuntimeDemo01 {

	public static void main(String[] args) {
		Runtime run = Runtime.getRuntime();
		System.out.println("JVM's max memopry size: " + run.maxMemory());
		System.out.println("JVM's free memory size: " + run.freeMemory());
		
		String str = "Hello" + " World" + "!!!" + "\t" + "Welcome to China!";
		System.out.println(str);
		
		for(int i = 0; i < 1000; i++) {
			str += i;  //循环修改内容会产生多个垃圾
		}
		
		System.out.println("JVM's free memory size after operating String: " + run.freeMemory());
		
		run.gc();
		System.out.println("JVM's free memory size after gc: " + run.freeMemory());
	}
}
