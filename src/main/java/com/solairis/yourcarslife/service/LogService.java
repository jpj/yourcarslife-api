/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.solairis.yourcarslife.service;

import com.solairis.yourcarslife.data.dao.LogDao;
import com.solairis.yourcarslife.data.domain.Log;
import com.solairis.yourcarslife.data.domain.LogFuel;
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

	public void setLogDao(LogDao logDao) {
		this.logDao = logDao;
	}
}
