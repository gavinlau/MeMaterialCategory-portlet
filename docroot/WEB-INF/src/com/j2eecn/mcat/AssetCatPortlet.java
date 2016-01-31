package com.j2eecn.mcat;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Date;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletException;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

import com.j2eecn.mcat.model.MeAssetCat;
import com.liferay.counter.service.CounterLocalServiceUtil;
import com.liferay.counter.service.persistence.CounterUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.io.ByteArrayFileInputStream;
import com.liferay.portal.kernel.json.JSONArray;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.PortletResponseUtil;
import com.liferay.portal.kernel.repository.model.FileEntry;
import com.liferay.portal.kernel.servlet.SessionErrors;
import com.liferay.portal.kernel.upload.UploadPortletRequest;
import com.liferay.portal.kernel.util.CharPool;
import com.liferay.portal.kernel.util.ContentTypes;
import com.liferay.portal.kernel.util.FileUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.MimeTypesUtil;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.PrefsPropsUtil;
import com.liferay.portal.kernel.util.PropsKeys;
import com.liferay.portal.kernel.util.StreamUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.WebKeys;
import com.liferay.portal.kernel.uuid.PortalUUIDUtil;
import com.liferay.portal.model.Role;
import com.liferay.portal.model.User;
import com.liferay.portal.service.RoleLocalServiceUtil;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.service.ServiceContextFactory;
import com.liferay.portal.service.UserLocalServiceUtil;
import com.liferay.portal.theme.ThemeDisplay;
import com.liferay.portal.util.PortalUtil;
import com.liferay.portlet.PortletURLFactoryUtil;
import com.liferay.portlet.documentlibrary.FileExtensionException;
import com.liferay.portlet.documentlibrary.FileNameException;
import com.liferay.portlet.documentlibrary.FileSizeException;
import com.liferay.portlet.documentlibrary.model.DLFileEntry;
import com.liferay.portlet.documentlibrary.service.DLAppLocalServiceUtil;
import com.liferay.util.bridges.mvc.MVCPortlet;
import com.liferay.util.portlet.PortletProps;
import com.liferay.util.bridges.mvc.MVCPortlet;

/**
 * Portlet implementation class AssetCatPortlet
 */
public class AssetCatPortlet extends MVCPortlet {

	public void initialAssetCat(ActionRequest actionRequest,
			ActionResponse actionResponse) throws IOException, PortletException {
		_log.info("In initialAssetCat");
		ServiceContext serviceContext = null;
		try {
			serviceContext = ServiceContextFactory.getInstance(
					DLFileEntry.class.getName(), actionRequest);
		} catch (PortalException e1) {
			_log.error(e1.getMessage());
			e1.printStackTrace();
		} catch (SystemException e1) {
			_log.error(e1.getMessage());
			e1.printStackTrace();
		}

		User user = null;
		try {
			user = UserLocalServiceUtil.getUser(serviceContext.getUserId());
		} catch (PortalException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		} catch (SystemException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
		
		String now="NOW()";
		//String strNow=
		UploadPortletRequest uploadPortletRequest = PortalUtil
				.getUploadPortletRequest(actionRequest);
		InputStream inputStream = null;
		inputStream = uploadPortletRequest.getFileAsStream("initialAssetCatFile");
		File tmpfile=FileUtil.createTempFile(inputStream);
		File sqlFile=FileUtil.createTempFile("SQL-", "txt");
		try {
			Workbook rw = Workbook.getWorkbook(tmpfile);
			Sheet sheet_0=rw.getSheet(0);
			for(int i=0;i<sheet_0.getRows();i++)
			{
				
					
					String name=sheet_0.getCell(0, i).getContents();
					String code=sheet_0.getCell(1, i).getContents();
					String desc=sheet_0.getCell(2, i).getContents();
					String codeAndName="["+code+"]"+name;
					String uuid=PortalUUIDUtil.generate();
					long entryId=0l;
					try {
						 entryId=CounterLocalServiceUtil.increment(MeAssetCat.class.toString());
					} catch (SystemException e) {
						_log.error(e.getMessage());
						e.printStackTrace();
					}
					long groupId = serviceContext.getScopeGroupId();
					long comanyId=serviceContext.getCompanyId();
					
					String sql="INSERT INTO meassetcat(uuid_, assetCatId, groupId, companyId, userId, userName, createDate, modifiedDate, status, statusByUserId, statusByUserName, statusDate, name, desc_, useStatus, code_, mngId, mngName, codeAndName) VALUES "
							+ "('"+uuid+"', "+entryId+", "+groupId+", "+comanyId+", "+user.getUserId()+", '"+user.getScreenName()+"', "+now+", "+now+", 1, "+user.getUserId()+", '"+user.getScreenName()+"', "+now+", '"+name+"', '"+desc+"', 1, '"+code+"', "+user.getUserId()+", '"+user.getScreenName()+"', '"+codeAndName+"');";
				
					FileUtil.write(sqlFile, sql, true, true);
			}
			
		} catch (BiffException e) {
			_log.error(e.getMessage());
		}
		
		
	}
	private static Log _log = LogFactoryUtil.getLog(AssetCatPortlet.class);
}
