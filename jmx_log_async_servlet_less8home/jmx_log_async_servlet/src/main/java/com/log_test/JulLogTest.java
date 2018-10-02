package com.log_test;

import java.util.logging.Logger;

//import org.slf4j.Logger;

public class JulLogTest {

  private static final Logger logger = Logger.getLogger(JulLogTest.class.getName());
//  private static final Logger logger = LoggerFactory.getLogger(JulLogTest.class.getName());

  public static void main(String[] args) {
    // logger.fine("main method >> start");
    logger.setFilter(new LogFilter());
    logger.info("info message");
    logger.info("some important message");
  }
}
