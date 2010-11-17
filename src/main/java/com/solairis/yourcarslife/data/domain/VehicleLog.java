/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.solairis.yourcarslife.data.domain;

import java.util.Date;

/**
 *
 * @author josh
 */
public class VehicleLog {

	private long vehicleLogId;
	private double odometer;
	private Date created;
	private Date modified;

	public long getVehicleLogId() {
		return vehicleLogId;
	}

	public void setVehicleLogId(long vehicleLogId) {
		this.vehicleLogId = vehicleLogId;
	}

	public double getOdometer() {
		return odometer;
	}

	public void setOdometer(double odometer) {
		this.odometer = odometer;
	}

	public Date getCreated() {
		return created;
	}

	public void setCreated(Date created) {
		this.created = created;
	}

	public Date getModified() {
		return modified;
	}

	public void setModified(Date modified) {
		this.modified = modified;
	}
}
