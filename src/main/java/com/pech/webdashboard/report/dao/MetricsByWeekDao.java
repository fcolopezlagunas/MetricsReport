package com.pech.webdashboard.report.dao;

import java.sql.SQLException;
import java.util.Date;
import java.util.List;

import com.pech.webdashboard.report.vo.MetricByWeek;

public interface MetricsByWeekDao {

	List<MetricByWeek> getMetricsByDate(Date fromDate, Date toDate)
			throws SQLException;
}
