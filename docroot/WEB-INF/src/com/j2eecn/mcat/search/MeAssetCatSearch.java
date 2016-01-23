package com.j2eecn.mcat.search;
import com.liferay.portal.kernel.dao.search.SearchContainer;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.JavaConstants;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.kernel.workflow.WorkflowConstants;
import com.liferay.portal.model.User;
import com.liferay.portal.util.PortletKeys;
import com.liferay.portlet.PortalPreferences;
import com.liferay.portlet.PortletPreferencesFactoryUtil;
import com.j2eecn.mcat.model.MeAssetCat;

import java.util.*;

import javax.portlet.PortletConfig;
import javax.portlet.PortletRequest;
import javax.portlet.PortletURL;
public class MeAssetCatSearch extends SearchContainer<MeAssetCat>{
	static List<String> headerNames = new ArrayList<String>();
	static Map<String, String> orderableHeaders = new HashMap<String, String>();
	static
	{
		headerNames.add("name");
		headerNames.add("code");
		headerNames.add("desc");
		headerNames.add("userName");
		headerNames.add("mngName");
	}
public static final String EMPTY_RESULTS_MESSAGE = "no-supplier-were-found";
	
	public MeAssetCatSearch(PortletRequest portletRequest, PortletURL iteratorURL) {
		this(portletRequest, DEFAULT_CUR_PARAM, iteratorURL);
	}
	
	public MeAssetCatSearch(PortletRequest portletRequest,
			String defaultCurParam, PortletURL iteratorURL) {
		
		MeAssetCatDisplayTerms displayTerms = (MeAssetCatDisplayTerms)getDisplayTerms();
		MeAssetCatSearchTerms searchTerms = (MeAssetCatSearchTerms)getSearchTerms();
		iteratorURL.setParameter(
				MeAssetCatDisplayTerms.NAME, displayTerms.getName());
		iteratorURL.setParameter(
				MeAssetCatDisplayTerms.CODE, displayTerms.getCode());
		iteratorURL.setParameter(
				MeAssetCatDisplayTerms.CODEANDNAME, displayTerms.getCodeAndName());
	}

	private static Log _log=LogFactoryUtil.getLog(MeAssetCatSearch.class);
}
