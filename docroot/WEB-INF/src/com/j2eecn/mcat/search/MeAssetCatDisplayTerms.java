package com.j2eecn.mcat.search;

import javax.portlet.PortletRequest;

import com.liferay.portal.kernel.dao.search.DisplayTerms;
import com.liferay.portal.kernel.util.ParamUtil;

public class MeAssetCatDisplayTerms extends DisplayTerms{
	public static final String NAME="name";
	public static final String CODE="code";
	public static final String CODEANDNAME="codeAndName";
	
	public MeAssetCatDisplayTerms(PortletRequest portletRequest) {
		super(portletRequest);
		name=ParamUtil.getString(portletRequest, NAME);
		code=ParamUtil.getString(portletRequest, CODE);
		codeAndName=ParamUtil.getString(portletRequest, CODEANDNAME);
	}
	
	
	protected String name;
	protected String code;
	protected String codeAndName;
	protected int useStatus;
	protected String userName;
	protected long mngName;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getCodeAndName() {
		return codeAndName;
	}
	public void setCodeAndName(String codeAndName) {
		this.codeAndName = codeAndName;
	}
	public int getUseStatus() {
		return useStatus;
	}
	public void setUseStatus(int useStatus) {
		this.useStatus = useStatus;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public long getMngName() {
		return mngName;
	}
	public void setMngName(long mngName) {
		this.mngName = mngName;
	}


	
	
}
