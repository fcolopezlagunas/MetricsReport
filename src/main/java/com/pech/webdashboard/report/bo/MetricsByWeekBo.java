package com.pech.webdashboard.report.bo;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Calendar;

public interface MetricsByWeekBo {

	public void generateReport(Calendar fromCal, Calendar toCal, String file)
			throws IOException, SQLException;

}
