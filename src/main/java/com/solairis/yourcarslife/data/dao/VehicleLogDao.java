/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.solairis.yourcarslife.data.dao;

import com.solairis.yourcarslife.data.exception.VehicleLogDaoException;
import com.solairis.yourcarslife.data.domain.VehicleLog;

/**
 *
 * @author josh
 */
public interface VehicleLogDao {

	public VehicleLog getVehicleLog(long vehicleLogId) throws VehicleLogDaoException;

	public VehicleLog updateVehicleLog(VehicleLog vehicleLog) throws VehicleLogDaoException;

}
