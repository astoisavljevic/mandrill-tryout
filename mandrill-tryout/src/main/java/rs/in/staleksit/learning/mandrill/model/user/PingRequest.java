/**
 * 
 */
package rs.in.staleksit.learning.mandrill.model.user;

import java.io.Serializable;

/**
 * @author aleksandar
 *
 */
public class PingRequest implements Serializable {
	private static final long serialVersionUID = -7496531789115805402L;
	
	private String key;
	
	public PingRequest(String key) {
		this.key = key;
	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}
	
	

}
