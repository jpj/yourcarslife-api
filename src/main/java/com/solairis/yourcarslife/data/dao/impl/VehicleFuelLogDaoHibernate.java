/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.solairis.yourcarslife.data.dao.impl;

import com.solairis.yourcarslife.data.dao.VehicleFuelLogDao;
import com.solairis.yourcarslife.data.exception.VehicleLogDaoException;
import com.solairis.yourcarslife.data.domain.VehicleFuelLog;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 *
 * @author josh
 */
public class VehicleFuelLogDaoHibernate implements VehicleFuelLogDao {

	private SessionFactory sessionFactory;

	@Override
	public VehicleFuelLog getVehicleFuelLog(long vehicleLogId) throws VehicleLogDaoException {
		Session session = this.sessionFactory.getCurrentSession();
		Query query = session.createQuery("from VehicleFuelLog log where log.vehicleFuelLogId=?");
		query.setParameter(0, vehicleLogId);
		return (VehicleFuelLog)query.uniqueResult();
	}

	@Override
	public VehicleFuelLog saveVehicleFuelLog(VehicleFuelLog vehicleLog) throws VehicleLogDaoException {
		Session session = this.sessionFactory.getCurrentSession();
		session.save(vehicleLog);
		return this.getVehicleFuelLog(vehicleLog.getVehicleFuelLogId());
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

}
