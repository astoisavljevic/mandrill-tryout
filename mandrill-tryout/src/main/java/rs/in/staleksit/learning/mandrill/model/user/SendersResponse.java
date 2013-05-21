/**
 * 
 */
package rs.in.staleksit.learning.mandrill.model.user;

import java.io.Serializable;

/**
 * @author Aleksandar Stoisavljevic
 *
 */
public class SendersResponse implements Serializable {
	private static final long serialVersionUID = 3576893976461324922L;
	
	private Sender[] senders;
	
	public SendersResponse() {
		
	}

	public Sender[] getSenders() {
		return senders;
	}

	public void setSenders(Sender[] senders) {
		this.senders = senders;
	}
	
	

}
