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

import com.liferay.portal.kernel.lar.StagedModelType;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link MeAssetCat}.
 * </p>
 *
 * @author Administrator
 * @see MeAssetCat
 * @generated
 */
public class MeAssetCatWrapper implements MeAssetCat, ModelWrapper<MeAssetCat> {
	public MeAssetCatWrapper(MeAssetCat meAssetCat) {
		_meAssetCat = meAssetCat;
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

	/**
	* Returns the primary key of this me asset cat.
	*
	* @return the primary key of this me asset cat
	*/
	@Override
	public long getPrimaryKey() {
		return _meAssetCat.getPrimaryKey();
	}

	/**
	* Sets the primary key of this me asset cat.
	*
	* @param primaryKey the primary key of this me asset cat
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_meAssetCat.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the uuid of this me asset cat.
	*
	* @return the uuid of this me asset cat
	*/
	@Override
	public java.lang.String getUuid() {
		return _meAssetCat.getUuid();
	}

	/**
	* Sets the uuid of this me asset cat.
	*
	* @param uuid the uuid of this me asset cat
	*/
	@Override
	public void setUuid(java.lang.String uuid) {
		_meAssetCat.setUuid(uuid);
	}

	/**
	* Returns the asset cat ID of this me asset cat.
	*
	* @return the asset cat ID of this me asset cat
	*/
	@Override
	public long getAssetCatId() {
		return _meAssetCat.getAssetCatId();
	}

	/**
	* Sets the asset cat ID of this me asset cat.
	*
	* @param assetCatId the asset cat ID of this me asset cat
	*/
	@Override
	public void setAssetCatId(long assetCatId) {
		_meAssetCat.setAssetCatId(assetCatId);
	}

	/**
	* Returns the group ID of this me asset cat.
	*
	* @return the group ID of this me asset cat
	*/
	@Override
	public long getGroupId() {
		return _meAssetCat.getGroupId();
	}

	/**
	* Sets the group ID of this me asset cat.
	*
	* @param groupId the group ID of this me asset cat
	*/
	@Override
	public void setGroupId(long groupId) {
		_meAssetCat.setGroupId(groupId);
	}

	/**
	* Returns the company ID of this me asset cat.
	*
	* @return the company ID of this me asset cat
	*/
	@Override
	public long getCompanyId() {
		return _meAssetCat.getCompanyId();
	}

	/**
	* Sets the company ID of this me asset cat.
	*
	* @param companyId the company ID of this me asset cat
	*/
	@Override
	public void setCompanyId(long companyId) {
		_meAssetCat.setCompanyId(companyId);
	}

	/**
	* Returns the user ID of this me asset cat.
	*
	* @return the user ID of this me asset cat
	*/
	@Override
	public long getUserId() {
		return _meAssetCat.getUserId();
	}

	/**
	* Sets the user ID of this me asset cat.
	*
	* @param userId the user ID of this me asset cat
	*/
	@Override
	public void setUserId(long userId) {
		_meAssetCat.setUserId(userId);
	}

	/**
	* Returns the user uuid of this me asset cat.
	*
	* @return the user uuid of this me asset cat
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.lang.String getUserUuid()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _meAssetCat.getUserUuid();
	}

	/**
	* Sets the user uuid of this me asset cat.
	*
	* @param userUuid the user uuid of this me asset cat
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_meAssetCat.setUserUuid(userUuid);
	}

	/**
	* Returns the user name of this me asset cat.
	*
	* @return the user name of this me asset cat
	*/
	@Override
	public java.lang.String getUserName() {
		return _meAssetCat.getUserName();
	}

	/**
	* Sets the user name of this me asset cat.
	*
	* @param userName the user name of this me asset cat
	*/
	@Override
	public void setUserName(java.lang.String userName) {
		_meAssetCat.setUserName(userName);
	}

	/**
	* Returns the create date of this me asset cat.
	*
	* @return the create date of this me asset cat
	*/
	@Override
	public java.util.Date getCreateDate() {
		return _meAssetCat.getCreateDate();
	}

	/**
	* Sets the create date of this me asset cat.
	*
	* @param createDate the create date of this me asset cat
	*/
	@Override
	public void setCreateDate(java.util.Date createDate) {
		_meAssetCat.setCreateDate(createDate);
	}

	/**
	* Returns the modified date of this me asset cat.
	*
	* @return the modified date of this me asset cat
	*/
	@Override
	public java.util.Date getModifiedDate() {
		return _meAssetCat.getModifiedDate();
	}

	/**
	* Sets the modified date of this me asset cat.
	*
	* @param modifiedDate the modified date of this me asset cat
	*/
	@Override
	public void setModifiedDate(java.util.Date modifiedDate) {
		_meAssetCat.setModifiedDate(modifiedDate);
	}

	/**
	* Returns the status of this me asset cat.
	*
	* @return the status of this me asset cat
	*/
	@Override
	public int getStatus() {
		return _meAssetCat.getStatus();
	}

	/**
	* Sets the status of this me asset cat.
	*
	* @param status the status of this me asset cat
	*/
	@Override
	public void setStatus(int status) {
		_meAssetCat.setStatus(status);
	}

	/**
	* Returns the status by user ID of this me asset cat.
	*
	* @return the status by user ID of this me asset cat
	*/
	@Override
	public long getStatusByUserId() {
		return _meAssetCat.getStatusByUserId();
	}

	/**
	* Sets the status by user ID of this me asset cat.
	*
	* @param statusByUserId the status by user ID of this me asset cat
	*/
	@Override
	public void setStatusByUserId(long statusByUserId) {
		_meAssetCat.setStatusByUserId(statusByUserId);
	}

	/**
	* Returns the status by user uuid of this me asset cat.
	*
	* @return the status by user uuid of this me asset cat
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.lang.String getStatusByUserUuid()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _meAssetCat.getStatusByUserUuid();
	}

	/**
	* Sets the status by user uuid of this me asset cat.
	*
	* @param statusByUserUuid the status by user uuid of this me asset cat
	*/
	@Override
	public void setStatusByUserUuid(java.lang.String statusByUserUuid) {
		_meAssetCat.setStatusByUserUuid(statusByUserUuid);
	}

	/**
	* Returns the status by user name of this me asset cat.
	*
	* @return the status by user name of this me asset cat
	*/
	@Override
	public java.lang.String getStatusByUserName() {
		return _meAssetCat.getStatusByUserName();
	}

	/**
	* Sets the status by user name of this me asset cat.
	*
	* @param statusByUserName the status by user name of this me asset cat
	*/
	@Override
	public void setStatusByUserName(java.lang.String statusByUserName) {
		_meAssetCat.setStatusByUserName(statusByUserName);
	}

	/**
	* Returns the status date of this me asset cat.
	*
	* @return the status date of this me asset cat
	*/
	@Override
	public java.util.Date getStatusDate() {
		return _meAssetCat.getStatusDate();
	}

	/**
	* Sets the status date of this me asset cat.
	*
	* @param statusDate the status date of this me asset cat
	*/
	@Override
	public void setStatusDate(java.util.Date statusDate) {
		_meAssetCat.setStatusDate(statusDate);
	}

	/**
	* Returns the name of this me asset cat.
	*
	* @return the name of this me asset cat
	*/
	@Override
	public java.lang.String getName() {
		return _meAssetCat.getName();
	}

	/**
	* Sets the name of this me asset cat.
	*
	* @param name the name of this me asset cat
	*/
	@Override
	public void setName(java.lang.String name) {
		_meAssetCat.setName(name);
	}

	/**
	* Returns the desc of this me asset cat.
	*
	* @return the desc of this me asset cat
	*/
	@Override
	public java.lang.String getDesc() {
		return _meAssetCat.getDesc();
	}

	/**
	* Sets the desc of this me asset cat.
	*
	* @param desc the desc of this me asset cat
	*/
	@Override
	public void setDesc(java.lang.String desc) {
		_meAssetCat.setDesc(desc);
	}

	/**
	* Returns the use status of this me asset cat.
	*
	* @return the use status of this me asset cat
	*/
	@Override
	public int getUseStatus() {
		return _meAssetCat.getUseStatus();
	}

	/**
	* Sets the use status of this me asset cat.
	*
	* @param useStatus the use status of this me asset cat
	*/
	@Override
	public void setUseStatus(int useStatus) {
		_meAssetCat.setUseStatus(useStatus);
	}

	/**
	* Returns the code of this me asset cat.
	*
	* @return the code of this me asset cat
	*/
	@Override
	public java.lang.String getCode() {
		return _meAssetCat.getCode();
	}

	/**
	* Sets the code of this me asset cat.
	*
	* @param code the code of this me asset cat
	*/
	@Override
	public void setCode(java.lang.String code) {
		_meAssetCat.setCode(code);
	}

	/**
	* Returns the mng ID of this me asset cat.
	*
	* @return the mng ID of this me asset cat
	*/
	@Override
	public long getMngId() {
		return _meAssetCat.getMngId();
	}

	/**
	* Sets the mng ID of this me asset cat.
	*
	* @param mngId the mng ID of this me asset cat
	*/
	@Override
	public void setMngId(long mngId) {
		_meAssetCat.setMngId(mngId);
	}

	/**
	* Returns the mng name of this me asset cat.
	*
	* @return the mng name of this me asset cat
	*/
	@Override
	public long getMngName() {
		return _meAssetCat.getMngName();
	}

	/**
	* Sets the mng name of this me asset cat.
	*
	* @param mngName the mng name of this me asset cat
	*/
	@Override
	public void setMngName(long mngName) {
		_meAssetCat.setMngName(mngName);
	}

	/**
	* Returns the code and name of this me asset cat.
	*
	* @return the code and name of this me asset cat
	*/
	@Override
	public java.lang.String getCodeAndName() {
		return _meAssetCat.getCodeAndName();
	}

	/**
	* Sets the code and name of this me asset cat.
	*
	* @param codeAndName the code and name of this me asset cat
	*/
	@Override
	public void setCodeAndName(java.lang.String codeAndName) {
		_meAssetCat.setCodeAndName(codeAndName);
	}

	/**
	* @deprecated As of 6.1.0, replaced by {@link #isApproved()}
	*/
	@Override
	public boolean getApproved() {
		return _meAssetCat.getApproved();
	}

	/**
	* Returns <code>true</code> if this me asset cat is approved.
	*
	* @return <code>true</code> if this me asset cat is approved; <code>false</code> otherwise
	*/
	@Override
	public boolean isApproved() {
		return _meAssetCat.isApproved();
	}

	/**
	* Returns <code>true</code> if this me asset cat is denied.
	*
	* @return <code>true</code> if this me asset cat is denied; <code>false</code> otherwise
	*/
	@Override
	public boolean isDenied() {
		return _meAssetCat.isDenied();
	}

	/**
	* Returns <code>true</code> if this me asset cat is a draft.
	*
	* @return <code>true</code> if this me asset cat is a draft; <code>false</code> otherwise
	*/
	@Override
	public boolean isDraft() {
		return _meAssetCat.isDraft();
	}

	/**
	* Returns <code>true</code> if this me asset cat is expired.
	*
	* @return <code>true</code> if this me asset cat is expired; <code>false</code> otherwise
	*/
	@Override
	public boolean isExpired() {
		return _meAssetCat.isExpired();
	}

	/**
	* Returns <code>true</code> if this me asset cat is inactive.
	*
	* @return <code>true</code> if this me asset cat is inactive; <code>false</code> otherwise
	*/
	@Override
	public boolean isInactive() {
		return _meAssetCat.isInactive();
	}

	/**
	* Returns <code>true</code> if this me asset cat is incomplete.
	*
	* @return <code>true</code> if this me asset cat is incomplete; <code>false</code> otherwise
	*/
	@Override
	public boolean isIncomplete() {
		return _meAssetCat.isIncomplete();
	}

	/**
	* Returns <code>true</code> if this me asset cat is pending.
	*
	* @return <code>true</code> if this me asset cat is pending; <code>false</code> otherwise
	*/
	@Override
	public boolean isPending() {
		return _meAssetCat.isPending();
	}

	/**
	* Returns <code>true</code> if this me asset cat is scheduled.
	*
	* @return <code>true</code> if this me asset cat is scheduled; <code>false</code> otherwise
	*/
	@Override
	public boolean isScheduled() {
		return _meAssetCat.isScheduled();
	}

	@Override
	public boolean isNew() {
		return _meAssetCat.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_meAssetCat.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _meAssetCat.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_meAssetCat.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _meAssetCat.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _meAssetCat.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_meAssetCat.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _meAssetCat.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_meAssetCat.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_meAssetCat.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_meAssetCat.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new MeAssetCatWrapper((MeAssetCat)_meAssetCat.clone());
	}

	@Override
	public int compareTo(com.j2eecn.mcat.model.MeAssetCat meAssetCat) {
		return _meAssetCat.compareTo(meAssetCat);
	}

	@Override
	public int hashCode() {
		return _meAssetCat.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.j2eecn.mcat.model.MeAssetCat> toCacheModel() {
		return _meAssetCat.toCacheModel();
	}

	@Override
	public com.j2eecn.mcat.model.MeAssetCat toEscapedModel() {
		return new MeAssetCatWrapper(_meAssetCat.toEscapedModel());
	}

	@Override
	public com.j2eecn.mcat.model.MeAssetCat toUnescapedModel() {
		return new MeAssetCatWrapper(_meAssetCat.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _meAssetCat.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _meAssetCat.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_meAssetCat.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof MeAssetCatWrapper)) {
			return false;
		}

		MeAssetCatWrapper meAssetCatWrapper = (MeAssetCatWrapper)obj;

		if (Validator.equals(_meAssetCat, meAssetCatWrapper._meAssetCat)) {
			return true;
		}

		return false;
	}

	@Override
	public StagedModelType getStagedModelType() {
		return _meAssetCat.getStagedModelType();
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public MeAssetCat getWrappedMeAssetCat() {
		return _meAssetCat;
	}

	@Override
	public MeAssetCat getWrappedModel() {
		return _meAssetCat;
	}

	@Override
	public void resetOriginalValues() {
		_meAssetCat.resetOriginalValues();
	}

	private MeAssetCat _meAssetCat;
}