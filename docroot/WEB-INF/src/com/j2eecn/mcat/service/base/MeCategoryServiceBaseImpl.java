/**
 * Copyright (c) 2000-2013 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.j2eecn.mcat.service.base;

import com.j2eecn.mcat.model.MeCategory;
import com.j2eecn.mcat.service.MeCategoryService;
import com.j2eecn.mcat.service.persistence.MeAssetCatFinder;
import com.j2eecn.mcat.service.persistence.MeAssetCatPersistence;
import com.j2eecn.mcat.service.persistence.MeCategoryPersistence;

import com.liferay.portal.kernel.bean.BeanReference;
import com.liferay.portal.kernel.bean.IdentifiableBean;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdate;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdateFactoryUtil;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.service.BaseServiceImpl;
import com.liferay.portal.service.persistence.UserPersistence;

import javax.sql.DataSource;

/**
 * Provides the base implementation for the me category remote service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link com.j2eecn.mcat.service.impl.MeCategoryServiceImpl}.
 * </p>
 *
 * @author Administrator
 * @see com.j2eecn.mcat.service.impl.MeCategoryServiceImpl
 * @see com.j2eecn.mcat.service.MeCategoryServiceUtil
 * @generated
 */
public abstract class MeCategoryServiceBaseImpl extends BaseServiceImpl
	implements MeCategoryService, IdentifiableBean {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link com.j2eecn.mcat.service.MeCategoryServiceUtil} to access the me category remote service.
	 */

	/**
	 * Returns the me asset cat local service.
	 *
	 * @return the me asset cat local service
	 */
	public com.j2eecn.mcat.service.MeAssetCatLocalService getMeAssetCatLocalService() {
		return meAssetCatLocalService;
	}

	/**
	 * Sets the me asset cat local service.
	 *
	 * @param meAssetCatLocalService the me asset cat local service
	 */
	public void setMeAssetCatLocalService(
		com.j2eecn.mcat.service.MeAssetCatLocalService meAssetCatLocalService) {
		this.meAssetCatLocalService = meAssetCatLocalService;
	}

	/**
	 * Returns the me asset cat remote service.
	 *
	 * @return the me asset cat remote service
	 */
	public com.j2eecn.mcat.service.MeAssetCatService getMeAssetCatService() {
		return meAssetCatService;
	}

	/**
	 * Sets the me asset cat remote service.
	 *
	 * @param meAssetCatService the me asset cat remote service
	 */
	public void setMeAssetCatService(
		com.j2eecn.mcat.service.MeAssetCatService meAssetCatService) {
		this.meAssetCatService = meAssetCatService;
	}

	/**
	 * Returns the me asset cat persistence.
	 *
	 * @return the me asset cat persistence
	 */
	public MeAssetCatPersistence getMeAssetCatPersistence() {
		return meAssetCatPersistence;
	}

	/**
	 * Sets the me asset cat persistence.
	 *
	 * @param meAssetCatPersistence the me asset cat persistence
	 */
	public void setMeAssetCatPersistence(
		MeAssetCatPersistence meAssetCatPersistence) {
		this.meAssetCatPersistence = meAssetCatPersistence;
	}

	/**
	 * Returns the me asset cat finder.
	 *
	 * @return the me asset cat finder
	 */
	public MeAssetCatFinder getMeAssetCatFinder() {
		return meAssetCatFinder;
	}

	/**
	 * Sets the me asset cat finder.
	 *
	 * @param meAssetCatFinder the me asset cat finder
	 */
	public void setMeAssetCatFinder(MeAssetCatFinder meAssetCatFinder) {
		this.meAssetCatFinder = meAssetCatFinder;
	}

	/**
	 * Returns the me category local service.
	 *
	 * @return the me category local service
	 */
	public com.j2eecn.mcat.service.MeCategoryLocalService getMeCategoryLocalService() {
		return meCategoryLocalService;
	}

	/**
	 * Sets the me category local service.
	 *
	 * @param meCategoryLocalService the me category local service
	 */
	public void setMeCategoryLocalService(
		com.j2eecn.mcat.service.MeCategoryLocalService meCategoryLocalService) {
		this.meCategoryLocalService = meCategoryLocalService;
	}

	/**
	 * Returns the me category remote service.
	 *
	 * @return the me category remote service
	 */
	public com.j2eecn.mcat.service.MeCategoryService getMeCategoryService() {
		return meCategoryService;
	}

	/**
	 * Sets the me category remote service.
	 *
	 * @param meCategoryService the me category remote service
	 */
	public void setMeCategoryService(
		com.j2eecn.mcat.service.MeCategoryService meCategoryService) {
		this.meCategoryService = meCategoryService;
	}

	/**
	 * Returns the me category persistence.
	 *
	 * @return the me category persistence
	 */
	public MeCategoryPersistence getMeCategoryPersistence() {
		return meCategoryPersistence;
	}

	/**
	 * Sets the me category persistence.
	 *
	 * @param meCategoryPersistence the me category persistence
	 */
	public void setMeCategoryPersistence(
		MeCategoryPersistence meCategoryPersistence) {
		this.meCategoryPersistence = meCategoryPersistence;
	}

	/**
	 * Returns the counter local service.
	 *
	 * @return the counter local service
	 */
	public com.liferay.counter.service.CounterLocalService getCounterLocalService() {
		return counterLocalService;
	}

	/**
	 * Sets the counter local service.
	 *
	 * @param counterLocalService the counter local service
	 */
	public void setCounterLocalService(
		com.liferay.counter.service.CounterLocalService counterLocalService) {
		this.counterLocalService = counterLocalService;
	}

	/**
	 * Returns the resource local service.
	 *
	 * @return the resource local service
	 */
	public com.liferay.portal.service.ResourceLocalService getResourceLocalService() {
		return resourceLocalService;
	}

	/**
	 * Sets the resource local service.
	 *
	 * @param resourceLocalService the resource local service
	 */
	public void setResourceLocalService(
		com.liferay.portal.service.ResourceLocalService resourceLocalService) {
		this.resourceLocalService = resourceLocalService;
	}

	/**
	 * Returns the user local service.
	 *
	 * @return the user local service
	 */
	public com.liferay.portal.service.UserLocalService getUserLocalService() {
		return userLocalService;
	}

	/**
	 * Sets the user local service.
	 *
	 * @param userLocalService the user local service
	 */
	public void setUserLocalService(
		com.liferay.portal.service.UserLocalService userLocalService) {
		this.userLocalService = userLocalService;
	}

	/**
	 * Returns the user remote service.
	 *
	 * @return the user remote service
	 */
	public com.liferay.portal.service.UserService getUserService() {
		return userService;
	}

	/**
	 * Sets the user remote service.
	 *
	 * @param userService the user remote service
	 */
	public void setUserService(
		com.liferay.portal.service.UserService userService) {
		this.userService = userService;
	}

	/**
	 * Returns the user persistence.
	 *
	 * @return the user persistence
	 */
	public UserPersistence getUserPersistence() {
		return userPersistence;
	}

	/**
	 * Sets the user persistence.
	 *
	 * @param userPersistence the user persistence
	 */
	public void setUserPersistence(UserPersistence userPersistence) {
		this.userPersistence = userPersistence;
	}

	public void afterPropertiesSet() {
		Class<?> clazz = getClass();

		_classLoader = clazz.getClassLoader();
	}

	public void destroy() {
	}

	/**
	 * Returns the Spring bean ID for this bean.
	 *
	 * @return the Spring bean ID for this bean
	 */
	@Override
	public String getBeanIdentifier() {
		return _beanIdentifier;
	}

	/**
	 * Sets the Spring bean ID for this bean.
	 *
	 * @param beanIdentifier the Spring bean ID for this bean
	 */
	@Override
	public void setBeanIdentifier(String beanIdentifier) {
		_beanIdentifier = beanIdentifier;
	}

	@Override
	public Object invokeMethod(String name, String[] parameterTypes,
		Object[] arguments) throws Throwable {
		Thread currentThread = Thread.currentThread();

		ClassLoader contextClassLoader = currentThread.getContextClassLoader();

		if (contextClassLoader != _classLoader) {
			currentThread.setContextClassLoader(_classLoader);
		}

		try {
			return _clpInvoker.invokeMethod(name, parameterTypes, arguments);
		}
		finally {
			if (contextClassLoader != _classLoader) {
				currentThread.setContextClassLoader(contextClassLoader);
			}
		}
	}

	protected Class<?> getModelClass() {
		return MeCategory.class;
	}

	protected String getModelClassName() {
		return MeCategory.class.getName();
	}

	/**
	 * Performs an SQL query.
	 *
	 * @param sql the sql query
	 */
	protected void runSQL(String sql) throws SystemException {
		try {
			DataSource dataSource = meCategoryPersistence.getDataSource();

			SqlUpdate sqlUpdate = SqlUpdateFactoryUtil.getSqlUpdate(dataSource,
					sql, new int[0]);

			sqlUpdate.update();
		}
		catch (Exception e) {
			throw new SystemException(e);
		}
	}

	@BeanReference(type = com.j2eecn.mcat.service.MeAssetCatLocalService.class)
	protected com.j2eecn.mcat.service.MeAssetCatLocalService meAssetCatLocalService;
	@BeanReference(type = com.j2eecn.mcat.service.MeAssetCatService.class)
	protected com.j2eecn.mcat.service.MeAssetCatService meAssetCatService;
	@BeanReference(type = MeAssetCatPersistence.class)
	protected MeAssetCatPersistence meAssetCatPersistence;
	@BeanReference(type = MeAssetCatFinder.class)
	protected MeAssetCatFinder meAssetCatFinder;
	@BeanReference(type = com.j2eecn.mcat.service.MeCategoryLocalService.class)
	protected com.j2eecn.mcat.service.MeCategoryLocalService meCategoryLocalService;
	@BeanReference(type = com.j2eecn.mcat.service.MeCategoryService.class)
	protected com.j2eecn.mcat.service.MeCategoryService meCategoryService;
	@BeanReference(type = MeCategoryPersistence.class)
	protected MeCategoryPersistence meCategoryPersistence;
	@BeanReference(type = com.liferay.counter.service.CounterLocalService.class)
	protected com.liferay.counter.service.CounterLocalService counterLocalService;
	@BeanReference(type = com.liferay.portal.service.ResourceLocalService.class)
	protected com.liferay.portal.service.ResourceLocalService resourceLocalService;
	@BeanReference(type = com.liferay.portal.service.UserLocalService.class)
	protected com.liferay.portal.service.UserLocalService userLocalService;
	@BeanReference(type = com.liferay.portal.service.UserService.class)
	protected com.liferay.portal.service.UserService userService;
	@BeanReference(type = UserPersistence.class)
	protected UserPersistence userPersistence;
	private String _beanIdentifier;
	private ClassLoader _classLoader;
	private MeCategoryServiceClpInvoker _clpInvoker = new MeCategoryServiceClpInvoker();
}