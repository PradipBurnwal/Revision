package com.fh.entities;

public class Project {

	private int projectNo;
	private String title;
	private String desc;
	private String domine;
	private Long duration;
	private String clientName;
	private String status;
	public Project() {
		//no code
	}
	public int getProjectNo() {
		return projectNo;
	}
	public void setProjectNo(int projectNo) {
		this.projectNo = projectNo;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public String getDomine() {
		return domine;
	}
	public void setDomine(String domine) {
		this.domine = domine;
	}
	public Long getDuration() {
		return duration;
	}
	public void setDuration(Long duration) {
		this.duration = duration;
	}
	public String getClientName() {
		return clientName;
	}
	public void setClientName(String clientName) {
		this.clientName = clientName;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "Project [projectNo=" + projectNo + ", title=" + title
				+ ", desc=" + desc + ", domine=" + domine + ", duration="
				+ duration + ", clientName=" + clientName + ", status="
				+ status + "]";
	}
	
}
