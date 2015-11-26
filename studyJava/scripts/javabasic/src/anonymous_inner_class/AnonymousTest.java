package anonymous_inner_class;

public class AnonymousTest {

	public void test(Product product) {
		System.out.println("Name: " + product.getName() + " , price: " + product.getPrice()); 
	}
	
	public static void main(String[] args) {
		
		AnonymousTest test = new AnonymousTest();
		
		test.test(new Product() {
			public double getPrice() {
				return 22.3;
			}
			public String getName() {
				return "skyler.tao";
			}
		});
	}
}
