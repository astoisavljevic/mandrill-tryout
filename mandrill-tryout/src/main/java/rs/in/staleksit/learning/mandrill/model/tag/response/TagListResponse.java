/**
 * 
 */
package rs.in.staleksit.learning.mandrill.model.tag.response;

import java.io.Serializable;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;

/**
 * @author aleksandar
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class TagListResponse implements Serializable {
	private static final long serialVersionUID = 5381874540446571771L;
	
	private String tag;
	private Integer sent;
	private Integer hardBounces;
	private Integer softBounces;
	private Integer rejects;
	private Integer complaints;
	private Integer unsubs;
	private Integer opens;
	private Integer clicks;
	private Integer uniqueOpens;
	private Integer uniqueClicks;
	
	public TagListResponse() {
		
	}
	
	public String getTag() {
		return tag;
	}
	public void setTag(String tag) {
		this.tag = tag;
	}
	public Integer getSent() {
		return sent;
	}
	public void setSent(Integer sent) {
		this.sent = sent;
	}
	public Integer getHardBounces() {
		return hardBounces;
	}
	@JsonProperty("hard_bounces")
	public void setHardBounces(Integer hardBounces) {
		this.hardBounces = hardBounces;
	}
	public Integer getSoftBounces() {
		return softBounces;
	}
	@JsonProperty("soft_bounces")
	public void setSoftBounces(Integer softBounces) {
		this.softBounces = softBounces;
	}
	public Integer getRejects() {
		return rejects;
	}
	public void setRejects(Integer rejects) {
		this.rejects = rejects;
	}
	public Integer getComplaints() {
		return complaints;
	}
	public void setComplaints(Integer complaints) {
		this.complaints = complaints;
	}
	public Integer getUnsubs() {
		return unsubs;
	}
	public void setUnsubs(Integer unsubs) {
		this.unsubs = unsubs;
	}
	public Integer getOpens() {
		return opens;
	}
	public void setOpens(Integer opens) {
		this.opens = opens;
	}
	public Integer getClicks() {
		return clicks;
	}
	public void setClicks(Integer clicks) {
		this.clicks = clicks;
	}
	public Integer getUniqueOpens() {
		return uniqueOpens;
	}
	@JsonProperty("unique_opens")
	public void setUniqueOpens(Integer uniqueOpens) {
		this.uniqueOpens = uniqueOpens;
	}
	public Integer getUniqueClicks() {
		return uniqueClicks;
	}
	@JsonProperty("unique_clicks")
	public void setUniqueClicks(Integer uniqueClicks) {
		this.uniqueClicks = uniqueClicks;
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
	}
	

}
