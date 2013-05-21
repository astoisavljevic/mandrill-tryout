/**
 * 
 */
package rs.in.staleksit.learning.mandrill.model.user;

import java.io.Serializable;

import org.codehaus.jackson.annotate.JsonProperty;

/**
 * @author Aleksandar Stoisavljevic
 *
 */
public class Sender implements Serializable {
	private static final long serialVersionUID = -3469025994295384795L;
	
	private String address;
	private String createdAt;
	private Integer sent;
	private Integer hardBounces;
	private Integer softBounces;
	private Integer rejects;
	private Integer complaints;
	private Integer unsubs;
	private Integer opens;
	private Integer clicks;
	
	public Sender() {
		
	}
	
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCreatedAt() {
		return createdAt;
	}
	
	@JsonProperty("created_at")
	public void setCreatedAt(String createdAt) {
		this.createdAt = createdAt;
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
	
	

}