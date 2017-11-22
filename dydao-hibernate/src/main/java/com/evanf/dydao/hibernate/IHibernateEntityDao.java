package com.evanf.dydao.hibernate;

import java.util.List;

import com.evanf.dydao.core.IEntityDao;
/**
 * Hibernate具体实体数据库访问接口
 * created on Nov 17, 2017
 * @author evanf
 * 
 * @param <T> 实体类
 * @param <V> 实体的主键类型
 */
public interface IHibernateEntityDao<T,V> extends IEntityDao<T,V>{
	
	T findOneByHql(String hql,Object ...params);
	
	List<T> findByHql(String hql,Object ...params);
	
	List<T> findByPageAndHql(int pageNum,int pageIndex,String hql,Object ...params);

}
