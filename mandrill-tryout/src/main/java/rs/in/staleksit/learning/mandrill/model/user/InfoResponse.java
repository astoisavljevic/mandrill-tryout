/**
 * 
 */
package rs.in.staleksit.learning.mandrill.model.user;

import java.io.Serializable;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import org.codehaus.jackson.annotate.JsonProperty;

import rs.in.staleksit.learning.mandrill.model.stats.Stats;

/**
 * @author aleksandar
 * 
 */
public class InfoResponse implements Serializable {
	private static final long serialVersionUID = 6587605501987646410L;

	private String username;
	private String createdAt;
	private String publicId;

	private Integer reputation;
	private Integer hourlyQuota;

	private Integer backlog;

	private Stats stats;
	
	public InfoResponse() {
		
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getCreatedAt() {
		return createdAt;
	}

	@JsonProperty("created_at")
	public void setCreatedAt(String createdAt) {
		this.createdAt = createdAt;
	}

	public String getPublicId() {
		return publicId;
	}

	@JsonProperty("public_id")
	public void setPublicId(String publicId) {
		this.publicId = publicId;
	}

	public Integer getReputation() {
		return reputation;
	}

	public void setReputation(Integer reputation) {
		this.reputation = reputation;
	}

	public Integer getHourlyQuota() {
		return hourlyQuota;
	}

	@JsonProperty("hourly_quota")
	public void setHourlyQuota(Integer hourlyQuota) {
		this.hourlyQuota = hourlyQuota;
	}

	public Integer getBacklog() {
		return backlog;
	}

	public void setBacklog(Integer backlog) {
		this.backlog = backlog;
	}

	public Stats getStats() {
		return stats;
	}

	public void setStats(Stats stats) {
		this.stats = stats;
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this,
				ToStringStyle.SHORT_PREFIX_STYLE);
	}

}
