package top.tamlong.dao.impl;

import org.mybatis.spring.support.SqlSessionDaoSupport;

import top.tamlong.dao.CustomerDao;
import top.tamlong.po.Customer;

public class CustomerImpl extends SqlSessionDaoSupport implements CustomerDao {

	/**
	 * 通过id查询客户
	 */
	@Override
	public Customer findCustomerById(Integer id) {
		return this.getSqlSession().selectOne("top.tamlong.po"+".CustomerMapper.findCustomerById",id);
		
	}

}
