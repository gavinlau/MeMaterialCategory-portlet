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
 * This class is a wrapper for {@link MeAssetCatCare}.
 * </p>
 *
 * @author Administrator
 * @see MeAssetCatCare
 * @generated
 */
public class MeAssetCatCareWrapper implements MeAssetCatCare,
	ModelWrapper<MeAssetCatCare> {
	public MeAssetCatCareWrapper(MeAssetCatCare meAssetCatCare) {
		_meAssetCatCare = meAssetCatCare;
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

	/**
	* Returns the primary key of this me asset cat care.
	*
	* @return the primary key of this me asset cat care
	*/
	@Override
	public long getPrimaryKey() {
		return _meAssetCatCare.getPrimaryKey();
	}

	/**
	* Sets the primary key of this me asset cat care.
	*
	* @param primaryKey the primary key of this me asset cat care
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_meAssetCatCare.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the uuid of this me asset cat care.
	*
	* @return the uuid of this me asset cat care
	*/
	@Override
	public java.lang.String getUuid() {
		return _meAssetCatCare.getUuid();
	}

	/**
	* Sets the uuid of this me asset cat care.
	*
	* @param uuid the uuid of this me asset cat care
	*/
	@Override
	public void setUuid(java.lang.String uuid) {
		_meAssetCatCare.setUuid(uuid);
	}

	/**
	* Returns the asset cat care ID of this me asset cat care.
	*
	* @return the asset cat care ID of this me asset cat care
	*/
	@Override
	public long getAssetCatCareId() {
		return _meAssetCatCare.getAssetCatCareId();
	}

	/**
	* Sets the asset cat care ID of this me asset cat care.
	*
	* @param assetCatCareId the asset cat care ID of this me asset cat care
	*/
	@Override
	public void setAssetCatCareId(long assetCatCareId) {
		_meAssetCatCare.setAssetCatCareId(assetCatCareId);
	}

	/**
	* Returns the group ID of this me asset cat care.
	*
	* @return the group ID of this me asset cat care
	*/
	@Override
	public long getGroupId() {
		return _meAssetCatCare.getGroupId();
	}

	/**
	* Sets the group ID of this me asset cat care.
	*
	* @param groupId the group ID of this me asset cat care
	*/
	@Override
	public void setGroupId(long groupId) {
		_meAssetCatCare.setGroupId(groupId);
	}

	/**
	* Returns the company ID of this me asset cat care.
	*
	* @return the company ID of this me asset cat care
	*/
	@Override
	public long getCompanyId() {
		return _meAssetCatCare.getCompanyId();
	}

	/**
	* Sets the company ID of this me asset cat care.
	*
	* @param companyId the company ID of this me asset cat care
	*/
	@Override
	public void setCompanyId(long companyId) {
		_meAssetCatCare.setCompanyId(companyId);
	}

	/**
	* Returns the user ID of this me asset cat care.
	*
	* @return the user ID of this me asset cat care
	*/
	@Override
	public long getUserId() {
		return _meAssetCatCare.getUserId();
	}

	/**
	* Sets the user ID of this me asset cat care.
	*
	* @param userId the user ID of this me asset cat care
	*/
	@Override
	public void setUserId(long userId) {
		_meAssetCatCare.setUserId(userId);
	}

	/**
	* Returns the user uuid of this me asset cat care.
	*
	* @return the user uuid of this me asset cat care
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.lang.String getUserUuid()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _meAssetCatCare.getUserUuid();
	}

	/**
	* Sets the user uuid of this me asset cat care.
	*
	* @param userUuid the user uuid of this me asset cat care
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_meAssetCatCare.setUserUuid(userUuid);
	}

	/**
	* Returns the user name of this me asset cat care.
	*
	* @return the user name of this me asset cat care
	*/
	@Override
	public java.lang.String getUserName() {
		return _meAssetCatCare.getUserName();
	}

	/**
	* Sets the user name of this me asset cat care.
	*
	* @param userName the user name of this me asset cat care
	*/
	@Override
	public void setUserName(java.lang.String userName) {
		_meAssetCatCare.setUserName(userName);
	}

	/**
	* Returns the create date of this me asset cat care.
	*
	* @return the create date of this me asset cat care
	*/
	@Override
	public java.util.Date getCreateDate() {
		return _meAssetCatCare.getCreateDate();
	}

	/**
	* Sets the create date of this me asset cat care.
	*
	* @param createDate the create date of this me asset cat care
	*/
	@Override
	public void setCreateDate(java.util.Date createDate) {
		_meAssetCatCare.setCreateDate(createDate);
	}

	/**
	* Returns the modified date of this me asset cat care.
	*
	* @return the modified date of this me asset cat care
	*/
	@Override
	public java.util.Date getModifiedDate() {
		return _meAssetCatCare.getModifiedDate();
	}

	/**
	* Sets the modified date of this me asset cat care.
	*
	* @param modifiedDate the modified date of this me asset cat care
	*/
	@Override
	public void setModifiedDate(java.util.Date modifiedDate) {
		_meAssetCatCare.setModifiedDate(modifiedDate);
	}

	/**
	* Returns the asset cat ID of this me asset cat care.
	*
	* @return the asset cat ID of this me asset cat care
	*/
	@Override
	public long getAssetCatId() {
		return _meAssetCatCare.getAssetCatId();
	}

	/**
	* Sets the asset cat ID of this me asset cat care.
	*
	* @param assetCatId the asset cat ID of this me asset cat care
	*/
	@Override
	public void setAssetCatId(long assetCatId) {
		_meAssetCatCare.setAssetCatId(assetCatId);
	}

	@Override
	public boolean isNew() {
		return _meAssetCatCare.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_meAssetCatCare.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _meAssetCatCare.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_meAssetCatCare.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _meAssetCatCare.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _meAssetCatCare.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_meAssetCatCare.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _meAssetCatCare.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_meAssetCatCare.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_meAssetCatCare.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_meAssetCatCare.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new MeAssetCatCareWrapper((MeAssetCatCare)_meAssetCatCare.clone());
	}

	@Override
	public int compareTo(com.j2eecn.mcat.model.MeAssetCatCare meAssetCatCare) {
		return _meAssetCatCare.compareTo(meAssetCatCare);
	}

	@Override
	public int hashCode() {
		return _meAssetCatCare.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.j2eecn.mcat.model.MeAssetCatCare> toCacheModel() {
		return _meAssetCatCare.toCacheModel();
	}

	@Override
	public com.j2eecn.mcat.model.MeAssetCatCare toEscapedModel() {
		return new MeAssetCatCareWrapper(_meAssetCatCare.toEscapedModel());
	}

	@Override
	public com.j2eecn.mcat.model.MeAssetCatCare toUnescapedModel() {
		return new MeAssetCatCareWrapper(_meAssetCatCare.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _meAssetCatCare.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _meAssetCatCare.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_meAssetCatCare.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof MeAssetCatCareWrapper)) {
			return false;
		}

		MeAssetCatCareWrapper meAssetCatCareWrapper = (MeAssetCatCareWrapper)obj;

		if (Validator.equals(_meAssetCatCare,
					meAssetCatCareWrapper._meAssetCatCare)) {
			return true;
		}

		return false;
	}

	@Override
	public StagedModelType getStagedModelType() {
		return _meAssetCatCare.getStagedModelType();
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public MeAssetCatCare getWrappedMeAssetCatCare() {
		return _meAssetCatCare;
	}

	@Override
	public MeAssetCatCare getWrappedModel() {
		return _meAssetCatCare;
	}

	@Override
	public void resetOriginalValues() {
		_meAssetCatCare.resetOriginalValues();
	}

	private MeAssetCatCare _meAssetCatCare;
}