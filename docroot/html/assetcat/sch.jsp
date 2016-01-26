<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@page import="com.j2eecn.mcat.search.*"%>
<portlet:defineObjects />
<%@include file="init.jsp"%>
<%
MeAssetCatSearch  searchContainer = (MeAssetCatSearch)request.getAttribute("liferay-ui:search:searchContainer");
MeAssetCatDisplayTerms displayTerms = (MeAssetCatDisplayTerms)searchContainer.getDisplayTerms();
MeAssetCatSearchTerms searchTerms = (MeAssetCatSearchTerms)searchContainer.getSearchTerms();

%>
<liferay-ui:search-toggle
	buttonLabel="search"
	displayTerms="<%= searchContainer.getDisplayTerms() %>"
	id="toggle_id_metCat_search">
	<aui:fieldset>
	   <aui:input label="assetCat-name" name="<%=displayTerms.NAME %>" value="<%= displayTerms.getName() %>" size="20"/>
	   <aui:input label="assetCat-code" name="<%=displayTerms.CODE %>" value="<%= displayTerms.getCode() %>" size="20"/>
	   <aui:input label="assetCat-codeAndName" name="<%=displayTerms.CODEANDNAME %>" value="<%= displayTerms.getCodeAndName() %>" size="20"/>
	</aui:fieldset>
</liferay-ui:search-toggle>
	