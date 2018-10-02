package com.log_test;

import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Formatter;
import java.util.logging.LogRecord;


public class HTMLFormatter extends Formatter {

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

    ArrayList<String> list = new ArrayList<String>();
    list.add(dat.toString());
    list.add(source);
    list.add(record.getLoggerName());
    list.add(record.getLevel().getLocalizedName());
    list.add(message);

    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("<table>\n");
    stringBuilder.append("\t<tr>\n");
    for (int i = 0; i < list.size(); i++) {
      stringBuilder.append("\t\t<td>");
      stringBuilder.append(list.get(i));
      stringBuilder.append("</td>\n");
    }
    stringBuilder.append("\t</tr>\n");
    stringBuilder.append("</table>\n");

    return stringBuilder.toString();
  }
}

