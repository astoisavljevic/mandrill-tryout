/**
 * 
 */
package rs.in.staleksit.learning.mandrill.service;

import rs.in.staleksit.learning.mandrill.model.user.InfoRequest;
import rs.in.staleksit.learning.mandrill.model.user.InfoResponse;
import rs.in.staleksit.learning.mandrill.model.user.Ping2Response;
import rs.in.staleksit.learning.mandrill.model.user.PingRequest;
import rs.in.staleksit.learning.mandrill.model.user.Sender;

/**
 * @author aleksandar
 *
 */
public interface UserService {
	
	InfoResponse getUserInfo(InfoRequest request);
	
	String ping(PingRequest request);
	
	Ping2Response ping2(PingRequest request);
	
	Sender[] senders(PingRequest request);
	
	

}
