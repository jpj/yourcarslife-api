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
public class VehicleFuelLog {

	private long vehicleFuelLogId;
	private double odometer;
	private Date created;
	private Date modified;
	private Date logDate;
	private double fuel;
	private int octane;
	private boolean active;

	public long getVehicleFuelLogId() {
		return vehicleFuelLogId;
	}

	public void setVehicleFuelLogId(long vehicleFuelLogId) {
		this.vehicleFuelLogId = vehicleFuelLogId;
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

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public double getFuel() {
		return fuel;
	}

	public void setFuel(double fuel) {
		this.fuel = fuel;
	}

	public Date getLogDate() {
		return logDate;
	}

	public void setLogDate(Date logDate) {
		this.logDate = logDate;
	}

	public int getOctane() {
		return octane;
	}

	public void setOctane(int octane) {
		this.octane = octane;
	}
}
