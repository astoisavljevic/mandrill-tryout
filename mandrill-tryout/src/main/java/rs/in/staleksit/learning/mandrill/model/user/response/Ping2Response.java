/**
 * 
 */
package rs.in.staleksit.learning.mandrill.model.user.response;

import java.io.Serializable;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import org.codehaus.jackson.annotate.JsonProperty;

/**
 * @author aleksandar
 *
 */
public class Ping2Response implements Serializable {
	private static final long serialVersionUID = -6782992414732058727L;
	
	private String ping;
	
	public Ping2Response() {
		
	}

	public String getPong() {
		return ping;
	}

	@JsonProperty("PING")
	public void setPong(String pong) {
		this.ping = pong;
	}
	
	
	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
	}
	

}
