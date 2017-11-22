package com.evanf.dydao.hibernate.impl;

import java.util.List;

import com.evanf.dydao.hibernate.IHibernateEntityDao;
/**
 * Hibernate具体实体数据库访问实现
 * created on Nov 17, 2017
 * @author evanf
 * 
 * @param <T> 实体类
 * @param <V> 实体的主键类型
 */
public class HibernateEntityDaoImpl<T,V> implements IHibernateEntityDao<T,V> {

	@Override
	public List<T> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public T getOne(V id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<T> findByIds(Iterable<V> ids) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public T findOneBySql(String sql, Object... params) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<T> findBySql(String sql, Object... params) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<T> findByPage(int pageNum, int pageIndex) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<T> findByPageAndSql(int pageNum, int pageIndex, String sql, Object... params) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends T> List<S> save(Iterable<S> objs) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends T> S save(S obj) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends T> void update(S obj) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteById(V id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteById(Iterable<V> ids) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(T t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Iterable<? extends T> objs) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public T findOneByHql(String hql, Object... params) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<T> findByHql(String hql, Object... params) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<T> findByPageAndHql(int pageNum, int pageIndex, String hql, Object... params) {
		// TODO Auto-generated method stub
		return null;
	}

}
