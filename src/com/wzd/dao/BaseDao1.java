package com.wzd.dao;

import java.util.List;

public interface BaseDao1 {
	/**
	 * @param <T>
	 * @param t�������
	 */
	public <T> boolean save(T t);

	/**
	 * @param id
	 * @return��ͨJDBC���ݲ���ʹ�õ�ɾ������
	 */
	public boolean delete(int id);

	/**
	 * @param <T>
	 * @param cla
	 * @param id
	 * @returnHibernateר�õ�ɾ�����󷽷�
	 */
	public <T> boolean delete(Class<T> cla, Integer id);

	/**
	 * @param <T>
	 * @param t
	 * @return�޸�����
	 */
	public <T> boolean update(T t);

	/**
	 * @param <T>
	 * @param cla
	 * @param id
	 * @return��������ID��ȡ����
	 */
	public <T> T get(Class<T> cla, Integer id);

	/**
	 * @param <T>
	 * @param cla
	 * @param pras
	 * @return���ݶ�������ѯ���ݣ�����һ�����ݶ���
	 */
	public <T> T get(String hql, Class<T> cla, Object... pras);

	/**
	 * @param <T>
	 * @param hqlHQL�﷨
	 * @param claʵ����������
	 * @param pras�����б�
	 * @returnʹ��HQL����ѯ����
	 */
	public <T> List<T> queryByHQL(String hql, Class<T> cla, Object... pras);

	/**
	 * @param <T>
	 * @param sql
	 * @param cla
	 * @param pras
	 * @returnʹ��SQL����ѯ����
	 */
	public <T> List<T> queryBySQL(String sql, Class<T> cla, Object... pras);

	/**
	 * @param <T>
	 * @param hql
	 * @param cla
	 * @param pageҳ��
	 * @param size���ݸ���
	 * @param pras
	 * @return��ҳ��ȡ����
	 */
	public <T> List<T> queryByHQLForPage(String hql, Class<T> cla, int page, int size, Object... pras);

	/**
	 * @param <T>
	 * @param sql
	 * @param cla
	 * @param page
	 * @param size
	 * @param pras
	 * @return��ҳ��ȡ����
	 */
	public <T> List<T> queryBySQLForPage(String sql, Class<T> cla, int page, int size, Object... pras);

	/**
	 * @param pras
	 * @return��ȡ���ݼ�¼����
	 */
	public Long getCount(String hql, Object... pras);
}
