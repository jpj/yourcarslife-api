/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.solairis.yourcarslife.data.exception;

/**
 *
 * @author josh
 */
public class VehicleLogDaoException extends Exception {

	public VehicleLogDaoException(String message) {
		super(message);
	}

	public VehicleLogDaoException(Exception e) {
		super(e);
	}

}
