package com.pech.webdashboard.report;

import java.util.Calendar;
import java.util.Locale;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AppTest extends TestCase {

	private static final Logger logger = LoggerFactory.getLogger(AppTest.class);

	public AppTest(String testName) {
		super(testName);
	}

	public static Test suite() {
		return new TestSuite(AppTest.class);
	}

	public void testApp() {
		Calendar cal = Calendar.getInstance(Locale.US);
		cal.set(2012, Calendar.MAY, 01);

		logger.debug(cal.getTime().toString());

		Integer month = cal.get(Calendar.MONTH);
		Integer diference = cal.getFirstDayOfWeek()
				- cal.get(Calendar.DAY_OF_WEEK);
		cal.add(Calendar.DATE, diference);

		if (cal.get(Calendar.MONTH) < month) {
			cal.add(Calendar.DATE, 7);
		}

		logger.debug(String.valueOf(cal.get(Calendar.DAY_OF_MONTH)));
		logger.debug(cal.getTime().toString());
		assertTrue(true);
	}
}
