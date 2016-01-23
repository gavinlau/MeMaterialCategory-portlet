package com.j2eecn.mcat.service.persistence;

import java.util.ArrayList;
import java.util.List;
import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.SQLQuery;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.dao.orm.Type;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.service.RoleLocalServiceUtil;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;
import com.liferay.portlet.rolesadmin.util.RolesAdminUtil;
import com.liferay.util.dao.orm.CustomSQLUtil;

import com.j2eecn.mcat.model.MeAssetCat;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;
import com.liferay.util.dao.orm.CustomSQLUtil;


public class MeAssetCatFinderImpl extends BasePersistenceImpl<MeAssetCat> implements MeAssetCatFinder{
	public static final String  FIND_BY_N_C_NC=MeAssetCatFinder.class.getName()+".findByN_C_NC";
	public static final String  COUNT_BY_N_C_NC=MeAssetCatFinder.class.getName()+".countByN_C_NC";
	public List<MeAssetCat> findByN_C_NC(String name,String code,String codeAndName,boolean andOperator,int start,int end,OrderByComparator obc)
	{
		List<MeAssetCat> target=new ArrayList<MeAssetCat>();
		String[] names = CustomSQLUtil.keywords(name);
		String[] codes = CustomSQLUtil.keywords(code);
		String[] nameAndCodes = CustomSQLUtil.keywords(codeAndName);
		Session session = null;
		session=openSession();
		String sql = CustomSQLUtil.get(FIND_BY_N_C_NC);
		sql = CustomSQLUtil.replaceKeywords(
				sql, "lower(ent.name)", StringPool.LIKE, false,
				names);
		sql = CustomSQLUtil.replaceKeywords(
				sql, "lower(ent.code)", StringPool.LIKE, false,
				codes);
		sql = CustomSQLUtil.replaceKeywords(
				sql, "lower(ent.codeAndName)", StringPool.LIKE, false,
				nameAndCodes);
		sql = CustomSQLUtil.replaceAndOperator(sql, andOperator);
		
		StringBundler sb = new StringBundler(sql);
		if (obc == null) {
			sb.append(" ORDER BY ");
			sb.append("modifiedDate desc");
		}
		
		sql=sb.toString();
		
		SQLQuery q = session.createSQLQuery(sql);
		QueryPos qPos = QueryPos.getInstance(q);
		
		qPos.add(names,2);
		qPos.add(codes,2);
		qPos.add(nameAndCodes,2);
		
		target = (List<MeAssetCat>)QueryUtil.list(
				q, getDialect(), start, end);
		closeSession(session);
		return target;
	}
	public Integer countByN_C_NC(String name,String code,String codeAndName,boolean andOperator)
	{
		Integer target=0;
		String[] names = CustomSQLUtil.keywords(name);
		String[] codes = CustomSQLUtil.keywords(code);
		String[] nameAndCodes = CustomSQLUtil.keywords(codeAndName);
		Session session = null;
		session=openSession();
		String sql = CustomSQLUtil.get(COUNT_BY_N_C_NC);
		sql = CustomSQLUtil.replaceKeywords(
				sql, "lower(ent.name)", StringPool.LIKE, false,
				names);
		sql = CustomSQLUtil.replaceKeywords(
				sql, "lower(ent.code)", StringPool.LIKE, false,
				codes);
		sql = CustomSQLUtil.replaceKeywords(
				sql, "lower(ent.codeAndName)", StringPool.LIKE, false,
				nameAndCodes);
		sql = CustomSQLUtil.replaceAndOperator(sql, andOperator);
		
		StringBundler sb = new StringBundler(sql);
		
		
		sql=sb.toString();
		
		SQLQuery q = session.createSQLQuery(sql);
		q.addScalar("cnt", Type.INTEGER);
		QueryPos qPos = QueryPos.getInstance(q);
		
		qPos.add(names,2);
		qPos.add(codes,2);
		qPos.add(nameAndCodes,2);
		
	   target=(Integer)q.uniqueResult();
		
//		List<Long> list= (List<Long>)QueryUtil.list(
//				q, getDialect(), -1, -1);
		
//		target=list.get(0);
		closeSession(session);
		
		return target;
	}
	
	public List<MeAssetCat> findByKeywords(String keywords,boolean andOperator,int start,int end,OrderByComparator obc)
	{
		List<MeAssetCat> target=new ArrayList<MeAssetCat>();
		String name="";
		String code="";
		String codeAndName="";
		
		if (Validator.isNotNull(keywords)) {
			name = keywords;
			code = keywords;
			codeAndName = keywords;
		}
		else {
			andOperator = true;
		}
		
		return findByN_C_NC(name, code, codeAndName, andOperator, start, end, obc);
		
	}
	public Integer countByKeywords(String keywords,boolean andOperator,int start,int end,OrderByComparator obc)
	{
		
		String name="";
		String code="";
		String codeAndName="";
		
		if (Validator.isNotNull(keywords)) {
			name = keywords;
			code = keywords;
			codeAndName = keywords;
		}
		else {
			andOperator = true;
		}
		return countByN_C_NC(name, code, codeAndName, andOperator);
	}
	
}
