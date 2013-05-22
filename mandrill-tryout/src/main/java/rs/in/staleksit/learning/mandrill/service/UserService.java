/**
 * 
 */
package rs.in.staleksit.learning.mandrill.service;

import rs.in.staleksit.learning.mandrill.model.request.KeyRequest;
import rs.in.staleksit.learning.mandrill.model.user.response.InfoResponse;
import rs.in.staleksit.learning.mandrill.model.user.response.Ping2Response;
import rs.in.staleksit.learning.mandrill.model.user.response.SenderResponse;

/**
 * @author aleksandar
 *
 */
public interface UserService {
	
	InfoResponse getUserInfo(KeyRequest request);
	
	String ping(KeyRequest request);
	
	Ping2Response ping2(KeyRequest request);
	
	SenderResponse[] senders(KeyRequest request);

}
