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

package com.j2eecn.mcat.service;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.InvokableLocalService;

/**
 * Provides the local service utility for MeCategory. This utility wraps
 * {@link com.j2eecn.mcat.service.impl.MeCategoryLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Administrator
 * @see MeCategoryLocalService
 * @see com.j2eecn.mcat.service.base.MeCategoryLocalServiceBaseImpl
 * @see com.j2eecn.mcat.service.impl.MeCategoryLocalServiceImpl
 * @generated
 */
public class MeCategoryLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link com.j2eecn.mcat.service.impl.MeCategoryLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the me category to the database. Also notifies the appropriate model listeners.
	*
	* @param meCategory the me category
	* @return the me category that was added
	* @throws SystemException if a system exception occurred
	*/
	public static com.j2eecn.mcat.model.MeCategory addMeCategory(
		com.j2eecn.mcat.model.MeCategory meCategory)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().addMeCategory(meCategory);
	}

	/**
	* Creates a new me category with the primary key. Does not add the me category to the database.
	*
	* @param catId the primary key for the new me category
	* @return the new me category
	*/
	public static com.j2eecn.mcat.model.MeCategory createMeCategory(long catId) {
		return getService().createMeCategory(catId);
	}

	/**
	* Deletes the me category with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param catId the primary key of the me category
	* @return the me category that was removed
	* @throws PortalException if a me category with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.j2eecn.mcat.model.MeCategory deleteMeCategory(long catId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteMeCategory(catId);
	}

	/**
	* Deletes the me category from the database. Also notifies the appropriate model listeners.
	*
	* @param meCategory the me category
	* @return the me category that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static com.j2eecn.mcat.model.MeCategory deleteMeCategory(
		com.j2eecn.mcat.model.MeCategory meCategory)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteMeCategory(meCategory);
	}

	public static com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return getService().dynamicQuery();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQuery(dynamicQuery);
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
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQuery(dynamicQuery, start, end);
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
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .dynamicQuery(dynamicQuery, start, end, orderByComparator);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQueryCount(dynamicQuery, projection);
	}

	public static com.j2eecn.mcat.model.MeCategory fetchMeCategory(long catId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchMeCategory(catId);
	}

	/**
	* Returns the me category with the matching UUID and company.
	*
	* @param uuid the me category's UUID
	* @param companyId the primary key of the company
	* @return the matching me category, or <code>null</code> if a matching me category could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.j2eecn.mcat.model.MeCategory fetchMeCategoryByUuidAndCompanyId(
		java.lang.String uuid, long companyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchMeCategoryByUuidAndCompanyId(uuid, companyId);
	}

	/**
	* Returns the me category matching the UUID and group.
	*
	* @param uuid the me category's UUID
	* @param groupId the primary key of the group
	* @return the matching me category, or <code>null</code> if a matching me category could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.j2eecn.mcat.model.MeCategory fetchMeCategoryByUuidAndGroupId(
		java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchMeCategoryByUuidAndGroupId(uuid, groupId);
	}

	/**
	* Returns the me category with the primary key.
	*
	* @param catId the primary key of the me category
	* @return the me category
	* @throws PortalException if a me category with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.j2eecn.mcat.model.MeCategory getMeCategory(long catId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getMeCategory(catId);
	}

	public static com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the me category with the matching UUID and company.
	*
	* @param uuid the me category's UUID
	* @param companyId the primary key of the company
	* @return the matching me category
	* @throws PortalException if a matching me category could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.j2eecn.mcat.model.MeCategory getMeCategoryByUuidAndCompanyId(
		java.lang.String uuid, long companyId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getMeCategoryByUuidAndCompanyId(uuid, companyId);
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
	public static com.j2eecn.mcat.model.MeCategory getMeCategoryByUuidAndGroupId(
		java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getMeCategoryByUuidAndGroupId(uuid, groupId);
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
	public static java.util.List<com.j2eecn.mcat.model.MeCategory> getMeCategories(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getMeCategories(start, end);
	}

	/**
	* Returns the number of me categories.
	*
	* @return the number of me categories
	* @throws SystemException if a system exception occurred
	*/
	public static int getMeCategoriesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getMeCategoriesCount();
	}

	/**
	* Updates the me category in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param meCategory the me category
	* @return the me category that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static com.j2eecn.mcat.model.MeCategory updateMeCategory(
		com.j2eecn.mcat.model.MeCategory meCategory)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateMeCategory(meCategory);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public static java.lang.String getBeanIdentifier() {
		return getService().getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public static void setBeanIdentifier(java.lang.String beanIdentifier) {
		getService().setBeanIdentifier(beanIdentifier);
	}

	public static java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return getService().invokeMethod(name, parameterTypes, arguments);
	}

	public static void clearService() {
		_service = null;
	}

	public static MeCategoryLocalService getService() {
		if (_service == null) {
			InvokableLocalService invokableLocalService = (InvokableLocalService)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					MeCategoryLocalService.class.getName());

			if (invokableLocalService instanceof MeCategoryLocalService) {
				_service = (MeCategoryLocalService)invokableLocalService;
			}
			else {
				_service = new MeCategoryLocalServiceClp(invokableLocalService);
			}

			ReferenceRegistry.registerReference(MeCategoryLocalServiceUtil.class,
				"_service");
		}

		return _service;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setService(MeCategoryLocalService service) {
	}

	private static MeCategoryLocalService _service;
}