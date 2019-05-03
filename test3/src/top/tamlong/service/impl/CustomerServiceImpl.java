package top.tamlong.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import top.tamlong.mapper.CustomerMapper;
import top.tamlong.po.Customer;
import top.tamlong.service.CustomerService;

@Service
//@Transactional
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerMapper customerMapper;

	// Ìí¼Ó¿Í»§
	@Override
	public void addCustomer(Customer customer) {
		this.customerMapper.addCustomer(customer);
		int i = 1 / 0;
	}

}
