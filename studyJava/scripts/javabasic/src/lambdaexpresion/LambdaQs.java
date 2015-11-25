package lambdaexpresion;

interface Eatable {
	void taste();
}
interface Flyable {
	void fly(String weather);
}
interface Addable {
	int add(int a, int b);
}

public class LambdaQs {

	public void eat(Eatable e) {
//		System.out.println(e);
		e.taste();
	}
	
	public void drive(String myString, Flyable f) {
//		System.out.println(f);
		f.fly(myString);
	}
	
	public void myAdd(int a, int b, Addable myAdd) {
		System.out.println(myAdd.add(a, b));
	}
	
	public static void main(String[] args) {
		
		LambdaQs lambda = new LambdaQs();
		
		//Lambda���ʽ�Ĵ����ֻ��һ����䣬����ʡ�Ի�����
		lambda.eat(() -> System.out.println("Taste good!"));
		
		//Lambda���ʽ���β��б�ֻ��һ������������ʡ��Բ����
		String myString = "Summer";
		lambda.drive(myString, weather -> {
			System.out.println(weather);
			System.out.println(myString);
		});
		
		//Lambda���ʽ�Ĵ����ֻ��һ����䣬����ʡ�Ի�����
		//һ����䣬����ʡ��return�ؼ���
		lambda.myAdd(5, 23, (a, b) -> a + b);
	}
}
