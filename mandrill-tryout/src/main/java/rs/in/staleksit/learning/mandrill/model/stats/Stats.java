package rs.in.staleksit.learning.mandrill.model.stats;

import java.io.Serializable;

import org.codehaus.jackson.annotate.JsonProperty;

public class Stats implements Serializable {
	private static final long serialVersionUID = -7721124514509814920L;
	
	private TodayStats today;
	private Last7DaysStats last7DaysStats;
	private Last30DaysStats last30DaysStats;
	private Last60DaysStats last60DaysStats;
	private Last90DaysStats last90DaysStats;
	private AllTimeStats allTimeStats;
	
	public Stats() {
		
	}

	public TodayStats getToday() {
		return today;
	}

	public void setToday(TodayStats today) {
		this.today = today;
	}

	public Last7DaysStats getLast7DaysStats() {
		return last7DaysStats;
	}

	@JsonProperty("last_7_days")
	public void setLast7DaysStats(Last7DaysStats last7DaysStats) {
		this.last7DaysStats = last7DaysStats;
	}

	public Last30DaysStats getLast30DaysStats() {
		return last30DaysStats;
	}

	@JsonProperty("last_30_days")
	public void setLast30DaysStats(Last30DaysStats last30DaysStats) {
		this.last30DaysStats = last30DaysStats;
	}

	public Last60DaysStats getLast60DaysStats() {
		return last60DaysStats;
	}

	@JsonProperty("last_60_days")
	public void setLast60DaysStats(Last60DaysStats last60DaysStats) {
		this.last60DaysStats = last60DaysStats;
	}

	public Last90DaysStats getLast90DaysStats() {
		return last90DaysStats;
	}

	@JsonProperty("last_90_days")
	public void setLast90DaysStats(Last90DaysStats last90DaysStats) {
		this.last90DaysStats = last90DaysStats;
	}

	public AllTimeStats getAllTimeStats() {
		return allTimeStats;
	}
	
	@JsonProperty("all_time")
	public void setAllTimeStats(AllTimeStats allTimeStats) {
		this.allTimeStats = allTimeStats;
	}

}
