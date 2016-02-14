package com.j2eecn.mcat;

import java.io.IOException;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletException;
import javax.servlet.http.HttpServletResponse;

import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.util.PortalUtil;
import com.liferay.util.bridges.mvc.MVCPortlet;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.servlet.ServletResponseUtil;

/**
 * Portlet implementation class MeCategoryPortlet
 */
public class MeCategoryPortlet extends MVCPortlet {

	public void searchAssetCat(ActionRequest actionRequest,
			ActionResponse actionResponse) throws IOException, PortletException {
		JSONObject jsonObject = JSONFactoryUtil.createJSONObject();

		jsonObject.put("success", true);

		HttpServletResponse response = PortalUtil.getHttpServletResponse(
			actionResponse);

		ServletResponseUtil.write(response, jsonObject.toString());
	}
}
