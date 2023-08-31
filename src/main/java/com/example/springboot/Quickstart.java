import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Quickstart {
  private static final Logger logger = LoggerFactory.getLogger(Quickstart.class);

  public static void main(String[] args) {
    String exceptionMessage = "This is a multi-line exception message:\n"
        + "Line 1\n"
        + "Line 2\n"
        + "Line 3\n";
    logger.info("Logging INFO with Logback");
    logger.error("Logging ERROR with Logback: {}", exceptionMessage);
  }
}