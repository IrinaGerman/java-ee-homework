package com.jmx_test;

import java.lang.management.ManagementFactory;
import javax.management.InstanceAlreadyExistsException;
import javax.management.MBeanRegistrationException;
import javax.management.MBeanServer;
import javax.management.MalformedObjectNameException;
import javax.management.NotCompliantMBeanException;
import javax.management.ObjectName;
import javax.management.StandardMBean;

public class JMXTest {

  public static void main(String[] args)
      throws NotCompliantMBeanException, MalformedObjectNameException, InstanceAlreadyExistsException, MBeanRegistrationException {

    MBeanServer platform = ManagementFactory.getPlatformMBeanServer();
    StandardMBean resource = new StandardMBean(new JMXResource(), JMXResourceI.class);
    platform.registerMBean(resource, new ObjectName("test:name=test_name"));

    while (true) {

    }
  }
}
