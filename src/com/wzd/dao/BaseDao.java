package com.wzd.dao;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;

import org.apache.tomcat.jdbc.pool.DataSource;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import org.springframework.stereotype.Service;

import com.ibatis.sqlmap.client.SqlMapClient;

@Service
public class BaseDao extends SqlMapClientDaoSupport {
	@Resource(name = "sqlMapClient")
	private SqlMapClient sqlMapClient;
	@Resource(name = "dataSource")
	private DataSource dataSource;

	@PostConstruct
	public void initSqlMapClient() {
		this.setSqlMapClient(sqlMapClient);
		this.setDataSource(dataSource);
	}
}
