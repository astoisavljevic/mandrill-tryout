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
import org.springframework.web.client.HttpServerErrorException;
import org.springframework.web.client.RestTemplate;

import rs.in.staleksit.learning.mandrill.model.request.KeyRequest;
import rs.in.staleksit.learning.mandrill.model.user.response.InfoResponse;
import rs.in.staleksit.learning.mandrill.model.user.response.Ping2Response;
import rs.in.staleksit.learning.mandrill.model.user.response.SenderResponse;
import rs.in.staleksit.learning.mandrill.service.UserService;

/**
 * @author aleksandar
 *
 */
@Service("userService")
public class UserServiceImpl implements UserService {
	
	private static final Logger log = LoggerFactory.getLogger(UserServiceImpl.class);
	
	private RestTemplate restTemplate;
	
	@Autowired
	public UserServiceImpl(@Qualifier("restTemplate") RestTemplate restTemplate) {
		this.restTemplate = restTemplate;
	}

	public InfoResponse getUserInfo(KeyRequest request) {
		InfoResponse result = new InfoResponse();
		if (log.isDebugEnabled()) {
			log.debug("-+- infoRequest: {} -+-", request);
		}
		ResponseEntity<InfoResponse> fetchResult = restTemplate.postForEntity("https://mandrillapp.com/api/1.0/users/info.json", request, InfoResponse.class);
		
		if (fetchResult.getStatusCode() == HttpStatus.OK) {
			result = fetchResult.getBody();
			if (log.isDebugEnabled()) {
				log.debug("-+- infoResponse: {} -+-", result);
			}
		}
		
		return result;
	}

	public String ping(KeyRequest request) {
		String result = "";
		if (log.isDebugEnabled()) {
			log.debug("-+- pingRequest: {} -+-", request);
		}
		
		try {
			ResponseEntity<String> fetchResult = restTemplate.postForEntity("https://mandrillapp.com/api/1.0/users/ping.json", request, String.class);

			if (fetchResult.getStatusCode() == HttpStatus.OK) {
				result = fetchResult.getBody();
				if (log.isDebugEnabled()) {
					log.debug("-+- pingResponse: {} -+-", result);
				}
			}
			
		} catch (HttpServerErrorException ex) {
			
			log.error("-+- Error: {} -+-", ex);
		}

		
		return result;
	}

	public Ping2Response ping2(KeyRequest request) {
		Ping2Response result = new Ping2Response();
		if (log.isDebugEnabled()) {
			log.debug("-+- pingRequest: {} -+-", request);
		}
		ResponseEntity<Ping2Response> fetchResult = restTemplate.postForEntity("https://mandrillapp.com/api/1.0/users/ping2.json", request, Ping2Response.class);

		if (fetchResult.getStatusCode() == HttpStatus.OK) {
			result = fetchResult.getBody();
			if (log.isDebugEnabled()) {
				log.debug("-+- ping2Response: {} -+-", result);
			}
		}
		
		return result;
	}

	public SenderResponse[] senders(KeyRequest request) {
		SenderResponse[] result = null;
		if (log.isDebugEnabled()) {
			log.debug("-+- sendersRequest: {} -+-", request);
		}
		ResponseEntity<SenderResponse[]> fetchResult = restTemplate.postForEntity("https://mandrillapp.com/api/1.0/users/senders.json", request, SenderResponse[].class);
		
		if (fetchResult.getStatusCode() == HttpStatus.OK) {
			result = fetchResult.getBody();
			if (log.isDebugEnabled()) {
				for (SenderResponse sender: result) {
					log.debug("-+- sender: {} -+-", sender);
				}				
			}
		}
		return result;
	}

}
