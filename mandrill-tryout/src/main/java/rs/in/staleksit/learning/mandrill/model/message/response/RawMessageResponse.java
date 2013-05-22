/**
 * 
 */
package rs.in.staleksit.learning.mandrill.model.message.response;

import java.io.Serializable;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import org.codehaus.jackson.annotate.JsonProperty;

/**
 * @author aleksandar
 *
 */
public class RawMessageResponse implements Serializable {
	private static final long serialVersionUID = 414336629396867226L;
	
	private String email;
	private String status;
	private String rejectReason;
	private String id;
	
	public RawMessageResponse() {
		
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	public String getRejectReason() {
		return rejectReason;
	}
	@JsonProperty("reject_reason")
	public void setRejectReason(String rejectReason) {
		this.rejectReason = rejectReason;
	}
	public String getId() {
		return id;
	}
	@JsonProperty("_id")
	public void setId(String id) {
		this.id = id;
	}
	
	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
	}

}
