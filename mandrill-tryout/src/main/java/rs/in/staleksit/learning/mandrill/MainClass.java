/**
 * 
 */
package rs.in.staleksit.learning.mandrill;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import rs.in.staleksit.learning.mandrill.model.user.InfoRequest;
import rs.in.staleksit.learning.mandrill.model.user.PingRequest;
import rs.in.staleksit.learning.mandrill.service.UserService;
import rs.in.staleksit.learning.mandrill.service.impl.UserServiceImpl;

/**
 * @author aleksandar
 *
 */
public class MainClass {
	
	private static final String API_KEY = "sVlj-TYbFP6bvWYKIFYb9A";

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ClassPathXmlApplicationContext appContext = new ClassPathXmlApplicationContext("classpath:/applicationContext.xml");
		UserService userService = appContext.getBean(UserServiceImpl.class);
		userService.getUserInfo(new InfoRequest(API_KEY));
		userService.ping(new PingRequest(API_KEY));
		userService.ping2(new PingRequest(API_KEY));
	}

}
