package com.j2eecn.mcat.search;

import javax.portlet.PortletRequest;

import com.liferay.portal.kernel.dao.search.DAOParamUtil;
import com.liferay.portal.kernel.util.ParamUtil;

public class MeAssetCatSearchTerms extends MeAssetCatDisplayTerms{

	public MeAssetCatSearchTerms(PortletRequest portletRequest) {
		super(portletRequest);
		name = DAOParamUtil.getString(portletRequest, NAME);
		code=DAOParamUtil.getString(portletRequest, CODE);
		codeAndName=DAOParamUtil.getString(portletRequest, CODEANDNAME);
	}

}
