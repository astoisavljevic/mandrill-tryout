/**
 * 
 */
package rs.in.staleksit.learning.mandrill.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import rs.in.staleksit.learning.mandrill.service.MessagesService;

/**
 * @author aleksandar
 *
 */
@Service("messageService")
public class MessageServiceImpl implements MessagesService {
	
	private static final Logger log = LoggerFactory.getLogger(MessageServiceImpl.class);
	
	private RestTemplate restTemplate;
	
	@Autowired
	public MessageServiceImpl(@Qualifier("restTemplate") RestTemplate restTemplate) {
		this.restTemplate = restTemplate;
	}

	/* (non-Javadoc)
	 * @see rs.in.staleksit.learning.mandrill.service.MessagesService#send()
	 */
	public void send() {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see rs.in.staleksit.learning.mandrill.service.MessagesService#sendTemplate()
	 */
	public void sendTemplate() {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see rs.in.staleksit.learning.mandrill.service.MessagesService#search()
	 */
	public void search() {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see rs.in.staleksit.learning.mandrill.service.MessagesService#parse()
	 */
	public void parse() {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see rs.in.staleksit.learning.mandrill.service.MessagesService#sendRaw()
	 */
	public void sendRaw() {
		// TODO Auto-generated method stub

	}

}
