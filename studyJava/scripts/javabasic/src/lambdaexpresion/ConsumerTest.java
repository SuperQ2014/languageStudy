package lambdaexpresion;

import java.util.function.Consumer;

public class ConsumerTest {

	public static void main(String[] args) {

		Consumer<Resource> consumer = null;
		Resource.withResource(consumer);
	}
}
