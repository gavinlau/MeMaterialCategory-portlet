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

package com.j2eecn.mcat.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.j2eecn.mcat.model.MeAssetCatCare;
import com.j2eecn.mcat.service.base.MeAssetCatCareLocalServiceBaseImpl;
import com.liferay.portal.kernel.exception.SystemException;

/**
 * The implementation of the me asset cat care local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.j2eecn.mcat.service.MeAssetCatCareLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Administrator
 * @see com.j2eecn.mcat.service.base.MeAssetCatCareLocalServiceBaseImpl
 * @see com.j2eecn.mcat.service.MeAssetCatCareLocalServiceUtil
 */
public class MeAssetCatCareLocalServiceImpl
	extends MeAssetCatCareLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link com.j2eecn.mcat.service.MeAssetCatCareLocalServiceUtil} to access the me asset cat care local service.
	 */
	public List<MeAssetCatCare> findByUserId(long userId) throws SystemException {
		List<MeAssetCatCare> target=null;
		target=meAssetCatCarePersistence.findByUserId(userId);
		return target;
	}
	public boolean isCare(long userId,long assetCatId) throws SystemException {
		boolean target=false;
		List<MeAssetCatCare> tmp=null;
		tmp=meAssetCatCarePersistence.findByU_ACID(userId, assetCatId);
		target=(tmp!=null && tmp.size()>0)?true:false;
		return target;
	}
}