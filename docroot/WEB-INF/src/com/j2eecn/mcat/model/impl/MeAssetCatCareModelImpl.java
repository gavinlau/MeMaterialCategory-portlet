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

package com.j2eecn.mcat.model.impl;

import com.j2eecn.mcat.model.MeAssetCatCare;
import com.j2eecn.mcat.model.MeAssetCatCareModel;
import com.j2eecn.mcat.model.MeAssetCatCareSoap;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.json.JSON;
import com.liferay.portal.kernel.lar.StagedModelType;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.util.PortalUtil;

import com.liferay.portlet.expando.model.ExpandoBridge;
import com.liferay.portlet.expando.util.ExpandoBridgeFactoryUtil;

import java.io.Serializable;

import java.sql.Types;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The base model implementation for the MeAssetCatCare service. Represents a row in the &quot;MeAssetCatCare&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link com.j2eecn.mcat.model.MeAssetCatCareModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link MeAssetCatCareImpl}.
 * </p>
 *
 * @author Administrator
 * @see MeAssetCatCareImpl
 * @see com.j2eecn.mcat.model.MeAssetCatCare
 * @see com.j2eecn.mcat.model.MeAssetCatCareModel
 * @generated
 */
@JSON(strict = true)
public class MeAssetCatCareModelImpl extends BaseModelImpl<MeAssetCatCare>
	implements MeAssetCatCareModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a me asset cat care model instance should use the {@link com.j2eecn.mcat.model.MeAssetCatCare} interface instead.
	 */
	public static final String TABLE_NAME = "MeAssetCatCare";
	public static final Object[][] TABLE_COLUMNS = {
			{ "uuid_", Types.VARCHAR },
			{ "assetCatCareId", Types.BIGINT },
			{ "groupId", Types.BIGINT },
			{ "companyId", Types.BIGINT },
			{ "userId", Types.BIGINT },
			{ "userName", Types.VARCHAR },
			{ "createDate", Types.TIMESTAMP },
			{ "modifiedDate", Types.TIMESTAMP },
			{ "assetCatId", Types.BIGINT }
		};
	public static final String TABLE_SQL_CREATE = "create table MeAssetCatCare (uuid_ VARCHAR(75) null,assetCatCareId LONG not null primary key,groupId LONG,companyId LONG,userId LONG,userName VARCHAR(75) null,createDate DATE null,modifiedDate DATE null,assetCatId LONG)";
	public static final String TABLE_SQL_DROP = "drop table MeAssetCatCare";
	public static final String ORDER_BY_JPQL = " ORDER BY meAssetCatCare.assetCatCareId ASC";
	public static final String ORDER_BY_SQL = " ORDER BY MeAssetCatCare.assetCatCareId ASC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.com.j2eecn.mcat.model.MeAssetCatCare"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.com.j2eecn.mcat.model.MeAssetCatCare"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.column.bitmask.enabled.com.j2eecn.mcat.model.MeAssetCatCare"),
			true);
	public static long ASSETCATID_COLUMN_BITMASK = 1L;
	public static long COMPANYID_COLUMN_BITMASK = 2L;
	public static long GROUPID_COLUMN_BITMASK = 4L;
	public static long USERID_COLUMN_BITMASK = 8L;
	public static long UUID_COLUMN_BITMASK = 16L;
	public static long ASSETCATCAREID_COLUMN_BITMASK = 32L;

	/**
	 * Converts the soap model instance into a normal model instance.
	 *
	 * @param soapModel the soap model instance to convert
	 * @return the normal model instance
	 */
	public static MeAssetCatCare toModel(MeAssetCatCareSoap soapModel) {
		if (soapModel == null) {
			return null;
		}

		MeAssetCatCare model = new MeAssetCatCareImpl();

		model.setUuid(soapModel.getUuid());
		model.setAssetCatCareId(soapModel.getAssetCatCareId());
		model.setGroupId(soapModel.getGroupId());
		model.setCompanyId(soapModel.getCompanyId());
		model.setUserId(soapModel.getUserId());
		model.setUserName(soapModel.getUserName());
		model.setCreateDate(soapModel.getCreateDate());
		model.setModifiedDate(soapModel.getModifiedDate());
		model.setAssetCatId(soapModel.getAssetCatId());

		return model;
	}

	/**
	 * Converts the soap model instances into normal model instances.
	 *
	 * @param soapModels the soap model instances to convert
	 * @return the normal model instances
	 */
	public static List<MeAssetCatCare> toModels(MeAssetCatCareSoap[] soapModels) {
		if (soapModels == null) {
			return null;
		}

		List<MeAssetCatCare> models = new ArrayList<MeAssetCatCare>(soapModels.length);

		for (MeAssetCatCareSoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.com.j2eecn.mcat.model.MeAssetCatCare"));

	public MeAssetCatCareModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _assetCatCareId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setAssetCatCareId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _assetCatCareId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return MeAssetCatCare.class;
	}

	@Override
	public String getModelClassName() {
		return MeAssetCatCare.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("assetCatCareId", getAssetCatCareId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("assetCatId", getAssetCatId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long assetCatCareId = (Long)attributes.get("assetCatCareId");

		if (assetCatCareId != null) {
			setAssetCatCareId(assetCatCareId);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		String userName = (String)attributes.get("userName");

		if (userName != null) {
			setUserName(userName);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}

		Long assetCatId = (Long)attributes.get("assetCatId");

		if (assetCatId != null) {
			setAssetCatId(assetCatId);
		}
	}

	@JSON
	@Override
	public String getUuid() {
		if (_uuid == null) {
			return StringPool.BLANK;
		}
		else {
			return _uuid;
		}
	}

	@Override
	public void setUuid(String uuid) {
		if (_originalUuid == null) {
			_originalUuid = _uuid;
		}

		_uuid = uuid;
	}

	public String getOriginalUuid() {
		return GetterUtil.getString(_originalUuid);
	}

	@JSON
	@Override
	public long getAssetCatCareId() {
		return _assetCatCareId;
	}

	@Override
	public void setAssetCatCareId(long assetCatCareId) {
		_assetCatCareId = assetCatCareId;
	}

	@JSON
	@Override
	public long getGroupId() {
		return _groupId;
	}

	@Override
	public void setGroupId(long groupId) {
		_columnBitmask |= GROUPID_COLUMN_BITMASK;

		if (!_setOriginalGroupId) {
			_setOriginalGroupId = true;

			_originalGroupId = _groupId;
		}

		_groupId = groupId;
	}

	public long getOriginalGroupId() {
		return _originalGroupId;
	}

	@JSON
	@Override
	public long getCompanyId() {
		return _companyId;
	}

	@Override
	public void setCompanyId(long companyId) {
		_columnBitmask |= COMPANYID_COLUMN_BITMASK;

		if (!_setOriginalCompanyId) {
			_setOriginalCompanyId = true;

			_originalCompanyId = _companyId;
		}

		_companyId = companyId;
	}

	public long getOriginalCompanyId() {
		return _originalCompanyId;
	}

	@JSON
	@Override
	public long getUserId() {
		return _userId;
	}

	@Override
	public void setUserId(long userId) {
		_columnBitmask |= USERID_COLUMN_BITMASK;

		if (!_setOriginalUserId) {
			_setOriginalUserId = true;

			_originalUserId = _userId;
		}

		_userId = userId;
	}

	@Override
	public String getUserUuid() throws SystemException {
		return PortalUtil.getUserValue(getUserId(), "uuid", _userUuid);
	}

	@Override
	public void setUserUuid(String userUuid) {
		_userUuid = userUuid;
	}

	public long getOriginalUserId() {
		return _originalUserId;
	}

	@JSON
	@Override
	public String getUserName() {
		if (_userName == null) {
			return StringPool.BLANK;
		}
		else {
			return _userName;
		}
	}

	@Override
	public void setUserName(String userName) {
		_userName = userName;
	}

	@JSON
	@Override
	public Date getCreateDate() {
		return _createDate;
	}

	@Override
	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	@JSON
	@Override
	public Date getModifiedDate() {
		return _modifiedDate;
	}

	@Override
	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;
	}

	@JSON
	@Override
	public long getAssetCatId() {
		return _assetCatId;
	}

	@Override
	public void setAssetCatId(long assetCatId) {
		_columnBitmask |= ASSETCATID_COLUMN_BITMASK;

		if (!_setOriginalAssetCatId) {
			_setOriginalAssetCatId = true;

			_originalAssetCatId = _assetCatId;
		}

		_assetCatId = assetCatId;
	}

	public long getOriginalAssetCatId() {
		return _originalAssetCatId;
	}

	@Override
	public StagedModelType getStagedModelType() {
		return new StagedModelType(PortalUtil.getClassNameId(
				MeAssetCatCare.class.getName()));
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(getCompanyId(),
			MeAssetCatCare.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public MeAssetCatCare toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (MeAssetCatCare)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		MeAssetCatCareImpl meAssetCatCareImpl = new MeAssetCatCareImpl();

		meAssetCatCareImpl.setUuid(getUuid());
		meAssetCatCareImpl.setAssetCatCareId(getAssetCatCareId());
		meAssetCatCareImpl.setGroupId(getGroupId());
		meAssetCatCareImpl.setCompanyId(getCompanyId());
		meAssetCatCareImpl.setUserId(getUserId());
		meAssetCatCareImpl.setUserName(getUserName());
		meAssetCatCareImpl.setCreateDate(getCreateDate());
		meAssetCatCareImpl.setModifiedDate(getModifiedDate());
		meAssetCatCareImpl.setAssetCatId(getAssetCatId());

		meAssetCatCareImpl.resetOriginalValues();

		return meAssetCatCareImpl;
	}

	@Override
	public int compareTo(MeAssetCatCare meAssetCatCare) {
		long primaryKey = meAssetCatCare.getPrimaryKey();

		if (getPrimaryKey() < primaryKey) {
			return -1;
		}
		else if (getPrimaryKey() > primaryKey) {
			return 1;
		}
		else {
			return 0;
		}
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof MeAssetCatCare)) {
			return false;
		}

		MeAssetCatCare meAssetCatCare = (MeAssetCatCare)obj;

		long primaryKey = meAssetCatCare.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	@Override
	public void resetOriginalValues() {
		MeAssetCatCareModelImpl meAssetCatCareModelImpl = this;

		meAssetCatCareModelImpl._originalUuid = meAssetCatCareModelImpl._uuid;

		meAssetCatCareModelImpl._originalGroupId = meAssetCatCareModelImpl._groupId;

		meAssetCatCareModelImpl._setOriginalGroupId = false;

		meAssetCatCareModelImpl._originalCompanyId = meAssetCatCareModelImpl._companyId;

		meAssetCatCareModelImpl._setOriginalCompanyId = false;

		meAssetCatCareModelImpl._originalUserId = meAssetCatCareModelImpl._userId;

		meAssetCatCareModelImpl._setOriginalUserId = false;

		meAssetCatCareModelImpl._originalAssetCatId = meAssetCatCareModelImpl._assetCatId;

		meAssetCatCareModelImpl._setOriginalAssetCatId = false;

		meAssetCatCareModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<MeAssetCatCare> toCacheModel() {
		MeAssetCatCareCacheModel meAssetCatCareCacheModel = new MeAssetCatCareCacheModel();

		meAssetCatCareCacheModel.uuid = getUuid();

		String uuid = meAssetCatCareCacheModel.uuid;

		if ((uuid != null) && (uuid.length() == 0)) {
			meAssetCatCareCacheModel.uuid = null;
		}

		meAssetCatCareCacheModel.assetCatCareId = getAssetCatCareId();

		meAssetCatCareCacheModel.groupId = getGroupId();

		meAssetCatCareCacheModel.companyId = getCompanyId();

		meAssetCatCareCacheModel.userId = getUserId();

		meAssetCatCareCacheModel.userName = getUserName();

		String userName = meAssetCatCareCacheModel.userName;

		if ((userName != null) && (userName.length() == 0)) {
			meAssetCatCareCacheModel.userName = null;
		}

		Date createDate = getCreateDate();

		if (createDate != null) {
			meAssetCatCareCacheModel.createDate = createDate.getTime();
		}
		else {
			meAssetCatCareCacheModel.createDate = Long.MIN_VALUE;
		}

		Date modifiedDate = getModifiedDate();

		if (modifiedDate != null) {
			meAssetCatCareCacheModel.modifiedDate = modifiedDate.getTime();
		}
		else {
			meAssetCatCareCacheModel.modifiedDate = Long.MIN_VALUE;
		}

		meAssetCatCareCacheModel.assetCatId = getAssetCatId();

		return meAssetCatCareCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(19);

		sb.append("{uuid=");
		sb.append(getUuid());
		sb.append(", assetCatCareId=");
		sb.append(getAssetCatCareId());
		sb.append(", groupId=");
		sb.append(getGroupId());
		sb.append(", companyId=");
		sb.append(getCompanyId());
		sb.append(", userId=");
		sb.append(getUserId());
		sb.append(", userName=");
		sb.append(getUserName());
		sb.append(", createDate=");
		sb.append(getCreateDate());
		sb.append(", modifiedDate=");
		sb.append(getModifiedDate());
		sb.append(", assetCatId=");
		sb.append(getAssetCatId());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(31);

		sb.append("<model><model-name>");
		sb.append("com.j2eecn.mcat.model.MeAssetCatCare");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>uuid</column-name><column-value><![CDATA[");
		sb.append(getUuid());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>assetCatCareId</column-name><column-value><![CDATA[");
		sb.append(getAssetCatCareId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>groupId</column-name><column-value><![CDATA[");
		sb.append(getGroupId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>companyId</column-name><column-value><![CDATA[");
		sb.append(getCompanyId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userId</column-name><column-value><![CDATA[");
		sb.append(getUserId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userName</column-name><column-value><![CDATA[");
		sb.append(getUserName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>createDate</column-name><column-value><![CDATA[");
		sb.append(getCreateDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>modifiedDate</column-name><column-value><![CDATA[");
		sb.append(getModifiedDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>assetCatId</column-name><column-value><![CDATA[");
		sb.append(getAssetCatId());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static ClassLoader _classLoader = MeAssetCatCare.class.getClassLoader();
	private static Class<?>[] _escapedModelInterfaces = new Class[] {
			MeAssetCatCare.class
		};
	private String _uuid;
	private String _originalUuid;
	private long _assetCatCareId;
	private long _groupId;
	private long _originalGroupId;
	private boolean _setOriginalGroupId;
	private long _companyId;
	private long _originalCompanyId;
	private boolean _setOriginalCompanyId;
	private long _userId;
	private String _userUuid;
	private long _originalUserId;
	private boolean _setOriginalUserId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private long _assetCatId;
	private long _originalAssetCatId;
	private boolean _setOriginalAssetCatId;
	private long _columnBitmask;
	private MeAssetCatCare _escapedModel;
}