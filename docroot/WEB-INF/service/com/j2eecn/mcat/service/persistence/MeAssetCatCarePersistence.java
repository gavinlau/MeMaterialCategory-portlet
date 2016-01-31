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

import com.liferay.portal.service.persistence.BasePersistence;

/**
 * The persistence interface for the me asset cat care service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Administrator
 * @see MeAssetCatCarePersistenceImpl
 * @see MeAssetCatCareUtil
 * @generated
 */
public interface MeAssetCatCarePersistence extends BasePersistence<MeAssetCatCare> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link MeAssetCatCareUtil} to access the me asset cat care persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the me asset cat cares where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the matching me asset cat cares
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.j2eecn.mcat.model.MeAssetCatCare> findByUuid(
		java.lang.String uuid)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.j2eecn.mcat.model.MeAssetCatCare> findByUuid(
		java.lang.String uuid, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.j2eecn.mcat.model.MeAssetCatCare> findByUuid(
		java.lang.String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first me asset cat care in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching me asset cat care
	* @throws com.j2eecn.mcat.NoSuchAssetCatCareException if a matching me asset cat care could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.j2eecn.mcat.model.MeAssetCatCare findByUuid_First(
		java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.j2eecn.mcat.NoSuchAssetCatCareException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first me asset cat care in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching me asset cat care, or <code>null</code> if a matching me asset cat care could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.j2eecn.mcat.model.MeAssetCatCare fetchByUuid_First(
		java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last me asset cat care in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching me asset cat care
	* @throws com.j2eecn.mcat.NoSuchAssetCatCareException if a matching me asset cat care could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.j2eecn.mcat.model.MeAssetCatCare findByUuid_Last(
		java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.j2eecn.mcat.NoSuchAssetCatCareException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last me asset cat care in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching me asset cat care, or <code>null</code> if a matching me asset cat care could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.j2eecn.mcat.model.MeAssetCatCare fetchByUuid_Last(
		java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public com.j2eecn.mcat.model.MeAssetCatCare[] findByUuid_PrevAndNext(
		long assetCatCareId, java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.j2eecn.mcat.NoSuchAssetCatCareException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the me asset cat cares where uuid = &#63; from the database.
	*
	* @param uuid the uuid
	* @throws SystemException if a system exception occurred
	*/
	public void removeByUuid(java.lang.String uuid)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of me asset cat cares where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the number of matching me asset cat cares
	* @throws SystemException if a system exception occurred
	*/
	public int countByUuid(java.lang.String uuid)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the me asset cat care where uuid = &#63; and groupId = &#63; or throws a {@link com.j2eecn.mcat.NoSuchAssetCatCareException} if it could not be found.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching me asset cat care
	* @throws com.j2eecn.mcat.NoSuchAssetCatCareException if a matching me asset cat care could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.j2eecn.mcat.model.MeAssetCatCare findByUUID_G(
		java.lang.String uuid, long groupId)
		throws com.j2eecn.mcat.NoSuchAssetCatCareException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the me asset cat care where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching me asset cat care, or <code>null</code> if a matching me asset cat care could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.j2eecn.mcat.model.MeAssetCatCare fetchByUUID_G(
		java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the me asset cat care where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching me asset cat care, or <code>null</code> if a matching me asset cat care could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.j2eecn.mcat.model.MeAssetCatCare fetchByUUID_G(
		java.lang.String uuid, long groupId, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the me asset cat care where uuid = &#63; and groupId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the me asset cat care that was removed
	* @throws SystemException if a system exception occurred
	*/
	public com.j2eecn.mcat.model.MeAssetCatCare removeByUUID_G(
		java.lang.String uuid, long groupId)
		throws com.j2eecn.mcat.NoSuchAssetCatCareException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of me asset cat cares where uuid = &#63; and groupId = &#63;.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the number of matching me asset cat cares
	* @throws SystemException if a system exception occurred
	*/
	public int countByUUID_G(java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the me asset cat cares where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the matching me asset cat cares
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.j2eecn.mcat.model.MeAssetCatCare> findByUuid_C(
		java.lang.String uuid, long companyId)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.j2eecn.mcat.model.MeAssetCatCare> findByUuid_C(
		java.lang.String uuid, long companyId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.j2eecn.mcat.model.MeAssetCatCare> findByUuid_C(
		java.lang.String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public com.j2eecn.mcat.model.MeAssetCatCare findByUuid_C_First(
		java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.j2eecn.mcat.NoSuchAssetCatCareException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first me asset cat care in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching me asset cat care, or <code>null</code> if a matching me asset cat care could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.j2eecn.mcat.model.MeAssetCatCare fetchByUuid_C_First(
		java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public com.j2eecn.mcat.model.MeAssetCatCare findByUuid_C_Last(
		java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.j2eecn.mcat.NoSuchAssetCatCareException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last me asset cat care in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching me asset cat care, or <code>null</code> if a matching me asset cat care could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.j2eecn.mcat.model.MeAssetCatCare fetchByUuid_C_Last(
		java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public com.j2eecn.mcat.model.MeAssetCatCare[] findByUuid_C_PrevAndNext(
		long assetCatCareId, java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.j2eecn.mcat.NoSuchAssetCatCareException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the me asset cat cares where uuid = &#63; and companyId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByUuid_C(java.lang.String uuid, long companyId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of me asset cat cares where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the number of matching me asset cat cares
	* @throws SystemException if a system exception occurred
	*/
	public int countByUuid_C(java.lang.String uuid, long companyId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the me asset cat cares where userId = &#63; and assetCatId = &#63;.
	*
	* @param userId the user ID
	* @param assetCatId the asset cat ID
	* @return the matching me asset cat cares
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.j2eecn.mcat.model.MeAssetCatCare> findByU_ACID(
		long userId, long assetCatId)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.j2eecn.mcat.model.MeAssetCatCare> findByU_ACID(
		long userId, long assetCatId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.j2eecn.mcat.model.MeAssetCatCare> findByU_ACID(
		long userId, long assetCatId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public com.j2eecn.mcat.model.MeAssetCatCare findByU_ACID_First(
		long userId, long assetCatId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.j2eecn.mcat.NoSuchAssetCatCareException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first me asset cat care in the ordered set where userId = &#63; and assetCatId = &#63;.
	*
	* @param userId the user ID
	* @param assetCatId the asset cat ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching me asset cat care, or <code>null</code> if a matching me asset cat care could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.j2eecn.mcat.model.MeAssetCatCare fetchByU_ACID_First(
		long userId, long assetCatId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public com.j2eecn.mcat.model.MeAssetCatCare findByU_ACID_Last(long userId,
		long assetCatId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.j2eecn.mcat.NoSuchAssetCatCareException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last me asset cat care in the ordered set where userId = &#63; and assetCatId = &#63;.
	*
	* @param userId the user ID
	* @param assetCatId the asset cat ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching me asset cat care, or <code>null</code> if a matching me asset cat care could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.j2eecn.mcat.model.MeAssetCatCare fetchByU_ACID_Last(
		long userId, long assetCatId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public com.j2eecn.mcat.model.MeAssetCatCare[] findByU_ACID_PrevAndNext(
		long assetCatCareId, long userId, long assetCatId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.j2eecn.mcat.NoSuchAssetCatCareException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the me asset cat cares where userId = &#63; and assetCatId = &#63; from the database.
	*
	* @param userId the user ID
	* @param assetCatId the asset cat ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByU_ACID(long userId, long assetCatId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of me asset cat cares where userId = &#63; and assetCatId = &#63;.
	*
	* @param userId the user ID
	* @param assetCatId the asset cat ID
	* @return the number of matching me asset cat cares
	* @throws SystemException if a system exception occurred
	*/
	public int countByU_ACID(long userId, long assetCatId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the me asset cat cares where userId = &#63;.
	*
	* @param userId the user ID
	* @return the matching me asset cat cares
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.j2eecn.mcat.model.MeAssetCatCare> findByUserId(
		long userId) throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.j2eecn.mcat.model.MeAssetCatCare> findByUserId(
		long userId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.j2eecn.mcat.model.MeAssetCatCare> findByUserId(
		long userId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first me asset cat care in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching me asset cat care
	* @throws com.j2eecn.mcat.NoSuchAssetCatCareException if a matching me asset cat care could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.j2eecn.mcat.model.MeAssetCatCare findByUserId_First(
		long userId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.j2eecn.mcat.NoSuchAssetCatCareException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first me asset cat care in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching me asset cat care, or <code>null</code> if a matching me asset cat care could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.j2eecn.mcat.model.MeAssetCatCare fetchByUserId_First(
		long userId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last me asset cat care in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching me asset cat care
	* @throws com.j2eecn.mcat.NoSuchAssetCatCareException if a matching me asset cat care could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.j2eecn.mcat.model.MeAssetCatCare findByUserId_Last(long userId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.j2eecn.mcat.NoSuchAssetCatCareException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last me asset cat care in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching me asset cat care, or <code>null</code> if a matching me asset cat care could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.j2eecn.mcat.model.MeAssetCatCare fetchByUserId_Last(
		long userId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public com.j2eecn.mcat.model.MeAssetCatCare[] findByUserId_PrevAndNext(
		long assetCatCareId, long userId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.j2eecn.mcat.NoSuchAssetCatCareException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the me asset cat cares where userId = &#63; from the database.
	*
	* @param userId the user ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByUserId(long userId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of me asset cat cares where userId = &#63;.
	*
	* @param userId the user ID
	* @return the number of matching me asset cat cares
	* @throws SystemException if a system exception occurred
	*/
	public int countByUserId(long userId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Caches the me asset cat care in the entity cache if it is enabled.
	*
	* @param meAssetCatCare the me asset cat care
	*/
	public void cacheResult(com.j2eecn.mcat.model.MeAssetCatCare meAssetCatCare);

	/**
	* Caches the me asset cat cares in the entity cache if it is enabled.
	*
	* @param meAssetCatCares the me asset cat cares
	*/
	public void cacheResult(
		java.util.List<com.j2eecn.mcat.model.MeAssetCatCare> meAssetCatCares);

	/**
	* Creates a new me asset cat care with the primary key. Does not add the me asset cat care to the database.
	*
	* @param assetCatCareId the primary key for the new me asset cat care
	* @return the new me asset cat care
	*/
	public com.j2eecn.mcat.model.MeAssetCatCare create(long assetCatCareId);

	/**
	* Removes the me asset cat care with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param assetCatCareId the primary key of the me asset cat care
	* @return the me asset cat care that was removed
	* @throws com.j2eecn.mcat.NoSuchAssetCatCareException if a me asset cat care with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.j2eecn.mcat.model.MeAssetCatCare remove(long assetCatCareId)
		throws com.j2eecn.mcat.NoSuchAssetCatCareException,
			com.liferay.portal.kernel.exception.SystemException;

	public com.j2eecn.mcat.model.MeAssetCatCare updateImpl(
		com.j2eecn.mcat.model.MeAssetCatCare meAssetCatCare)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the me asset cat care with the primary key or throws a {@link com.j2eecn.mcat.NoSuchAssetCatCareException} if it could not be found.
	*
	* @param assetCatCareId the primary key of the me asset cat care
	* @return the me asset cat care
	* @throws com.j2eecn.mcat.NoSuchAssetCatCareException if a me asset cat care with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.j2eecn.mcat.model.MeAssetCatCare findByPrimaryKey(
		long assetCatCareId)
		throws com.j2eecn.mcat.NoSuchAssetCatCareException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the me asset cat care with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param assetCatCareId the primary key of the me asset cat care
	* @return the me asset cat care, or <code>null</code> if a me asset cat care with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.j2eecn.mcat.model.MeAssetCatCare fetchByPrimaryKey(
		long assetCatCareId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the me asset cat cares.
	*
	* @return the me asset cat cares
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.j2eecn.mcat.model.MeAssetCatCare> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.j2eecn.mcat.model.MeAssetCatCare> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.j2eecn.mcat.model.MeAssetCatCare> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the me asset cat cares from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of me asset cat cares.
	*
	* @return the number of me asset cat cares
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}