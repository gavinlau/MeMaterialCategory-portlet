<%@page import="com.j2eecn.mcat.service.MeAssetCatLocalServiceUtil"%>
<%@page import="com.j2eecn.mcat.service.persistence.MeAssetCatUtil"%>
<%@page import="com.j2eecn.mcat.model.MeAssetCat"%>
<%@page import="com.j2eecn.mcat.search.*"%>
<%@page import="com.liferay.portal.kernel.dao.search.RowChecker"%>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<portlet:defineObjects />
<%@include file="init.jsp"%>
<portlet:renderURL var="addURL">
	<portlet:param name="mvcPath" value="${basePath}/add.jsp" />
</portlet:renderURL>
<portlet:renderURL var="backURL">
	<portlet:param name="mvcPath" value="${basePath}/lst.jsp" />
</portlet:renderURL>
<aui:form name="searchForm" action="${backURL}" method="post">
<%
MeAssetCatSearch searchContainer=new MeAssetCatSearch(renderRequest, "cur1", currentURLObj);
searchContainer.setRowChecker(new RowChecker(renderResponse));
%>
  <liferay-ui:search-container  searchContainer="<%= searchContainer %>" var="meAssetCatSearchContainer"
			emptyResultsMessage="no-entries-were-found">
    <!-- Header -->
    <aui:nav-bar>
            <aui:nav>
		               <aui:nav-item href="${addURL }" label="assetInital-add" iconCssClass="icon-user"/>
		     </aui:nav>
             <aui:nav-bar-search cssClass="pull-right">
				<liferay-ui:search-form servletContext="<%= this.getServletContext()%>"	page="${basePath}/sch.jsp"/>
			</aui:nav-bar-search>
         </aui:nav-bar>
	<liferay-ui:search-container-results>
	  <%
	   MeAssetCatDisplayTerms displayTerms = (MeAssetCatDisplayTerms)searchContainer.getDisplayTerms();
		MeAssetCatSearchTerms searchTerms = (MeAssetCatSearchTerms)searchContainer.getSearchTerms();
	  if (searchTerms.isAdvancedSearch()) {
		  results=MeAssetCatLocalServiceUtil.findByN_C_NC(searchTerms.getName(), searchTerms.getCode(), searchTerms.getCodeAndName(), searchTerms.isAndOperator(), searchContainer.getStart(), searchContainer.getEnd(), null);
		  total=MeAssetCatLocalServiceUtil.countByN_C_NC(searchTerms.getName(), searchTerms.getCode(), searchTerms.getCodeAndName(), searchTerms.isAndOperator());
	  }else
	  {
		  results=MeAssetCatLocalServiceUtil.findByKeywords(searchTerms.getKeywords(), searchTerms.isAndOperator(), searchContainer.getStart(), searchContainer.getEnd(), null);
	      total=MeAssetCatLocalServiceUtil.countByKeywords(searchTerms.getKeywords(), searchTerms.isAndOperator(), searchContainer.getStart(), searchContainer.getEnd(), null);
	  }
	    pageContext.setAttribute("results", results);
		pageContext.setAttribute("total", total);
	  %>
	  
	</liferay-ui:search-container-results>
	 <liferay-ui:search-container-row className="com.j2eecn.mcat.model.MeAssetCat"  keyProperty="assetCatId" rowIdProperty="assetCatId" modelVar="assetCat">
	   <portlet:renderURL var="careURL">
                 <portlet:param name="assetCatId" value="${assetCat.assetCatId }"/>
                 <portlet:param name="mvcPath" value="/html/supplier/viw.jsp"/>
                 <portlet:param name="redirectURL" value="${backURL }"/>
        </portlet:renderURL>
          <portlet:renderURL var="notCareURL">
                 <portlet:param name="assetCatId" value="${assetCat.assetCatId }"/>
                 <portlet:param name="mvcPath" value="/html/supplier/viw.jsp"/>
                 <portlet:param name="redirectURL" value="${backURL }"/>
        </portlet:renderURL>
            
	    <liferay-ui:search-container-column-text property="code" name="assetCat-code"/>
	    <liferay-ui:search-container-column-text property="name" name="assetCat-name"/>
	      <liferay-ui:search-container-column-text name="assetCat-operation">
	      <%
	           boolean isCare=false;
	      %>
	        <c:if test="<%=isCare %>">
	          <liferay-ui:icon image="view" url="${careURL}"/>
	         </c:if>
	         <c:if test="<%=!isCare %>">
	          <liferay-ui:icon image="view" url="${notCareURL}"/>
	        </c:if>
	      </liferay-ui:search-container-column-text>
	 </liferay-ui:search-container-row>
	 <liferay-ui:search-iterator/>
   </liferay-ui:search-container>
</aui:form>

