import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MyLoggerClass {

    private static final Logger logger = LoggerFactory.getLogger(MyLoggerClass.class);

    public void doSomething() {
        logger.debug("This is a debug message");
        logger.info("This is an info message");
        logger.warn("This is a warning message");
        logger.error("This is an error message");
        logger.info("Just space ------------------");
    }

    public static void main(String[] args) {
        MyLoggerClass myLogger = new MyLoggerClass();
        myLogger.doSomething();
    }
}
