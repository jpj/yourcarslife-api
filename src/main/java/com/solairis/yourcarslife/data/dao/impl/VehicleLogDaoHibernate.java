/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.solairis.yourcarslife.data.dao.impl;

import com.solairis.yourcarslife.data.dao.VehicleLogDao;
import com.solairis.yourcarslife.data.exception.VehicleLogDaoException;
import com.solairis.yourcarslife.data.domain.VehicleLog;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 *
 * @author josh
 */
public class VehicleLogDaoHibernate implements VehicleLogDao {

	private SessionFactory sessionFactory;

	@Override
	public VehicleLog getVehicleLog(long vehicleLogId) throws VehicleLogDaoException {
		Session session = this.sessionFactory.getCurrentSession();
		Query query = session.createQuery("from VehicleLog log where log.vehicleLogId=?");
		query.setParameter(0, vehicleLogId);
		return (VehicleLog)query.uniqueResult();
	}

	@Override
	public VehicleLog updateVehicleLog(VehicleLog vehicleLog) throws VehicleLogDaoException {
		Session session = this.sessionFactory.getCurrentSession();
		session.save(vehicleLog);
		return this.getVehicleLog(vehicleLog.getVehicleLogId());
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

}
