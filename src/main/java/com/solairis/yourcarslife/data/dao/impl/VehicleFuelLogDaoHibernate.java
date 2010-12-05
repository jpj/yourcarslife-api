/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.solairis.yourcarslife.data.dao.impl;

import com.solairis.yourcarslife.data.dao.VehicleFuelLogDao;
import com.solairis.yourcarslife.data.exception.VehicleLogDaoException;
import com.solairis.yourcarslife.data.domain.VehicleFuelLog;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author josh
 */
public class VehicleFuelLogDaoHibernate implements VehicleFuelLogDao {

	private SessionFactory sessionFactory;

	@Override
	public VehicleFuelLog getVehicleFuelLog(long vehicleFuelLogId) throws VehicleLogDaoException {

		VehicleFuelLog vehicleFuelLog = null;

		try {
			Criteria criteria = this.sessionFactory.getCurrentSession().createCriteria(VehicleFuelLog.class);
			criteria.add(Restrictions.eq("vehicleFuelLogId", vehicleFuelLogId));
			vehicleFuelLog = (VehicleFuelLog)criteria.uniqueResult();
		} catch (HibernateException e) {
			throw new VehicleLogDaoException(e);
		}

		return vehicleFuelLog;
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
