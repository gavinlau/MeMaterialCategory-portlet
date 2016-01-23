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

import com.j2eecn.mcat.model.MeCategory;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing MeCategory in entity cache.
 *
 * @author Administrator
 * @see MeCategory
 * @generated
 */
public class MeCategoryCacheModel implements CacheModel<MeCategory>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(45);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", catId=");
		sb.append(catId);
		sb.append(", groupId=");
		sb.append(groupId);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", userName=");
		sb.append(userName);
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append(", modifiedDate=");
		sb.append(modifiedDate);
		sb.append(", status=");
		sb.append(status);
		sb.append(", statusByUserId=");
		sb.append(statusByUserId);
		sb.append(", statusByUserName=");
		sb.append(statusByUserName);
		sb.append(", statusDate=");
		sb.append(statusDate);
		sb.append(", name=");
		sb.append(name);
		sb.append(", desc=");
		sb.append(desc);
		sb.append(", remark=");
		sb.append(remark);
		sb.append(", useStatus=");
		sb.append(useStatus);
		sb.append(", code=");
		sb.append(code);
		sb.append(", mngId=");
		sb.append(mngId);
		sb.append(", mngName=");
		sb.append(mngName);
		sb.append(", codeAndName=");
		sb.append(codeAndName);
		sb.append(", fullName=");
		sb.append(fullName);
		sb.append(", assetCatId=");
		sb.append(assetCatId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public MeCategory toEntityModel() {
		MeCategoryImpl meCategoryImpl = new MeCategoryImpl();

		if (uuid == null) {
			meCategoryImpl.setUuid(StringPool.BLANK);
		}
		else {
			meCategoryImpl.setUuid(uuid);
		}

		meCategoryImpl.setCatId(catId);
		meCategoryImpl.setGroupId(groupId);
		meCategoryImpl.setCompanyId(companyId);
		meCategoryImpl.setUserId(userId);

		if (userName == null) {
			meCategoryImpl.setUserName(StringPool.BLANK);
		}
		else {
			meCategoryImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			meCategoryImpl.setCreateDate(null);
		}
		else {
			meCategoryImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			meCategoryImpl.setModifiedDate(null);
		}
		else {
			meCategoryImpl.setModifiedDate(new Date(modifiedDate));
		}

		meCategoryImpl.setStatus(status);
		meCategoryImpl.setStatusByUserId(statusByUserId);

		if (statusByUserName == null) {
			meCategoryImpl.setStatusByUserName(StringPool.BLANK);
		}
		else {
			meCategoryImpl.setStatusByUserName(statusByUserName);
		}

		if (statusDate == Long.MIN_VALUE) {
			meCategoryImpl.setStatusDate(null);
		}
		else {
			meCategoryImpl.setStatusDate(new Date(statusDate));
		}

		if (name == null) {
			meCategoryImpl.setName(StringPool.BLANK);
		}
		else {
			meCategoryImpl.setName(name);
		}

		if (desc == null) {
			meCategoryImpl.setDesc(StringPool.BLANK);
		}
		else {
			meCategoryImpl.setDesc(desc);
		}

		if (remark == null) {
			meCategoryImpl.setRemark(StringPool.BLANK);
		}
		else {
			meCategoryImpl.setRemark(remark);
		}

		meCategoryImpl.setUseStatus(useStatus);

		if (code == null) {
			meCategoryImpl.setCode(StringPool.BLANK);
		}
		else {
			meCategoryImpl.setCode(code);
		}

		meCategoryImpl.setMngId(mngId);
		meCategoryImpl.setMngName(mngName);

		if (codeAndName == null) {
			meCategoryImpl.setCodeAndName(StringPool.BLANK);
		}
		else {
			meCategoryImpl.setCodeAndName(codeAndName);
		}

		if (fullName == null) {
			meCategoryImpl.setFullName(StringPool.BLANK);
		}
		else {
			meCategoryImpl.setFullName(fullName);
		}

		meCategoryImpl.setAssetCatId(assetCatId);

		meCategoryImpl.resetOriginalValues();

		return meCategoryImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();
		catId = objectInput.readLong();
		groupId = objectInput.readLong();
		companyId = objectInput.readLong();
		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		status = objectInput.readInt();
		statusByUserId = objectInput.readLong();
		statusByUserName = objectInput.readUTF();
		statusDate = objectInput.readLong();
		name = objectInput.readUTF();
		desc = objectInput.readUTF();
		remark = objectInput.readUTF();
		useStatus = objectInput.readInt();
		code = objectInput.readUTF();
		mngId = objectInput.readLong();
		mngName = objectInput.readLong();
		codeAndName = objectInput.readUTF();
		fullName = objectInput.readUTF();
		assetCatId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(catId);
		objectOutput.writeLong(groupId);
		objectOutput.writeLong(companyId);
		objectOutput.writeLong(userId);

		if (userName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(userName);
		}

		objectOutput.writeLong(createDate);
		objectOutput.writeLong(modifiedDate);
		objectOutput.writeInt(status);
		objectOutput.writeLong(statusByUserId);

		if (statusByUserName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(statusByUserName);
		}

		objectOutput.writeLong(statusDate);

		if (name == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(name);
		}

		if (desc == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(desc);
		}

		if (remark == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(remark);
		}

		objectOutput.writeInt(useStatus);

		if (code == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(code);
		}

		objectOutput.writeLong(mngId);
		objectOutput.writeLong(mngName);

		if (codeAndName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(codeAndName);
		}

		if (fullName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(fullName);
		}

		objectOutput.writeLong(assetCatId);
	}

	public String uuid;
	public long catId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public int status;
	public long statusByUserId;
	public String statusByUserName;
	public long statusDate;
	public String name;
	public String desc;
	public String remark;
	public int useStatus;
	public String code;
	public long mngId;
	public long mngName;
	public String codeAndName;
	public String fullName;
	public long assetCatId;
}