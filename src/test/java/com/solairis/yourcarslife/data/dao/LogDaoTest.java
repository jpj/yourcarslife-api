/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.solairis.yourcarslife.data.dao;

import com.solairis.yourcarslife.data.domain.Log;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;

/**
 *
 * @author josh
 */
@ContextConfiguration(locations={"classpath:com/solairis/yourcarslife/spring/spring-context.xml"})
public class LogDaoTest extends AbstractTransactionalJUnit4SpringContextTests {
	
	@Autowired
	private LogDao logDao;
	
	@Test
	public void save() {
		Log log = new Log();
		this.logDao.save(log);
		Assert.assertTrue(log.getLogId() > 0);
	}
	
	@Test
	public void get() {
		Log log = new Log();
		this.logDao.save(log);
		Log l2 = this.logDao.getLog(log.getLogId());
		Assert.assertTrue(log.getLogId() == l2.getLogId());
	}
	
}
