/**
 * 
 */
package rs.in.staleksit.learning.mandrill.model.message.request;

import java.io.Serializable;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import org.codehaus.jackson.annotate.JsonProperty;

import rs.in.staleksit.learning.mandrill.model.request.AbstractKeyRequest;

/**
 * @author aleksandar
 *
 */
public class RawMessageRequest extends AbstractKeyRequest implements Serializable {
	private static final long serialVersionUID = 8842338389382032042L;
	
	private String rawMessage;
	private String fromEmail;
	private String fromName;
	private String[] to;
	private Boolean async;
	
	public RawMessageRequest() {
		
	}

	public String getRawMessage() {
		return rawMessage;
	}
	
	@JsonProperty("raw_message")
	public void setRawMessage(String rawMessage) {
		this.rawMessage = rawMessage;
	}

	public String getFromEmail() {
		return fromEmail;
	}

	@JsonProperty("from_email")
	public void setFromEmail(String fromEmail) {
		this.fromEmail = fromEmail;
	}

	public String getFromName() {
		return fromName;
	}

	@JsonProperty("from_name")
	public void setFromName(String fromName) {
		this.fromName = fromName;
	}
	
	public Boolean getAsync() {
		return async;
	}

	public String[] getTo() {
		return to;
	}

	public void setTo(String[] to) {
		this.to = to;
	}

	public void setAsync(Boolean async) {
		this.async = async;
	}
	
	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
	}

}
