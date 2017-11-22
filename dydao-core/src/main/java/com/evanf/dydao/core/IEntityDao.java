package com.evanf.dydao.core;

import java.util.List;

/**
 * 与具体实体相关的数据库访问接口，这部分功能在spring-data框架中是重复的，所以意义并不重大
 * created on Nov 17, 2017
 * @author evanf
 * 
 * @param <T> 实体类
 * @param <V> 实体的主键类型
 */
public interface IEntityDao<T,V> {
	List<T> findAll();
	
	T getOne(V id);

	List<T> findByIds(Iterable<V> ids);
	
	T findOneBySql(String sql,Object ...params);
	
	List<T> findBySql(String sql,Object ...params);
	
	List<T> findByPage(int pageNum,int pageIndex);
	
	List<T> findByPageAndSql(int pageNum,int pageIndex,String sql,Object ...params);
	
	<S extends T> List<S> save(Iterable<S> objs);

	<S extends T> S save(S obj);
	
	<S extends T> void update(S obj);
	
	void deleteById(V id);
	
	void deleteById(Iterable<V> ids);

	void delete(T t);
	
	void delete(Iterable<? extends T> objs);

	void deleteAll();

}
