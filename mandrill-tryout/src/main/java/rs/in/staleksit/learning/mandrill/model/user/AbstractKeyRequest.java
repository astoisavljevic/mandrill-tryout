/**
 * 
 */
package rs.in.staleksit.learning.mandrill.model.user;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import org.codehaus.jackson.annotate.JsonProperty;

/**
 * @author aleksandar
 *
 */
public abstract class AbstractKeyRequest {
	
	private String apiKey;
	
	public String getApiKey() {
		return apiKey;
	}
	
	@JsonProperty("key")
	public void setApiKey(String apiKey) {
		this.apiKey = apiKey;
	}
	
	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
	}

}
