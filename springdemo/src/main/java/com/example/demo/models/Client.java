package com.example.demo.models;

import java.sql.Date;

public class Client {
	private int id;
	private String fullName;
	private String image;
	private String identityCard;
	private String phone;
	private String email;
	private String userName;
	private String password;
	private Date createDate;
	private boolean isActive;
	public Client() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Client(int id, String fullName, String image, String identityCard, String phone, String email,
			String userName, String password, Date createDate, boolean isActive) {
		super();
		this.id = id;
		this.fullName = fullName;
		this.image = image;
		this.identityCard = identityCard;
		this.phone = phone;
		this.email = email;
		this.userName = userName;
		this.password = password;
		this.createDate = createDate;
		this.isActive = isActive;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public String getIdentityCard() {
		return identityCard;
	}
	public void setIdentityCard(String identityCard) {
		this.identityCard = identityCard;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	public boolean isActive() {
		return isActive;
	}
	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
	
}
