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

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.j2eecn.mcat.service.http.MeCategoryServiceSoap}.
 *
 * @author Administrator
 * @see com.j2eecn.mcat.service.http.MeCategoryServiceSoap
 * @generated
 */
public class MeCategorySoap implements Serializable {
	public static MeCategorySoap toSoapModel(MeCategory model) {
		MeCategorySoap soapModel = new MeCategorySoap();

		soapModel.setUuid(model.getUuid());
		soapModel.setCatId(model.getCatId());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setUserId(model.getUserId());
		soapModel.setUserName(model.getUserName());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setStatus(model.getStatus());
		soapModel.setStatusByUserId(model.getStatusByUserId());
		soapModel.setStatusByUserName(model.getStatusByUserName());
		soapModel.setStatusDate(model.getStatusDate());
		soapModel.setName(model.getName());
		soapModel.setDesc(model.getDesc());
		soapModel.setRemark(model.getRemark());
		soapModel.setUseStatus(model.getUseStatus());
		soapModel.setCode(model.getCode());
		soapModel.setMngId(model.getMngId());
		soapModel.setMngName(model.getMngName());
		soapModel.setCodeAndName(model.getCodeAndName());
		soapModel.setFullName(model.getFullName());
		soapModel.setAssetCatId(model.getAssetCatId());

		return soapModel;
	}

	public static MeCategorySoap[] toSoapModels(MeCategory[] models) {
		MeCategorySoap[] soapModels = new MeCategorySoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static MeCategorySoap[][] toSoapModels(MeCategory[][] models) {
		MeCategorySoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new MeCategorySoap[models.length][models[0].length];
		}
		else {
			soapModels = new MeCategorySoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static MeCategorySoap[] toSoapModels(List<MeCategory> models) {
		List<MeCategorySoap> soapModels = new ArrayList<MeCategorySoap>(models.size());

		for (MeCategory model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new MeCategorySoap[soapModels.size()]);
	}

	public MeCategorySoap() {
	}

	public long getPrimaryKey() {
		return _catId;
	}

	public void setPrimaryKey(long pk) {
		setCatId(pk);
	}

	public String getUuid() {
		return _uuid;
	}

	public void setUuid(String uuid) {
		_uuid = uuid;
	}

	public long getCatId() {
		return _catId;
	}

	public void setCatId(long catId) {
		_catId = catId;
	}

	public long getGroupId() {
		return _groupId;
	}

	public void setGroupId(long groupId) {
		_groupId = groupId;
	}

	public long getCompanyId() {
		return _companyId;
	}

	public void setCompanyId(long companyId) {
		_companyId = companyId;
	}

	public long getUserId() {
		return _userId;
	}

	public void setUserId(long userId) {
		_userId = userId;
	}

	public String getUserName() {
		return _userName;
	}

	public void setUserName(String userName) {
		_userName = userName;
	}

	public Date getCreateDate() {
		return _createDate;
	}

	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	public Date getModifiedDate() {
		return _modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;
	}

	public int getStatus() {
		return _status;
	}

	public void setStatus(int status) {
		_status = status;
	}

	public long getStatusByUserId() {
		return _statusByUserId;
	}

	public void setStatusByUserId(long statusByUserId) {
		_statusByUserId = statusByUserId;
	}

	public String getStatusByUserName() {
		return _statusByUserName;
	}

	public void setStatusByUserName(String statusByUserName) {
		_statusByUserName = statusByUserName;
	}

	public Date getStatusDate() {
		return _statusDate;
	}

	public void setStatusDate(Date statusDate) {
		_statusDate = statusDate;
	}

	public String getName() {
		return _name;
	}

	public void setName(String name) {
		_name = name;
	}

	public String getDesc() {
		return _desc;
	}

	public void setDesc(String desc) {
		_desc = desc;
	}

	public String getRemark() {
		return _remark;
	}

	public void setRemark(String remark) {
		_remark = remark;
	}

	public int getUseStatus() {
		return _useStatus;
	}

	public void setUseStatus(int useStatus) {
		_useStatus = useStatus;
	}

	public String getCode() {
		return _code;
	}

	public void setCode(String code) {
		_code = code;
	}

	public long getMngId() {
		return _mngId;
	}

	public void setMngId(long mngId) {
		_mngId = mngId;
	}

	public long getMngName() {
		return _mngName;
	}

	public void setMngName(long mngName) {
		_mngName = mngName;
	}

	public String getCodeAndName() {
		return _codeAndName;
	}

	public void setCodeAndName(String codeAndName) {
		_codeAndName = codeAndName;
	}

	public String getFullName() {
		return _fullName;
	}

	public void setFullName(String fullName) {
		_fullName = fullName;
	}

	public long getAssetCatId() {
		return _assetCatId;
	}

	public void setAssetCatId(long assetCatId) {
		_assetCatId = assetCatId;
	}

	private String _uuid;
	private long _catId;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private int _status;
	private long _statusByUserId;
	private String _statusByUserName;
	private Date _statusDate;
	private String _name;
	private String _desc;
	private String _remark;
	private int _useStatus;
	private String _code;
	private long _mngId;
	private long _mngName;
	private String _codeAndName;
	private String _fullName;
	private long _assetCatId;
}