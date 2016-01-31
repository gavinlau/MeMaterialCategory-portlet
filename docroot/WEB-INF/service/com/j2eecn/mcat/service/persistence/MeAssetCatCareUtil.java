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

package com.j2eecn.mcat.service.persistence;

import com.j2eecn.mcat.model.MeAssetCatCare;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import java.util.List;

/**
 * The persistence utility for the me asset cat care service. This utility wraps {@link MeAssetCatCarePersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Administrator
 * @see MeAssetCatCarePersistence
 * @see MeAssetCatCarePersistenceImpl
 * @generated
 */
public class MeAssetCatCareUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache(com.liferay.portal.model.BaseModel)
	 */
	public static void clearCache(MeAssetCatCare meAssetCatCare) {
		getPersistence().clearCache(meAssetCatCare);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<MeAssetCatCare> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<MeAssetCatCare> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<MeAssetCatCare> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static MeAssetCatCare update(MeAssetCatCare meAssetCatCare)
		throws SystemException {
		return getPersistence().update(meAssetCatCare);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static MeAssetCatCare update(MeAssetCatCare meAssetCatCare,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(meAssetCatCare, serviceContext);
	}

	/**
	* Returns all the me asset cat cares where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the matching me asset cat cares
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.j2eecn.mcat.model.MeAssetCatCare> findByUuid(
		java.lang.String uuid)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByUuid(uuid);
	}

	/**
	* Returns a range of all the me asset cat cares where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.j2eecn.mcat.model.impl.MeAssetCatCareModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of me asset cat cares
	* @param end the upper bound of the range of me asset cat cares (not inclusive)
	* @return the range of matching me asset cat cares
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.j2eecn.mcat.model.MeAssetCatCare> findByUuid(
		java.lang.String uuid, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	* Returns an ordered range of all the me asset cat cares where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.j2eecn.mcat.model.impl.MeAssetCatCareModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of me asset cat cares
	* @param end the upper bound of the range of me asset cat cares (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching me asset cat cares
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.j2eecn.mcat.model.MeAssetCatCare> findByUuid(
		java.lang.String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	* Returns the first me asset cat care in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching me asset cat care
	* @throws com.j2eecn.mcat.NoSuchAssetCatCareException if a matching me asset cat care could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.j2eecn.mcat.model.MeAssetCatCare findByUuid_First(
		java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.j2eecn.mcat.NoSuchAssetCatCareException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	* Returns the first me asset cat care in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching me asset cat care, or <code>null</code> if a matching me asset cat care could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.j2eecn.mcat.model.MeAssetCatCare fetchByUuid_First(
		java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	* Returns the last me asset cat care in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching me asset cat care
	* @throws com.j2eecn.mcat.NoSuchAssetCatCareException if a matching me asset cat care could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.j2eecn.mcat.model.MeAssetCatCare findByUuid_Last(
		java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.j2eecn.mcat.NoSuchAssetCatCareException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	* Returns the last me asset cat care in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching me asset cat care, or <code>null</code> if a matching me asset cat care could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.j2eecn.mcat.model.MeAssetCatCare fetchByUuid_Last(
		java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	* Returns the me asset cat cares before and after the current me asset cat care in the ordered set where uuid = &#63;.
	*
	* @param assetCatCareId the primary key of the current me asset cat care
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next me asset cat care
	* @throws com.j2eecn.mcat.NoSuchAssetCatCareException if a me asset cat care with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.j2eecn.mcat.model.MeAssetCatCare[] findByUuid_PrevAndNext(
		long assetCatCareId, java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.j2eecn.mcat.NoSuchAssetCatCareException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByUuid_PrevAndNext(assetCatCareId, uuid,
			orderByComparator);
	}

	/**
	* Removes all the me asset cat cares where uuid = &#63; from the database.
	*
	* @param uuid the uuid
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByUuid(java.lang.String uuid)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByUuid(uuid);
	}

	/**
	* Returns the number of me asset cat cares where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the number of matching me asset cat cares
	* @throws SystemException if a system exception occurred
	*/
	public static int countByUuid(java.lang.String uuid)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByUuid(uuid);
	}

	/**
	* Returns the me asset cat care where uuid = &#63; and groupId = &#63; or throws a {@link com.j2eecn.mcat.NoSuchAssetCatCareException} if it could not be found.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching me asset cat care
	* @throws com.j2eecn.mcat.NoSuchAssetCatCareException if a matching me asset cat care could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.j2eecn.mcat.model.MeAssetCatCare findByUUID_G(
		java.lang.String uuid, long groupId)
		throws com.j2eecn.mcat.NoSuchAssetCatCareException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByUUID_G(uuid, groupId);
	}

	/**
	* Returns the me asset cat care where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching me asset cat care, or <code>null</code> if a matching me asset cat care could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.j2eecn.mcat.model.MeAssetCatCare fetchByUUID_G(
		java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByUUID_G(uuid, groupId);
	}

	/**
	* Returns the me asset cat care where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching me asset cat care, or <code>null</code> if a matching me asset cat care could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.j2eecn.mcat.model.MeAssetCatCare fetchByUUID_G(
		java.lang.String uuid, long groupId, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByUUID_G(uuid, groupId, retrieveFromCache);
	}

	/**
	* Removes the me asset cat care where uuid = &#63; and groupId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the me asset cat care that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static com.j2eecn.mcat.model.MeAssetCatCare removeByUUID_G(
		java.lang.String uuid, long groupId)
		throws com.j2eecn.mcat.NoSuchAssetCatCareException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().removeByUUID_G(uuid, groupId);
	}

	/**
	* Returns the number of me asset cat cares where uuid = &#63; and groupId = &#63;.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the number of matching me asset cat cares
	* @throws SystemException if a system exception occurred
	*/
	public static int countByUUID_G(java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByUUID_G(uuid, groupId);
	}

	/**
	* Returns all the me asset cat cares where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the matching me asset cat cares
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.j2eecn.mcat.model.MeAssetCatCare> findByUuid_C(
		java.lang.String uuid, long companyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByUuid_C(uuid, companyId);
	}

	/**
	* Returns a range of all the me asset cat cares where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.j2eecn.mcat.model.impl.MeAssetCatCareModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of me asset cat cares
	* @param end the upper bound of the range of me asset cat cares (not inclusive)
	* @return the range of matching me asset cat cares
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.j2eecn.mcat.model.MeAssetCatCare> findByUuid_C(
		java.lang.String uuid, long companyId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByUuid_C(uuid, companyId, start, end);
	}

	/**
	* Returns an ordered range of all the me asset cat cares where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.j2eecn.mcat.model.impl.MeAssetCatCareModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of me asset cat cares
	* @param end the upper bound of the range of me asset cat cares (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching me asset cat cares
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.j2eecn.mcat.model.MeAssetCatCare> findByUuid_C(
		java.lang.String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByUuid_C(uuid, companyId, start, end, orderByComparator);
	}

	/**
	* Returns the first me asset cat care in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching me asset cat care
	* @throws com.j2eecn.mcat.NoSuchAssetCatCareException if a matching me asset cat care could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.j2eecn.mcat.model.MeAssetCatCare findByUuid_C_First(
		java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.j2eecn.mcat.NoSuchAssetCatCareException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByUuid_C_First(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the first me asset cat care in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching me asset cat care, or <code>null</code> if a matching me asset cat care could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.j2eecn.mcat.model.MeAssetCatCare fetchByUuid_C_First(
		java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByUuid_C_First(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the last me asset cat care in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching me asset cat care
	* @throws com.j2eecn.mcat.NoSuchAssetCatCareException if a matching me asset cat care could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.j2eecn.mcat.model.MeAssetCatCare findByUuid_C_Last(
		java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.j2eecn.mcat.NoSuchAssetCatCareException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByUuid_C_Last(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the last me asset cat care in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching me asset cat care, or <code>null</code> if a matching me asset cat care could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.j2eecn.mcat.model.MeAssetCatCare fetchByUuid_C_Last(
		java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByUuid_C_Last(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the me asset cat cares before and after the current me asset cat care in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param assetCatCareId the primary key of the current me asset cat care
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next me asset cat care
	* @throws com.j2eecn.mcat.NoSuchAssetCatCareException if a me asset cat care with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.j2eecn.mcat.model.MeAssetCatCare[] findByUuid_C_PrevAndNext(
		long assetCatCareId, java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.j2eecn.mcat.NoSuchAssetCatCareException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByUuid_C_PrevAndNext(assetCatCareId, uuid, companyId,
			orderByComparator);
	}

	/**
	* Removes all the me asset cat cares where uuid = &#63; and companyId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByUuid_C(java.lang.String uuid, long companyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByUuid_C(uuid, companyId);
	}

	/**
	* Returns the number of me asset cat cares where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the number of matching me asset cat cares
	* @throws SystemException if a system exception occurred
	*/
	public static int countByUuid_C(java.lang.String uuid, long companyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByUuid_C(uuid, companyId);
	}

	/**
	* Returns all the me asset cat cares where userId = &#63; and assetCatId = &#63;.
	*
	* @param userId the user ID
	* @param assetCatId the asset cat ID
	* @return the matching me asset cat cares
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.j2eecn.mcat.model.MeAssetCatCare> findByU_ACID(
		long userId, long assetCatId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByU_ACID(userId, assetCatId);
	}

	/**
	* Returns a range of all the me asset cat cares where userId = &#63; and assetCatId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.j2eecn.mcat.model.impl.MeAssetCatCareModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param userId the user ID
	* @param assetCatId the asset cat ID
	* @param start the lower bound of the range of me asset cat cares
	* @param end the upper bound of the range of me asset cat cares (not inclusive)
	* @return the range of matching me asset cat cares
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.j2eecn.mcat.model.MeAssetCatCare> findByU_ACID(
		long userId, long assetCatId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByU_ACID(userId, assetCatId, start, end);
	}

	/**
	* Returns an ordered range of all the me asset cat cares where userId = &#63; and assetCatId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.j2eecn.mcat.model.impl.MeAssetCatCareModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param userId the user ID
	* @param assetCatId the asset cat ID
	* @param start the lower bound of the range of me asset cat cares
	* @param end the upper bound of the range of me asset cat cares (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching me asset cat cares
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.j2eecn.mcat.model.MeAssetCatCare> findByU_ACID(
		long userId, long assetCatId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByU_ACID(userId, assetCatId, start, end,
			orderByComparator);
	}

	/**
	* Returns the first me asset cat care in the ordered set where userId = &#63; and assetCatId = &#63;.
	*
	* @param userId the user ID
	* @param assetCatId the asset cat ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching me asset cat care
	* @throws com.j2eecn.mcat.NoSuchAssetCatCareException if a matching me asset cat care could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.j2eecn.mcat.model.MeAssetCatCare findByU_ACID_First(
		long userId, long assetCatId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.j2eecn.mcat.NoSuchAssetCatCareException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByU_ACID_First(userId, assetCatId, orderByComparator);
	}

	/**
	* Returns the first me asset cat care in the ordered set where userId = &#63; and assetCatId = &#63;.
	*
	* @param userId the user ID
	* @param assetCatId the asset cat ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching me asset cat care, or <code>null</code> if a matching me asset cat care could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.j2eecn.mcat.model.MeAssetCatCare fetchByU_ACID_First(
		long userId, long assetCatId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByU_ACID_First(userId, assetCatId, orderByComparator);
	}

	/**
	* Returns the last me asset cat care in the ordered set where userId = &#63; and assetCatId = &#63;.
	*
	* @param userId the user ID
	* @param assetCatId the asset cat ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching me asset cat care
	* @throws com.j2eecn.mcat.NoSuchAssetCatCareException if a matching me asset cat care could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.j2eecn.mcat.model.MeAssetCatCare findByU_ACID_Last(
		long userId, long assetCatId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.j2eecn.mcat.NoSuchAssetCatCareException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByU_ACID_Last(userId, assetCatId, orderByComparator);
	}

	/**
	* Returns the last me asset cat care in the ordered set where userId = &#63; and assetCatId = &#63;.
	*
	* @param userId the user ID
	* @param assetCatId the asset cat ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching me asset cat care, or <code>null</code> if a matching me asset cat care could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.j2eecn.mcat.model.MeAssetCatCare fetchByU_ACID_Last(
		long userId, long assetCatId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByU_ACID_Last(userId, assetCatId, orderByComparator);
	}

	/**
	* Returns the me asset cat cares before and after the current me asset cat care in the ordered set where userId = &#63; and assetCatId = &#63;.
	*
	* @param assetCatCareId the primary key of the current me asset cat care
	* @param userId the user ID
	* @param assetCatId the asset cat ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next me asset cat care
	* @throws com.j2eecn.mcat.NoSuchAssetCatCareException if a me asset cat care with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.j2eecn.mcat.model.MeAssetCatCare[] findByU_ACID_PrevAndNext(
		long assetCatCareId, long userId, long assetCatId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.j2eecn.mcat.NoSuchAssetCatCareException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByU_ACID_PrevAndNext(assetCatCareId, userId,
			assetCatId, orderByComparator);
	}

	/**
	* Removes all the me asset cat cares where userId = &#63; and assetCatId = &#63; from the database.
	*
	* @param userId the user ID
	* @param assetCatId the asset cat ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByU_ACID(long userId, long assetCatId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByU_ACID(userId, assetCatId);
	}

	/**
	* Returns the number of me asset cat cares where userId = &#63; and assetCatId = &#63;.
	*
	* @param userId the user ID
	* @param assetCatId the asset cat ID
	* @return the number of matching me asset cat cares
	* @throws SystemException if a system exception occurred
	*/
	public static int countByU_ACID(long userId, long assetCatId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByU_ACID(userId, assetCatId);
	}

	/**
	* Returns all the me asset cat cares where userId = &#63;.
	*
	* @param userId the user ID
	* @return the matching me asset cat cares
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.j2eecn.mcat.model.MeAssetCatCare> findByUserId(
		long userId) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByUserId(userId);
	}

	/**
	* Returns a range of all the me asset cat cares where userId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.j2eecn.mcat.model.impl.MeAssetCatCareModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param userId the user ID
	* @param start the lower bound of the range of me asset cat cares
	* @param end the upper bound of the range of me asset cat cares (not inclusive)
	* @return the range of matching me asset cat cares
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.j2eecn.mcat.model.MeAssetCatCare> findByUserId(
		long userId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByUserId(userId, start, end);
	}

	/**
	* Returns an ordered range of all the me asset cat cares where userId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.j2eecn.mcat.model.impl.MeAssetCatCareModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param userId the user ID
	* @param start the lower bound of the range of me asset cat cares
	* @param end the upper bound of the range of me asset cat cares (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching me asset cat cares
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.j2eecn.mcat.model.MeAssetCatCare> findByUserId(
		long userId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByUserId(userId, start, end, orderByComparator);
	}

	/**
	* Returns the first me asset cat care in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching me asset cat care
	* @throws com.j2eecn.mcat.NoSuchAssetCatCareException if a matching me asset cat care could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.j2eecn.mcat.model.MeAssetCatCare findByUserId_First(
		long userId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.j2eecn.mcat.NoSuchAssetCatCareException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByUserId_First(userId, orderByComparator);
	}

	/**
	* Returns the first me asset cat care in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching me asset cat care, or <code>null</code> if a matching me asset cat care could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.j2eecn.mcat.model.MeAssetCatCare fetchByUserId_First(
		long userId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByUserId_First(userId, orderByComparator);
	}

	/**
	* Returns the last me asset cat care in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching me asset cat care
	* @throws com.j2eecn.mcat.NoSuchAssetCatCareException if a matching me asset cat care could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.j2eecn.mcat.model.MeAssetCatCare findByUserId_Last(
		long userId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.j2eecn.mcat.NoSuchAssetCatCareException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByUserId_Last(userId, orderByComparator);
	}

	/**
	* Returns the last me asset cat care in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching me asset cat care, or <code>null</code> if a matching me asset cat care could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.j2eecn.mcat.model.MeAssetCatCare fetchByUserId_Last(
		long userId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByUserId_Last(userId, orderByComparator);
	}

	/**
	* Returns the me asset cat cares before and after the current me asset cat care in the ordered set where userId = &#63;.
	*
	* @param assetCatCareId the primary key of the current me asset cat care
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next me asset cat care
	* @throws com.j2eecn.mcat.NoSuchAssetCatCareException if a me asset cat care with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.j2eecn.mcat.model.MeAssetCatCare[] findByUserId_PrevAndNext(
		long assetCatCareId, long userId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.j2eecn.mcat.NoSuchAssetCatCareException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByUserId_PrevAndNext(assetCatCareId, userId,
			orderByComparator);
	}

	/**
	* Removes all the me asset cat cares where userId = &#63; from the database.
	*
	* @param userId the user ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByUserId(long userId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByUserId(userId);
	}

	/**
	* Returns the number of me asset cat cares where userId = &#63;.
	*
	* @param userId the user ID
	* @return the number of matching me asset cat cares
	* @throws SystemException if a system exception occurred
	*/
	public static int countByUserId(long userId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByUserId(userId);
	}

	/**
	* Caches the me asset cat care in the entity cache if it is enabled.
	*
	* @param meAssetCatCare the me asset cat care
	*/
	public static void cacheResult(
		com.j2eecn.mcat.model.MeAssetCatCare meAssetCatCare) {
		getPersistence().cacheResult(meAssetCatCare);
	}

	/**
	* Caches the me asset cat cares in the entity cache if it is enabled.
	*
	* @param meAssetCatCares the me asset cat cares
	*/
	public static void cacheResult(
		java.util.List<com.j2eecn.mcat.model.MeAssetCatCare> meAssetCatCares) {
		getPersistence().cacheResult(meAssetCatCares);
	}

	/**
	* Creates a new me asset cat care with the primary key. Does not add the me asset cat care to the database.
	*
	* @param assetCatCareId the primary key for the new me asset cat care
	* @return the new me asset cat care
	*/
	public static com.j2eecn.mcat.model.MeAssetCatCare create(
		long assetCatCareId) {
		return getPersistence().create(assetCatCareId);
	}

	/**
	* Removes the me asset cat care with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param assetCatCareId the primary key of the me asset cat care
	* @return the me asset cat care that was removed
	* @throws com.j2eecn.mcat.NoSuchAssetCatCareException if a me asset cat care with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.j2eecn.mcat.model.MeAssetCatCare remove(
		long assetCatCareId)
		throws com.j2eecn.mcat.NoSuchAssetCatCareException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().remove(assetCatCareId);
	}

	public static com.j2eecn.mcat.model.MeAssetCatCare updateImpl(
		com.j2eecn.mcat.model.MeAssetCatCare meAssetCatCare)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(meAssetCatCare);
	}

	/**
	* Returns the me asset cat care with the primary key or throws a {@link com.j2eecn.mcat.NoSuchAssetCatCareException} if it could not be found.
	*
	* @param assetCatCareId the primary key of the me asset cat care
	* @return the me asset cat care
	* @throws com.j2eecn.mcat.NoSuchAssetCatCareException if a me asset cat care with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.j2eecn.mcat.model.MeAssetCatCare findByPrimaryKey(
		long assetCatCareId)
		throws com.j2eecn.mcat.NoSuchAssetCatCareException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByPrimaryKey(assetCatCareId);
	}

	/**
	* Returns the me asset cat care with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param assetCatCareId the primary key of the me asset cat care
	* @return the me asset cat care, or <code>null</code> if a me asset cat care with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.j2eecn.mcat.model.MeAssetCatCare fetchByPrimaryKey(
		long assetCatCareId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(assetCatCareId);
	}

	/**
	* Returns all the me asset cat cares.
	*
	* @return the me asset cat cares
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.j2eecn.mcat.model.MeAssetCatCare> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
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
	public static java.util.List<com.j2eecn.mcat.model.MeAssetCatCare> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the me asset cat cares.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.j2eecn.mcat.model.impl.MeAssetCatCareModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of me asset cat cares
	* @param end the upper bound of the range of me asset cat cares (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of me asset cat cares
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.j2eecn.mcat.model.MeAssetCatCare> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the me asset cat cares from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of me asset cat cares.
	*
	* @return the number of me asset cat cares
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static MeAssetCatCarePersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (MeAssetCatCarePersistence)PortletBeanLocatorUtil.locate(com.j2eecn.mcat.service.ClpSerializer.getServletContextName(),
					MeAssetCatCarePersistence.class.getName());

			ReferenceRegistry.registerReference(MeAssetCatCareUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(MeAssetCatCarePersistence persistence) {
	}

	private static MeAssetCatCarePersistence _persistence;
}