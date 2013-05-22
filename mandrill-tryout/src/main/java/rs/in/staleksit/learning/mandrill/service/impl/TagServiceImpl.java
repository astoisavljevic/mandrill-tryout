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

import rs.in.staleksit.learning.mandrill.model.tag.request.TagListRequest;
import rs.in.staleksit.learning.mandrill.model.tag.response.TagListResponse;
import rs.in.staleksit.learning.mandrill.service.TagService;

/**
 * @author aleksandar
 *
 */
@Service("tagService")
public class TagServiceImpl implements TagService {
	
	private static final Logger log = LoggerFactory.getLogger(TagServiceImpl.class);
	
	private RestTemplate restTemplate;
	
	@Autowired
	public TagServiceImpl(@Qualifier("restTemplate") RestTemplate restTemplate) {
		this.restTemplate = restTemplate;
	}
	
	public void list(TagListRequest taglistRequest) {
		if (log.isDebugEnabled()) {
			log.debug("-+- taglistRequest: {} -+-", taglistRequest);
		}
		
		ResponseEntity<TagListResponse[]> fetchResult = restTemplate.postForEntity("https://mandrillapp.com/api/1.0/tags/list.json", taglistRequest, TagListResponse[].class);
		
		if (fetchResult.getStatusCode() == HttpStatus.OK) {
			if (log.isDebugEnabled()) {
				for (TagListResponse item : fetchResult.getBody()) {
					log.debug("-+- TagListResponse: {} -+-", item);
				}
			}
		}
		
	}

}
