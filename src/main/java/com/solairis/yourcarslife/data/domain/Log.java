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
public class Log {

	private long logId;
	private long vehicleId;
	private double odometer;
	private Date created;
	private Date modified;
	private Date logDate;
	private double fuel;
	private int octane;
	private boolean missedFillup;
	private boolean active;

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public Date getCreated() {
		return created;
	}

	public void setCreated(Date created) {
		this.created = created;
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

	public long getLogId() {
		return logId;
	}

	public void setLogId(long logId) {
		this.logId = logId;
	}

	public boolean isMissedFillup() {
		return missedFillup;
	}

	public void setMissedFillup(boolean missedFillup) {
		this.missedFillup = missedFillup;
	}

	public Date getModified() {
		return modified;
	}

	public void setModified(Date modified) {
		this.modified = modified;
	}

	public int getOctane() {
		return octane;
	}

	public void setOctane(int octane) {
		this.octane = octane;
	}

	public double getOdometer() {
		return odometer;
	}

	public void setOdometer(double odometer) {
		this.odometer = odometer;
	}

	public long getVehicleId() {
		return vehicleId;
	}

	public void setVehicleId(long vehicleId) {
		this.vehicleId = vehicleId;
	}
}
