package com.example.demo.entity;

public class Project {
private int bugno;
private String name;
private String description;

public Project() {
	
}
public Project(int bugno, String name, String description) {
	super();
	this.bugno = bugno;
	this.name = name;
	this.description = description;
}
public int getBugno() {
	return bugno;
}
public void setBugno(int bugno) {
	this.bugno = bugno;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}

}
