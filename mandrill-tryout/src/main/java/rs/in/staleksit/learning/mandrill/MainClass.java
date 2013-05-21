/**
 * 
 */
package rs.in.staleksit.learning.mandrill;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import rs.in.staleksit.learning.mandrill.model.request.KeyRequest;
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
		userService.getUserInfo(new KeyRequest(API_KEY));
		userService.ping(new KeyRequest(API_KEY));
		userService.ping2(new KeyRequest(API_KEY));
		userService.senders(new KeyRequest(API_KEY));
	}

}
