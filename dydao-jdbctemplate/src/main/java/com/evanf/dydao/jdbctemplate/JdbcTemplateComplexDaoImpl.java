package com.evanf.dydao.jdbctemplate;

import java.util.List;
import java.util.Map;

import com.evanf.dydao.core.IJdbcDynamicComplexDao;
/**
 * jdbc动态复杂的数据库访问实现
 * created on Nov 17, 2017
 * @author evanf
 *
 */
public class JdbcTemplateComplexDaoImpl implements IJdbcDynamicComplexDao {

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

}
