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

package com.j2eecn.mcat.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link MeAssetCatCareService}.
 *
 * @author Administrator
 * @see MeAssetCatCareService
 * @generated
 */
public class MeAssetCatCareServiceWrapper implements MeAssetCatCareService,
	ServiceWrapper<MeAssetCatCareService> {
	public MeAssetCatCareServiceWrapper(
		MeAssetCatCareService meAssetCatCareService) {
		_meAssetCatCareService = meAssetCatCareService;
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _meAssetCatCareService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_meAssetCatCareService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _meAssetCatCareService.invokeMethod(name, parameterTypes,
			arguments);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public MeAssetCatCareService getWrappedMeAssetCatCareService() {
		return _meAssetCatCareService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedMeAssetCatCareService(
		MeAssetCatCareService meAssetCatCareService) {
		_meAssetCatCareService = meAssetCatCareService;
	}

	@Override
	public MeAssetCatCareService getWrappedService() {
		return _meAssetCatCareService;
	}

	@Override
	public void setWrappedService(MeAssetCatCareService meAssetCatCareService) {
		_meAssetCatCareService = meAssetCatCareService;
	}

	private MeAssetCatCareService _meAssetCatCareService;
}