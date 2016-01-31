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

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing MeAssetCatCare in entity cache.
 *
 * @author Administrator
 * @see MeAssetCatCare
 * @generated
 */
public class MeAssetCatCareCacheModel implements CacheModel<MeAssetCatCare>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(19);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", assetCatCareId=");
		sb.append(assetCatCareId);
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
		sb.append(", assetCatId=");
		sb.append(assetCatId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public MeAssetCatCare toEntityModel() {
		MeAssetCatCareImpl meAssetCatCareImpl = new MeAssetCatCareImpl();

		if (uuid == null) {
			meAssetCatCareImpl.setUuid(StringPool.BLANK);
		}
		else {
			meAssetCatCareImpl.setUuid(uuid);
		}

		meAssetCatCareImpl.setAssetCatCareId(assetCatCareId);
		meAssetCatCareImpl.setGroupId(groupId);
		meAssetCatCareImpl.setCompanyId(companyId);
		meAssetCatCareImpl.setUserId(userId);

		if (userName == null) {
			meAssetCatCareImpl.setUserName(StringPool.BLANK);
		}
		else {
			meAssetCatCareImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			meAssetCatCareImpl.setCreateDate(null);
		}
		else {
			meAssetCatCareImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			meAssetCatCareImpl.setModifiedDate(null);
		}
		else {
			meAssetCatCareImpl.setModifiedDate(new Date(modifiedDate));
		}

		meAssetCatCareImpl.setAssetCatId(assetCatId);

		meAssetCatCareImpl.resetOriginalValues();

		return meAssetCatCareImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();
		assetCatCareId = objectInput.readLong();
		groupId = objectInput.readLong();
		companyId = objectInput.readLong();
		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
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

		objectOutput.writeLong(assetCatCareId);
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
		objectOutput.writeLong(assetCatId);
	}

	public String uuid;
	public long assetCatCareId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public long assetCatId;
}