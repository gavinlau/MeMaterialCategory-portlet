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

import com.j2eecn.mcat.model.MeAssetCat;

import com.liferay.portal.service.persistence.BasePersistence;

/**
 * The persistence interface for the me asset cat service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Administrator
 * @see MeAssetCatPersistenceImpl
 * @see MeAssetCatUtil
 * @generated
 */
public interface MeAssetCatPersistence extends BasePersistence<MeAssetCat> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link MeAssetCatUtil} to access the me asset cat persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the me asset cats where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the matching me asset cats
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.j2eecn.mcat.model.MeAssetCat> findByUuid(
		java.lang.String uuid)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the me asset cats where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.j2eecn.mcat.model.impl.MeAssetCatModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of me asset cats
	* @param end the upper bound of the range of me asset cats (not inclusive)
	* @return the range of matching me asset cats
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.j2eecn.mcat.model.MeAssetCat> findByUuid(
		java.lang.String uuid, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the me asset cats where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.j2eecn.mcat.model.impl.MeAssetCatModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of me asset cats
	* @param end the upper bound of the range of me asset cats (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching me asset cats
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.j2eecn.mcat.model.MeAssetCat> findByUuid(
		java.lang.String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first me asset cat in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching me asset cat
	* @throws com.j2eecn.mcat.NoSuchAssetCatException if a matching me asset cat could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.j2eecn.mcat.model.MeAssetCat findByUuid_First(
		java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.j2eecn.mcat.NoSuchAssetCatException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first me asset cat in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching me asset cat, or <code>null</code> if a matching me asset cat could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.j2eecn.mcat.model.MeAssetCat fetchByUuid_First(
		java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last me asset cat in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching me asset cat
	* @throws com.j2eecn.mcat.NoSuchAssetCatException if a matching me asset cat could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.j2eecn.mcat.model.MeAssetCat findByUuid_Last(
		java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.j2eecn.mcat.NoSuchAssetCatException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last me asset cat in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching me asset cat, or <code>null</code> if a matching me asset cat could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.j2eecn.mcat.model.MeAssetCat fetchByUuid_Last(
		java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the me asset cats before and after the current me asset cat in the ordered set where uuid = &#63;.
	*
	* @param assetCatId the primary key of the current me asset cat
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next me asset cat
	* @throws com.j2eecn.mcat.NoSuchAssetCatException if a me asset cat with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.j2eecn.mcat.model.MeAssetCat[] findByUuid_PrevAndNext(
		long assetCatId, java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.j2eecn.mcat.NoSuchAssetCatException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the me asset cats where uuid = &#63; from the database.
	*
	* @param uuid the uuid
	* @throws SystemException if a system exception occurred
	*/
	public void removeByUuid(java.lang.String uuid)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of me asset cats where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the number of matching me asset cats
	* @throws SystemException if a system exception occurred
	*/
	public int countByUuid(java.lang.String uuid)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the me asset cat where uuid = &#63; and groupId = &#63; or throws a {@link com.j2eecn.mcat.NoSuchAssetCatException} if it could not be found.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching me asset cat
	* @throws com.j2eecn.mcat.NoSuchAssetCatException if a matching me asset cat could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.j2eecn.mcat.model.MeAssetCat findByUUID_G(
		java.lang.String uuid, long groupId)
		throws com.j2eecn.mcat.NoSuchAssetCatException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the me asset cat where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching me asset cat, or <code>null</code> if a matching me asset cat could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.j2eecn.mcat.model.MeAssetCat fetchByUUID_G(
		java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the me asset cat where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching me asset cat, or <code>null</code> if a matching me asset cat could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.j2eecn.mcat.model.MeAssetCat fetchByUUID_G(
		java.lang.String uuid, long groupId, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the me asset cat where uuid = &#63; and groupId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the me asset cat that was removed
	* @throws SystemException if a system exception occurred
	*/
	public com.j2eecn.mcat.model.MeAssetCat removeByUUID_G(
		java.lang.String uuid, long groupId)
		throws com.j2eecn.mcat.NoSuchAssetCatException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of me asset cats where uuid = &#63; and groupId = &#63;.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the number of matching me asset cats
	* @throws SystemException if a system exception occurred
	*/
	public int countByUUID_G(java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the me asset cats where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the matching me asset cats
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.j2eecn.mcat.model.MeAssetCat> findByUuid_C(
		java.lang.String uuid, long companyId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the me asset cats where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.j2eecn.mcat.model.impl.MeAssetCatModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of me asset cats
	* @param end the upper bound of the range of me asset cats (not inclusive)
	* @return the range of matching me asset cats
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.j2eecn.mcat.model.MeAssetCat> findByUuid_C(
		java.lang.String uuid, long companyId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the me asset cats where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.j2eecn.mcat.model.impl.MeAssetCatModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of me asset cats
	* @param end the upper bound of the range of me asset cats (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching me asset cats
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.j2eecn.mcat.model.MeAssetCat> findByUuid_C(
		java.lang.String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first me asset cat in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching me asset cat
	* @throws com.j2eecn.mcat.NoSuchAssetCatException if a matching me asset cat could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.j2eecn.mcat.model.MeAssetCat findByUuid_C_First(
		java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.j2eecn.mcat.NoSuchAssetCatException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first me asset cat in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching me asset cat, or <code>null</code> if a matching me asset cat could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.j2eecn.mcat.model.MeAssetCat fetchByUuid_C_First(
		java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last me asset cat in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching me asset cat
	* @throws com.j2eecn.mcat.NoSuchAssetCatException if a matching me asset cat could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.j2eecn.mcat.model.MeAssetCat findByUuid_C_Last(
		java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.j2eecn.mcat.NoSuchAssetCatException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last me asset cat in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching me asset cat, or <code>null</code> if a matching me asset cat could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.j2eecn.mcat.model.MeAssetCat fetchByUuid_C_Last(
		java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the me asset cats before and after the current me asset cat in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param assetCatId the primary key of the current me asset cat
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next me asset cat
	* @throws com.j2eecn.mcat.NoSuchAssetCatException if a me asset cat with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.j2eecn.mcat.model.MeAssetCat[] findByUuid_C_PrevAndNext(
		long assetCatId, java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.j2eecn.mcat.NoSuchAssetCatException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the me asset cats where uuid = &#63; and companyId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByUuid_C(java.lang.String uuid, long companyId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of me asset cats where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the number of matching me asset cats
	* @throws SystemException if a system exception occurred
	*/
	public int countByUuid_C(java.lang.String uuid, long companyId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Caches the me asset cat in the entity cache if it is enabled.
	*
	* @param meAssetCat the me asset cat
	*/
	public void cacheResult(com.j2eecn.mcat.model.MeAssetCat meAssetCat);

	/**
	* Caches the me asset cats in the entity cache if it is enabled.
	*
	* @param meAssetCats the me asset cats
	*/
	public void cacheResult(
		java.util.List<com.j2eecn.mcat.model.MeAssetCat> meAssetCats);

	/**
	* Creates a new me asset cat with the primary key. Does not add the me asset cat to the database.
	*
	* @param assetCatId the primary key for the new me asset cat
	* @return the new me asset cat
	*/
	public com.j2eecn.mcat.model.MeAssetCat create(long assetCatId);

	/**
	* Removes the me asset cat with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param assetCatId the primary key of the me asset cat
	* @return the me asset cat that was removed
	* @throws com.j2eecn.mcat.NoSuchAssetCatException if a me asset cat with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.j2eecn.mcat.model.MeAssetCat remove(long assetCatId)
		throws com.j2eecn.mcat.NoSuchAssetCatException,
			com.liferay.portal.kernel.exception.SystemException;

	public com.j2eecn.mcat.model.MeAssetCat updateImpl(
		com.j2eecn.mcat.model.MeAssetCat meAssetCat)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the me asset cat with the primary key or throws a {@link com.j2eecn.mcat.NoSuchAssetCatException} if it could not be found.
	*
	* @param assetCatId the primary key of the me asset cat
	* @return the me asset cat
	* @throws com.j2eecn.mcat.NoSuchAssetCatException if a me asset cat with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.j2eecn.mcat.model.MeAssetCat findByPrimaryKey(long assetCatId)
		throws com.j2eecn.mcat.NoSuchAssetCatException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the me asset cat with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param assetCatId the primary key of the me asset cat
	* @return the me asset cat, or <code>null</code> if a me asset cat with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.j2eecn.mcat.model.MeAssetCat fetchByPrimaryKey(long assetCatId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the me asset cats.
	*
	* @return the me asset cats
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.j2eecn.mcat.model.MeAssetCat> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.j2eecn.mcat.model.MeAssetCat> findAll(int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the me asset cats.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.j2eecn.mcat.model.impl.MeAssetCatModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of me asset cats
	* @param end the upper bound of the range of me asset cats (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of me asset cats
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.j2eecn.mcat.model.MeAssetCat> findAll(int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the me asset cats from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of me asset cats.
	*
	* @return the number of me asset cats
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}