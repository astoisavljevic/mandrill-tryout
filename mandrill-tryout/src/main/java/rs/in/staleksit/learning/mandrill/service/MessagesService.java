/**
 * 
 */
package rs.in.staleksit.learning.mandrill.service;

import rs.in.staleksit.learning.mandrill.model.message.request.RawMessageRequest;

/**
 * @author aleksandar
 *
 */
public interface MessagesService {
	
	void send();
	
	void sendTemplate();
	
	void search();
	
	void parse();
	
	void sendRaw(RawMessageRequest rawMessageRequest);

}
