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
		
		//Lambda表达式的代码块只有一条语句，可以省略花括号
		lambda.eat(() -> System.out.println("Taste good!"));
		
		//Lambda表达式的形参列表只有一个参数，可以省略圆括号
		String myString = "Summer";
		lambda.drive(myString, weather -> {
			System.out.println(weather);
			System.out.println(myString);
		});
		
		//Lambda表达式的代码块只有一条语句，可以省略花括号
		//一条语句，可以省略return关键字
		lambda.myAdd(5, 23, (a, b) -> a + b);
	}
}
