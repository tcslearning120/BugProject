package com.example.demo.entity;

public class Bug {
private String emailAddress;
private String owner;
private String priority;
private String status;
private String ownerProject;
private String createdData;
private String completionDate;
private String description;
private String attachedFile;

public Bug() {

}
public Bug(String emailAddress, String owner, String priority, String status, String ownerProject, String createdData,
		String completionDate, String description, String attachedFile) {
	super();
	this.emailAddress = emailAddress;
	this.owner = owner;
	this.priority = priority;
	this.status = status;
	this.ownerProject = ownerProject;
	this.createdData = createdData;
	this.completionDate = completionDate;
	this.description = description;
	this.attachedFile = attachedFile;
}
public String getEmailAddress() {
	return emailAddress;
}
public void setEmailAddress(String emailAddress) {
	this.emailAddress = emailAddress;
}
public String getOwner() {
	return owner;
}
public void setOwner(String owner) {
	this.owner = owner;
}
public String getPriority() {
	return priority;
}
public void setPriority(String priority) {
	this.priority = priority;
}
public String getStatus() {
	return status;
}
public void setStatus(String status) {
	this.status = status;
}
public String getOwnerProject() {
	return ownerProject;
}
public void setOwnerProject(String ownerProject) {
	this.ownerProject = ownerProject;
}
public String getCreatedData() {
	return createdData;
}
public void setCreatedData(String createdData) {
	this.createdData = createdData;
}
public String getCompletionDate() {
	return completionDate;
}
public void setCompletionDate(String completionDate) {
	this.completionDate = completionDate;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}
public String getAttachedFile() {
	return attachedFile;
}
public void setAttachedFile(String attachedFile) {
	this.attachedFile = attachedFile;
}

}
