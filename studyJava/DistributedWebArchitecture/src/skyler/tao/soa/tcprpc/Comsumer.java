package skyler.tao.soa.tcprpc;

import java.lang.reflect.Method;

public class Comsumer {

	private String interfaceName;
	private Method method;

	public Method getMethod() {
		return method;
	}

	public void setMethod() throws NoSuchMethodException, SecurityException {
		this.method = SayHelloService.class.getMethod("sayHello", java.lang.String.class);
	}

	public String getInterfaceName() {
		return interfaceName;
	}

	public void setInterfaceName() {
		this.interfaceName = SayHelloService.class.getName();
	}
}
