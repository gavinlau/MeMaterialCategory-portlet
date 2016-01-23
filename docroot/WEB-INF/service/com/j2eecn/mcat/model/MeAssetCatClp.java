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
import com.j2eecn.mcat.service.MeAssetCatLocalServiceUtil;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.lar.StagedModelType;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.workflow.WorkflowConstants;
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
public class MeAssetCatClp extends BaseModelImpl<MeAssetCat>
	implements MeAssetCat {
	public MeAssetCatClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return MeAssetCat.class;
	}

	@Override
	public String getModelClassName() {
		return MeAssetCat.class.getName();
	}

	@Override
	public long getPrimaryKey() {
		return _assetCatId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setAssetCatId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _assetCatId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("assetCatId", getAssetCatId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("status", getStatus());
		attributes.put("statusByUserId", getStatusByUserId());
		attributes.put("statusByUserName", getStatusByUserName());
		attributes.put("statusDate", getStatusDate());
		attributes.put("name", getName());
		attributes.put("desc", getDesc());
		attributes.put("useStatus", getUseStatus());
		attributes.put("code", getCode());
		attributes.put("mngId", getMngId());
		attributes.put("mngName", getMngName());
		attributes.put("codeAndName", getCodeAndName());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long assetCatId = (Long)attributes.get("assetCatId");

		if (assetCatId != null) {
			setAssetCatId(assetCatId);
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

		Integer status = (Integer)attributes.get("status");

		if (status != null) {
			setStatus(status);
		}

		Long statusByUserId = (Long)attributes.get("statusByUserId");

		if (statusByUserId != null) {
			setStatusByUserId(statusByUserId);
		}

		String statusByUserName = (String)attributes.get("statusByUserName");

		if (statusByUserName != null) {
			setStatusByUserName(statusByUserName);
		}

		Date statusDate = (Date)attributes.get("statusDate");

		if (statusDate != null) {
			setStatusDate(statusDate);
		}

		String name = (String)attributes.get("name");

		if (name != null) {
			setName(name);
		}

		String desc = (String)attributes.get("desc");

		if (desc != null) {
			setDesc(desc);
		}

		Integer useStatus = (Integer)attributes.get("useStatus");

		if (useStatus != null) {
			setUseStatus(useStatus);
		}

		String code = (String)attributes.get("code");

		if (code != null) {
			setCode(code);
		}

		Long mngId = (Long)attributes.get("mngId");

		if (mngId != null) {
			setMngId(mngId);
		}

		Long mngName = (Long)attributes.get("mngName");

		if (mngName != null) {
			setMngName(mngName);
		}

		String codeAndName = (String)attributes.get("codeAndName");

		if (codeAndName != null) {
			setCodeAndName(codeAndName);
		}
	}

	@Override
	public String getUuid() {
		return _uuid;
	}

	@Override
	public void setUuid(String uuid) {
		_uuid = uuid;

		if (_meAssetCatRemoteModel != null) {
			try {
				Class<?> clazz = _meAssetCatRemoteModel.getClass();

				Method method = clazz.getMethod("setUuid", String.class);

				method.invoke(_meAssetCatRemoteModel, uuid);
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

		if (_meAssetCatRemoteModel != null) {
			try {
				Class<?> clazz = _meAssetCatRemoteModel.getClass();

				Method method = clazz.getMethod("setAssetCatId", long.class);

				method.invoke(_meAssetCatRemoteModel, assetCatId);
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

		if (_meAssetCatRemoteModel != null) {
			try {
				Class<?> clazz = _meAssetCatRemoteModel.getClass();

				Method method = clazz.getMethod("setGroupId", long.class);

				method.invoke(_meAssetCatRemoteModel, groupId);
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

		if (_meAssetCatRemoteModel != null) {
			try {
				Class<?> clazz = _meAssetCatRemoteModel.getClass();

				Method method = clazz.getMethod("setCompanyId", long.class);

				method.invoke(_meAssetCatRemoteModel, companyId);
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

		if (_meAssetCatRemoteModel != null) {
			try {
				Class<?> clazz = _meAssetCatRemoteModel.getClass();

				Method method = clazz.getMethod("setUserId", long.class);

				method.invoke(_meAssetCatRemoteModel, userId);
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

		if (_meAssetCatRemoteModel != null) {
			try {
				Class<?> clazz = _meAssetCatRemoteModel.getClass();

				Method method = clazz.getMethod("setUserName", String.class);

				method.invoke(_meAssetCatRemoteModel, userName);
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

		if (_meAssetCatRemoteModel != null) {
			try {
				Class<?> clazz = _meAssetCatRemoteModel.getClass();

				Method method = clazz.getMethod("setCreateDate", Date.class);

				method.invoke(_meAssetCatRemoteModel, createDate);
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

		if (_meAssetCatRemoteModel != null) {
			try {
				Class<?> clazz = _meAssetCatRemoteModel.getClass();

				Method method = clazz.getMethod("setModifiedDate", Date.class);

				method.invoke(_meAssetCatRemoteModel, modifiedDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getStatus() {
		return _status;
	}

	@Override
	public void setStatus(int status) {
		_status = status;

		if (_meAssetCatRemoteModel != null) {
			try {
				Class<?> clazz = _meAssetCatRemoteModel.getClass();

				Method method = clazz.getMethod("setStatus", int.class);

				method.invoke(_meAssetCatRemoteModel, status);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getStatusByUserId() {
		return _statusByUserId;
	}

	@Override
	public void setStatusByUserId(long statusByUserId) {
		_statusByUserId = statusByUserId;

		if (_meAssetCatRemoteModel != null) {
			try {
				Class<?> clazz = _meAssetCatRemoteModel.getClass();

				Method method = clazz.getMethod("setStatusByUserId", long.class);

				method.invoke(_meAssetCatRemoteModel, statusByUserId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getStatusByUserUuid() throws SystemException {
		return PortalUtil.getUserValue(getStatusByUserId(), "uuid",
			_statusByUserUuid);
	}

	@Override
	public void setStatusByUserUuid(String statusByUserUuid) {
		_statusByUserUuid = statusByUserUuid;
	}

	@Override
	public String getStatusByUserName() {
		return _statusByUserName;
	}

	@Override
	public void setStatusByUserName(String statusByUserName) {
		_statusByUserName = statusByUserName;

		if (_meAssetCatRemoteModel != null) {
			try {
				Class<?> clazz = _meAssetCatRemoteModel.getClass();

				Method method = clazz.getMethod("setStatusByUserName",
						String.class);

				method.invoke(_meAssetCatRemoteModel, statusByUserName);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getStatusDate() {
		return _statusDate;
	}

	@Override
	public void setStatusDate(Date statusDate) {
		_statusDate = statusDate;

		if (_meAssetCatRemoteModel != null) {
			try {
				Class<?> clazz = _meAssetCatRemoteModel.getClass();

				Method method = clazz.getMethod("setStatusDate", Date.class);

				method.invoke(_meAssetCatRemoteModel, statusDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getName() {
		return _name;
	}

	@Override
	public void setName(String name) {
		_name = name;

		if (_meAssetCatRemoteModel != null) {
			try {
				Class<?> clazz = _meAssetCatRemoteModel.getClass();

				Method method = clazz.getMethod("setName", String.class);

				method.invoke(_meAssetCatRemoteModel, name);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getDesc() {
		return _desc;
	}

	@Override
	public void setDesc(String desc) {
		_desc = desc;

		if (_meAssetCatRemoteModel != null) {
			try {
				Class<?> clazz = _meAssetCatRemoteModel.getClass();

				Method method = clazz.getMethod("setDesc", String.class);

				method.invoke(_meAssetCatRemoteModel, desc);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getUseStatus() {
		return _useStatus;
	}

	@Override
	public void setUseStatus(int useStatus) {
		_useStatus = useStatus;

		if (_meAssetCatRemoteModel != null) {
			try {
				Class<?> clazz = _meAssetCatRemoteModel.getClass();

				Method method = clazz.getMethod("setUseStatus", int.class);

				method.invoke(_meAssetCatRemoteModel, useStatus);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getCode() {
		return _code;
	}

	@Override
	public void setCode(String code) {
		_code = code;

		if (_meAssetCatRemoteModel != null) {
			try {
				Class<?> clazz = _meAssetCatRemoteModel.getClass();

				Method method = clazz.getMethod("setCode", String.class);

				method.invoke(_meAssetCatRemoteModel, code);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getMngId() {
		return _mngId;
	}

	@Override
	public void setMngId(long mngId) {
		_mngId = mngId;

		if (_meAssetCatRemoteModel != null) {
			try {
				Class<?> clazz = _meAssetCatRemoteModel.getClass();

				Method method = clazz.getMethod("setMngId", long.class);

				method.invoke(_meAssetCatRemoteModel, mngId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getMngName() {
		return _mngName;
	}

	@Override
	public void setMngName(long mngName) {
		_mngName = mngName;

		if (_meAssetCatRemoteModel != null) {
			try {
				Class<?> clazz = _meAssetCatRemoteModel.getClass();

				Method method = clazz.getMethod("setMngName", long.class);

				method.invoke(_meAssetCatRemoteModel, mngName);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getCodeAndName() {
		return _codeAndName;
	}

	@Override
	public void setCodeAndName(String codeAndName) {
		_codeAndName = codeAndName;

		if (_meAssetCatRemoteModel != null) {
			try {
				Class<?> clazz = _meAssetCatRemoteModel.getClass();

				Method method = clazz.getMethod("setCodeAndName", String.class);

				method.invoke(_meAssetCatRemoteModel, codeAndName);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public StagedModelType getStagedModelType() {
		return new StagedModelType(PortalUtil.getClassNameId(
				MeAssetCat.class.getName()));
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #isApproved}
	 */
	@Override
	public boolean getApproved() {
		return isApproved();
	}

	@Override
	public boolean isApproved() {
		if (getStatus() == WorkflowConstants.STATUS_APPROVED) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public boolean isDenied() {
		if (getStatus() == WorkflowConstants.STATUS_DENIED) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public boolean isDraft() {
		if (getStatus() == WorkflowConstants.STATUS_DRAFT) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public boolean isExpired() {
		if (getStatus() == WorkflowConstants.STATUS_EXPIRED) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public boolean isInactive() {
		if (getStatus() == WorkflowConstants.STATUS_INACTIVE) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public boolean isIncomplete() {
		if (getStatus() == WorkflowConstants.STATUS_INCOMPLETE) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public boolean isPending() {
		if (getStatus() == WorkflowConstants.STATUS_PENDING) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public boolean isScheduled() {
		if (getStatus() == WorkflowConstants.STATUS_SCHEDULED) {
			return true;
		}
		else {
			return false;
		}
	}

	public BaseModel<?> getMeAssetCatRemoteModel() {
		return _meAssetCatRemoteModel;
	}

	public void setMeAssetCatRemoteModel(BaseModel<?> meAssetCatRemoteModel) {
		_meAssetCatRemoteModel = meAssetCatRemoteModel;
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

		Class<?> remoteModelClass = _meAssetCatRemoteModel.getClass();

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

		Object returnValue = method.invoke(_meAssetCatRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			MeAssetCatLocalServiceUtil.addMeAssetCat(this);
		}
		else {
			MeAssetCatLocalServiceUtil.updateMeAssetCat(this);
		}
	}

	@Override
	public MeAssetCat toEscapedModel() {
		return (MeAssetCat)ProxyUtil.newProxyInstance(MeAssetCat.class.getClassLoader(),
			new Class[] { MeAssetCat.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		MeAssetCatClp clone = new MeAssetCatClp();

		clone.setUuid(getUuid());
		clone.setAssetCatId(getAssetCatId());
		clone.setGroupId(getGroupId());
		clone.setCompanyId(getCompanyId());
		clone.setUserId(getUserId());
		clone.setUserName(getUserName());
		clone.setCreateDate(getCreateDate());
		clone.setModifiedDate(getModifiedDate());
		clone.setStatus(getStatus());
		clone.setStatusByUserId(getStatusByUserId());
		clone.setStatusByUserName(getStatusByUserName());
		clone.setStatusDate(getStatusDate());
		clone.setName(getName());
		clone.setDesc(getDesc());
		clone.setUseStatus(getUseStatus());
		clone.setCode(getCode());
		clone.setMngId(getMngId());
		clone.setMngName(getMngName());
		clone.setCodeAndName(getCodeAndName());

		return clone;
	}

	@Override
	public int compareTo(MeAssetCat meAssetCat) {
		long primaryKey = meAssetCat.getPrimaryKey();

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

		if (!(obj instanceof MeAssetCatClp)) {
			return false;
		}

		MeAssetCatClp meAssetCat = (MeAssetCatClp)obj;

		long primaryKey = meAssetCat.getPrimaryKey();

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
		StringBundler sb = new StringBundler(39);

		sb.append("{uuid=");
		sb.append(getUuid());
		sb.append(", assetCatId=");
		sb.append(getAssetCatId());
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
		sb.append(", status=");
		sb.append(getStatus());
		sb.append(", statusByUserId=");
		sb.append(getStatusByUserId());
		sb.append(", statusByUserName=");
		sb.append(getStatusByUserName());
		sb.append(", statusDate=");
		sb.append(getStatusDate());
		sb.append(", name=");
		sb.append(getName());
		sb.append(", desc=");
		sb.append(getDesc());
		sb.append(", useStatus=");
		sb.append(getUseStatus());
		sb.append(", code=");
		sb.append(getCode());
		sb.append(", mngId=");
		sb.append(getMngId());
		sb.append(", mngName=");
		sb.append(getMngName());
		sb.append(", codeAndName=");
		sb.append(getCodeAndName());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(61);

		sb.append("<model><model-name>");
		sb.append("com.j2eecn.mcat.model.MeAssetCat");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>uuid</column-name><column-value><![CDATA[");
		sb.append(getUuid());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>assetCatId</column-name><column-value><![CDATA[");
		sb.append(getAssetCatId());
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
			"<column><column-name>status</column-name><column-value><![CDATA[");
		sb.append(getStatus());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>statusByUserId</column-name><column-value><![CDATA[");
		sb.append(getStatusByUserId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>statusByUserName</column-name><column-value><![CDATA[");
		sb.append(getStatusByUserName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>statusDate</column-name><column-value><![CDATA[");
		sb.append(getStatusDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>name</column-name><column-value><![CDATA[");
		sb.append(getName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>desc</column-name><column-value><![CDATA[");
		sb.append(getDesc());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>useStatus</column-name><column-value><![CDATA[");
		sb.append(getUseStatus());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>code</column-name><column-value><![CDATA[");
		sb.append(getCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>mngId</column-name><column-value><![CDATA[");
		sb.append(getMngId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>mngName</column-name><column-value><![CDATA[");
		sb.append(getMngName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>codeAndName</column-name><column-value><![CDATA[");
		sb.append(getCodeAndName());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private String _uuid;
	private long _assetCatId;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userUuid;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private int _status;
	private long _statusByUserId;
	private String _statusByUserUuid;
	private String _statusByUserName;
	private Date _statusDate;
	private String _name;
	private String _desc;
	private int _useStatus;
	private String _code;
	private long _mngId;
	private long _mngName;
	private String _codeAndName;
	private BaseModel<?> _meAssetCatRemoteModel;
	private Class<?> _clpSerializerClass = com.j2eecn.mcat.service.ClpSerializer.class;
}