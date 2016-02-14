
<%@page import="com.j2eecn.mcat.service.MeAssetCatLocalServiceUtil"%>
<%@page import="com.j2eecn.mcat.service.persistence.MeAssetCatUtil"%>
<%@page import="com.j2eecn.mcat.model.MeAssetCat"%>
<%@page import="com.j2eecn.mcat.search.*"%>
<%@page import="com.liferay.portal.kernel.dao.search.RowChecker"%>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<portlet:defineObjects />
<%@include file="init.jsp"%>
<portlet:renderURL var="addURL">
	<portlet:param name="mvcPath" value="${basePath}}/add.jsp" />
</portlet:renderURL>
<portlet:renderURL var="backURL">
	<portlet:param name="mvcPath" value="${basePath}}/lst.jsp" />
</portlet:renderURL>

<portlet:resourceURL var=""/>
<portlet:renderURL var="getAssetCatSearchActionURL">
	<portlet:param name="mvcPath" value="${basePath}}/lst.jsp" />
</portlet:renderURL>

<aui:layout>
   <aui:column first="true" columnWidth="30">
     <liferay-ui:header backURL="<%= backURL %>" title='supplier-view'/>
     <aui:form action="${getAssetCatSearchActionURL }" method="post" name="fm" onSubmit="event.preventDefault();">
	     <div class="row-fluid">
	        
	     </div>
     </aui:form>
   </aui:column>
   <aui:column first="last" columnWidth="70">
      
   </aui:column>
</aui:layout>
<aui:script>
	
</aui:script>
