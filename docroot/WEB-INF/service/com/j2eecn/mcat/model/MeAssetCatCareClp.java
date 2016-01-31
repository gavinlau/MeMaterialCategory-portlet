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

package com.j2eecn.mcat.model;

import com.j2eecn.mcat.service.ClpSerializer;
import com.j2eecn.mcat.service.MeAssetCatCareLocalServiceUtil;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.lar.StagedModelType;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.util.PortalUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Administrator
 */
public class MeAssetCatCareClp extends BaseModelImpl<MeAssetCatCare>
	implements MeAssetCatCare {
	public MeAssetCatCareClp() {
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

	@Override
	public String getUuid() {
		return _uuid;
	}

	@Override
	public void setUuid(String uuid) {
		_uuid = uuid;

		if (_meAssetCatCareRemoteModel != null) {
			try {
				Class<?> clazz = _meAssetCatCareRemoteModel.getClass();

				Method method = clazz.getMethod("setUuid", String.class);

				method.invoke(_meAssetCatCareRemoteModel, uuid);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getAssetCatCareId() {
		return _assetCatCareId;
	}

	@Override
	public void setAssetCatCareId(long assetCatCareId) {
		_assetCatCareId = assetCatCareId;

		if (_meAssetCatCareRemoteModel != null) {
			try {
				Class<?> clazz = _meAssetCatCareRemoteModel.getClass();

				Method method = clazz.getMethod("setAssetCatCareId", long.class);

				method.invoke(_meAssetCatCareRemoteModel, assetCatCareId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getGroupId() {
		return _groupId;
	}

	@Override
	public void setGroupId(long groupId) {
		_groupId = groupId;

		if (_meAssetCatCareRemoteModel != null) {
			try {
				Class<?> clazz = _meAssetCatCareRemoteModel.getClass();

				Method method = clazz.getMethod("setGroupId", long.class);

				method.invoke(_meAssetCatCareRemoteModel, groupId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getCompanyId() {
		return _companyId;
	}

	@Override
	public void setCompanyId(long companyId) {
		_companyId = companyId;

		if (_meAssetCatCareRemoteModel != null) {
			try {
				Class<?> clazz = _meAssetCatCareRemoteModel.getClass();

				Method method = clazz.getMethod("setCompanyId", long.class);

				method.invoke(_meAssetCatCareRemoteModel, companyId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getUserId() {
		return _userId;
	}

	@Override
	public void setUserId(long userId) {
		_userId = userId;

		if (_meAssetCatCareRemoteModel != null) {
			try {
				Class<?> clazz = _meAssetCatCareRemoteModel.getClass();

				Method method = clazz.getMethod("setUserId", long.class);

				method.invoke(_meAssetCatCareRemoteModel, userId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getUserUuid() throws SystemException {
		return PortalUtil.getUserValue(getUserId(), "uuid", _userUuid);
	}

	@Override
	public void setUserUuid(String userUuid) {
		_userUuid = userUuid;
	}

	@Override
	public String getUserName() {
		return _userName;
	}

	@Override
	public void setUserName(String userName) {
		_userName = userName;

		if (_meAssetCatCareRemoteModel != null) {
			try {
				Class<?> clazz = _meAssetCatCareRemoteModel.getClass();

				Method method = clazz.getMethod("setUserName", String.class);

				method.invoke(_meAssetCatCareRemoteModel, userName);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getCreateDate() {
		return _createDate;
	}

	@Override
	public void setCreateDate(Date createDate) {
		_createDate = createDate;

		if (_meAssetCatCareRemoteModel != null) {
			try {
				Class<?> clazz = _meAssetCatCareRemoteModel.getClass();

				Method method = clazz.getMethod("setCreateDate", Date.class);

				method.invoke(_meAssetCatCareRemoteModel, createDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getModifiedDate() {
		return _modifiedDate;
	}

	@Override
	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;

		if (_meAssetCatCareRemoteModel != null) {
			try {
				Class<?> clazz = _meAssetCatCareRemoteModel.getClass();

				Method method = clazz.getMethod("setModifiedDate", Date.class);

				method.invoke(_meAssetCatCareRemoteModel, modifiedDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getAssetCatId() {
		return _assetCatId;
	}

	@Override
	public void setAssetCatId(long assetCatId) {
		_assetCatId = assetCatId;

		if (_meAssetCatCareRemoteModel != null) {
			try {
				Class<?> clazz = _meAssetCatCareRemoteModel.getClass();

				Method method = clazz.getMethod("setAssetCatId", long.class);

				method.invoke(_meAssetCatCareRemoteModel, assetCatId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public StagedModelType getStagedModelType() {
		return new StagedModelType(PortalUtil.getClassNameId(
				MeAssetCatCare.class.getName()));
	}

	public BaseModel<?> getMeAssetCatCareRemoteModel() {
		return _meAssetCatCareRemoteModel;
	}

	public void setMeAssetCatCareRemoteModel(
		BaseModel<?> meAssetCatCareRemoteModel) {
		_meAssetCatCareRemoteModel = meAssetCatCareRemoteModel;
	}

	public Object invokeOnRemoteModel(String methodName,
		Class<?>[] parameterTypes, Object[] parameterValues)
		throws Exception {
		Object[] remoteParameterValues = new Object[parameterValues.length];

		for (int i = 0; i < parameterValues.length; i++) {
			if (parameterValues[i] != null) {
				remoteParameterValues[i] = ClpSerializer.translateInput(parameterValues[i]);
			}
		}

		Class<?> remoteModelClass = _meAssetCatCareRemoteModel.getClass();

		ClassLoader remoteModelClassLoader = remoteModelClass.getClassLoader();

		Class<?>[] remoteParameterTypes = new Class[parameterTypes.length];

		for (int i = 0; i < parameterTypes.length; i++) {
			if (parameterTypes[i].isPrimitive()) {
				remoteParameterTypes[i] = parameterTypes[i];
			}
			else {
				String parameterTypeName = parameterTypes[i].getName();

				remoteParameterTypes[i] = remoteModelClassLoader.loadClass(parameterTypeName);
			}
		}

		Method method = remoteModelClass.getMethod(methodName,
				remoteParameterTypes);

		Object returnValue = method.invoke(_meAssetCatCareRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			MeAssetCatCareLocalServiceUtil.addMeAssetCatCare(this);
		}
		else {
			MeAssetCatCareLocalServiceUtil.updateMeAssetCatCare(this);
		}
	}

	@Override
	public MeAssetCatCare toEscapedModel() {
		return (MeAssetCatCare)ProxyUtil.newProxyInstance(MeAssetCatCare.class.getClassLoader(),
			new Class[] { MeAssetCatCare.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		MeAssetCatCareClp clone = new MeAssetCatCareClp();

		clone.setUuid(getUuid());
		clone.setAssetCatCareId(getAssetCatCareId());
		clone.setGroupId(getGroupId());
		clone.setCompanyId(getCompanyId());
		clone.setUserId(getUserId());
		clone.setUserName(getUserName());
		clone.setCreateDate(getCreateDate());
		clone.setModifiedDate(getModifiedDate());
		clone.setAssetCatId(getAssetCatId());

		return clone;
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

		if (!(obj instanceof MeAssetCatCareClp)) {
			return false;
		}

		MeAssetCatCareClp meAssetCatCare = (MeAssetCatCareClp)obj;

		long primaryKey = meAssetCatCare.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	public Class<?> getClpSerializerClass() {
		return _clpSerializerClass;
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
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

	private String _uuid;
	private long _assetCatCareId;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userUuid;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private long _assetCatId;
	private BaseModel<?> _meAssetCatCareRemoteModel;
	private Class<?> _clpSerializerClass = com.j2eecn.mcat.service.ClpSerializer.class;
}