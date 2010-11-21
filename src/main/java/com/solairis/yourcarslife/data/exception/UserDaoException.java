/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.solairis.yourcarslife.data.exception;

/**
 *
 * @author josh
 */
public class UserDaoException extends DaoException {

	public UserDaoException(String message) {
		super(message);
	}

	public UserDaoException(Exception e) {
		super(e);
	}

}
