package synchronizedTest;

public class Callme {
	
	Callme() {
		
	}
	
/*	synchronized public void call1( String msg ) {		//ʹ��synchronized���Է�ֹ����̵߳��ø�ͬһ������ʱ�����־������
		System.out.print("[ " + msg );
		try {
			Thread.sleep(1000);
		} catch ( InterruptedException e ) {
			System.out.println("Interrupted!");
		}
		System.out.println(" ]");
	}*/
	
	public void call2( String msg ) {		//�ڵ��ú�����ʹ��synchronized����Է�ֹ����̵߳��ø�ͬһ������ʱ�����־������
		System.out.print("[ " + msg );
		try {
			Thread.sleep(1000);
		} catch ( InterruptedException e ) {
			System.out.println("Interrupted!");
		}
		System.out.println(" ]");
	}
}
