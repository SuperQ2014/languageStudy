package threadtest;

public class extendNewThread extends Thread {
	//���캯��
	extendNewThread() {
		super("Demo thread2");		//���ø���Ĺ��췽������Thread�Ĺ��췽���������String������Ϊ�߳���
		System.out.println("Child thread2 : " + this );
		start();
	}
	
	//�߳���ڣ�start���ú�������ڷ���
	public void run() {
		try {
			int n;
			for ( n = 5; n > 0; n-- ) {
				System.out.println("Child thread2 : " + n );
				Thread.sleep(3000);
			}
		} catch ( InterruptedException e ) {
			System.out.println("The child thread2 is interrupted!");
		}
		System.out.println("Exiting the child thread2!!");
	}
}
