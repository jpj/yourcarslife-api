/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.solairis.yourcarslife.data.domain;

import java.util.Set;

/**
 *
 * @author josh
 */
public class Vehicle {

	private long vehicleId;
	private User user;
	private String name;
	private String description;
	private String notes;

	private Set<Log> vehicleFuelLogs;

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public long getVehicleId() {
		return vehicleId;
	}

	public void setVehicleId(long vehicleId) {
		this.vehicleId = vehicleId;
	}

	public Set<Log> getVehicleFuelLogs() {
		return vehicleFuelLogs;
	}

	public void setVehicleFuelLogs(Set<Log> vehicleFuelLogs) {
		this.vehicleFuelLogs = vehicleFuelLogs;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}
