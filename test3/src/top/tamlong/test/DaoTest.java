package top.tamlong.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import top.tamlong.dao.CustomerDao;
import top.tamlong.po.Customer;
import top.tamlong.service.CustomerService;

// ≤‚ ‘¿‡
public class DaoTest {
	@Test
	public void TransactionTest() {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		CustomerService customerService=(CustomerService)applicationContext.getBean(CustomerService.class);
		Customer customer=new Customer();
		customer.setUsername("tan");
		customer.setJobs("cyuyan");
		customer.setPhone("1534564644");
		customerService.addCustomer(customer);
	}
}
