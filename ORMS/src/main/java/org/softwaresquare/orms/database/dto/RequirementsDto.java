package org.softwaresquare.orms.database.dto;

public class RequirementsDto {
	private int idx;
	private int member;
	private int project;
	private int user;
	private int method;
	private int operation;
	private int purpose;
	private int conditions;
	public int getIdx() {
		return idx;
	}
	public void setIdx(int idx) {
		this.idx = idx;
	}
	public int getMember() {
		return member;
	}
	public void setMember(int member) {
		this.member = member;
	}
	public int getProject() {
		return project;
	}
	public void setProject(int project) {
		this.project = project;
	}
	public int getUser() {
		return user;
	}
	public void setUser(int user) {
		this.user = user;
	}
	public int getMethod() {
		return method;
	}
	public void setMethod(int method) {
		this.method = method;
	}
	public int getOperation() {
		return operation;
	}
	public void setOperation(int operation) {
		this.operation = operation;
	}
	public int getPurpose() {
		return purpose;
	}
	public void setPurpose(int purpose) {
		this.purpose = purpose;
	}
	public int getConditions() {
		return conditions;
	}
	public void setConditions(int conditions) {
		this.conditions = conditions;
	}
}
