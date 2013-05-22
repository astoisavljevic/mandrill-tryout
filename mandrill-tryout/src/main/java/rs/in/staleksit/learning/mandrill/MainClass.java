/**
 * 
 */
package rs.in.staleksit.learning.mandrill;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import rs.in.staleksit.learning.mandrill.model.message.request.RawMessageRequest;
import rs.in.staleksit.learning.mandrill.service.MessagesService;
import rs.in.staleksit.learning.mandrill.service.UserService;
import rs.in.staleksit.learning.mandrill.service.impl.MessageServiceImpl;
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
		// test /users/info.json
		// userService.getUserInfo(new KeyRequest(API_KEY));
		// test /users/ping.json
		// userService.ping(new KeyRequest(API_KEY));
		// test /users/ping2.json
		// userService.ping2(new KeyRequest(API_KEY));
		// test /users/senders.json
		// userService.senders(new KeyRequest(API_KEY));
		
		
		MessagesService messagesService = appContext.getBean(MessageServiceImpl.class);
		
		// test /messages/send-raw.json
//		RawMessageRequest rawMessageRequest = new RawMessageRequest();
//		rawMessageRequest.setApiKey(API_KEY);
//		rawMessageRequest.setAsync(Boolean.FALSE);
//		rawMessageRequest.setFromEmail("staleks@gmail.com");
//		rawMessageRequest.setFromName("Aleksandar Stoisavljevic");
//		rawMessageRequest.setRawMessage("From: staleks@gmail.com\nTo:b.ivanovic@levi9.com\nSubject: Skola stonog tenisa\n\n Postovani,\n skola stonog tenisa se nastavlja danas u 17h.\n\nDobro dosli!");
//		
//		String[] tos = new String[] {"b.ivanovic@levi9.com"};
//		rawMessageRequest.setTo(tos);
//		
//		messagesService.sendRaw(rawMessageRequest);
		
		
	}

}
