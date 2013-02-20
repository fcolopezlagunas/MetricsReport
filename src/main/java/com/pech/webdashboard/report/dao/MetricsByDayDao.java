package com.pech.webdashboard.report.dao;

import java.sql.SQLException;
import java.util.Date;
import java.util.List;

import com.pech.webdashboard.report.vo.MetricByDay;

public interface MetricsByDayDao {

	List<MetricByDay> getMetricsByDate(Date fromDate, Date toDate)
			throws SQLException;

}
