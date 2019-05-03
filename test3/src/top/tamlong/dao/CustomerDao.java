package top.tamlong.dao;

import top.tamlong.po.Customer;

public interface CustomerDao {
	//通过id查询客户信息
	public Customer findCustomerById(Integer id);
}
