/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.solairis.yourcarslife.data.dao;

import com.solairis.yourcarslife.data.domain.Tag;
import com.solairis.yourcarslife.data.domain.User;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;

/**
 *
 * @author Joshua Johnson
 */
@ContextConfiguration(locations={"classpath:com/solairis/yourcarslife/spring/spring-context.xml"})
public class TagDaoTest extends AbstractTransactionalJUnit4SpringContextTests {

	@Autowired
	private TagDao tagDao;
	@Autowired
	private UserDao userDao;

	@Test
	public void save() {
		Tag tag = templateTag();
		Assert.assertTrue(tag.getTagId() > 0);
		Assert.assertTrue(tag.getUser().getUserId() > 0);
	}

	private Tag templateTag() {
		User user = new User();
		user.setEnabled(true);
		this.userDao.saveUser(user);
		Tag tag = new Tag();
		tag.setUser(user);
		this.tagDao.save(tag);
		return tag;
	}

}
