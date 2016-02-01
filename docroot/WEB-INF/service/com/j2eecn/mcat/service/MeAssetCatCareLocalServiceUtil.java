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
 * Provides the local service utility for MeAssetCatCare. This utility wraps
 * {@link com.j2eecn.mcat.service.impl.MeAssetCatCareLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Administrator
 * @see MeAssetCatCareLocalService
 * @see com.j2eecn.mcat.service.base.MeAssetCatCareLocalServiceBaseImpl
 * @see com.j2eecn.mcat.service.impl.MeAssetCatCareLocalServiceImpl
 * @generated
 */
public class MeAssetCatCareLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link com.j2eecn.mcat.service.impl.MeAssetCatCareLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the me asset cat care to the database. Also notifies the appropriate model listeners.
	*
	* @param meAssetCatCare the me asset cat care
	* @return the me asset cat care that was added
	* @throws SystemException if a system exception occurred
	*/
	public static com.j2eecn.mcat.model.MeAssetCatCare addMeAssetCatCare(
		com.j2eecn.mcat.model.MeAssetCatCare meAssetCatCare)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().addMeAssetCatCare(meAssetCatCare);
	}

	/**
	* Creates a new me asset cat care with the primary key. Does not add the me asset cat care to the database.
	*
	* @param assetCatCareId the primary key for the new me asset cat care
	* @return the new me asset cat care
	*/
	public static com.j2eecn.mcat.model.MeAssetCatCare createMeAssetCatCare(
		long assetCatCareId) {
		return getService().createMeAssetCatCare(assetCatCareId);
	}

	/**
	* Deletes the me asset cat care with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param assetCatCareId the primary key of the me asset cat care
	* @return the me asset cat care that was removed
	* @throws PortalException if a me asset cat care with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.j2eecn.mcat.model.MeAssetCatCare deleteMeAssetCatCare(
		long assetCatCareId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteMeAssetCatCare(assetCatCareId);
	}

	/**
	* Deletes the me asset cat care from the database. Also notifies the appropriate model listeners.
	*
	* @param meAssetCatCare the me asset cat care
	* @return the me asset cat care that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static com.j2eecn.mcat.model.MeAssetCatCare deleteMeAssetCatCare(
		com.j2eecn.mcat.model.MeAssetCatCare meAssetCatCare)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteMeAssetCatCare(meAssetCatCare);
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.j2eecn.mcat.model.impl.MeAssetCatCareModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.j2eecn.mcat.model.impl.MeAssetCatCareModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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

	public static com.j2eecn.mcat.model.MeAssetCatCare fetchMeAssetCatCare(
		long assetCatCareId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchMeAssetCatCare(assetCatCareId);
	}

	/**
	* Returns the me asset cat care with the matching UUID and company.
	*
	* @param uuid the me asset cat care's UUID
	* @param companyId the primary key of the company
	* @return the matching me asset cat care, or <code>null</code> if a matching me asset cat care could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.j2eecn.mcat.model.MeAssetCatCare fetchMeAssetCatCareByUuidAndCompanyId(
		java.lang.String uuid, long companyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .fetchMeAssetCatCareByUuidAndCompanyId(uuid, companyId);
	}

	/**
	* Returns the me asset cat care matching the UUID and group.
	*
	* @param uuid the me asset cat care's UUID
	* @param groupId the primary key of the group
	* @return the matching me asset cat care, or <code>null</code> if a matching me asset cat care could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.j2eecn.mcat.model.MeAssetCatCare fetchMeAssetCatCareByUuidAndGroupId(
		java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchMeAssetCatCareByUuidAndGroupId(uuid, groupId);
	}

	/**
	* Returns the me asset cat care with the primary key.
	*
	* @param assetCatCareId the primary key of the me asset cat care
	* @return the me asset cat care
	* @throws PortalException if a me asset cat care with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.j2eecn.mcat.model.MeAssetCatCare getMeAssetCatCare(
		long assetCatCareId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getMeAssetCatCare(assetCatCareId);
	}

	public static com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the me asset cat care with the matching UUID and company.
	*
	* @param uuid the me asset cat care's UUID
	* @param companyId the primary key of the company
	* @return the matching me asset cat care
	* @throws PortalException if a matching me asset cat care could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.j2eecn.mcat.model.MeAssetCatCare getMeAssetCatCareByUuidAndCompanyId(
		java.lang.String uuid, long companyId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getMeAssetCatCareByUuidAndCompanyId(uuid, companyId);
	}

	/**
	* Returns the me asset cat care matching the UUID and group.
	*
	* @param uuid the me asset cat care's UUID
	* @param groupId the primary key of the group
	* @return the matching me asset cat care
	* @throws PortalException if a matching me asset cat care could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.j2eecn.mcat.model.MeAssetCatCare getMeAssetCatCareByUuidAndGroupId(
		java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getMeAssetCatCareByUuidAndGroupId(uuid, groupId);
	}

	/**
	* Returns a range of all the me asset cat cares.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.j2eecn.mcat.model.impl.MeAssetCatCareModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of me asset cat cares
	* @param end the upper bound of the range of me asset cat cares (not inclusive)
	* @return the range of me asset cat cares
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.j2eecn.mcat.model.MeAssetCatCare> getMeAssetCatCares(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getMeAssetCatCares(start, end);
	}

	/**
	* Returns the number of me asset cat cares.
	*
	* @return the number of me asset cat cares
	* @throws SystemException if a system exception occurred
	*/
	public static int getMeAssetCatCaresCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getMeAssetCatCaresCount();
	}

	/**
	* Updates the me asset cat care in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param meAssetCatCare the me asset cat care
	* @return the me asset cat care that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static com.j2eecn.mcat.model.MeAssetCatCare updateMeAssetCatCare(
		com.j2eecn.mcat.model.MeAssetCatCare meAssetCatCare)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateMeAssetCatCare(meAssetCatCare);
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

	public static java.util.List<com.j2eecn.mcat.model.MeAssetCatCare> findByUserId(
		long userId) throws com.liferay.portal.kernel.exception.SystemException {
		return getService().findByUserId(userId);
	}

	public static com.j2eecn.mcat.model.MeAssetCatCare findByU_ACID(
		long userId, long assetCatId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().findByU_ACID(userId, assetCatId);
	}

	public static boolean isCare(long userId, long assetCatId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().isCare(userId, assetCatId);
	}

	public static com.j2eecn.mcat.model.MeAssetCatCare addEntry(
		com.j2eecn.mcat.model.MeAssetCatCare entry,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().addEntry(entry, serviceContext);
	}

	public static void clearService() {
		_service = null;
	}

	public static MeAssetCatCareLocalService getService() {
		if (_service == null) {
			InvokableLocalService invokableLocalService = (InvokableLocalService)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					MeAssetCatCareLocalService.class.getName());

			if (invokableLocalService instanceof MeAssetCatCareLocalService) {
				_service = (MeAssetCatCareLocalService)invokableLocalService;
			}
			else {
				_service = new MeAssetCatCareLocalServiceClp(invokableLocalService);
			}

			ReferenceRegistry.registerReference(MeAssetCatCareLocalServiceUtil.class,
				"_service");
		}

		return _service;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setService(MeAssetCatCareLocalService service) {
	}

	private static MeAssetCatCareLocalService _service;
}