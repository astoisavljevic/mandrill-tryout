/**
 * 
 */
package rs.in.staleksit.learning.mandrill;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import rs.in.staleksit.learning.mandrill.model.user.InfoRequest;
import rs.in.staleksit.learning.mandrill.service.UserService;
import rs.in.staleksit.learning.mandrill.service.impl.UserServiceImpl;

/**
 * @author aleksandar
 *
 */
public class MainClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ClassPathXmlApplicationContext appContext = new ClassPathXmlApplicationContext("classpath:/applicationContext.xml");
		UserService userService = appContext.getBean(UserServiceImpl.class);
		userService.ping(new InfoRequest("sVlj-TYbFP6bvWYKIFYb9A"));
	}

}
