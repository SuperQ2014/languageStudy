package HelloLog4jGroup.HelloLog4j;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

import org.apache.log4j.Logger;
import org.apache.log4j.Level;

public class RootLoggerMain {

	static Logger log = Logger.getRootLogger();

	public static void main(String[] args) throws IOException {
		System.out.println("===>Please enter a number: \n====>");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int number = Integer.valueOf(br.readLine());

		log.info("Info : number is " + number);
		log.warn("Warning : number is " + number);
		log.debug("Debug : number is " + number);
		log.error("Error : number is " + number);
		log.fatal("Fatal : number is " + number);
	}
}
