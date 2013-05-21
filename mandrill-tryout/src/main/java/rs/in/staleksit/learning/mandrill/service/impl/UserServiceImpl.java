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
import rs.in.staleksit.learning.mandrill.model.user.Ping2Response;
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

	public InfoResponse getUserInfo(InfoRequest request) {
		InfoResponse result = new InfoResponse();
		log.info("-+- infoRequest: {} -+-", request);
		ResponseEntity<InfoResponse> fetchResult = restTemplate.postForEntity("https://mandrillapp.com/api/1.0/users/info.json", request, InfoResponse.class);
		
		if (fetchResult.getStatusCode() == HttpStatus.OK) {
			result = fetchResult.getBody();
			log.info("-+- infoResponse: {} -+-", result);
		}
		
		return result;
	}

	public String ping(PingRequest request) {
		String result = "";
		log.info("-+- pingRequest: {} -+-", request);
		ResponseEntity<String> fetchResult = restTemplate.postForEntity("https://mandrillapp.com/api/1.0/users/ping.json", request, String.class);

		if (fetchResult.getStatusCode() == HttpStatus.OK) {
			result = fetchResult.getBody();
			log.info("-+- pingResponse: {} -+-", result);
		}
		
		return result;
	}

	public Ping2Response ping2(PingRequest request) {
		Ping2Response result = new Ping2Response();
		log.info("-+- pingRequest: {} -+-", request);
		ResponseEntity<Ping2Response> fetchResult = restTemplate.postForEntity("https://mandrillapp.com/api/1.0/users/ping2.json", request, Ping2Response.class);

		if (fetchResult.getStatusCode() == HttpStatus.OK) {
			result = fetchResult.getBody();
			log.info("-+- ping2Response: {} -+-", result);
		}
		
		return result;
	}

}
