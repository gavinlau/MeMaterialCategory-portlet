<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@page import="com.j2eecn.mcat.search.*"%>
<portlet:defineObjects />
<%@include file="init.jsp"%>
<portlet:actionURL name="initialAssetCat" var="initialAssetCatActionURL"/>
<aui:form name="assetCatInitalForm" enctype="multipart/form-data" method="post" action="${initialAssetCatActionURL }">
   <aui:input name="initialAssetCatFile" type="file"/>
     <aui:button type="submit"/>
</aui:form>
	