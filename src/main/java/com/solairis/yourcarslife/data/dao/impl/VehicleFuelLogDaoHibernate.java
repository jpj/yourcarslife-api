/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.solairis.yourcarslife.data.dao.impl;

import com.solairis.yourcarslife.data.dao.VehicleFuelLogDao;
import com.solairis.yourcarslife.data.exception.VehicleLogDaoException;
import com.solairis.yourcarslife.data.domain.VehicleFuelLog;
import com.solairis.yourcarslife.data.input.VehicleFuelLogInputData;
import java.util.List;
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
	public List<VehicleFuelLog> getVehicleFuelLogs(VehicleFuelLogInputData inputData) throws VehicleLogDaoException {
		List<VehicleFuelLog> vehicleFuelLogs = null;

		try {
			Criteria criteria = this.sessionFactory.getCurrentSession().createCriteria(VehicleFuelLog.class);

			if (inputData.getVehicleId() > 0) {
				criteria.add(Restrictions.eq("vehicleId", inputData.getVehicleId()));
			}
			if (inputData.getMaxRecords() > 0) {
				criteria.setFetchSize(inputData.getMaxRecords());
			}
			if (inputData.getStartRecord() > 0) {
				criteria.setFirstResult(inputData.getStartRecord());
			}
			vehicleFuelLogs = criteria.list();
		} catch (HibernateException e) {
			throw new VehicleLogDaoException(e);
		}

		return vehicleFuelLogs;
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
