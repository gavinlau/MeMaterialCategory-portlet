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
 * This class is a wrapper for {@link MeCategory}.
 * </p>
 *
 * @author Administrator
 * @see MeCategory
 * @generated
 */
public class MeCategoryWrapper implements MeCategory, ModelWrapper<MeCategory> {
	public MeCategoryWrapper(MeCategory meCategory) {
		_meCategory = meCategory;
	}

	@Override
	public Class<?> getModelClass() {
		return MeCategory.class;
	}

	@Override
	public String getModelClassName() {
		return MeCategory.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("catId", getCatId());
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
		attributes.put("remark", getRemark());
		attributes.put("useStatus", getUseStatus());
		attributes.put("code", getCode());
		attributes.put("mngId", getMngId());
		attributes.put("mngName", getMngName());
		attributes.put("codeAndName", getCodeAndName());
		attributes.put("fullName", getFullName());
		attributes.put("assetCatId", getAssetCatId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long catId = (Long)attributes.get("catId");

		if (catId != null) {
			setCatId(catId);
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

		String remark = (String)attributes.get("remark");

		if (remark != null) {
			setRemark(remark);
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

		String fullName = (String)attributes.get("fullName");

		if (fullName != null) {
			setFullName(fullName);
		}

		Long assetCatId = (Long)attributes.get("assetCatId");

		if (assetCatId != null) {
			setAssetCatId(assetCatId);
		}
	}

	/**
	* Returns the primary key of this me category.
	*
	* @return the primary key of this me category
	*/
	@Override
	public long getPrimaryKey() {
		return _meCategory.getPrimaryKey();
	}

	/**
	* Sets the primary key of this me category.
	*
	* @param primaryKey the primary key of this me category
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_meCategory.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the uuid of this me category.
	*
	* @return the uuid of this me category
	*/
	@Override
	public java.lang.String getUuid() {
		return _meCategory.getUuid();
	}

	/**
	* Sets the uuid of this me category.
	*
	* @param uuid the uuid of this me category
	*/
	@Override
	public void setUuid(java.lang.String uuid) {
		_meCategory.setUuid(uuid);
	}

	/**
	* Returns the cat ID of this me category.
	*
	* @return the cat ID of this me category
	*/
	@Override
	public long getCatId() {
		return _meCategory.getCatId();
	}

	/**
	* Sets the cat ID of this me category.
	*
	* @param catId the cat ID of this me category
	*/
	@Override
	public void setCatId(long catId) {
		_meCategory.setCatId(catId);
	}

	/**
	* Returns the group ID of this me category.
	*
	* @return the group ID of this me category
	*/
	@Override
	public long getGroupId() {
		return _meCategory.getGroupId();
	}

	/**
	* Sets the group ID of this me category.
	*
	* @param groupId the group ID of this me category
	*/
	@Override
	public void setGroupId(long groupId) {
		_meCategory.setGroupId(groupId);
	}

	/**
	* Returns the company ID of this me category.
	*
	* @return the company ID of this me category
	*/
	@Override
	public long getCompanyId() {
		return _meCategory.getCompanyId();
	}

	/**
	* Sets the company ID of this me category.
	*
	* @param companyId the company ID of this me category
	*/
	@Override
	public void setCompanyId(long companyId) {
		_meCategory.setCompanyId(companyId);
	}

	/**
	* Returns the user ID of this me category.
	*
	* @return the user ID of this me category
	*/
	@Override
	public long getUserId() {
		return _meCategory.getUserId();
	}

	/**
	* Sets the user ID of this me category.
	*
	* @param userId the user ID of this me category
	*/
	@Override
	public void setUserId(long userId) {
		_meCategory.setUserId(userId);
	}

	/**
	* Returns the user uuid of this me category.
	*
	* @return the user uuid of this me category
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.lang.String getUserUuid()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _meCategory.getUserUuid();
	}

	/**
	* Sets the user uuid of this me category.
	*
	* @param userUuid the user uuid of this me category
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_meCategory.setUserUuid(userUuid);
	}

	/**
	* Returns the user name of this me category.
	*
	* @return the user name of this me category
	*/
	@Override
	public java.lang.String getUserName() {
		return _meCategory.getUserName();
	}

	/**
	* Sets the user name of this me category.
	*
	* @param userName the user name of this me category
	*/
	@Override
	public void setUserName(java.lang.String userName) {
		_meCategory.setUserName(userName);
	}

	/**
	* Returns the create date of this me category.
	*
	* @return the create date of this me category
	*/
	@Override
	public java.util.Date getCreateDate() {
		return _meCategory.getCreateDate();
	}

	/**
	* Sets the create date of this me category.
	*
	* @param createDate the create date of this me category
	*/
	@Override
	public void setCreateDate(java.util.Date createDate) {
		_meCategory.setCreateDate(createDate);
	}

	/**
	* Returns the modified date of this me category.
	*
	* @return the modified date of this me category
	*/
	@Override
	public java.util.Date getModifiedDate() {
		return _meCategory.getModifiedDate();
	}

	/**
	* Sets the modified date of this me category.
	*
	* @param modifiedDate the modified date of this me category
	*/
	@Override
	public void setModifiedDate(java.util.Date modifiedDate) {
		_meCategory.setModifiedDate(modifiedDate);
	}

	/**
	* Returns the status of this me category.
	*
	* @return the status of this me category
	*/
	@Override
	public int getStatus() {
		return _meCategory.getStatus();
	}

	/**
	* Sets the status of this me category.
	*
	* @param status the status of this me category
	*/
	@Override
	public void setStatus(int status) {
		_meCategory.setStatus(status);
	}

	/**
	* Returns the status by user ID of this me category.
	*
	* @return the status by user ID of this me category
	*/
	@Override
	public long getStatusByUserId() {
		return _meCategory.getStatusByUserId();
	}

	/**
	* Sets the status by user ID of this me category.
	*
	* @param statusByUserId the status by user ID of this me category
	*/
	@Override
	public void setStatusByUserId(long statusByUserId) {
		_meCategory.setStatusByUserId(statusByUserId);
	}

	/**
	* Returns the status by user uuid of this me category.
	*
	* @return the status by user uuid of this me category
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.lang.String getStatusByUserUuid()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _meCategory.getStatusByUserUuid();
	}

	/**
	* Sets the status by user uuid of this me category.
	*
	* @param statusByUserUuid the status by user uuid of this me category
	*/
	@Override
	public void setStatusByUserUuid(java.lang.String statusByUserUuid) {
		_meCategory.setStatusByUserUuid(statusByUserUuid);
	}

	/**
	* Returns the status by user name of this me category.
	*
	* @return the status by user name of this me category
	*/
	@Override
	public java.lang.String getStatusByUserName() {
		return _meCategory.getStatusByUserName();
	}

	/**
	* Sets the status by user name of this me category.
	*
	* @param statusByUserName the status by user name of this me category
	*/
	@Override
	public void setStatusByUserName(java.lang.String statusByUserName) {
		_meCategory.setStatusByUserName(statusByUserName);
	}

	/**
	* Returns the status date of this me category.
	*
	* @return the status date of this me category
	*/
	@Override
	public java.util.Date getStatusDate() {
		return _meCategory.getStatusDate();
	}

	/**
	* Sets the status date of this me category.
	*
	* @param statusDate the status date of this me category
	*/
	@Override
	public void setStatusDate(java.util.Date statusDate) {
		_meCategory.setStatusDate(statusDate);
	}

	/**
	* Returns the name of this me category.
	*
	* @return the name of this me category
	*/
	@Override
	public java.lang.String getName() {
		return _meCategory.getName();
	}

	/**
	* Sets the name of this me category.
	*
	* @param name the name of this me category
	*/
	@Override
	public void setName(java.lang.String name) {
		_meCategory.setName(name);
	}

	/**
	* Returns the desc of this me category.
	*
	* @return the desc of this me category
	*/
	@Override
	public java.lang.String getDesc() {
		return _meCategory.getDesc();
	}

	/**
	* Sets the desc of this me category.
	*
	* @param desc the desc of this me category
	*/
	@Override
	public void setDesc(java.lang.String desc) {
		_meCategory.setDesc(desc);
	}

	/**
	* Returns the remark of this me category.
	*
	* @return the remark of this me category
	*/
	@Override
	public java.lang.String getRemark() {
		return _meCategory.getRemark();
	}

	/**
	* Sets the remark of this me category.
	*
	* @param remark the remark of this me category
	*/
	@Override
	public void setRemark(java.lang.String remark) {
		_meCategory.setRemark(remark);
	}

	/**
	* Returns the use status of this me category.
	*
	* @return the use status of this me category
	*/
	@Override
	public int getUseStatus() {
		return _meCategory.getUseStatus();
	}

	/**
	* Sets the use status of this me category.
	*
	* @param useStatus the use status of this me category
	*/
	@Override
	public void setUseStatus(int useStatus) {
		_meCategory.setUseStatus(useStatus);
	}

	/**
	* Returns the code of this me category.
	*
	* @return the code of this me category
	*/
	@Override
	public java.lang.String getCode() {
		return _meCategory.getCode();
	}

	/**
	* Sets the code of this me category.
	*
	* @param code the code of this me category
	*/
	@Override
	public void setCode(java.lang.String code) {
		_meCategory.setCode(code);
	}

	/**
	* Returns the mng ID of this me category.
	*
	* @return the mng ID of this me category
	*/
	@Override
	public long getMngId() {
		return _meCategory.getMngId();
	}

	/**
	* Sets the mng ID of this me category.
	*
	* @param mngId the mng ID of this me category
	*/
	@Override
	public void setMngId(long mngId) {
		_meCategory.setMngId(mngId);
	}

	/**
	* Returns the mng name of this me category.
	*
	* @return the mng name of this me category
	*/
	@Override
	public long getMngName() {
		return _meCategory.getMngName();
	}

	/**
	* Sets the mng name of this me category.
	*
	* @param mngName the mng name of this me category
	*/
	@Override
	public void setMngName(long mngName) {
		_meCategory.setMngName(mngName);
	}

	/**
	* Returns the code and name of this me category.
	*
	* @return the code and name of this me category
	*/
	@Override
	public java.lang.String getCodeAndName() {
		return _meCategory.getCodeAndName();
	}

	/**
	* Sets the code and name of this me category.
	*
	* @param codeAndName the code and name of this me category
	*/
	@Override
	public void setCodeAndName(java.lang.String codeAndName) {
		_meCategory.setCodeAndName(codeAndName);
	}

	/**
	* Returns the full name of this me category.
	*
	* @return the full name of this me category
	*/
	@Override
	public java.lang.String getFullName() {
		return _meCategory.getFullName();
	}

	/**
	* Sets the full name of this me category.
	*
	* @param fullName the full name of this me category
	*/
	@Override
	public void setFullName(java.lang.String fullName) {
		_meCategory.setFullName(fullName);
	}

	/**
	* Returns the asset cat ID of this me category.
	*
	* @return the asset cat ID of this me category
	*/
	@Override
	public long getAssetCatId() {
		return _meCategory.getAssetCatId();
	}

	/**
	* Sets the asset cat ID of this me category.
	*
	* @param assetCatId the asset cat ID of this me category
	*/
	@Override
	public void setAssetCatId(long assetCatId) {
		_meCategory.setAssetCatId(assetCatId);
	}

	/**
	* @deprecated As of 6.1.0, replaced by {@link #isApproved()}
	*/
	@Override
	public boolean getApproved() {
		return _meCategory.getApproved();
	}

	/**
	* Returns <code>true</code> if this me category is approved.
	*
	* @return <code>true</code> if this me category is approved; <code>false</code> otherwise
	*/
	@Override
	public boolean isApproved() {
		return _meCategory.isApproved();
	}

	/**
	* Returns <code>true</code> if this me category is denied.
	*
	* @return <code>true</code> if this me category is denied; <code>false</code> otherwise
	*/
	@Override
	public boolean isDenied() {
		return _meCategory.isDenied();
	}

	/**
	* Returns <code>true</code> if this me category is a draft.
	*
	* @return <code>true</code> if this me category is a draft; <code>false</code> otherwise
	*/
	@Override
	public boolean isDraft() {
		return _meCategory.isDraft();
	}

	/**
	* Returns <code>true</code> if this me category is expired.
	*
	* @return <code>true</code> if this me category is expired; <code>false</code> otherwise
	*/
	@Override
	public boolean isExpired() {
		return _meCategory.isExpired();
	}

	/**
	* Returns <code>true</code> if this me category is inactive.
	*
	* @return <code>true</code> if this me category is inactive; <code>false</code> otherwise
	*/
	@Override
	public boolean isInactive() {
		return _meCategory.isInactive();
	}

	/**
	* Returns <code>true</code> if this me category is incomplete.
	*
	* @return <code>true</code> if this me category is incomplete; <code>false</code> otherwise
	*/
	@Override
	public boolean isIncomplete() {
		return _meCategory.isIncomplete();
	}

	/**
	* Returns <code>true</code> if this me category is pending.
	*
	* @return <code>true</code> if this me category is pending; <code>false</code> otherwise
	*/
	@Override
	public boolean isPending() {
		return _meCategory.isPending();
	}

	/**
	* Returns <code>true</code> if this me category is scheduled.
	*
	* @return <code>true</code> if this me category is scheduled; <code>false</code> otherwise
	*/
	@Override
	public boolean isScheduled() {
		return _meCategory.isScheduled();
	}

	@Override
	public boolean isNew() {
		return _meCategory.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_meCategory.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _meCategory.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_meCategory.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _meCategory.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _meCategory.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_meCategory.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _meCategory.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_meCategory.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_meCategory.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_meCategory.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new MeCategoryWrapper((MeCategory)_meCategory.clone());
	}

	@Override
	public int compareTo(com.j2eecn.mcat.model.MeCategory meCategory) {
		return _meCategory.compareTo(meCategory);
	}

	@Override
	public int hashCode() {
		return _meCategory.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.j2eecn.mcat.model.MeCategory> toCacheModel() {
		return _meCategory.toCacheModel();
	}

	@Override
	public com.j2eecn.mcat.model.MeCategory toEscapedModel() {
		return new MeCategoryWrapper(_meCategory.toEscapedModel());
	}

	@Override
	public com.j2eecn.mcat.model.MeCategory toUnescapedModel() {
		return new MeCategoryWrapper(_meCategory.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _meCategory.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _meCategory.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_meCategory.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof MeCategoryWrapper)) {
			return false;
		}

		MeCategoryWrapper meCategoryWrapper = (MeCategoryWrapper)obj;

		if (Validator.equals(_meCategory, meCategoryWrapper._meCategory)) {
			return true;
		}

		return false;
	}

	@Override
	public StagedModelType getStagedModelType() {
		return _meCategory.getStagedModelType();
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public MeCategory getWrappedMeCategory() {
		return _meCategory;
	}

	@Override
	public MeCategory getWrappedModel() {
		return _meCategory;
	}

	@Override
	public void resetOriginalValues() {
		_meCategory.resetOriginalValues();
	}

	private MeCategory _meCategory;
}