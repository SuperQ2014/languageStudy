package HelloLog4jGroup.HelloLog4j;

//import org.apache.log4j.*;
import org.apache.log4j.Logger;
//import org.apache.log4j.BasicConfigurator;
//import org.apache.log4j.PropertyConfigurator;
/**
 * Hello world!
 *
 */
public class App 
{
	private static Logger logger = Logger.getLogger(App.class);
    public static void main( String[] args )
    {
//        System.out.println( "Hello World!" );
//    	public static Logger logger = Logger.getLogger(App.class);
//    	BasicConfigurator.configure();
//    	PropertyConfigurator.configure(args[0]);
    	logger.debug("This is a debug message.");
    	logger.info("This is a info message.");
    	logger.error("This is a error message.");
    	
    }
}
