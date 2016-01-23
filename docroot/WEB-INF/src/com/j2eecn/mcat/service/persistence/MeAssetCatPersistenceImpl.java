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

import com.j2eecn.mcat.NoSuchAssetCatException;
import com.j2eecn.mcat.model.MeAssetCat;
import com.j2eecn.mcat.model.impl.MeAssetCatImpl;
import com.j2eecn.mcat.model.impl.MeAssetCatModelImpl;

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
 * The persistence implementation for the me asset cat service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Administrator
 * @see MeAssetCatPersistence
 * @see MeAssetCatUtil
 * @generated
 */
public class MeAssetCatPersistenceImpl extends BasePersistenceImpl<MeAssetCat>
	implements MeAssetCatPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link MeAssetCatUtil} to access the me asset cat persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = MeAssetCatImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(MeAssetCatModelImpl.ENTITY_CACHE_ENABLED,
			MeAssetCatModelImpl.FINDER_CACHE_ENABLED, MeAssetCatImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(MeAssetCatModelImpl.ENTITY_CACHE_ENABLED,
			MeAssetCatModelImpl.FINDER_CACHE_ENABLED, MeAssetCatImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(MeAssetCatModelImpl.ENTITY_CACHE_ENABLED,
			MeAssetCatModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_UUID = new FinderPath(MeAssetCatModelImpl.ENTITY_CACHE_ENABLED,
			MeAssetCatModelImpl.FINDER_CACHE_ENABLED, MeAssetCatImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByUuid",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID = new FinderPath(MeAssetCatModelImpl.ENTITY_CACHE_ENABLED,
			MeAssetCatModelImpl.FINDER_CACHE_ENABLED, MeAssetCatImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByUuid",
			new String[] { String.class.getName() },
			MeAssetCatModelImpl.UUID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_UUID = new FinderPath(MeAssetCatModelImpl.ENTITY_CACHE_ENABLED,
			MeAssetCatModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUuid",
			new String[] { String.class.getName() });

	/**
	 * Returns all the me asset cats where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching me asset cats
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<MeAssetCat> findByUuid(String uuid) throws SystemException {
		return findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

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
	@Override
	public List<MeAssetCat> findByUuid(String uuid, int start, int end)
		throws SystemException {
		return findByUuid(uuid, start, end, null);
	}

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
	@Override
	public List<MeAssetCat> findByUuid(String uuid, int start, int end,
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

		List<MeAssetCat> list = (List<MeAssetCat>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (MeAssetCat meAssetCat : list) {
				if (!Validator.equals(uuid, meAssetCat.getUuid())) {
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

			query.append(_SQL_SELECT_MEASSETCAT_WHERE);

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
				query.append(MeAssetCatModelImpl.ORDER_BY_JPQL);
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
					list = (List<MeAssetCat>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<MeAssetCat>(list);
				}
				else {
					list = (List<MeAssetCat>)QueryUtil.list(q, getDialect(),
							start, end);
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
	 * Returns the first me asset cat in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching me asset cat
	 * @throws com.j2eecn.mcat.NoSuchAssetCatException if a matching me asset cat could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MeAssetCat findByUuid_First(String uuid,
		OrderByComparator orderByComparator)
		throws NoSuchAssetCatException, SystemException {
		MeAssetCat meAssetCat = fetchByUuid_First(uuid, orderByComparator);

		if (meAssetCat != null) {
			return meAssetCat;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("uuid=");
		msg.append(uuid);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchAssetCatException(msg.toString());
	}

	/**
	 * Returns the first me asset cat in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching me asset cat, or <code>null</code> if a matching me asset cat could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MeAssetCat fetchByUuid_First(String uuid,
		OrderByComparator orderByComparator) throws SystemException {
		List<MeAssetCat> list = findByUuid(uuid, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last me asset cat in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching me asset cat
	 * @throws com.j2eecn.mcat.NoSuchAssetCatException if a matching me asset cat could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MeAssetCat findByUuid_Last(String uuid,
		OrderByComparator orderByComparator)
		throws NoSuchAssetCatException, SystemException {
		MeAssetCat meAssetCat = fetchByUuid_Last(uuid, orderByComparator);

		if (meAssetCat != null) {
			return meAssetCat;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("uuid=");
		msg.append(uuid);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchAssetCatException(msg.toString());
	}

	/**
	 * Returns the last me asset cat in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching me asset cat, or <code>null</code> if a matching me asset cat could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MeAssetCat fetchByUuid_Last(String uuid,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByUuid(uuid);

		if (count == 0) {
			return null;
		}

		List<MeAssetCat> list = findByUuid(uuid, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

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
	@Override
	public MeAssetCat[] findByUuid_PrevAndNext(long assetCatId, String uuid,
		OrderByComparator orderByComparator)
		throws NoSuchAssetCatException, SystemException {
		MeAssetCat meAssetCat = findByPrimaryKey(assetCatId);

		Session session = null;

		try {
			session = openSession();

			MeAssetCat[] array = new MeAssetCatImpl[3];

			array[0] = getByUuid_PrevAndNext(session, meAssetCat, uuid,
					orderByComparator, true);

			array[1] = meAssetCat;

			array[2] = getByUuid_PrevAndNext(session, meAssetCat, uuid,
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

	protected MeAssetCat getByUuid_PrevAndNext(Session session,
		MeAssetCat meAssetCat, String uuid,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_MEASSETCAT_WHERE);

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
			query.append(MeAssetCatModelImpl.ORDER_BY_JPQL);
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
			Object[] values = orderByComparator.getOrderByConditionValues(meAssetCat);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<MeAssetCat> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the me asset cats where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByUuid(String uuid) throws SystemException {
		for (MeAssetCat meAssetCat : findByUuid(uuid, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(meAssetCat);
		}
	}

	/**
	 * Returns the number of me asset cats where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching me asset cats
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

			query.append(_SQL_COUNT_MEASSETCAT_WHERE);

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

	private static final String _FINDER_COLUMN_UUID_UUID_1 = "meAssetCat.uuid IS NULL";
	private static final String _FINDER_COLUMN_UUID_UUID_2 = "meAssetCat.uuid = ?";
	private static final String _FINDER_COLUMN_UUID_UUID_3 = "(meAssetCat.uuid IS NULL OR meAssetCat.uuid = '')";
	public static final FinderPath FINDER_PATH_FETCH_BY_UUID_G = new FinderPath(MeAssetCatModelImpl.ENTITY_CACHE_ENABLED,
			MeAssetCatModelImpl.FINDER_CACHE_ENABLED, MeAssetCatImpl.class,
			FINDER_CLASS_NAME_ENTITY, "fetchByUUID_G",
			new String[] { String.class.getName(), Long.class.getName() },
			MeAssetCatModelImpl.UUID_COLUMN_BITMASK |
			MeAssetCatModelImpl.GROUPID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_UUID_G = new FinderPath(MeAssetCatModelImpl.ENTITY_CACHE_ENABLED,
			MeAssetCatModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUUID_G",
			new String[] { String.class.getName(), Long.class.getName() });

	/**
	 * Returns the me asset cat where uuid = &#63; and groupId = &#63; or throws a {@link com.j2eecn.mcat.NoSuchAssetCatException} if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching me asset cat
	 * @throws com.j2eecn.mcat.NoSuchAssetCatException if a matching me asset cat could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MeAssetCat findByUUID_G(String uuid, long groupId)
		throws NoSuchAssetCatException, SystemException {
		MeAssetCat meAssetCat = fetchByUUID_G(uuid, groupId);

		if (meAssetCat == null) {
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

			throw new NoSuchAssetCatException(msg.toString());
		}

		return meAssetCat;
	}

	/**
	 * Returns the me asset cat where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching me asset cat, or <code>null</code> if a matching me asset cat could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MeAssetCat fetchByUUID_G(String uuid, long groupId)
		throws SystemException {
		return fetchByUUID_G(uuid, groupId, true);
	}

	/**
	 * Returns the me asset cat where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param retrieveFromCache whether to use the finder cache
	 * @return the matching me asset cat, or <code>null</code> if a matching me asset cat could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MeAssetCat fetchByUUID_G(String uuid, long groupId,
		boolean retrieveFromCache) throws SystemException {
		Object[] finderArgs = new Object[] { uuid, groupId };

		Object result = null;

		if (retrieveFromCache) {
			result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_UUID_G,
					finderArgs, this);
		}

		if (result instanceof MeAssetCat) {
			MeAssetCat meAssetCat = (MeAssetCat)result;

			if (!Validator.equals(uuid, meAssetCat.getUuid()) ||
					(groupId != meAssetCat.getGroupId())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_SELECT_MEASSETCAT_WHERE);

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

				List<MeAssetCat> list = q.list();

				if (list.isEmpty()) {
					FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_UUID_G,
						finderArgs, list);
				}
				else {
					MeAssetCat meAssetCat = list.get(0);

					result = meAssetCat;

					cacheResult(meAssetCat);

					if ((meAssetCat.getUuid() == null) ||
							!meAssetCat.getUuid().equals(uuid) ||
							(meAssetCat.getGroupId() != groupId)) {
						FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_UUID_G,
							finderArgs, meAssetCat);
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
			return (MeAssetCat)result;
		}
	}

	/**
	 * Removes the me asset cat where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the me asset cat that was removed
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MeAssetCat removeByUUID_G(String uuid, long groupId)
		throws NoSuchAssetCatException, SystemException {
		MeAssetCat meAssetCat = findByUUID_G(uuid, groupId);

		return remove(meAssetCat);
	}

	/**
	 * Returns the number of me asset cats where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching me asset cats
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

			query.append(_SQL_COUNT_MEASSETCAT_WHERE);

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

	private static final String _FINDER_COLUMN_UUID_G_UUID_1 = "meAssetCat.uuid IS NULL AND ";
	private static final String _FINDER_COLUMN_UUID_G_UUID_2 = "meAssetCat.uuid = ? AND ";
	private static final String _FINDER_COLUMN_UUID_G_UUID_3 = "(meAssetCat.uuid IS NULL OR meAssetCat.uuid = '') AND ";
	private static final String _FINDER_COLUMN_UUID_G_GROUPID_2 = "meAssetCat.groupId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_UUID_C = new FinderPath(MeAssetCatModelImpl.ENTITY_CACHE_ENABLED,
			MeAssetCatModelImpl.FINDER_CACHE_ENABLED, MeAssetCatImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByUuid_C",
			new String[] {
				String.class.getName(), Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C =
		new FinderPath(MeAssetCatModelImpl.ENTITY_CACHE_ENABLED,
			MeAssetCatModelImpl.FINDER_CACHE_ENABLED, MeAssetCatImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByUuid_C",
			new String[] { String.class.getName(), Long.class.getName() },
			MeAssetCatModelImpl.UUID_COLUMN_BITMASK |
			MeAssetCatModelImpl.COMPANYID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_UUID_C = new FinderPath(MeAssetCatModelImpl.ENTITY_CACHE_ENABLED,
			MeAssetCatModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUuid_C",
			new String[] { String.class.getName(), Long.class.getName() });

	/**
	 * Returns all the me asset cats where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching me asset cats
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<MeAssetCat> findByUuid_C(String uuid, long companyId)
		throws SystemException {
		return findByUuid_C(uuid, companyId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

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
	@Override
	public List<MeAssetCat> findByUuid_C(String uuid, long companyId,
		int start, int end) throws SystemException {
		return findByUuid_C(uuid, companyId, start, end, null);
	}

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
	@Override
	public List<MeAssetCat> findByUuid_C(String uuid, long companyId,
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

		List<MeAssetCat> list = (List<MeAssetCat>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (MeAssetCat meAssetCat : list) {
				if (!Validator.equals(uuid, meAssetCat.getUuid()) ||
						(companyId != meAssetCat.getCompanyId())) {
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

			query.append(_SQL_SELECT_MEASSETCAT_WHERE);

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
				query.append(MeAssetCatModelImpl.ORDER_BY_JPQL);
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
					list = (List<MeAssetCat>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<MeAssetCat>(list);
				}
				else {
					list = (List<MeAssetCat>)QueryUtil.list(q, getDialect(),
							start, end);
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
	 * Returns the first me asset cat in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching me asset cat
	 * @throws com.j2eecn.mcat.NoSuchAssetCatException if a matching me asset cat could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MeAssetCat findByUuid_C_First(String uuid, long companyId,
		OrderByComparator orderByComparator)
		throws NoSuchAssetCatException, SystemException {
		MeAssetCat meAssetCat = fetchByUuid_C_First(uuid, companyId,
				orderByComparator);

		if (meAssetCat != null) {
			return meAssetCat;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("uuid=");
		msg.append(uuid);

		msg.append(", companyId=");
		msg.append(companyId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchAssetCatException(msg.toString());
	}

	/**
	 * Returns the first me asset cat in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching me asset cat, or <code>null</code> if a matching me asset cat could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MeAssetCat fetchByUuid_C_First(String uuid, long companyId,
		OrderByComparator orderByComparator) throws SystemException {
		List<MeAssetCat> list = findByUuid_C(uuid, companyId, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

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
	@Override
	public MeAssetCat findByUuid_C_Last(String uuid, long companyId,
		OrderByComparator orderByComparator)
		throws NoSuchAssetCatException, SystemException {
		MeAssetCat meAssetCat = fetchByUuid_C_Last(uuid, companyId,
				orderByComparator);

		if (meAssetCat != null) {
			return meAssetCat;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("uuid=");
		msg.append(uuid);

		msg.append(", companyId=");
		msg.append(companyId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchAssetCatException(msg.toString());
	}

	/**
	 * Returns the last me asset cat in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching me asset cat, or <code>null</code> if a matching me asset cat could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MeAssetCat fetchByUuid_C_Last(String uuid, long companyId,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByUuid_C(uuid, companyId);

		if (count == 0) {
			return null;
		}

		List<MeAssetCat> list = findByUuid_C(uuid, companyId, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

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
	@Override
	public MeAssetCat[] findByUuid_C_PrevAndNext(long assetCatId, String uuid,
		long companyId, OrderByComparator orderByComparator)
		throws NoSuchAssetCatException, SystemException {
		MeAssetCat meAssetCat = findByPrimaryKey(assetCatId);

		Session session = null;

		try {
			session = openSession();

			MeAssetCat[] array = new MeAssetCatImpl[3];

			array[0] = getByUuid_C_PrevAndNext(session, meAssetCat, uuid,
					companyId, orderByComparator, true);

			array[1] = meAssetCat;

			array[2] = getByUuid_C_PrevAndNext(session, meAssetCat, uuid,
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

	protected MeAssetCat getByUuid_C_PrevAndNext(Session session,
		MeAssetCat meAssetCat, String uuid, long companyId,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_MEASSETCAT_WHERE);

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
			query.append(MeAssetCatModelImpl.ORDER_BY_JPQL);
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
			Object[] values = orderByComparator.getOrderByConditionValues(meAssetCat);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<MeAssetCat> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the me asset cats where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByUuid_C(String uuid, long companyId)
		throws SystemException {
		for (MeAssetCat meAssetCat : findByUuid_C(uuid, companyId,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(meAssetCat);
		}
	}

	/**
	 * Returns the number of me asset cats where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching me asset cats
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

			query.append(_SQL_COUNT_MEASSETCAT_WHERE);

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

	private static final String _FINDER_COLUMN_UUID_C_UUID_1 = "meAssetCat.uuid IS NULL AND ";
	private static final String _FINDER_COLUMN_UUID_C_UUID_2 = "meAssetCat.uuid = ? AND ";
	private static final String _FINDER_COLUMN_UUID_C_UUID_3 = "(meAssetCat.uuid IS NULL OR meAssetCat.uuid = '') AND ";
	private static final String _FINDER_COLUMN_UUID_C_COMPANYID_2 = "meAssetCat.companyId = ?";

	public MeAssetCatPersistenceImpl() {
		setModelClass(MeAssetCat.class);
	}

	/**
	 * Caches the me asset cat in the entity cache if it is enabled.
	 *
	 * @param meAssetCat the me asset cat
	 */
	@Override
	public void cacheResult(MeAssetCat meAssetCat) {
		EntityCacheUtil.putResult(MeAssetCatModelImpl.ENTITY_CACHE_ENABLED,
			MeAssetCatImpl.class, meAssetCat.getPrimaryKey(), meAssetCat);

		FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_UUID_G,
			new Object[] { meAssetCat.getUuid(), meAssetCat.getGroupId() },
			meAssetCat);

		meAssetCat.resetOriginalValues();
	}

	/**
	 * Caches the me asset cats in the entity cache if it is enabled.
	 *
	 * @param meAssetCats the me asset cats
	 */
	@Override
	public void cacheResult(List<MeAssetCat> meAssetCats) {
		for (MeAssetCat meAssetCat : meAssetCats) {
			if (EntityCacheUtil.getResult(
						MeAssetCatModelImpl.ENTITY_CACHE_ENABLED,
						MeAssetCatImpl.class, meAssetCat.getPrimaryKey()) == null) {
				cacheResult(meAssetCat);
			}
			else {
				meAssetCat.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all me asset cats.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(MeAssetCatImpl.class.getName());
		}

		EntityCacheUtil.clearCache(MeAssetCatImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the me asset cat.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(MeAssetCat meAssetCat) {
		EntityCacheUtil.removeResult(MeAssetCatModelImpl.ENTITY_CACHE_ENABLED,
			MeAssetCatImpl.class, meAssetCat.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		clearUniqueFindersCache(meAssetCat);
	}

	@Override
	public void clearCache(List<MeAssetCat> meAssetCats) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (MeAssetCat meAssetCat : meAssetCats) {
			EntityCacheUtil.removeResult(MeAssetCatModelImpl.ENTITY_CACHE_ENABLED,
				MeAssetCatImpl.class, meAssetCat.getPrimaryKey());

			clearUniqueFindersCache(meAssetCat);
		}
	}

	protected void cacheUniqueFindersCache(MeAssetCat meAssetCat) {
		if (meAssetCat.isNew()) {
			Object[] args = new Object[] {
					meAssetCat.getUuid(), meAssetCat.getGroupId()
				};

			FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_UUID_G, args,
				Long.valueOf(1));
			FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_UUID_G, args,
				meAssetCat);
		}
		else {
			MeAssetCatModelImpl meAssetCatModelImpl = (MeAssetCatModelImpl)meAssetCat;

			if ((meAssetCatModelImpl.getColumnBitmask() &
					FINDER_PATH_FETCH_BY_UUID_G.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						meAssetCat.getUuid(), meAssetCat.getGroupId()
					};

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_UUID_G, args,
					Long.valueOf(1));
				FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_UUID_G, args,
					meAssetCat);
			}
		}
	}

	protected void clearUniqueFindersCache(MeAssetCat meAssetCat) {
		MeAssetCatModelImpl meAssetCatModelImpl = (MeAssetCatModelImpl)meAssetCat;

		Object[] args = new Object[] {
				meAssetCat.getUuid(), meAssetCat.getGroupId()
			};

		FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_UUID_G, args);
		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_UUID_G, args);

		if ((meAssetCatModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_UUID_G.getColumnBitmask()) != 0) {
			args = new Object[] {
					meAssetCatModelImpl.getOriginalUuid(),
					meAssetCatModelImpl.getOriginalGroupId()
				};

			FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_UUID_G, args);
			FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_UUID_G, args);
		}
	}

	/**
	 * Creates a new me asset cat with the primary key. Does not add the me asset cat to the database.
	 *
	 * @param assetCatId the primary key for the new me asset cat
	 * @return the new me asset cat
	 */
	@Override
	public MeAssetCat create(long assetCatId) {
		MeAssetCat meAssetCat = new MeAssetCatImpl();

		meAssetCat.setNew(true);
		meAssetCat.setPrimaryKey(assetCatId);

		String uuid = PortalUUIDUtil.generate();

		meAssetCat.setUuid(uuid);

		return meAssetCat;
	}

	/**
	 * Removes the me asset cat with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param assetCatId the primary key of the me asset cat
	 * @return the me asset cat that was removed
	 * @throws com.j2eecn.mcat.NoSuchAssetCatException if a me asset cat with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MeAssetCat remove(long assetCatId)
		throws NoSuchAssetCatException, SystemException {
		return remove((Serializable)assetCatId);
	}

	/**
	 * Removes the me asset cat with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the me asset cat
	 * @return the me asset cat that was removed
	 * @throws com.j2eecn.mcat.NoSuchAssetCatException if a me asset cat with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MeAssetCat remove(Serializable primaryKey)
		throws NoSuchAssetCatException, SystemException {
		Session session = null;

		try {
			session = openSession();

			MeAssetCat meAssetCat = (MeAssetCat)session.get(MeAssetCatImpl.class,
					primaryKey);

			if (meAssetCat == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchAssetCatException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(meAssetCat);
		}
		catch (NoSuchAssetCatException nsee) {
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
	protected MeAssetCat removeImpl(MeAssetCat meAssetCat)
		throws SystemException {
		meAssetCat = toUnwrappedModel(meAssetCat);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(meAssetCat)) {
				meAssetCat = (MeAssetCat)session.get(MeAssetCatImpl.class,
						meAssetCat.getPrimaryKeyObj());
			}

			if (meAssetCat != null) {
				session.delete(meAssetCat);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (meAssetCat != null) {
			clearCache(meAssetCat);
		}

		return meAssetCat;
	}

	@Override
	public MeAssetCat updateImpl(com.j2eecn.mcat.model.MeAssetCat meAssetCat)
		throws SystemException {
		meAssetCat = toUnwrappedModel(meAssetCat);

		boolean isNew = meAssetCat.isNew();

		MeAssetCatModelImpl meAssetCatModelImpl = (MeAssetCatModelImpl)meAssetCat;

		if (Validator.isNull(meAssetCat.getUuid())) {
			String uuid = PortalUUIDUtil.generate();

			meAssetCat.setUuid(uuid);
		}

		Session session = null;

		try {
			session = openSession();

			if (meAssetCat.isNew()) {
				session.save(meAssetCat);

				meAssetCat.setNew(false);
			}
			else {
				session.merge(meAssetCat);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !MeAssetCatModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((meAssetCatModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						meAssetCatModelImpl.getOriginalUuid()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_UUID, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID,
					args);

				args = new Object[] { meAssetCatModelImpl.getUuid() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_UUID, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID,
					args);
			}

			if ((meAssetCatModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						meAssetCatModelImpl.getOriginalUuid(),
						meAssetCatModelImpl.getOriginalCompanyId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_UUID_C, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C,
					args);

				args = new Object[] {
						meAssetCatModelImpl.getUuid(),
						meAssetCatModelImpl.getCompanyId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_UUID_C, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C,
					args);
			}
		}

		EntityCacheUtil.putResult(MeAssetCatModelImpl.ENTITY_CACHE_ENABLED,
			MeAssetCatImpl.class, meAssetCat.getPrimaryKey(), meAssetCat);

		clearUniqueFindersCache(meAssetCat);
		cacheUniqueFindersCache(meAssetCat);

		return meAssetCat;
	}

	protected MeAssetCat toUnwrappedModel(MeAssetCat meAssetCat) {
		if (meAssetCat instanceof MeAssetCatImpl) {
			return meAssetCat;
		}

		MeAssetCatImpl meAssetCatImpl = new MeAssetCatImpl();

		meAssetCatImpl.setNew(meAssetCat.isNew());
		meAssetCatImpl.setPrimaryKey(meAssetCat.getPrimaryKey());

		meAssetCatImpl.setUuid(meAssetCat.getUuid());
		meAssetCatImpl.setAssetCatId(meAssetCat.getAssetCatId());
		meAssetCatImpl.setGroupId(meAssetCat.getGroupId());
		meAssetCatImpl.setCompanyId(meAssetCat.getCompanyId());
		meAssetCatImpl.setUserId(meAssetCat.getUserId());
		meAssetCatImpl.setUserName(meAssetCat.getUserName());
		meAssetCatImpl.setCreateDate(meAssetCat.getCreateDate());
		meAssetCatImpl.setModifiedDate(meAssetCat.getModifiedDate());
		meAssetCatImpl.setStatus(meAssetCat.getStatus());
		meAssetCatImpl.setStatusByUserId(meAssetCat.getStatusByUserId());
		meAssetCatImpl.setStatusByUserName(meAssetCat.getStatusByUserName());
		meAssetCatImpl.setStatusDate(meAssetCat.getStatusDate());
		meAssetCatImpl.setName(meAssetCat.getName());
		meAssetCatImpl.setDesc(meAssetCat.getDesc());
		meAssetCatImpl.setUseStatus(meAssetCat.getUseStatus());
		meAssetCatImpl.setCode(meAssetCat.getCode());
		meAssetCatImpl.setMngId(meAssetCat.getMngId());
		meAssetCatImpl.setMngName(meAssetCat.getMngName());
		meAssetCatImpl.setCodeAndName(meAssetCat.getCodeAndName());

		return meAssetCatImpl;
	}

	/**
	 * Returns the me asset cat with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the me asset cat
	 * @return the me asset cat
	 * @throws com.j2eecn.mcat.NoSuchAssetCatException if a me asset cat with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MeAssetCat findByPrimaryKey(Serializable primaryKey)
		throws NoSuchAssetCatException, SystemException {
		MeAssetCat meAssetCat = fetchByPrimaryKey(primaryKey);

		if (meAssetCat == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchAssetCatException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return meAssetCat;
	}

	/**
	 * Returns the me asset cat with the primary key or throws a {@link com.j2eecn.mcat.NoSuchAssetCatException} if it could not be found.
	 *
	 * @param assetCatId the primary key of the me asset cat
	 * @return the me asset cat
	 * @throws com.j2eecn.mcat.NoSuchAssetCatException if a me asset cat with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MeAssetCat findByPrimaryKey(long assetCatId)
		throws NoSuchAssetCatException, SystemException {
		return findByPrimaryKey((Serializable)assetCatId);
	}

	/**
	 * Returns the me asset cat with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the me asset cat
	 * @return the me asset cat, or <code>null</code> if a me asset cat with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MeAssetCat fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		MeAssetCat meAssetCat = (MeAssetCat)EntityCacheUtil.getResult(MeAssetCatModelImpl.ENTITY_CACHE_ENABLED,
				MeAssetCatImpl.class, primaryKey);

		if (meAssetCat == _nullMeAssetCat) {
			return null;
		}

		if (meAssetCat == null) {
			Session session = null;

			try {
				session = openSession();

				meAssetCat = (MeAssetCat)session.get(MeAssetCatImpl.class,
						primaryKey);

				if (meAssetCat != null) {
					cacheResult(meAssetCat);
				}
				else {
					EntityCacheUtil.putResult(MeAssetCatModelImpl.ENTITY_CACHE_ENABLED,
						MeAssetCatImpl.class, primaryKey, _nullMeAssetCat);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(MeAssetCatModelImpl.ENTITY_CACHE_ENABLED,
					MeAssetCatImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return meAssetCat;
	}

	/**
	 * Returns the me asset cat with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param assetCatId the primary key of the me asset cat
	 * @return the me asset cat, or <code>null</code> if a me asset cat with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MeAssetCat fetchByPrimaryKey(long assetCatId)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)assetCatId);
	}

	/**
	 * Returns all the me asset cats.
	 *
	 * @return the me asset cats
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<MeAssetCat> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	public List<MeAssetCat> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

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
	@Override
	public List<MeAssetCat> findAll(int start, int end,
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

		List<MeAssetCat> list = (List<MeAssetCat>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_MEASSETCAT);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_MEASSETCAT;

				if (pagination) {
					sql = sql.concat(MeAssetCatModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<MeAssetCat>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<MeAssetCat>(list);
				}
				else {
					list = (List<MeAssetCat>)QueryUtil.list(q, getDialect(),
							start, end);
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
	 * Removes all the me asset cats from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (MeAssetCat meAssetCat : findAll()) {
			remove(meAssetCat);
		}
	}

	/**
	 * Returns the number of me asset cats.
	 *
	 * @return the number of me asset cats
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

				Query q = session.createQuery(_SQL_COUNT_MEASSETCAT);

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
	 * Initializes the me asset cat persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.j2eecn.mcat.model.MeAssetCat")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<MeAssetCat>> listenersList = new ArrayList<ModelListener<MeAssetCat>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<MeAssetCat>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(MeAssetCatImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_MEASSETCAT = "SELECT meAssetCat FROM MeAssetCat meAssetCat";
	private static final String _SQL_SELECT_MEASSETCAT_WHERE = "SELECT meAssetCat FROM MeAssetCat meAssetCat WHERE ";
	private static final String _SQL_COUNT_MEASSETCAT = "SELECT COUNT(meAssetCat) FROM MeAssetCat meAssetCat";
	private static final String _SQL_COUNT_MEASSETCAT_WHERE = "SELECT COUNT(meAssetCat) FROM MeAssetCat meAssetCat WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "meAssetCat.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No MeAssetCat exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No MeAssetCat exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(MeAssetCatPersistenceImpl.class);
	private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"uuid", "desc", "code"
			});
	private static MeAssetCat _nullMeAssetCat = new MeAssetCatImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<MeAssetCat> toCacheModel() {
				return _nullMeAssetCatCacheModel;
			}
		};

	private static CacheModel<MeAssetCat> _nullMeAssetCatCacheModel = new CacheModel<MeAssetCat>() {
			@Override
			public MeAssetCat toEntityModel() {
				return _nullMeAssetCat;
			}
		};
}