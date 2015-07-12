package com.eshop.bean;

import java.sql.Date;



public class Catogery {
private int catId;
private String catName;
private String description;
private java.sql.Date date;
public int getCatId() {
	return catId;
}
public void setCatId(int catId) {
	this.catId = catId;
}
public String getCatName() {
	return catName;
}
public void setCatName(String catName) {
	this.catName = catName;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}
public Date getDate() {
	return date;
}
public void setDate(Date date) {
	this.date = date;
}

}
