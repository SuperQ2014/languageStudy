package lambdaexpresion;

import java.util.function.Consumer;

public class Resource {

	private Resource() {
		System.out.println("Opening Resource...");
	}
	
	public void opearte() {
		System.out.println("Operating resource ...");
	}
	
	public void dispose() {
		System.out.println("Disposing resource ...");
	}
	
	public static void withResource(Consumer<Resource> consumer) {
		Resource resource = new Resource();
		try {
			consumer.accept(resource);
		} finally {
			resource.dispose();
		}
	}
}
