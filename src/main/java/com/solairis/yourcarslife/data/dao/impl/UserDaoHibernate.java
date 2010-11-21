/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.solairis.yourcarslife.data.dao.impl;

import com.solairis.yourcarslife.data.dao.UserDao;
import com.solairis.yourcarslife.data.domain.User;
import com.solairis.yourcarslife.data.exception.UserDaoException;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author josh
 */
public class UserDaoHibernate implements UserDao {

	private SessionFactory sessionFactory;

	@Override
	public User getUser(long userId) throws UserDaoException {
		User user = null;

		try {
			Criteria criteria = this.sessionFactory.getCurrentSession().createCriteria(User.class);
			criteria.add(Restrictions.eq("userId", userId));
			user = (User)criteria.uniqueResult();
		} catch (HibernateException e) {
			throw new UserDaoException(e);
		}

		return user;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

}
