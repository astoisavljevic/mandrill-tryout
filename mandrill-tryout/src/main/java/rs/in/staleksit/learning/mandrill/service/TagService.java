/**
 * 
 */
package rs.in.staleksit.learning.mandrill.service;

import rs.in.staleksit.learning.mandrill.model.tag.request.TagListRequest;

/**
 * @author aleksandar
 *
 */
public interface TagService {
	
	void list(TagListRequest taglistRequest);

}
