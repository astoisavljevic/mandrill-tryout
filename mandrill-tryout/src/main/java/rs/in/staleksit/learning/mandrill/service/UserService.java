/**
 * 
 */
package rs.in.staleksit.learning.mandrill.service;

import rs.in.staleksit.learning.mandrill.model.user.InfoRequest;
import rs.in.staleksit.learning.mandrill.model.user.InfoResponse;

/**
 * @author aleksandar
 *
 */
public interface UserService {
	
	InfoResponse ping(InfoRequest request);

}
