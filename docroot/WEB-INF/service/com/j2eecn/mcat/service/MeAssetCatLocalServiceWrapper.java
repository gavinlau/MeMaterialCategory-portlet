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

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link MeAssetCatLocalService}.
 *
 * @author Administrator
 * @see MeAssetCatLocalService
 * @generated
 */
public class MeAssetCatLocalServiceWrapper implements MeAssetCatLocalService,
	ServiceWrapper<MeAssetCatLocalService> {
	public MeAssetCatLocalServiceWrapper(
		MeAssetCatLocalService meAssetCatLocalService) {
		_meAssetCatLocalService = meAssetCatLocalService;
	}

	/**
	* Adds the me asset cat to the database. Also notifies the appropriate model listeners.
	*
	* @param meAssetCat the me asset cat
	* @return the me asset cat that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.j2eecn.mcat.model.MeAssetCat addMeAssetCat(
		com.j2eecn.mcat.model.MeAssetCat meAssetCat)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _meAssetCatLocalService.addMeAssetCat(meAssetCat);
	}

	/**
	* Creates a new me asset cat with the primary key. Does not add the me asset cat to the database.
	*
	* @param assetCatId the primary key for the new me asset cat
	* @return the new me asset cat
	*/
	@Override
	public com.j2eecn.mcat.model.MeAssetCat createMeAssetCat(long assetCatId) {
		return _meAssetCatLocalService.createMeAssetCat(assetCatId);
	}

	/**
	* Deletes the me asset cat with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param assetCatId the primary key of the me asset cat
	* @return the me asset cat that was removed
	* @throws PortalException if a me asset cat with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.j2eecn.mcat.model.MeAssetCat deleteMeAssetCat(long assetCatId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _meAssetCatLocalService.deleteMeAssetCat(assetCatId);
	}

	/**
	* Deletes the me asset cat from the database. Also notifies the appropriate model listeners.
	*
	* @param meAssetCat the me asset cat
	* @return the me asset cat that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.j2eecn.mcat.model.MeAssetCat deleteMeAssetCat(
		com.j2eecn.mcat.model.MeAssetCat meAssetCat)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _meAssetCatLocalService.deleteMeAssetCat(meAssetCat);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _meAssetCatLocalService.dynamicQuery();
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
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _meAssetCatLocalService.dynamicQuery(dynamicQuery);
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
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return _meAssetCatLocalService.dynamicQuery(dynamicQuery, start, end);
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
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _meAssetCatLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _meAssetCatLocalService.dynamicQueryCount(dynamicQuery);
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
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _meAssetCatLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public com.j2eecn.mcat.model.MeAssetCat fetchMeAssetCat(long assetCatId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _meAssetCatLocalService.fetchMeAssetCat(assetCatId);
	}

	/**
	* Returns the me asset cat with the matching UUID and company.
	*
	* @param uuid the me asset cat's UUID
	* @param companyId the primary key of the company
	* @return the matching me asset cat, or <code>null</code> if a matching me asset cat could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.j2eecn.mcat.model.MeAssetCat fetchMeAssetCatByUuidAndCompanyId(
		java.lang.String uuid, long companyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _meAssetCatLocalService.fetchMeAssetCatByUuidAndCompanyId(uuid,
			companyId);
	}

	/**
	* Returns the me asset cat matching the UUID and group.
	*
	* @param uuid the me asset cat's UUID
	* @param groupId the primary key of the group
	* @return the matching me asset cat, or <code>null</code> if a matching me asset cat could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.j2eecn.mcat.model.MeAssetCat fetchMeAssetCatByUuidAndGroupId(
		java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _meAssetCatLocalService.fetchMeAssetCatByUuidAndGroupId(uuid,
			groupId);
	}

	/**
	* Returns the me asset cat with the primary key.
	*
	* @param assetCatId the primary key of the me asset cat
	* @return the me asset cat
	* @throws PortalException if a me asset cat with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.j2eecn.mcat.model.MeAssetCat getMeAssetCat(long assetCatId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _meAssetCatLocalService.getMeAssetCat(assetCatId);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _meAssetCatLocalService.getPersistedModel(primaryKeyObj);
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
	@Override
	public com.j2eecn.mcat.model.MeAssetCat getMeAssetCatByUuidAndCompanyId(
		java.lang.String uuid, long companyId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _meAssetCatLocalService.getMeAssetCatByUuidAndCompanyId(uuid,
			companyId);
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
	@Override
	public com.j2eecn.mcat.model.MeAssetCat getMeAssetCatByUuidAndGroupId(
		java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _meAssetCatLocalService.getMeAssetCatByUuidAndGroupId(uuid,
			groupId);
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
	@Override
	public java.util.List<com.j2eecn.mcat.model.MeAssetCat> getMeAssetCats(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _meAssetCatLocalService.getMeAssetCats(start, end);
	}

	/**
	* Returns the number of me asset cats.
	*
	* @return the number of me asset cats
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getMeAssetCatsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _meAssetCatLocalService.getMeAssetCatsCount();
	}

	/**
	* Updates the me asset cat in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param meAssetCat the me asset cat
	* @return the me asset cat that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.j2eecn.mcat.model.MeAssetCat updateMeAssetCat(
		com.j2eecn.mcat.model.MeAssetCat meAssetCat)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _meAssetCatLocalService.updateMeAssetCat(meAssetCat);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _meAssetCatLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_meAssetCatLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _meAssetCatLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	@Override
	public java.util.List<com.j2eecn.mcat.model.MeAssetCat> findByN_C_NC(
		java.lang.String name, java.lang.String code,
		java.lang.String codeAndName, boolean andOperator, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator obc) {
		return _meAssetCatLocalService.findByN_C_NC(name, code, codeAndName,
			andOperator, start, end, obc);
	}

	@Override
	public java.lang.Integer countByN_C_NC(java.lang.String name,
		java.lang.String code, java.lang.String codeAndName, boolean andOperator) {
		return _meAssetCatLocalService.countByN_C_NC(name, code, codeAndName,
			andOperator);
	}

	@Override
	public java.util.List<com.j2eecn.mcat.model.MeAssetCat> findByKeywords(
		java.lang.String keywords, boolean andOperator, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator obc) {
		return _meAssetCatLocalService.findByKeywords(keywords, andOperator,
			start, end, obc);
	}

	@Override
	public java.lang.Integer countByKeywords(java.lang.String keywords,
		boolean andOperator, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator obc) {
		return _meAssetCatLocalService.countByKeywords(keywords, andOperator,
			start, end, obc);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public MeAssetCatLocalService getWrappedMeAssetCatLocalService() {
		return _meAssetCatLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedMeAssetCatLocalService(
		MeAssetCatLocalService meAssetCatLocalService) {
		_meAssetCatLocalService = meAssetCatLocalService;
	}

	@Override
	public MeAssetCatLocalService getWrappedService() {
		return _meAssetCatLocalService;
	}

	@Override
	public void setWrappedService(MeAssetCatLocalService meAssetCatLocalService) {
		_meAssetCatLocalService = meAssetCatLocalService;
	}

	private MeAssetCatLocalService _meAssetCatLocalService;
}