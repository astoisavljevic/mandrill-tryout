/**
 * 
 */
package rs.in.staleksit.learning.mandrill.model.user;

import java.io.Serializable;

/**
 * @author aleksandar
 *
 */
public class InfoRequest extends AbstractKeyRequest implements Serializable {
	private static final long serialVersionUID = -7496531789115805402L;
	
	public InfoRequest(String apiKey) {
		super();
		setApiKey(apiKey);
	}

}
