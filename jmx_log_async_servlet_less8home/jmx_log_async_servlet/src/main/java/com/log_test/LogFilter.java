package com.log_test;

import java.util.logging.Filter;
import java.util.logging.LogRecord;

public class LogFilter implements Filter {

  public boolean isLoggable(LogRecord record) {
    return record.getMessage().contains("important");
  }
}
