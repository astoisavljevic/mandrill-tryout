/**
 * 
 */
package rs.in.staleksit.learning.mandrill.service;

import rs.in.staleksit.learning.mandrill.model.user.PingRequest;

/**
 * @author aleksandar
 *
 */
public interface UserService {
	
	void ping(PingRequest request);

}
