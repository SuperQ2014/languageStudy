package anonymous_inner_class;

public class AnnoymousInner {

	public void test(Device device) {
		System.out.println("Name: " + device.getName() + " , price: " + device.getPrice());
	}
	
	public static void main(String[] args) {
		
		AnnoymousInner myInner = new AnnoymousInner();
		myInner.test(new Device("skyler.tao") {
			public double getPrice() {
				return 99.99;
			}
		});
		
		//�����޲����Ĺ���������Device����ʵ����Ķ���
		Device anotherDevice = new Device() {
			
			{
				System.out.println("��ʼ����������");
			}
			
			@Override
			public double getPrice() {
				return 2353.23;
			}
			
			public String getName() {
				return "another name";
			}
		};
		myInner.test(anotherDevice);
	}
}
