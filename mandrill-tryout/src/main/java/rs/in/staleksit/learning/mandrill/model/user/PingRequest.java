/**
 * 
 */
package rs.in.staleksit.learning.mandrill.model.user;

import java.io.Serializable;

/**
 * @author aleksandar
 *
 */
public class PingRequest extends AbstractKeyRequest implements Serializable {
	private static final long serialVersionUID = 3755443714701584962L;
	
	public PingRequest(String apiKey) {
		super();
		setApiKey(apiKey);
	}

}
