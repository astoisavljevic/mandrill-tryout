/**
 * 
 */
package rs.in.staleksit.learning.mandrill.model.request;

import java.io.Serializable;


/**
 * @author aleksandar
 *
 */
public class KeyRequest extends AbstractKeyRequest implements Serializable {
	private static final long serialVersionUID = -7496531789115805402L;
	
	public KeyRequest(String apiKey) {
		super();
		setApiKey(apiKey);
	}

}
