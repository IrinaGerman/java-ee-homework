package com.log_test;

import java.util.Date;
import java.util.logging.Formatter;
import java.util.logging.LogRecord;


public class MyNewFormatter extends Formatter {

  private final Date dat = new Date();

  public String format(LogRecord record) {

    dat.setTime(record.getMillis());
    String source;
    if (record.getSourceClassName() != null) {
      source = record.getSourceClassName();
      if (record.getSourceMethodName() != null) {
        source += " " + record.getSourceMethodName();
      }
    } else {
      source = record.getLoggerName();
    }
    String message = formatMessage(record);
    String formatString =
        dat.toString() + "***" + source + "***" +
            record.getLoggerName() + "***" +
            record.getLevel().getLocalizedName() + "***" +
            message;

    return formatString;
  }
}

