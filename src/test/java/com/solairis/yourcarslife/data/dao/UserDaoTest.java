/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.solairis.yourcarslife.data.dao;

import com.solairis.yourcarslife.data.domain.User;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;

/**
 *
 * @author JanieBear
 */
@ContextConfiguration(locations = {"classpath:com/solairis/yourcarslife/spring/spring-context.xml"})
public class UserDaoTest extends AbstractTransactionalJUnit4SpringContextTests {

	@Autowired
	private UserDao userDao;

	@Test
	public void save() {
		User user = new User();
		this.userDao.saveUser(user);
		Assert.assertTrue(user.getUserId() > 0);
	}

	@Test
	public void get() {
		User user = new User();
		this.userDao.saveUser(user);
		User u2 = this.userDao.getUser(user.getUserId());
		Assert.assertTrue(user.getUserId() == u2.getUserId());
		System.out.println(user.getUserId());
	}
}
