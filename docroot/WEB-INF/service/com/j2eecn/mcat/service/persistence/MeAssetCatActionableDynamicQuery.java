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

package com.j2eecn.mcat.service.persistence;

import com.j2eecn.mcat.model.MeAssetCat;
import com.j2eecn.mcat.service.MeAssetCatLocalServiceUtil;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

/**
 * @author Administrator
 * @generated
 */
public abstract class MeAssetCatActionableDynamicQuery
	extends BaseActionableDynamicQuery {
	public MeAssetCatActionableDynamicQuery() throws SystemException {
		setBaseLocalService(MeAssetCatLocalServiceUtil.getService());
		setClass(MeAssetCat.class);

		setClassLoader(com.j2eecn.mcat.service.ClpSerializer.class.getClassLoader());

		setPrimaryKeyPropertyName("assetCatId");
	}
}