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
import com.j2eecn.mcat.service.MeCategoryLocalService;
import com.j2eecn.mcat.service.persistence.MeAssetCatFinder;
import com.j2eecn.mcat.service.persistence.MeAssetCatPersistence;
import com.j2eecn.mcat.service.persistence.MeCategoryPersistence;

import com.liferay.portal.kernel.bean.BeanReference;
import com.liferay.portal.kernel.bean.IdentifiableBean;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdate;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdateFactoryUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil;
import com.liferay.portal.kernel.dao.orm.Projection;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.search.Indexable;
import com.liferay.portal.kernel.search.IndexableType;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.model.PersistedModel;
import com.liferay.portal.service.BaseLocalServiceImpl;
import com.liferay.portal.service.PersistedModelLocalServiceRegistryUtil;
import com.liferay.portal.service.persistence.UserPersistence;

import java.io.Serializable;

import java.util.List;

import javax.sql.DataSource;

/**
 * Provides the base implementation for the me category local service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link com.j2eecn.mcat.service.impl.MeCategoryLocalServiceImpl}.
 * </p>
 *
 * @author Administrator
 * @see com.j2eecn.mcat.service.impl.MeCategoryLocalServiceImpl
 * @see com.j2eecn.mcat.service.MeCategoryLocalServiceUtil
 * @generated
 */
public abstract class MeCategoryLocalServiceBaseImpl
	extends BaseLocalServiceImpl implements MeCategoryLocalService,
		IdentifiableBean {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link com.j2eecn.mcat.service.MeCategoryLocalServiceUtil} to access the me category local service.
	 */

	/**
	 * Adds the me category to the database. Also notifies the appropriate model listeners.
	 *
	 * @param meCategory the me category
	 * @return the me category that was added
	 * @throws SystemException if a system exception occurred
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public MeCategory addMeCategory(MeCategory meCategory)
		throws SystemException {
		meCategory.setNew(true);

		return meCategoryPersistence.update(meCategory);
	}

	/**
	 * Creates a new me category with the primary key. Does not add the me category to the database.
	 *
	 * @param catId the primary key for the new me category
	 * @return the new me category
	 */
	@Override
	public MeCategory createMeCategory(long catId) {
		return meCategoryPersistence.create(catId);
	}

	/**
	 * Deletes the me category with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param catId the primary key of the me category
	 * @return the me category that was removed
	 * @throws PortalException if a me category with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public MeCategory deleteMeCategory(long catId)
		throws PortalException, SystemException {
		return meCategoryPersistence.remove(catId);
	}

	/**
	 * Deletes the me category from the database. Also notifies the appropriate model listeners.
	 *
	 * @param meCategory the me category
	 * @return the me category that was removed
	 * @throws SystemException if a system exception occurred
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public MeCategory deleteMeCategory(MeCategory meCategory)
		throws SystemException {
		return meCategoryPersistence.remove(meCategory);
	}

	@Override
	public DynamicQuery dynamicQuery() {
		Class<?> clazz = getClass();

		return DynamicQueryFactoryUtil.forClass(MeCategory.class,
			clazz.getClassLoader());
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	@SuppressWarnings("rawtypes")
	public List dynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return meCategoryPersistence.findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.j2eecn.mcat.model.impl.MeCategoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @return the range of matching rows
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	@SuppressWarnings("rawtypes")
	public List dynamicQuery(DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return meCategoryPersistence.findWithDynamicQuery(dynamicQuery, start,
			end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.j2eecn.mcat.model.impl.MeCategoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching rows
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	@SuppressWarnings("rawtypes")
	public List dynamicQuery(DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return meCategoryPersistence.findWithDynamicQuery(dynamicQuery, start,
			end, orderByComparator);
	}

	/**
	 * Returns the number of rows that match the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows that match the dynamic query
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public long dynamicQueryCount(DynamicQuery dynamicQuery)
		throws SystemException {
		return meCategoryPersistence.countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * Returns the number of rows that match the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows that match the dynamic query
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public long dynamicQueryCount(DynamicQuery dynamicQuery,
		Projection projection) throws SystemException {
		return meCategoryPersistence.countWithDynamicQuery(dynamicQuery,
			projection);
	}

	@Override
	public MeCategory fetchMeCategory(long catId) throws SystemException {
		return meCategoryPersistence.fetchByPrimaryKey(catId);
	}

	/**
	 * Returns the me category with the matching UUID and company.
	 *
	 * @param uuid the me category's UUID
	 * @param  companyId the primary key of the company
	 * @return the matching me category, or <code>null</code> if a matching me category could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MeCategory fetchMeCategoryByUuidAndCompanyId(String uuid,
		long companyId) throws SystemException {
		return meCategoryPersistence.fetchByUuid_C_First(uuid, companyId, null);
	}

	/**
	 * Returns the me category matching the UUID and group.
	 *
	 * @param uuid the me category's UUID
	 * @param groupId the primary key of the group
	 * @return the matching me category, or <code>null</code> if a matching me category could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MeCategory fetchMeCategoryByUuidAndGroupId(String uuid, long groupId)
		throws SystemException {
		return meCategoryPersistence.fetchByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the me category with the primary key.
	 *
	 * @param catId the primary key of the me category
	 * @return the me category
	 * @throws PortalException if a me category with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MeCategory getMeCategory(long catId)
		throws PortalException, SystemException {
		return meCategoryPersistence.findByPrimaryKey(catId);
	}

	@Override
	public PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException, SystemException {
		return meCategoryPersistence.findByPrimaryKey(primaryKeyObj);
	}

	/**
	 * Returns the me category with the matching UUID and company.
	 *
	 * @param uuid the me category's UUID
	 * @param  companyId the primary key of the company
	 * @return the matching me category
	 * @throws PortalException if a matching me category could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MeCategory getMeCategoryByUuidAndCompanyId(String uuid,
		long companyId) throws PortalException, SystemException {
		return meCategoryPersistence.findByUuid_C_First(uuid, companyId, null);
	}

	/**
	 * Returns the me category matching the UUID and group.
	 *
	 * @param uuid the me category's UUID
	 * @param groupId the primary key of the group
	 * @return the matching me category
	 * @throws PortalException if a matching me category could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MeCategory getMeCategoryByUuidAndGroupId(String uuid, long groupId)
		throws PortalException, SystemException {
		return meCategoryPersistence.findByUUID_G(uuid, groupId);
	}

	/**
	 * Returns a range of all the me categories.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.j2eecn.mcat.model.impl.MeCategoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of me categories
	 * @param end the upper bound of the range of me categories (not inclusive)
	 * @return the range of me categories
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<MeCategory> getMeCategories(int start, int end)
		throws SystemException {
		return meCategoryPersistence.findAll(start, end);
	}

	/**
	 * Returns the number of me categories.
	 *
	 * @return the number of me categories
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int getMeCategoriesCount() throws SystemException {
		return meCategoryPersistence.countAll();
	}

	/**
	 * Updates the me category in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * @param meCategory the me category
	 * @return the me category that was updated
	 * @throws SystemException if a system exception occurred
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public MeCategory updateMeCategory(MeCategory meCategory)
		throws SystemException {
		return meCategoryPersistence.update(meCategory);
	}

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

		PersistedModelLocalServiceRegistryUtil.register("com.j2eecn.mcat.model.MeCategory",
			meCategoryLocalService);
	}

	public void destroy() {
		PersistedModelLocalServiceRegistryUtil.unregister(
			"com.j2eecn.mcat.model.MeCategory");
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
	private MeCategoryLocalServiceClpInvoker _clpInvoker = new MeCategoryLocalServiceClpInvoker();
}