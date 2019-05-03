package top.tamlong.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import top.tamlong.dao.CustomerDao;
import top.tamlong.po.Customer;

// 测试类
public class DaoTest {
	@Test
	public void findCustomerByIdMapperTest() {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		//根据容器中bean的id来获取指定的bean
		CustomerDao customerDao=(CustomerDao)applicationContext.getBean("CustomerDao");
		Customer customer=customerDao.findCustomerById(1);
		System.out.println(customer);
	}
}
