package top.tamlong.mapper;

import top.tamlong.po.Customer;

public interface CustomerMapper {
	// 通过id查询客户
	public Customer findCustomerById(Integer id);
	// 添加用户
	public void addCustomer(Customer customer);
}
