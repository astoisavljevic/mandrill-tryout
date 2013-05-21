/**
 * 
 */
package rs.in.staleksit.learning.mandrill.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import rs.in.staleksit.learning.mandrill.model.user.InfoRequest;
import rs.in.staleksit.learning.mandrill.model.user.InfoResponse;
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

	public InfoResponse ping(InfoRequest request) {
		InfoResponse result = new InfoResponse();
		log.info("-+- infoRequest: {} -+-", request);
		ResponseEntity<InfoResponse> fetchResult = restTemplate.postForEntity("https://mandrillapp.com/api/1.0/users/info.json", request, InfoResponse.class);
		
		if (fetchResult.getStatusCode() == HttpStatus.OK) {
			result = fetchResult.getBody();
			log.info("-+- infoResponse: {} -+-", result);
		}
		
		return result;
	}

}
