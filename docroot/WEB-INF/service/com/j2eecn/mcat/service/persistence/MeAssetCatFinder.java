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

/**
 * @author Administrator
 */
public interface MeAssetCatFinder {
	public java.util.List<com.j2eecn.mcat.model.MeAssetCat> findByN_C_NC(
		java.lang.String name, java.lang.String code,
		java.lang.String codeAndName, boolean andOperator, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator obc);

	public java.lang.Integer countByN_C_NC(java.lang.String name,
		java.lang.String code, java.lang.String codeAndName, boolean andOperator);

	public java.util.List<com.j2eecn.mcat.model.MeAssetCat> findByKeywords(
		java.lang.String keywords, boolean andOperator, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator obc);

	public java.lang.Integer countByKeywords(java.lang.String keywords,
		boolean andOperator, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator obc);
}