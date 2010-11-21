/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.solairis.yourcarslife.data.dao;

import com.solairis.yourcarslife.data.exception.VehicleLogDaoException;
import com.solairis.yourcarslife.data.domain.VehicleFuelLog;

/**
 *
 * @author josh
 */
public interface VehicleFuelLogDao {

	public VehicleFuelLog getVehicleFuelLog(long vehicleLogId) throws VehicleLogDaoException;

	public VehicleFuelLog saveVehicleFuelLog(VehicleFuelLog vehicleLog) throws VehicleLogDaoException;

}
