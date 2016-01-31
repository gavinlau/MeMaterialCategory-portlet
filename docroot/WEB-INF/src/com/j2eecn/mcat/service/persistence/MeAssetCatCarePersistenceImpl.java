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

import com.j2eecn.mcat.NoSuchAssetCatCareException;
import com.j2eecn.mcat.model.MeAssetCatCare;
import com.j2eecn.mcat.model.impl.MeAssetCatCareImpl;
import com.j2eecn.mcat.model.impl.MeAssetCatCareModelImpl;

import com.liferay.portal.kernel.cache.CacheRegistryUtil;
import com.liferay.portal.kernel.dao.orm.EntityCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.InstanceFactory;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PropsKeys;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.SetUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.UnmodifiableList;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.kernel.uuid.PortalUUIDUtil;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the me asset cat care service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Administrator
 * @see MeAssetCatCarePersistence
 * @see MeAssetCatCareUtil
 * @generated
 */
public class MeAssetCatCarePersistenceImpl extends BasePersistenceImpl<MeAssetCatCare>
	implements MeAssetCatCarePersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link MeAssetCatCareUtil} to access the me asset cat care persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = MeAssetCatCareImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(MeAssetCatCareModelImpl.ENTITY_CACHE_ENABLED,
			MeAssetCatCareModelImpl.FINDER_CACHE_ENABLED,
			MeAssetCatCareImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(MeAssetCatCareModelImpl.ENTITY_CACHE_ENABLED,
			MeAssetCatCareModelImpl.FINDER_CACHE_ENABLED,
			MeAssetCatCareImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(MeAssetCatCareModelImpl.ENTITY_CACHE_ENABLED,
			MeAssetCatCareModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_UUID = new FinderPath(MeAssetCatCareModelImpl.ENTITY_CACHE_ENABLED,
			MeAssetCatCareModelImpl.FINDER_CACHE_ENABLED,
			MeAssetCatCareImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByUuid",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID = new FinderPath(MeAssetCatCareModelImpl.ENTITY_CACHE_ENABLED,
			MeAssetCatCareModelImpl.FINDER_CACHE_ENABLED,
			MeAssetCatCareImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByUuid",
			new String[] { String.class.getName() },
			MeAssetCatCareModelImpl.UUID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_UUID = new FinderPath(MeAssetCatCareModelImpl.ENTITY_CACHE_ENABLED,
			MeAssetCatCareModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUuid",
			new String[] { String.class.getName() });

	/**
	 * Returns all the me asset cat cares where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching me asset cat cares
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<MeAssetCatCare> findByUuid(String uuid)
		throws SystemException {
		return findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<MeAssetCatCare> findByUuid(String uuid, int start, int end)
		throws SystemException {
		return findByUuid(uuid, start, end, null);
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
	@Override
	public List<MeAssetCatCare> findByUuid(String uuid, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID;
			finderArgs = new Object[] { uuid };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_UUID;
			finderArgs = new Object[] { uuid, start, end, orderByComparator };
		}

		List<MeAssetCatCare> list = (List<MeAssetCatCare>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (MeAssetCatCare meAssetCatCare : list) {
				if (!Validator.equals(uuid, meAssetCatCare.getUuid())) {
					list = null;

					break;
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(3 +
						(orderByComparator.getOrderByFields().length * 3));
			}
			else {
				query = new StringBundler(3);
			}

			query.append(_SQL_SELECT_MEASSETCATCARE_WHERE);

			boolean bindUuid = false;

			if (uuid == null) {
				query.append(_FINDER_COLUMN_UUID_UUID_1);
			}
			else if (uuid.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_UUID_UUID_3);
			}
			else {
				bindUuid = true;

				query.append(_FINDER_COLUMN_UUID_UUID_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(MeAssetCatCareModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindUuid) {
					qPos.add(uuid);
				}

				if (!pagination) {
					list = (List<MeAssetCatCare>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<MeAssetCatCare>(list);
				}
				else {
					list = (List<MeAssetCatCare>)QueryUtil.list(q,
							getDialect(), start, end);
				}

				cacheResult(list);

				FinderCacheUtil.putResult(finderPath, finderArgs, list);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
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
	@Override
	public MeAssetCatCare findByUuid_First(String uuid,
		OrderByComparator orderByComparator)
		throws NoSuchAssetCatCareException, SystemException {
		MeAssetCatCare meAssetCatCare = fetchByUuid_First(uuid,
				orderByComparator);

		if (meAssetCatCare != null) {
			return meAssetCatCare;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("uuid=");
		msg.append(uuid);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchAssetCatCareException(msg.toString());
	}

	/**
	 * Returns the first me asset cat care in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching me asset cat care, or <code>null</code> if a matching me asset cat care could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MeAssetCatCare fetchByUuid_First(String uuid,
		OrderByComparator orderByComparator) throws SystemException {
		List<MeAssetCatCare> list = findByUuid(uuid, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public MeAssetCatCare findByUuid_Last(String uuid,
		OrderByComparator orderByComparator)
		throws NoSuchAssetCatCareException, SystemException {
		MeAssetCatCare meAssetCatCare = fetchByUuid_Last(uuid, orderByComparator);

		if (meAssetCatCare != null) {
			return meAssetCatCare;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("uuid=");
		msg.append(uuid);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchAssetCatCareException(msg.toString());
	}

	/**
	 * Returns the last me asset cat care in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching me asset cat care, or <code>null</code> if a matching me asset cat care could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MeAssetCatCare fetchByUuid_Last(String uuid,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByUuid(uuid);

		if (count == 0) {
			return null;
		}

		List<MeAssetCatCare> list = findByUuid(uuid, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public MeAssetCatCare[] findByUuid_PrevAndNext(long assetCatCareId,
		String uuid, OrderByComparator orderByComparator)
		throws NoSuchAssetCatCareException, SystemException {
		MeAssetCatCare meAssetCatCare = findByPrimaryKey(assetCatCareId);

		Session session = null;

		try {
			session = openSession();

			MeAssetCatCare[] array = new MeAssetCatCareImpl[3];

			array[0] = getByUuid_PrevAndNext(session, meAssetCatCare, uuid,
					orderByComparator, true);

			array[1] = meAssetCatCare;

			array[2] = getByUuid_PrevAndNext(session, meAssetCatCare, uuid,
					orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected MeAssetCatCare getByUuid_PrevAndNext(Session session,
		MeAssetCatCare meAssetCatCare, String uuid,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_MEASSETCATCARE_WHERE);

		boolean bindUuid = false;

		if (uuid == null) {
			query.append(_FINDER_COLUMN_UUID_UUID_1);
		}
		else if (uuid.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_UUID_UUID_3);
		}
		else {
			bindUuid = true;

			query.append(_FINDER_COLUMN_UUID_UUID_2);
		}

		if (orderByComparator != null) {
			String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				query.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						query.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN);
					}
					else {
						query.append(WHERE_LESSER_THAN);
					}
				}
			}

			query.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						query.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC);
					}
					else {
						query.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			query.append(MeAssetCatCareModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindUuid) {
			qPos.add(uuid);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(meAssetCatCare);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<MeAssetCatCare> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the me asset cat cares where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByUuid(String uuid) throws SystemException {
		for (MeAssetCatCare meAssetCatCare : findByUuid(uuid,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(meAssetCatCare);
		}
	}

	/**
	 * Returns the number of me asset cat cares where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching me asset cat cares
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByUuid(String uuid) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_UUID;

		Object[] finderArgs = new Object[] { uuid };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_MEASSETCATCARE_WHERE);

			boolean bindUuid = false;

			if (uuid == null) {
				query.append(_FINDER_COLUMN_UUID_UUID_1);
			}
			else if (uuid.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_UUID_UUID_3);
			}
			else {
				bindUuid = true;

				query.append(_FINDER_COLUMN_UUID_UUID_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindUuid) {
					qPos.add(uuid);
				}

				count = (Long)q.uniqueResult();

				FinderCacheUtil.putResult(finderPath, finderArgs, count);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_UUID_UUID_1 = "meAssetCatCare.uuid IS NULL";
	private static final String _FINDER_COLUMN_UUID_UUID_2 = "meAssetCatCare.uuid = ?";
	private static final String _FINDER_COLUMN_UUID_UUID_3 = "(meAssetCatCare.uuid IS NULL OR meAssetCatCare.uuid = '')";
	public static final FinderPath FINDER_PATH_FETCH_BY_UUID_G = new FinderPath(MeAssetCatCareModelImpl.ENTITY_CACHE_ENABLED,
			MeAssetCatCareModelImpl.FINDER_CACHE_ENABLED,
			MeAssetCatCareImpl.class, FINDER_CLASS_NAME_ENTITY,
			"fetchByUUID_G",
			new String[] { String.class.getName(), Long.class.getName() },
			MeAssetCatCareModelImpl.UUID_COLUMN_BITMASK |
			MeAssetCatCareModelImpl.GROUPID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_UUID_G = new FinderPath(MeAssetCatCareModelImpl.ENTITY_CACHE_ENABLED,
			MeAssetCatCareModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUUID_G",
			new String[] { String.class.getName(), Long.class.getName() });

	/**
	 * Returns the me asset cat care where uuid = &#63; and groupId = &#63; or throws a {@link com.j2eecn.mcat.NoSuchAssetCatCareException} if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching me asset cat care
	 * @throws com.j2eecn.mcat.NoSuchAssetCatCareException if a matching me asset cat care could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MeAssetCatCare findByUUID_G(String uuid, long groupId)
		throws NoSuchAssetCatCareException, SystemException {
		MeAssetCatCare meAssetCatCare = fetchByUUID_G(uuid, groupId);

		if (meAssetCatCare == null) {
			StringBundler msg = new StringBundler(6);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("uuid=");
			msg.append(uuid);

			msg.append(", groupId=");
			msg.append(groupId);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isWarnEnabled()) {
				_log.warn(msg.toString());
			}

			throw new NoSuchAssetCatCareException(msg.toString());
		}

		return meAssetCatCare;
	}

	/**
	 * Returns the me asset cat care where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching me asset cat care, or <code>null</code> if a matching me asset cat care could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MeAssetCatCare fetchByUUID_G(String uuid, long groupId)
		throws SystemException {
		return fetchByUUID_G(uuid, groupId, true);
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
	@Override
	public MeAssetCatCare fetchByUUID_G(String uuid, long groupId,
		boolean retrieveFromCache) throws SystemException {
		Object[] finderArgs = new Object[] { uuid, groupId };

		Object result = null;

		if (retrieveFromCache) {
			result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_UUID_G,
					finderArgs, this);
		}

		if (result instanceof MeAssetCatCare) {
			MeAssetCatCare meAssetCatCare = (MeAssetCatCare)result;

			if (!Validator.equals(uuid, meAssetCatCare.getUuid()) ||
					(groupId != meAssetCatCare.getGroupId())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_SELECT_MEASSETCATCARE_WHERE);

			boolean bindUuid = false;

			if (uuid == null) {
				query.append(_FINDER_COLUMN_UUID_G_UUID_1);
			}
			else if (uuid.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_UUID_G_UUID_3);
			}
			else {
				bindUuid = true;

				query.append(_FINDER_COLUMN_UUID_G_UUID_2);
			}

			query.append(_FINDER_COLUMN_UUID_G_GROUPID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindUuid) {
					qPos.add(uuid);
				}

				qPos.add(groupId);

				List<MeAssetCatCare> list = q.list();

				if (list.isEmpty()) {
					FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_UUID_G,
						finderArgs, list);
				}
				else {
					MeAssetCatCare meAssetCatCare = list.get(0);

					result = meAssetCatCare;

					cacheResult(meAssetCatCare);

					if ((meAssetCatCare.getUuid() == null) ||
							!meAssetCatCare.getUuid().equals(uuid) ||
							(meAssetCatCare.getGroupId() != groupId)) {
						FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_UUID_G,
							finderArgs, meAssetCatCare);
					}
				}
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_UUID_G,
					finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		if (result instanceof List<?>) {
			return null;
		}
		else {
			return (MeAssetCatCare)result;
		}
	}

	/**
	 * Removes the me asset cat care where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the me asset cat care that was removed
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MeAssetCatCare removeByUUID_G(String uuid, long groupId)
		throws NoSuchAssetCatCareException, SystemException {
		MeAssetCatCare meAssetCatCare = findByUUID_G(uuid, groupId);

		return remove(meAssetCatCare);
	}

	/**
	 * Returns the number of me asset cat cares where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching me asset cat cares
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByUUID_G(String uuid, long groupId)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_UUID_G;

		Object[] finderArgs = new Object[] { uuid, groupId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_MEASSETCATCARE_WHERE);

			boolean bindUuid = false;

			if (uuid == null) {
				query.append(_FINDER_COLUMN_UUID_G_UUID_1);
			}
			else if (uuid.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_UUID_G_UUID_3);
			}
			else {
				bindUuid = true;

				query.append(_FINDER_COLUMN_UUID_G_UUID_2);
			}

			query.append(_FINDER_COLUMN_UUID_G_GROUPID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindUuid) {
					qPos.add(uuid);
				}

				qPos.add(groupId);

				count = (Long)q.uniqueResult();

				FinderCacheUtil.putResult(finderPath, finderArgs, count);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_UUID_G_UUID_1 = "meAssetCatCare.uuid IS NULL AND ";
	private static final String _FINDER_COLUMN_UUID_G_UUID_2 = "meAssetCatCare.uuid = ? AND ";
	private static final String _FINDER_COLUMN_UUID_G_UUID_3 = "(meAssetCatCare.uuid IS NULL OR meAssetCatCare.uuid = '') AND ";
	private static final String _FINDER_COLUMN_UUID_G_GROUPID_2 = "meAssetCatCare.groupId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_UUID_C = new FinderPath(MeAssetCatCareModelImpl.ENTITY_CACHE_ENABLED,
			MeAssetCatCareModelImpl.FINDER_CACHE_ENABLED,
			MeAssetCatCareImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByUuid_C",
			new String[] {
				String.class.getName(), Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C =
		new FinderPath(MeAssetCatCareModelImpl.ENTITY_CACHE_ENABLED,
			MeAssetCatCareModelImpl.FINDER_CACHE_ENABLED,
			MeAssetCatCareImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByUuid_C",
			new String[] { String.class.getName(), Long.class.getName() },
			MeAssetCatCareModelImpl.UUID_COLUMN_BITMASK |
			MeAssetCatCareModelImpl.COMPANYID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_UUID_C = new FinderPath(MeAssetCatCareModelImpl.ENTITY_CACHE_ENABLED,
			MeAssetCatCareModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUuid_C",
			new String[] { String.class.getName(), Long.class.getName() });

	/**
	 * Returns all the me asset cat cares where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching me asset cat cares
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<MeAssetCatCare> findByUuid_C(String uuid, long companyId)
		throws SystemException {
		return findByUuid_C(uuid, companyId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
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
	@Override
	public List<MeAssetCatCare> findByUuid_C(String uuid, long companyId,
		int start, int end) throws SystemException {
		return findByUuid_C(uuid, companyId, start, end, null);
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
	@Override
	public List<MeAssetCatCare> findByUuid_C(String uuid, long companyId,
		int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C;
			finderArgs = new Object[] { uuid, companyId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_UUID_C;
			finderArgs = new Object[] {
					uuid, companyId,
					
					start, end, orderByComparator
				};
		}

		List<MeAssetCatCare> list = (List<MeAssetCatCare>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (MeAssetCatCare meAssetCatCare : list) {
				if (!Validator.equals(uuid, meAssetCatCare.getUuid()) ||
						(companyId != meAssetCatCare.getCompanyId())) {
					list = null;

					break;
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(4 +
						(orderByComparator.getOrderByFields().length * 3));
			}
			else {
				query = new StringBundler(4);
			}

			query.append(_SQL_SELECT_MEASSETCATCARE_WHERE);

			boolean bindUuid = false;

			if (uuid == null) {
				query.append(_FINDER_COLUMN_UUID_C_UUID_1);
			}
			else if (uuid.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_UUID_C_UUID_3);
			}
			else {
				bindUuid = true;

				query.append(_FINDER_COLUMN_UUID_C_UUID_2);
			}

			query.append(_FINDER_COLUMN_UUID_C_COMPANYID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(MeAssetCatCareModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindUuid) {
					qPos.add(uuid);
				}

				qPos.add(companyId);

				if (!pagination) {
					list = (List<MeAssetCatCare>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<MeAssetCatCare>(list);
				}
				else {
					list = (List<MeAssetCatCare>)QueryUtil.list(q,
							getDialect(), start, end);
				}

				cacheResult(list);

				FinderCacheUtil.putResult(finderPath, finderArgs, list);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
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
	@Override
	public MeAssetCatCare findByUuid_C_First(String uuid, long companyId,
		OrderByComparator orderByComparator)
		throws NoSuchAssetCatCareException, SystemException {
		MeAssetCatCare meAssetCatCare = fetchByUuid_C_First(uuid, companyId,
				orderByComparator);

		if (meAssetCatCare != null) {
			return meAssetCatCare;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("uuid=");
		msg.append(uuid);

		msg.append(", companyId=");
		msg.append(companyId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchAssetCatCareException(msg.toString());
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
	@Override
	public MeAssetCatCare fetchByUuid_C_First(String uuid, long companyId,
		OrderByComparator orderByComparator) throws SystemException {
		List<MeAssetCatCare> list = findByUuid_C(uuid, companyId, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public MeAssetCatCare findByUuid_C_Last(String uuid, long companyId,
		OrderByComparator orderByComparator)
		throws NoSuchAssetCatCareException, SystemException {
		MeAssetCatCare meAssetCatCare = fetchByUuid_C_Last(uuid, companyId,
				orderByComparator);

		if (meAssetCatCare != null) {
			return meAssetCatCare;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("uuid=");
		msg.append(uuid);

		msg.append(", companyId=");
		msg.append(companyId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchAssetCatCareException(msg.toString());
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
	@Override
	public MeAssetCatCare fetchByUuid_C_Last(String uuid, long companyId,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByUuid_C(uuid, companyId);

		if (count == 0) {
			return null;
		}

		List<MeAssetCatCare> list = findByUuid_C(uuid, companyId, count - 1,
				count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public MeAssetCatCare[] findByUuid_C_PrevAndNext(long assetCatCareId,
		String uuid, long companyId, OrderByComparator orderByComparator)
		throws NoSuchAssetCatCareException, SystemException {
		MeAssetCatCare meAssetCatCare = findByPrimaryKey(assetCatCareId);

		Session session = null;

		try {
			session = openSession();

			MeAssetCatCare[] array = new MeAssetCatCareImpl[3];

			array[0] = getByUuid_C_PrevAndNext(session, meAssetCatCare, uuid,
					companyId, orderByComparator, true);

			array[1] = meAssetCatCare;

			array[2] = getByUuid_C_PrevAndNext(session, meAssetCatCare, uuid,
					companyId, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected MeAssetCatCare getByUuid_C_PrevAndNext(Session session,
		MeAssetCatCare meAssetCatCare, String uuid, long companyId,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_MEASSETCATCARE_WHERE);

		boolean bindUuid = false;

		if (uuid == null) {
			query.append(_FINDER_COLUMN_UUID_C_UUID_1);
		}
		else if (uuid.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_UUID_C_UUID_3);
		}
		else {
			bindUuid = true;

			query.append(_FINDER_COLUMN_UUID_C_UUID_2);
		}

		query.append(_FINDER_COLUMN_UUID_C_COMPANYID_2);

		if (orderByComparator != null) {
			String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				query.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						query.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN);
					}
					else {
						query.append(WHERE_LESSER_THAN);
					}
				}
			}

			query.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						query.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC);
					}
					else {
						query.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			query.append(MeAssetCatCareModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindUuid) {
			qPos.add(uuid);
		}

		qPos.add(companyId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(meAssetCatCare);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<MeAssetCatCare> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the me asset cat cares where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByUuid_C(String uuid, long companyId)
		throws SystemException {
		for (MeAssetCatCare meAssetCatCare : findByUuid_C(uuid, companyId,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(meAssetCatCare);
		}
	}

	/**
	 * Returns the number of me asset cat cares where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching me asset cat cares
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByUuid_C(String uuid, long companyId)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_UUID_C;

		Object[] finderArgs = new Object[] { uuid, companyId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_MEASSETCATCARE_WHERE);

			boolean bindUuid = false;

			if (uuid == null) {
				query.append(_FINDER_COLUMN_UUID_C_UUID_1);
			}
			else if (uuid.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_UUID_C_UUID_3);
			}
			else {
				bindUuid = true;

				query.append(_FINDER_COLUMN_UUID_C_UUID_2);
			}

			query.append(_FINDER_COLUMN_UUID_C_COMPANYID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindUuid) {
					qPos.add(uuid);
				}

				qPos.add(companyId);

				count = (Long)q.uniqueResult();

				FinderCacheUtil.putResult(finderPath, finderArgs, count);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_UUID_C_UUID_1 = "meAssetCatCare.uuid IS NULL AND ";
	private static final String _FINDER_COLUMN_UUID_C_UUID_2 = "meAssetCatCare.uuid = ? AND ";
	private static final String _FINDER_COLUMN_UUID_C_UUID_3 = "(meAssetCatCare.uuid IS NULL OR meAssetCatCare.uuid = '') AND ";
	private static final String _FINDER_COLUMN_UUID_C_COMPANYID_2 = "meAssetCatCare.companyId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_U_ACID = new FinderPath(MeAssetCatCareModelImpl.ENTITY_CACHE_ENABLED,
			MeAssetCatCareModelImpl.FINDER_CACHE_ENABLED,
			MeAssetCatCareImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByU_ACID",
			new String[] {
				Long.class.getName(), Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_U_ACID =
		new FinderPath(MeAssetCatCareModelImpl.ENTITY_CACHE_ENABLED,
			MeAssetCatCareModelImpl.FINDER_CACHE_ENABLED,
			MeAssetCatCareImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByU_ACID",
			new String[] { Long.class.getName(), Long.class.getName() },
			MeAssetCatCareModelImpl.USERID_COLUMN_BITMASK |
			MeAssetCatCareModelImpl.ASSETCATID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_U_ACID = new FinderPath(MeAssetCatCareModelImpl.ENTITY_CACHE_ENABLED,
			MeAssetCatCareModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByU_ACID",
			new String[] { Long.class.getName(), Long.class.getName() });

	/**
	 * Returns all the me asset cat cares where userId = &#63; and assetCatId = &#63;.
	 *
	 * @param userId the user ID
	 * @param assetCatId the asset cat ID
	 * @return the matching me asset cat cares
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<MeAssetCatCare> findByU_ACID(long userId, long assetCatId)
		throws SystemException {
		return findByU_ACID(userId, assetCatId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
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
	@Override
	public List<MeAssetCatCare> findByU_ACID(long userId, long assetCatId,
		int start, int end) throws SystemException {
		return findByU_ACID(userId, assetCatId, start, end, null);
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
	@Override
	public List<MeAssetCatCare> findByU_ACID(long userId, long assetCatId,
		int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_U_ACID;
			finderArgs = new Object[] { userId, assetCatId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_U_ACID;
			finderArgs = new Object[] {
					userId, assetCatId,
					
					start, end, orderByComparator
				};
		}

		List<MeAssetCatCare> list = (List<MeAssetCatCare>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (MeAssetCatCare meAssetCatCare : list) {
				if ((userId != meAssetCatCare.getUserId()) ||
						(assetCatId != meAssetCatCare.getAssetCatId())) {
					list = null;

					break;
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(4 +
						(orderByComparator.getOrderByFields().length * 3));
			}
			else {
				query = new StringBundler(4);
			}

			query.append(_SQL_SELECT_MEASSETCATCARE_WHERE);

			query.append(_FINDER_COLUMN_U_ACID_USERID_2);

			query.append(_FINDER_COLUMN_U_ACID_ASSETCATID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(MeAssetCatCareModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(userId);

				qPos.add(assetCatId);

				if (!pagination) {
					list = (List<MeAssetCatCare>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<MeAssetCatCare>(list);
				}
				else {
					list = (List<MeAssetCatCare>)QueryUtil.list(q,
							getDialect(), start, end);
				}

				cacheResult(list);

				FinderCacheUtil.putResult(finderPath, finderArgs, list);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
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
	@Override
	public MeAssetCatCare findByU_ACID_First(long userId, long assetCatId,
		OrderByComparator orderByComparator)
		throws NoSuchAssetCatCareException, SystemException {
		MeAssetCatCare meAssetCatCare = fetchByU_ACID_First(userId, assetCatId,
				orderByComparator);

		if (meAssetCatCare != null) {
			return meAssetCatCare;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("userId=");
		msg.append(userId);

		msg.append(", assetCatId=");
		msg.append(assetCatId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchAssetCatCareException(msg.toString());
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
	@Override
	public MeAssetCatCare fetchByU_ACID_First(long userId, long assetCatId,
		OrderByComparator orderByComparator) throws SystemException {
		List<MeAssetCatCare> list = findByU_ACID(userId, assetCatId, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public MeAssetCatCare findByU_ACID_Last(long userId, long assetCatId,
		OrderByComparator orderByComparator)
		throws NoSuchAssetCatCareException, SystemException {
		MeAssetCatCare meAssetCatCare = fetchByU_ACID_Last(userId, assetCatId,
				orderByComparator);

		if (meAssetCatCare != null) {
			return meAssetCatCare;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("userId=");
		msg.append(userId);

		msg.append(", assetCatId=");
		msg.append(assetCatId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchAssetCatCareException(msg.toString());
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
	@Override
	public MeAssetCatCare fetchByU_ACID_Last(long userId, long assetCatId,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByU_ACID(userId, assetCatId);

		if (count == 0) {
			return null;
		}

		List<MeAssetCatCare> list = findByU_ACID(userId, assetCatId, count - 1,
				count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public MeAssetCatCare[] findByU_ACID_PrevAndNext(long assetCatCareId,
		long userId, long assetCatId, OrderByComparator orderByComparator)
		throws NoSuchAssetCatCareException, SystemException {
		MeAssetCatCare meAssetCatCare = findByPrimaryKey(assetCatCareId);

		Session session = null;

		try {
			session = openSession();

			MeAssetCatCare[] array = new MeAssetCatCareImpl[3];

			array[0] = getByU_ACID_PrevAndNext(session, meAssetCatCare, userId,
					assetCatId, orderByComparator, true);

			array[1] = meAssetCatCare;

			array[2] = getByU_ACID_PrevAndNext(session, meAssetCatCare, userId,
					assetCatId, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected MeAssetCatCare getByU_ACID_PrevAndNext(Session session,
		MeAssetCatCare meAssetCatCare, long userId, long assetCatId,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_MEASSETCATCARE_WHERE);

		query.append(_FINDER_COLUMN_U_ACID_USERID_2);

		query.append(_FINDER_COLUMN_U_ACID_ASSETCATID_2);

		if (orderByComparator != null) {
			String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				query.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						query.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN);
					}
					else {
						query.append(WHERE_LESSER_THAN);
					}
				}
			}

			query.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						query.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC);
					}
					else {
						query.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			query.append(MeAssetCatCareModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(userId);

		qPos.add(assetCatId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(meAssetCatCare);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<MeAssetCatCare> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the me asset cat cares where userId = &#63; and assetCatId = &#63; from the database.
	 *
	 * @param userId the user ID
	 * @param assetCatId the asset cat ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByU_ACID(long userId, long assetCatId)
		throws SystemException {
		for (MeAssetCatCare meAssetCatCare : findByU_ACID(userId, assetCatId,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(meAssetCatCare);
		}
	}

	/**
	 * Returns the number of me asset cat cares where userId = &#63; and assetCatId = &#63;.
	 *
	 * @param userId the user ID
	 * @param assetCatId the asset cat ID
	 * @return the number of matching me asset cat cares
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByU_ACID(long userId, long assetCatId)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_U_ACID;

		Object[] finderArgs = new Object[] { userId, assetCatId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_MEASSETCATCARE_WHERE);

			query.append(_FINDER_COLUMN_U_ACID_USERID_2);

			query.append(_FINDER_COLUMN_U_ACID_ASSETCATID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(userId);

				qPos.add(assetCatId);

				count = (Long)q.uniqueResult();

				FinderCacheUtil.putResult(finderPath, finderArgs, count);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_U_ACID_USERID_2 = "meAssetCatCare.userId = ? AND ";
	private static final String _FINDER_COLUMN_U_ACID_ASSETCATID_2 = "meAssetCatCare.assetCatId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_USERID = new FinderPath(MeAssetCatCareModelImpl.ENTITY_CACHE_ENABLED,
			MeAssetCatCareModelImpl.FINDER_CACHE_ENABLED,
			MeAssetCatCareImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByUserId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_USERID =
		new FinderPath(MeAssetCatCareModelImpl.ENTITY_CACHE_ENABLED,
			MeAssetCatCareModelImpl.FINDER_CACHE_ENABLED,
			MeAssetCatCareImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByUserId",
			new String[] { Long.class.getName() },
			MeAssetCatCareModelImpl.USERID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_USERID = new FinderPath(MeAssetCatCareModelImpl.ENTITY_CACHE_ENABLED,
			MeAssetCatCareModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUserId",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the me asset cat cares where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @return the matching me asset cat cares
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<MeAssetCatCare> findByUserId(long userId)
		throws SystemException {
		return findByUserId(userId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<MeAssetCatCare> findByUserId(long userId, int start, int end)
		throws SystemException {
		return findByUserId(userId, start, end, null);
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
	@Override
	public List<MeAssetCatCare> findByUserId(long userId, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_USERID;
			finderArgs = new Object[] { userId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_USERID;
			finderArgs = new Object[] { userId, start, end, orderByComparator };
		}

		List<MeAssetCatCare> list = (List<MeAssetCatCare>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (MeAssetCatCare meAssetCatCare : list) {
				if ((userId != meAssetCatCare.getUserId())) {
					list = null;

					break;
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(3 +
						(orderByComparator.getOrderByFields().length * 3));
			}
			else {
				query = new StringBundler(3);
			}

			query.append(_SQL_SELECT_MEASSETCATCARE_WHERE);

			query.append(_FINDER_COLUMN_USERID_USERID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(MeAssetCatCareModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(userId);

				if (!pagination) {
					list = (List<MeAssetCatCare>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<MeAssetCatCare>(list);
				}
				else {
					list = (List<MeAssetCatCare>)QueryUtil.list(q,
							getDialect(), start, end);
				}

				cacheResult(list);

				FinderCacheUtil.putResult(finderPath, finderArgs, list);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
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
	@Override
	public MeAssetCatCare findByUserId_First(long userId,
		OrderByComparator orderByComparator)
		throws NoSuchAssetCatCareException, SystemException {
		MeAssetCatCare meAssetCatCare = fetchByUserId_First(userId,
				orderByComparator);

		if (meAssetCatCare != null) {
			return meAssetCatCare;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("userId=");
		msg.append(userId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchAssetCatCareException(msg.toString());
	}

	/**
	 * Returns the first me asset cat care in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching me asset cat care, or <code>null</code> if a matching me asset cat care could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MeAssetCatCare fetchByUserId_First(long userId,
		OrderByComparator orderByComparator) throws SystemException {
		List<MeAssetCatCare> list = findByUserId(userId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public MeAssetCatCare findByUserId_Last(long userId,
		OrderByComparator orderByComparator)
		throws NoSuchAssetCatCareException, SystemException {
		MeAssetCatCare meAssetCatCare = fetchByUserId_Last(userId,
				orderByComparator);

		if (meAssetCatCare != null) {
			return meAssetCatCare;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("userId=");
		msg.append(userId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchAssetCatCareException(msg.toString());
	}

	/**
	 * Returns the last me asset cat care in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching me asset cat care, or <code>null</code> if a matching me asset cat care could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MeAssetCatCare fetchByUserId_Last(long userId,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByUserId(userId);

		if (count == 0) {
			return null;
		}

		List<MeAssetCatCare> list = findByUserId(userId, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public MeAssetCatCare[] findByUserId_PrevAndNext(long assetCatCareId,
		long userId, OrderByComparator orderByComparator)
		throws NoSuchAssetCatCareException, SystemException {
		MeAssetCatCare meAssetCatCare = findByPrimaryKey(assetCatCareId);

		Session session = null;

		try {
			session = openSession();

			MeAssetCatCare[] array = new MeAssetCatCareImpl[3];

			array[0] = getByUserId_PrevAndNext(session, meAssetCatCare, userId,
					orderByComparator, true);

			array[1] = meAssetCatCare;

			array[2] = getByUserId_PrevAndNext(session, meAssetCatCare, userId,
					orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected MeAssetCatCare getByUserId_PrevAndNext(Session session,
		MeAssetCatCare meAssetCatCare, long userId,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_MEASSETCATCARE_WHERE);

		query.append(_FINDER_COLUMN_USERID_USERID_2);

		if (orderByComparator != null) {
			String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				query.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						query.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN);
					}
					else {
						query.append(WHERE_LESSER_THAN);
					}
				}
			}

			query.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						query.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC);
					}
					else {
						query.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			query.append(MeAssetCatCareModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(userId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(meAssetCatCare);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<MeAssetCatCare> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the me asset cat cares where userId = &#63; from the database.
	 *
	 * @param userId the user ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByUserId(long userId) throws SystemException {
		for (MeAssetCatCare meAssetCatCare : findByUserId(userId,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(meAssetCatCare);
		}
	}

	/**
	 * Returns the number of me asset cat cares where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @return the number of matching me asset cat cares
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByUserId(long userId) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_USERID;

		Object[] finderArgs = new Object[] { userId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_MEASSETCATCARE_WHERE);

			query.append(_FINDER_COLUMN_USERID_USERID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(userId);

				count = (Long)q.uniqueResult();

				FinderCacheUtil.putResult(finderPath, finderArgs, count);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_USERID_USERID_2 = "meAssetCatCare.userId = ?";

	public MeAssetCatCarePersistenceImpl() {
		setModelClass(MeAssetCatCare.class);
	}

	/**
	 * Caches the me asset cat care in the entity cache if it is enabled.
	 *
	 * @param meAssetCatCare the me asset cat care
	 */
	@Override
	public void cacheResult(MeAssetCatCare meAssetCatCare) {
		EntityCacheUtil.putResult(MeAssetCatCareModelImpl.ENTITY_CACHE_ENABLED,
			MeAssetCatCareImpl.class, meAssetCatCare.getPrimaryKey(),
			meAssetCatCare);

		FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_UUID_G,
			new Object[] { meAssetCatCare.getUuid(), meAssetCatCare.getGroupId() },
			meAssetCatCare);

		meAssetCatCare.resetOriginalValues();
	}

	/**
	 * Caches the me asset cat cares in the entity cache if it is enabled.
	 *
	 * @param meAssetCatCares the me asset cat cares
	 */
	@Override
	public void cacheResult(List<MeAssetCatCare> meAssetCatCares) {
		for (MeAssetCatCare meAssetCatCare : meAssetCatCares) {
			if (EntityCacheUtil.getResult(
						MeAssetCatCareModelImpl.ENTITY_CACHE_ENABLED,
						MeAssetCatCareImpl.class, meAssetCatCare.getPrimaryKey()) == null) {
				cacheResult(meAssetCatCare);
			}
			else {
				meAssetCatCare.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all me asset cat cares.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(MeAssetCatCareImpl.class.getName());
		}

		EntityCacheUtil.clearCache(MeAssetCatCareImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the me asset cat care.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(MeAssetCatCare meAssetCatCare) {
		EntityCacheUtil.removeResult(MeAssetCatCareModelImpl.ENTITY_CACHE_ENABLED,
			MeAssetCatCareImpl.class, meAssetCatCare.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		clearUniqueFindersCache(meAssetCatCare);
	}

	@Override
	public void clearCache(List<MeAssetCatCare> meAssetCatCares) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (MeAssetCatCare meAssetCatCare : meAssetCatCares) {
			EntityCacheUtil.removeResult(MeAssetCatCareModelImpl.ENTITY_CACHE_ENABLED,
				MeAssetCatCareImpl.class, meAssetCatCare.getPrimaryKey());

			clearUniqueFindersCache(meAssetCatCare);
		}
	}

	protected void cacheUniqueFindersCache(MeAssetCatCare meAssetCatCare) {
		if (meAssetCatCare.isNew()) {
			Object[] args = new Object[] {
					meAssetCatCare.getUuid(), meAssetCatCare.getGroupId()
				};

			FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_UUID_G, args,
				Long.valueOf(1));
			FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_UUID_G, args,
				meAssetCatCare);
		}
		else {
			MeAssetCatCareModelImpl meAssetCatCareModelImpl = (MeAssetCatCareModelImpl)meAssetCatCare;

			if ((meAssetCatCareModelImpl.getColumnBitmask() &
					FINDER_PATH_FETCH_BY_UUID_G.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						meAssetCatCare.getUuid(), meAssetCatCare.getGroupId()
					};

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_UUID_G, args,
					Long.valueOf(1));
				FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_UUID_G, args,
					meAssetCatCare);
			}
		}
	}

	protected void clearUniqueFindersCache(MeAssetCatCare meAssetCatCare) {
		MeAssetCatCareModelImpl meAssetCatCareModelImpl = (MeAssetCatCareModelImpl)meAssetCatCare;

		Object[] args = new Object[] {
				meAssetCatCare.getUuid(), meAssetCatCare.getGroupId()
			};

		FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_UUID_G, args);
		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_UUID_G, args);

		if ((meAssetCatCareModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_UUID_G.getColumnBitmask()) != 0) {
			args = new Object[] {
					meAssetCatCareModelImpl.getOriginalUuid(),
					meAssetCatCareModelImpl.getOriginalGroupId()
				};

			FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_UUID_G, args);
			FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_UUID_G, args);
		}
	}

	/**
	 * Creates a new me asset cat care with the primary key. Does not add the me asset cat care to the database.
	 *
	 * @param assetCatCareId the primary key for the new me asset cat care
	 * @return the new me asset cat care
	 */
	@Override
	public MeAssetCatCare create(long assetCatCareId) {
		MeAssetCatCare meAssetCatCare = new MeAssetCatCareImpl();

		meAssetCatCare.setNew(true);
		meAssetCatCare.setPrimaryKey(assetCatCareId);

		String uuid = PortalUUIDUtil.generate();

		meAssetCatCare.setUuid(uuid);

		return meAssetCatCare;
	}

	/**
	 * Removes the me asset cat care with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param assetCatCareId the primary key of the me asset cat care
	 * @return the me asset cat care that was removed
	 * @throws com.j2eecn.mcat.NoSuchAssetCatCareException if a me asset cat care with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MeAssetCatCare remove(long assetCatCareId)
		throws NoSuchAssetCatCareException, SystemException {
		return remove((Serializable)assetCatCareId);
	}

	/**
	 * Removes the me asset cat care with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the me asset cat care
	 * @return the me asset cat care that was removed
	 * @throws com.j2eecn.mcat.NoSuchAssetCatCareException if a me asset cat care with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MeAssetCatCare remove(Serializable primaryKey)
		throws NoSuchAssetCatCareException, SystemException {
		Session session = null;

		try {
			session = openSession();

			MeAssetCatCare meAssetCatCare = (MeAssetCatCare)session.get(MeAssetCatCareImpl.class,
					primaryKey);

			if (meAssetCatCare == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchAssetCatCareException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(meAssetCatCare);
		}
		catch (NoSuchAssetCatCareException nsee) {
			throw nsee;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	@Override
	protected MeAssetCatCare removeImpl(MeAssetCatCare meAssetCatCare)
		throws SystemException {
		meAssetCatCare = toUnwrappedModel(meAssetCatCare);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(meAssetCatCare)) {
				meAssetCatCare = (MeAssetCatCare)session.get(MeAssetCatCareImpl.class,
						meAssetCatCare.getPrimaryKeyObj());
			}

			if (meAssetCatCare != null) {
				session.delete(meAssetCatCare);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (meAssetCatCare != null) {
			clearCache(meAssetCatCare);
		}

		return meAssetCatCare;
	}

	@Override
	public MeAssetCatCare updateImpl(
		com.j2eecn.mcat.model.MeAssetCatCare meAssetCatCare)
		throws SystemException {
		meAssetCatCare = toUnwrappedModel(meAssetCatCare);

		boolean isNew = meAssetCatCare.isNew();

		MeAssetCatCareModelImpl meAssetCatCareModelImpl = (MeAssetCatCareModelImpl)meAssetCatCare;

		if (Validator.isNull(meAssetCatCare.getUuid())) {
			String uuid = PortalUUIDUtil.generate();

			meAssetCatCare.setUuid(uuid);
		}

		Session session = null;

		try {
			session = openSession();

			if (meAssetCatCare.isNew()) {
				session.save(meAssetCatCare);

				meAssetCatCare.setNew(false);
			}
			else {
				session.merge(meAssetCatCare);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !MeAssetCatCareModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((meAssetCatCareModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						meAssetCatCareModelImpl.getOriginalUuid()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_UUID, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID,
					args);

				args = new Object[] { meAssetCatCareModelImpl.getUuid() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_UUID, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID,
					args);
			}

			if ((meAssetCatCareModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						meAssetCatCareModelImpl.getOriginalUuid(),
						meAssetCatCareModelImpl.getOriginalCompanyId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_UUID_C, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C,
					args);

				args = new Object[] {
						meAssetCatCareModelImpl.getUuid(),
						meAssetCatCareModelImpl.getCompanyId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_UUID_C, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C,
					args);
			}

			if ((meAssetCatCareModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_U_ACID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						meAssetCatCareModelImpl.getOriginalUserId(),
						meAssetCatCareModelImpl.getOriginalAssetCatId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_U_ACID, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_U_ACID,
					args);

				args = new Object[] {
						meAssetCatCareModelImpl.getUserId(),
						meAssetCatCareModelImpl.getAssetCatId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_U_ACID, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_U_ACID,
					args);
			}

			if ((meAssetCatCareModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_USERID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						meAssetCatCareModelImpl.getOriginalUserId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_USERID, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_USERID,
					args);

				args = new Object[] { meAssetCatCareModelImpl.getUserId() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_USERID, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_USERID,
					args);
			}
		}

		EntityCacheUtil.putResult(MeAssetCatCareModelImpl.ENTITY_CACHE_ENABLED,
			MeAssetCatCareImpl.class, meAssetCatCare.getPrimaryKey(),
			meAssetCatCare);

		clearUniqueFindersCache(meAssetCatCare);
		cacheUniqueFindersCache(meAssetCatCare);

		return meAssetCatCare;
	}

	protected MeAssetCatCare toUnwrappedModel(MeAssetCatCare meAssetCatCare) {
		if (meAssetCatCare instanceof MeAssetCatCareImpl) {
			return meAssetCatCare;
		}

		MeAssetCatCareImpl meAssetCatCareImpl = new MeAssetCatCareImpl();

		meAssetCatCareImpl.setNew(meAssetCatCare.isNew());
		meAssetCatCareImpl.setPrimaryKey(meAssetCatCare.getPrimaryKey());

		meAssetCatCareImpl.setUuid(meAssetCatCare.getUuid());
		meAssetCatCareImpl.setAssetCatCareId(meAssetCatCare.getAssetCatCareId());
		meAssetCatCareImpl.setGroupId(meAssetCatCare.getGroupId());
		meAssetCatCareImpl.setCompanyId(meAssetCatCare.getCompanyId());
		meAssetCatCareImpl.setUserId(meAssetCatCare.getUserId());
		meAssetCatCareImpl.setUserName(meAssetCatCare.getUserName());
		meAssetCatCareImpl.setCreateDate(meAssetCatCare.getCreateDate());
		meAssetCatCareImpl.setModifiedDate(meAssetCatCare.getModifiedDate());
		meAssetCatCareImpl.setAssetCatId(meAssetCatCare.getAssetCatId());

		return meAssetCatCareImpl;
	}

	/**
	 * Returns the me asset cat care with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the me asset cat care
	 * @return the me asset cat care
	 * @throws com.j2eecn.mcat.NoSuchAssetCatCareException if a me asset cat care with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MeAssetCatCare findByPrimaryKey(Serializable primaryKey)
		throws NoSuchAssetCatCareException, SystemException {
		MeAssetCatCare meAssetCatCare = fetchByPrimaryKey(primaryKey);

		if (meAssetCatCare == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchAssetCatCareException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return meAssetCatCare;
	}

	/**
	 * Returns the me asset cat care with the primary key or throws a {@link com.j2eecn.mcat.NoSuchAssetCatCareException} if it could not be found.
	 *
	 * @param assetCatCareId the primary key of the me asset cat care
	 * @return the me asset cat care
	 * @throws com.j2eecn.mcat.NoSuchAssetCatCareException if a me asset cat care with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MeAssetCatCare findByPrimaryKey(long assetCatCareId)
		throws NoSuchAssetCatCareException, SystemException {
		return findByPrimaryKey((Serializable)assetCatCareId);
	}

	/**
	 * Returns the me asset cat care with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the me asset cat care
	 * @return the me asset cat care, or <code>null</code> if a me asset cat care with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MeAssetCatCare fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		MeAssetCatCare meAssetCatCare = (MeAssetCatCare)EntityCacheUtil.getResult(MeAssetCatCareModelImpl.ENTITY_CACHE_ENABLED,
				MeAssetCatCareImpl.class, primaryKey);

		if (meAssetCatCare == _nullMeAssetCatCare) {
			return null;
		}

		if (meAssetCatCare == null) {
			Session session = null;

			try {
				session = openSession();

				meAssetCatCare = (MeAssetCatCare)session.get(MeAssetCatCareImpl.class,
						primaryKey);

				if (meAssetCatCare != null) {
					cacheResult(meAssetCatCare);
				}
				else {
					EntityCacheUtil.putResult(MeAssetCatCareModelImpl.ENTITY_CACHE_ENABLED,
						MeAssetCatCareImpl.class, primaryKey,
						_nullMeAssetCatCare);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(MeAssetCatCareModelImpl.ENTITY_CACHE_ENABLED,
					MeAssetCatCareImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return meAssetCatCare;
	}

	/**
	 * Returns the me asset cat care with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param assetCatCareId the primary key of the me asset cat care
	 * @return the me asset cat care, or <code>null</code> if a me asset cat care with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MeAssetCatCare fetchByPrimaryKey(long assetCatCareId)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)assetCatCareId);
	}

	/**
	 * Returns all the me asset cat cares.
	 *
	 * @return the me asset cat cares
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<MeAssetCatCare> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<MeAssetCatCare> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
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
	@Override
	public List<MeAssetCatCare> findAll(int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL;
			finderArgs = FINDER_ARGS_EMPTY;
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_ALL;
			finderArgs = new Object[] { start, end, orderByComparator };
		}

		List<MeAssetCatCare> list = (List<MeAssetCatCare>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_MEASSETCATCARE);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_MEASSETCATCARE;

				if (pagination) {
					sql = sql.concat(MeAssetCatCareModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<MeAssetCatCare>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<MeAssetCatCare>(list);
				}
				else {
					list = (List<MeAssetCatCare>)QueryUtil.list(q,
							getDialect(), start, end);
				}

				cacheResult(list);

				FinderCacheUtil.putResult(finderPath, finderArgs, list);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Removes all the me asset cat cares from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (MeAssetCatCare meAssetCatCare : findAll()) {
			remove(meAssetCatCare);
		}
	}

	/**
	 * Returns the number of me asset cat cares.
	 *
	 * @return the number of me asset cat cares
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countAll() throws SystemException {
		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_MEASSETCATCARE);

				count = (Long)q.uniqueResult();

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_ALL,
					FINDER_ARGS_EMPTY, count);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_ALL,
					FINDER_ARGS_EMPTY);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	@Override
	protected Set<String> getBadColumnNames() {
		return _badColumnNames;
	}

	/**
	 * Initializes the me asset cat care persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.j2eecn.mcat.model.MeAssetCatCare")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<MeAssetCatCare>> listenersList = new ArrayList<ModelListener<MeAssetCatCare>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<MeAssetCatCare>)InstanceFactory.newInstance(
							getClassLoader(), listenerClassName));
				}

				listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
			}
			catch (Exception e) {
				_log.error(e);
			}
		}
	}

	public void destroy() {
		EntityCacheUtil.removeCache(MeAssetCatCareImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_MEASSETCATCARE = "SELECT meAssetCatCare FROM MeAssetCatCare meAssetCatCare";
	private static final String _SQL_SELECT_MEASSETCATCARE_WHERE = "SELECT meAssetCatCare FROM MeAssetCatCare meAssetCatCare WHERE ";
	private static final String _SQL_COUNT_MEASSETCATCARE = "SELECT COUNT(meAssetCatCare) FROM MeAssetCatCare meAssetCatCare";
	private static final String _SQL_COUNT_MEASSETCATCARE_WHERE = "SELECT COUNT(meAssetCatCare) FROM MeAssetCatCare meAssetCatCare WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "meAssetCatCare.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No MeAssetCatCare exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No MeAssetCatCare exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(MeAssetCatCarePersistenceImpl.class);
	private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"uuid"
			});
	private static MeAssetCatCare _nullMeAssetCatCare = new MeAssetCatCareImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<MeAssetCatCare> toCacheModel() {
				return _nullMeAssetCatCareCacheModel;
			}
		};

	private static CacheModel<MeAssetCatCare> _nullMeAssetCatCareCacheModel = new CacheModel<MeAssetCatCare>() {
			@Override
			public MeAssetCatCare toEntityModel() {
				return _nullMeAssetCatCare;
			}
		};
}