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

import com.j2eecn.mcat.model.MeAssetCat;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing MeAssetCat in entity cache.
 *
 * @author Administrator
 * @see MeAssetCat
 * @generated
 */
public class MeAssetCatCacheModel implements CacheModel<MeAssetCat>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(39);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", assetCatId=");
		sb.append(assetCatId);
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
		sb.append("}");

		return sb.toString();
	}

	@Override
	public MeAssetCat toEntityModel() {
		MeAssetCatImpl meAssetCatImpl = new MeAssetCatImpl();

		if (uuid == null) {
			meAssetCatImpl.setUuid(StringPool.BLANK);
		}
		else {
			meAssetCatImpl.setUuid(uuid);
		}

		meAssetCatImpl.setAssetCatId(assetCatId);
		meAssetCatImpl.setGroupId(groupId);
		meAssetCatImpl.setCompanyId(companyId);
		meAssetCatImpl.setUserId(userId);

		if (userName == null) {
			meAssetCatImpl.setUserName(StringPool.BLANK);
		}
		else {
			meAssetCatImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			meAssetCatImpl.setCreateDate(null);
		}
		else {
			meAssetCatImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			meAssetCatImpl.setModifiedDate(null);
		}
		else {
			meAssetCatImpl.setModifiedDate(new Date(modifiedDate));
		}

		meAssetCatImpl.setStatus(status);
		meAssetCatImpl.setStatusByUserId(statusByUserId);

		if (statusByUserName == null) {
			meAssetCatImpl.setStatusByUserName(StringPool.BLANK);
		}
		else {
			meAssetCatImpl.setStatusByUserName(statusByUserName);
		}

		if (statusDate == Long.MIN_VALUE) {
			meAssetCatImpl.setStatusDate(null);
		}
		else {
			meAssetCatImpl.setStatusDate(new Date(statusDate));
		}

		if (name == null) {
			meAssetCatImpl.setName(StringPool.BLANK);
		}
		else {
			meAssetCatImpl.setName(name);
		}

		if (desc == null) {
			meAssetCatImpl.setDesc(StringPool.BLANK);
		}
		else {
			meAssetCatImpl.setDesc(desc);
		}

		meAssetCatImpl.setUseStatus(useStatus);

		if (code == null) {
			meAssetCatImpl.setCode(StringPool.BLANK);
		}
		else {
			meAssetCatImpl.setCode(code);
		}

		meAssetCatImpl.setMngId(mngId);
		meAssetCatImpl.setMngName(mngName);

		if (codeAndName == null) {
			meAssetCatImpl.setCodeAndName(StringPool.BLANK);
		}
		else {
			meAssetCatImpl.setCodeAndName(codeAndName);
		}

		meAssetCatImpl.resetOriginalValues();

		return meAssetCatImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();
		assetCatId = objectInput.readLong();
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
		useStatus = objectInput.readInt();
		code = objectInput.readUTF();
		mngId = objectInput.readLong();
		mngName = objectInput.readLong();
		codeAndName = objectInput.readUTF();
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

		objectOutput.writeLong(assetCatId);
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
	}

	public String uuid;
	public long assetCatId;
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
	public int useStatus;
	public String code;
	public long mngId;
	public long mngName;
	public String codeAndName;
}