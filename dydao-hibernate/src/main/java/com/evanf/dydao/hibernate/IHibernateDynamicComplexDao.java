package com.evanf.dydao.hibernate;

import java.util.List;
import java.util.Map;

import com.evanf.dydao.core.IDynamicComplexDao;
/**
 * 基于Hibernate扩展的动态复杂的数据库访问接口
 * created on Nov 17, 2017
 * @author evanf
 *
 */
public interface IHibernateDynamicComplexDao extends IDynamicComplexDao {
	/**
	 * 通过hql查询单个记录，以字段名作为key的map作为返回记录的载体
	 * @param hql
	 * @param params
	 * @return
	 */
	Map<String, Object> getAliasMapByHql(String hql,Object ...params); 
	/**
	 * 通过hql查询单个记录，以顺序index作为key的map作为返回记录的载体
	 * @param hql
	 * @param params
	 * @return
	 */
	Map<Integer, Object> getMapByHql(String hql,Object ...params);
	/**
	 * 通过hql查询单个记录，以数组作为返回记录的载体
	 * @param hql
	 * @param params
	 * @return
	 */
	Object[] getArrayByHql(String hql,Object ...params);
	/**
	 * 通过hql查询单个记录，以值对象作为返回记录的载体
	 * @param cls
	 * @param hql
	 * @param params
	 * @return
	 */
	<T> T  getValueObjectByHql(Class<T> cls,String hql,Object ...params);
	/**
	 * 通过hql查询多个记录，以字段名作为key的map作为返回记录的载体
	 * @param hql
	 * @param params
	 * @return
	 */
	List<Map<String, Object>> getListAliasMapByHql(String hql,Object ...params);
	/**
	 * 通过hql查询多个记录，以顺序index作为key的map作为返回记录的载体
	 * @param hql
	 * @param params
	 * @return
	 */
	List<Map<String, Object>> getListMapByHql(String hql,Object ...params);
	/**
	 * 通过hql查询多个记录，以数组作为返回记录的载体
	 * @param hql
	 * @param params
	 * @return
	 */
	List<Object[]> getListArrayByHql(String hql,Object ...params);
	/**
	 * 通过hql查询多个记录，以值对象作为返回记录的载体
	 * @param cls
	 * @param hql
	 * @param params
	 * @return
	 */
	<T> List<T>  getListValueObjectByHql(Class<T> cls,String hql,Object ...params);
	/**
	 * 执行普通hql,不返回任何结果
	 * @param hql
	 * @param params
	 */
	void executeHql(String hql,Object ...params);
	/**
	 * 执行多句hql,不返回任何结果
	 * @param hqls
	 * @param params
	 */
	void executehqls(String[]hqls,Object ...params);
}
