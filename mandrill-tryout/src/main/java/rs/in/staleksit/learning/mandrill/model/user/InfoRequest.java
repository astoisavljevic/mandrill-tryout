/**
 * 
 */
package rs.in.staleksit.learning.mandrill.model.user;

import java.io.Serializable;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * @author aleksandar
 *
 */
public class InfoRequest implements Serializable {
	private static final long serialVersionUID = -7496531789115805402L;
	
	private String key;
	
	public InfoRequest(String key) {
		this.key = key;
	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}
	
	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
	}
	
	

}
