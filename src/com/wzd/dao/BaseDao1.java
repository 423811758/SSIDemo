package com.wzd.dao;

import java.util.List;

public interface BaseDao1 {
	/**
	 * @param <T>
	 * @param t添加数据
	 */
	public <T> boolean save(T t);

	/**
	 * @param id
	 * @return普通JDBC数据操作使用的删除方法
	 */
	public boolean delete(int id);

	/**
	 * @param <T>
	 * @param cla
	 * @param id
	 * @returnHibernate专用的删除对象方法
	 */
	public <T> boolean delete(Class<T> cla, Integer id);

	/**
	 * @param <T>
	 * @param t
	 * @return修改数据
	 */
	public <T> boolean update(T t);

	/**
	 * @param <T>
	 * @param cla
	 * @param id
	 * @return根据主键ID获取对象
	 */
	public <T> T get(Class<T> cla, Integer id);

	/**
	 * @param <T>
	 * @param cla
	 * @param pras
	 * @return根据多条件查询数据，返回一条数据对象
	 */
	public <T> T get(String hql, Class<T> cla, Object... pras);

	/**
	 * @param <T>
	 * @param hqlHQL语法
	 * @param cla实体类的类对象
	 * @param pras参数列表
	 * @return使用HQL语句查询数据
	 */
	public <T> List<T> queryByHQL(String hql, Class<T> cla, Object... pras);

	/**
	 * @param <T>
	 * @param sql
	 * @param cla
	 * @param pras
	 * @return使用SQL语句查询数据
	 */
	public <T> List<T> queryBySQL(String sql, Class<T> cla, Object... pras);

	/**
	 * @param <T>
	 * @param hql
	 * @param cla
	 * @param page页数
	 * @param size数据个数
	 * @param pras
	 * @return分页获取数据
	 */
	public <T> List<T> queryByHQLForPage(String hql, Class<T> cla, int page, int size, Object... pras);

	/**
	 * @param <T>
	 * @param sql
	 * @param cla
	 * @param page
	 * @param size
	 * @param pras
	 * @return分页获取数据
	 */
	public <T> List<T> queryBySQLForPage(String sql, Class<T> cla, int page, int size, Object... pras);

	/**
	 * @param pras
	 * @return获取数据记录个数
	 */
	public Long getCount(String hql, Object... pras);
}
