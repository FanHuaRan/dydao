package com.evanf.dydao.hibernate.impl;

import java.util.List;
import java.util.Map;

import com.evanf.dydao.hibernate.IHibernateDynamicComplexDao;
/**
 * Hibernate动态复杂的数据库访问实现
 * created on Nov 17, 2017
 * @author evanf
 *
 */
public class HibernateDynamicComplexDaoImpl implements IHibernateDynamicComplexDao {

	@Override
	public Map<String, Object> getAliasMapBySql(String sql, Object... params) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Map<Integer, Object> getMapBySql(String sql, Object... params) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object[] getArrayBySql(String sql, Object... params) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <T> T getValueObjectBySql(Class<T> cls, String sql, Object... params) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Map<String, Object>> getListAliasMapBySql(String sql, Object... params) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Map<String, Object>> getListMapBySql(String sql, Object... params) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Object[]> getListArrayBySql(String sql, Object... params) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <T> List<T> getListValueObjectBySql(Class<T> cls, String sql, Object... params) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void executeSql(String sql, Object... params) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void executeSqls(String[] sqls, Object... params) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int executeSqlAndGetCount(String sql, Object... params) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Map<String, Object> getAliasMapByHql(String hql, Object... params) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Map<Integer, Object> getMapByHql(String hql, Object... params) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object[] getArrayByHql(String hql, Object... params) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <T> T getValueObjectByHql(Class<T> cls, String hql, Object... params) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Map<String, Object>> getListAliasMapByHql(String hql, Object... params) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Map<String, Object>> getListMapByHql(String hql, Object... params) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Object[]> getListArrayByHql(String hql, Object... params) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <T> List<T> getListValueObjectByHql(Class<T> cls, String hql, Object... params) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void executeHql(String hql, Object... params) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void executehqls(String[] hqls, Object... params) {
		// TODO Auto-generated method stub
		
	}

}
