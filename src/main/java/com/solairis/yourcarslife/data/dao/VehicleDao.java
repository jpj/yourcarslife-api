/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.solairis.yourcarslife.data.dao;

import com.solairis.yourcarslife.data.domain.Vehicle;
import com.solairis.yourcarslife.data.exception.VehicleDaoException;
import com.solairis.yourcarslife.data.input.VehicleInputData;
import java.util.List;

/**
 *
 * @author josh
 */
public interface VehicleDao {

	public List<Vehicle> getVehicles(VehicleInputData inputData) throws VehicleDaoException;

}
