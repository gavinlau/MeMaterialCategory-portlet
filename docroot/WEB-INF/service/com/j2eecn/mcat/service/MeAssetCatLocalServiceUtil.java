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
 * Provides the local service utility for MeAssetCat. This utility wraps
 * {@link com.j2eecn.mcat.service.impl.MeAssetCatLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Administrator
 * @see MeAssetCatLocalService
 * @see com.j2eecn.mcat.service.base.MeAssetCatLocalServiceBaseImpl
 * @see com.j2eecn.mcat.service.impl.MeAssetCatLocalServiceImpl
 * @generated
 */
public class MeAssetCatLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link com.j2eecn.mcat.service.impl.MeAssetCatLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the me asset cat to the database. Also notifies the appropriate model listeners.
	*
	* @param meAssetCat the me asset cat
	* @return the me asset cat that was added
	* @throws SystemException if a system exception occurred
	*/
	public static com.j2eecn.mcat.model.MeAssetCat addMeAssetCat(
		com.j2eecn.mcat.model.MeAssetCat meAssetCat)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().addMeAssetCat(meAssetCat);
	}

	/**
	* Creates a new me asset cat with the primary key. Does not add the me asset cat to the database.
	*
	* @param assetCatId the primary key for the new me asset cat
	* @return the new me asset cat
	*/
	public static com.j2eecn.mcat.model.MeAssetCat createMeAssetCat(
		long assetCatId) {
		return getService().createMeAssetCat(assetCatId);
	}

	/**
	* Deletes the me asset cat with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param assetCatId the primary key of the me asset cat
	* @return the me asset cat that was removed
	* @throws PortalException if a me asset cat with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.j2eecn.mcat.model.MeAssetCat deleteMeAssetCat(
		long assetCatId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteMeAssetCat(assetCatId);
	}

	/**
	* Deletes the me asset cat from the database. Also notifies the appropriate model listeners.
	*
	* @param meAssetCat the me asset cat
	* @return the me asset cat that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static com.j2eecn.mcat.model.MeAssetCat deleteMeAssetCat(
		com.j2eecn.mcat.model.MeAssetCat meAssetCat)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteMeAssetCat(meAssetCat);
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.j2eecn.mcat.model.impl.MeAssetCatModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.j2eecn.mcat.model.impl.MeAssetCatModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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

	public static com.j2eecn.mcat.model.MeAssetCat fetchMeAssetCat(
		long assetCatId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchMeAssetCat(assetCatId);
	}

	/**
	* Returns the me asset cat with the matching UUID and company.
	*
	* @param uuid the me asset cat's UUID
	* @param companyId the primary key of the company
	* @return the matching me asset cat, or <code>null</code> if a matching me asset cat could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.j2eecn.mcat.model.MeAssetCat fetchMeAssetCatByUuidAndCompanyId(
		java.lang.String uuid, long companyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchMeAssetCatByUuidAndCompanyId(uuid, companyId);
	}

	/**
	* Returns the me asset cat matching the UUID and group.
	*
	* @param uuid the me asset cat's UUID
	* @param groupId the primary key of the group
	* @return the matching me asset cat, or <code>null</code> if a matching me asset cat could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.j2eecn.mcat.model.MeAssetCat fetchMeAssetCatByUuidAndGroupId(
		java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchMeAssetCatByUuidAndGroupId(uuid, groupId);
	}

	/**
	* Returns the me asset cat with the primary key.
	*
	* @param assetCatId the primary key of the me asset cat
	* @return the me asset cat
	* @throws PortalException if a me asset cat with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.j2eecn.mcat.model.MeAssetCat getMeAssetCat(
		long assetCatId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getMeAssetCat(assetCatId);
	}

	public static com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the me asset cat with the matching UUID and company.
	*
	* @param uuid the me asset cat's UUID
	* @param companyId the primary key of the company
	* @return the matching me asset cat
	* @throws PortalException if a matching me asset cat could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.j2eecn.mcat.model.MeAssetCat getMeAssetCatByUuidAndCompanyId(
		java.lang.String uuid, long companyId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getMeAssetCatByUuidAndCompanyId(uuid, companyId);
	}

	/**
	* Returns the me asset cat matching the UUID and group.
	*
	* @param uuid the me asset cat's UUID
	* @param groupId the primary key of the group
	* @return the matching me asset cat
	* @throws PortalException if a matching me asset cat could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.j2eecn.mcat.model.MeAssetCat getMeAssetCatByUuidAndGroupId(
		java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getMeAssetCatByUuidAndGroupId(uuid, groupId);
	}

	/**
	* Returns a range of all the me asset cats.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.j2eecn.mcat.model.impl.MeAssetCatModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of me asset cats
	* @param end the upper bound of the range of me asset cats (not inclusive)
	* @return the range of me asset cats
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.j2eecn.mcat.model.MeAssetCat> getMeAssetCats(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getMeAssetCats(start, end);
	}

	/**
	* Returns the number of me asset cats.
	*
	* @return the number of me asset cats
	* @throws SystemException if a system exception occurred
	*/
	public static int getMeAssetCatsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getMeAssetCatsCount();
	}

	/**
	* Updates the me asset cat in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param meAssetCat the me asset cat
	* @return the me asset cat that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static com.j2eecn.mcat.model.MeAssetCat updateMeAssetCat(
		com.j2eecn.mcat.model.MeAssetCat meAssetCat)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateMeAssetCat(meAssetCat);
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

	public static java.util.List<com.j2eecn.mcat.model.MeAssetCat> findByN_C_NC(
		java.lang.String name, java.lang.String code,
		java.lang.String codeAndName, boolean andOperator, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator obc) {
		return getService()
				   .findByN_C_NC(name, code, codeAndName, andOperator, start,
			end, obc);
	}

	public static java.lang.Integer countByN_C_NC(java.lang.String name,
		java.lang.String code, java.lang.String codeAndName, boolean andOperator) {
		return getService().countByN_C_NC(name, code, codeAndName, andOperator);
	}

	public static java.util.List<com.j2eecn.mcat.model.MeAssetCat> findByKeywords(
		java.lang.String keywords, boolean andOperator, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator obc) {
		return getService()
				   .findByKeywords(keywords, andOperator, start, end, obc);
	}

	public static java.lang.Integer countByKeywords(java.lang.String keywords,
		boolean andOperator, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator obc) {
		return getService()
				   .countByKeywords(keywords, andOperator, start, end, obc);
	}

	public static void clearService() {
		_service = null;
	}

	public static MeAssetCatLocalService getService() {
		if (_service == null) {
			InvokableLocalService invokableLocalService = (InvokableLocalService)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					MeAssetCatLocalService.class.getName());

			if (invokableLocalService instanceof MeAssetCatLocalService) {
				_service = (MeAssetCatLocalService)invokableLocalService;
			}
			else {
				_service = new MeAssetCatLocalServiceClp(invokableLocalService);
			}

			ReferenceRegistry.registerReference(MeAssetCatLocalServiceUtil.class,
				"_service");
		}

		return _service;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setService(MeAssetCatLocalService service) {
	}

	private static MeAssetCatLocalService _service;
}