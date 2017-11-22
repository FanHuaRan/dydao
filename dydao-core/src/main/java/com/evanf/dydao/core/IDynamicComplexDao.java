package com.evanf.dydao.core;

import java.util.List;
import java.util.Map;
/**
 * 动态复杂的数据库访问接口,后面加分页
 * created on Nov 17, 2017
 * @author evanf
 *
 */
public interface IDynamicComplexDao {
	/**
	 * 通过sql查询单个记录，以字段名作为key的map作为返回记录的载体
	 * @param sql
	 * @param params
	 * @return
	 */
	Map<String, Object> getAliasMapBySql(String sql,Object ...params); 
	/**
	 * 通过sql查询单个记录，以顺序index作为key的map作为返回记录的载体
	 * @param sql
	 * @param params
	 * @return
	 */
	Map<Integer, Object> getMapBySql(String sql,Object ...params);
	/**
	 * 通过sql查询单个记录，以数组作为返回记录的载体
	 * @param sql
	 * @param params
	 * @return
	 */
	Object[] getArrayBySql(String sql,Object ...params);
	/**
	 * 通过sql查询单个记录，以值对象作为返回记录的载体
	 * @param cls
	 * @param sql
	 * @param params
	 * @return
	 */
	<T> T  getValueObjectBySql(Class<T> cls,String sql,Object ...params);
	/**
	 * 通过sql查询多个记录，以字段名作为key的map作为返回记录的载体
	 * @param sql
	 * @param params
	 * @return
	 */
	List<Map<String, Object>> getListAliasMapBySql(String sql,Object ...params);
	/**
	 * 通过sql查询多个记录，以顺序index作为key的map作为返回记录的载体
	 * @param sql
	 * @param params
	 * @return
	 */
	List<Map<String, Object>> getListMapBySql(String sql,Object ...params);
	/**
	 * 通过sql查询多个记录，以数组作为返回记录的载体
	 * @param sql
	 * @param params
	 * @return
	 */
	List<Object[]> getListArrayBySql(String sql,Object ...params);
	/**
	 * 通过sql查询多个记录，以值对象作为返回记录的载体
	 * @param cls
	 * @param sql
	 * @param params
	 * @return
	 */
	<T> List<T>  getListValueObjectBySql(Class<T> cls,String sql,Object ...params);
	/**
	 * 执行普通sql,不返回任何结果
	 * @param sql
	 * @param params
	 */
	void executeSql(String sql,Object ...params);
	/**
	 * 执行多句sql,不返回任何结果
	 * @param sqls
	 * @param params
	 */
	void executeSqls(String[]sqls,Object ...params);
	/**
	 * 执行普通sql，返回影响行数
	 * @param sql
	 * @return
	 */
	int executeSqlAndGetCount(String sql,Object ...params);
}
