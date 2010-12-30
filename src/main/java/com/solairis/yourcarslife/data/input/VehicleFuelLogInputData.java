/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.solairis.yourcarslife.data.input;

/**
 *
 * @author josh
 */
public class VehicleFuelLogInputData extends PageableInputData {

	private long vehicleId;
	private long vehicleFuelLogId;
	private boolean active;

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public long getVehicleId() {
		return vehicleId;
	}

	public void setVehicleId(long vehicleId) {
		this.vehicleId = vehicleId;
	}

	public long getVehicleFuelLogId() {
		return vehicleFuelLogId;
	}

	public void setVehicleFuelLogId(long vehicleFuelLogId) {
		this.vehicleFuelLogId = vehicleFuelLogId;
	}

}
