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
		
		//调用无参数的构造器创建Device匿名实现类的对象
		Device anotherDevice = new Device() {
			
			{
				System.out.println("初始化。。。。");
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
