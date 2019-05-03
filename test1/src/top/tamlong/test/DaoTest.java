package top.tamlong.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import top.tamlong.dao.CustomerDao;
import top.tamlong.po.Customer;

// ������
public class DaoTest {
	@Test
	public void findCustomerByIdDaoTest() {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		//����������bean��id����ȡָ����bean
		CustomerDao customerDao=(CustomerDao)applicationContext.getBean("CustomerDao");
		Customer customer=customerDao.findCustomerById(1);
		System.out.println(customer);
	}
}
