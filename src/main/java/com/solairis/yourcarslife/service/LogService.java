/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.solairis.yourcarslife.service;

import com.solairis.yourcarslife.data.dao.LogDao;
import com.solairis.yourcarslife.data.domain.Log;
import com.solairis.yourcarslife.data.domain.LogFuel;
import com.solairis.yourcarslife.data.domain.ServiceLog;
import com.solairis.yourcarslife.data.input.LogInputData;
import java.util.List;

/**
 *
 * @author josh
 */
public class LogService {

	private LogDao logDao;

	public Log getLog(long logId) {
		return this.logDao.getLog(logId);
	}

	public LogFuel getFuelLog(long logId) {
		return (LogFuel)this.logDao.getLog(logId);
	}

	public ServiceLog getServiceLog(long logId) {
		return (ServiceLog)this.logDao.getLog(logId);
	}

	public void save(Log log) {
		this.logDao.save(log);
	}

	public List<Log> getLogsForVehicle(long vehicleId, int pageNumber, int maxResults) {
		LogInputData inputData = new LogInputData();
		inputData.setVehicleId(vehicleId);
		inputData.setMaxRecords(maxResults);
		inputData.setStartRecord(maxResults * (pageNumber - 1));
		inputData.setActive(true);

		return (List<Log>)this.logDao.getLogs(inputData);
	}

	public int getLogCountByVehicle(long vehicleId) {
		LogInputData inputData = new LogInputData();
		inputData.setVehicleId(vehicleId);
		inputData.setActive(true);

		return this.logDao.getLogCount(inputData);
	}

	public List<LogFuel> getFuelLogsForVehicle(long vehicleId, int pageNumber, int maxResults) {
		LogInputData inputData = new LogInputData();
		inputData.setVehicleId(vehicleId);
		inputData.setMaxRecords(maxResults);
		inputData.setStartRecord(maxResults * (pageNumber - 1));
		inputData.setActive(true);
		inputData.setLogType(LogFuel.class);

		return (List<LogFuel>)this.logDao.getLogs(inputData);
	}

	public int getFuelLogCountByVehicle(long vehicleId) {
		LogInputData inputData = new LogInputData();
		inputData.setVehicleId(vehicleId);
		inputData.setActive(true);
		inputData.setLogType(LogFuel.class);

		return this.logDao.getLogCount(inputData);
	}

	public List<ServiceLog> getServiceLogsForVehicle(long vehicleId, int pageNumber, int maxResults) {
		LogInputData inputData = new LogInputData();
		inputData.setVehicleId(vehicleId);
		inputData.setMaxRecords(maxResults);
		inputData.setStartRecord(maxResults * (pageNumber - 1));
		inputData.setActive(Boolean.TRUE);
		inputData.setLogType(ServiceLog.class);
		return (List<ServiceLog>)this.logDao.getLogs(inputData);
	}

	public int getServiceLogCountForVehicle(long vehicleId) {
		LogInputData inputData = new LogInputData();
		inputData.setVehicleId(vehicleId);
		inputData.setActive(Boolean.TRUE);
		inputData.setLogType(ServiceLog.class);
		return this.logDao.getLogCount(inputData);
	}

	public Log getMostRecentLogForVehicle(long vehicleId) {
		LogInputData inputData = new LogInputData();
		inputData.setVehicleId(vehicleId);
		inputData.setActive(Boolean.TRUE);
		inputData.setMaxRecords(1);

		List<Log> logs = (List<Log>)this.logDao.getLogs(inputData);
		return logs.isEmpty() ? null : logs.get(0);
	}

	public void setLogDao(LogDao logDao) {
		this.logDao = logDao;
	}
}
