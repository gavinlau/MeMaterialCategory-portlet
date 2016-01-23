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

import java.util.List;

import com.j2eecn.mcat.model.MeAssetCat;
import com.j2eecn.mcat.service.base.MeAssetCatLocalServiceBaseImpl;
import com.liferay.portal.kernel.util.OrderByComparator;

/**
 * The implementation of the me asset cat local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.j2eecn.mcat.service.MeAssetCatLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Administrator
 * @see com.j2eecn.mcat.service.base.MeAssetCatLocalServiceBaseImpl
 * @see com.j2eecn.mcat.service.MeAssetCatLocalServiceUtil
 */
public class MeAssetCatLocalServiceImpl extends MeAssetCatLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link com.j2eecn.mcat.service.MeAssetCatLocalServiceUtil} to access the me asset cat local service.
	 */
	//Advanced
	public List<MeAssetCat> findByN_C_NC(String name,String code,String codeAndName,boolean andOperator,int start,int end,OrderByComparator obc)
	{
		return meAssetCatFinder.findByN_C_NC(name, code, codeAndName, andOperator, start, end, obc);
	}
	public Integer countByN_C_NC(String name,String code,String codeAndName,boolean andOperator)
	{
		return meAssetCatFinder.countByN_C_NC(name, code, codeAndName, andOperator);
	}
	//Simple
	public List<MeAssetCat> findByKeywords(String keywords,boolean andOperator,int start,int end,OrderByComparator obc)
	{
		return meAssetCatFinder.findByKeywords(keywords, andOperator, start, end, obc);
	}
	
	public Integer countByKeywords(String keywords,boolean andOperator,int start,int end,OrderByComparator obc)
	{
		return meAssetCatFinder.countByKeywords(keywords, andOperator, start, end, obc);
	}
}