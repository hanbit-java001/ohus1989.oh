package com.hanbit.ohus1989.oh.standalone.core.vo;

public class ScheduleVO {

	private String scheduleId;
	private String title;
	private String memo;
	private String startDt;
	private String endDt;

	public String getScheduleId() {
		return scheduleId;
	}

	@Override
	public String toString() {
		return "ScheduleVO [scheduleId=" + scheduleId + ", title=" + title + ", memo=" + memo + ", startDt=" + startDt
				+ ", endDt=" + endDt + "]";
	}

	public void setScheduleId(String scheduleId) {
		this.scheduleId = scheduleId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getMemo() {
		return memo;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}

	public String getStartDt() {
		return startDt;
	}

	public void setStartDt(String startDt) {
		this.startDt = startDt;
	}

	public String getEndDt() {
		return endDt;
	}

	public void setEndDt(String endDt) {
		this.endDt = endDt;
	}

}
