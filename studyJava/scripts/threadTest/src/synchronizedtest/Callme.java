package synchronizedtest;

public class Callme {

	Callme() {

	}

	//ʹ��synchronized���Է�ֹ����̵߳��ø�ͬһ������ʱ�����־������ 
	synchronized public void hasSynCall(String msg) {
		System.out.print("[ " + msg );
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			System.out.println("Interrupted!");
			e.getStackTrace();
		}
		System.out.println(" ]");
	}

	public void noSynCall(String msg) {
		System.out.print("[ " + msg);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			System.out.println("Interrupted!");
		}
		System.out.println(" ]");
	}
}
