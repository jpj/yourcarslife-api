/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.solairis.yourcarslife.data.dao;

import com.solairis.yourcarslife.data.exception.VehicleLogDaoException;
import com.solairis.yourcarslife.data.domain.Log;
import com.solairis.yourcarslife.data.input.VehicleFuelLogInputData;
import java.util.List;

/**
 *
 * @author josh
 */
public interface VehicleFuelLogDao {

	public Log getVehicleFuelLog(long vehicleLogId) throws VehicleLogDaoException;

	public List<Log> getVehicleFuelLogs(VehicleFuelLogInputData inputData) throws VehicleLogDaoException;

	public void saveVehicleFuelLog(Log vehicleLog) throws VehicleLogDaoException;

	public int getVehicleFuelLogCount(VehicleFuelLogInputData inputData) throws VehicleLogDaoException;

}
