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

import rs.in.staleksit.learning.mandrill.model.user.PingRequest;
import rs.in.staleksit.learning.mandrill.service.UserService;

/**
 * @author aleksandar
 *
 */
@Service("userService")
public class UserServiceImpl implements UserService {
	
	private static final Logger log = LoggerFactory.getLogger(UserServiceImpl.class);
	
	@Autowired
	@Qualifier("restTemplate")
	private RestTemplate restTemplate;

	public void ping(PingRequest request) {
		log.info("-+- pingUser request: {} -+-", request);
	}

}
