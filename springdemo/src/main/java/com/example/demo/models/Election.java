package com.example.demo.models;

import java.sql.Date;
import java.time.LocalDateTime;

public class Election {
	private int id;
	private String title;
	private String image;
	private String createDate;
	private Date registerDate;
	private Date regisExpirationDate;
	private String regisConditions;
	private String description;
	private Date votingStartDate;
	private Date votingDeadline;
	private int numberOfSubscribers;
	private int winner;
	private String emailWinner;
	
	public Election() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Election(int id, String title, String image, String createDate, Date registerDate, Date regisExpirationDate,
			String regisConditions, String description, Date votingStartDate, Date votingDeadline,
			int numberOfSubscribers, int winner, String emailWinner) {
		super();
		this.id = id;
		this.title = title;
		this.image = image;
		this.createDate = createDate;
		this.registerDate = registerDate;
		this.regisExpirationDate = regisExpirationDate;
		this.regisConditions = regisConditions;
		this.description = description;
		this.votingStartDate = votingStartDate;
		this.votingDeadline = votingDeadline;
		this.numberOfSubscribers = numberOfSubscribers;
		this.winner = winner;
		this.emailWinner = emailWinner;
	}



	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getCreateDate() {
		return createDate;
	}
	public void setCreateDate(String createDate) {
		this.createDate = createDate;
	}
	public Date getRegisterDate() {
		return registerDate;
	}
	public void setRegisterDate(Date registerDate) {
		this.registerDate = registerDate;
	}
	public Date getRegisExpirationDate() {
		return regisExpirationDate;
	}
	public void setRegisExpirationDate(Date regisExpirationDate) {
		this.regisExpirationDate = regisExpirationDate;
	}
	public String getRegisConditions() {
		return regisConditions;
	}
	public void setRegisConditions(String regisConditions) {
		this.regisConditions = regisConditions;
	}
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getVotingStartDate() {
		return votingStartDate;
	}
	public void setVotingStartDate(Date votingStartDate) {
		this.votingStartDate = votingStartDate;
	}
	public Date getVotingDeadline() {
		return votingDeadline;
	}
	public void setVotingDeadline(Date votingDeadline) {
		this.votingDeadline = votingDeadline;
	}
	public int getNumberOfSubscribers() {
		return numberOfSubscribers;
	}
	public void setNumberOfSubscribers(int numberOfSubscribers) {
		this.numberOfSubscribers = numberOfSubscribers;
	}
	public int getWinner() {
		return winner;
	}
	public void setWinner(int winner) {
		this.winner = winner;
	}



	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getEmailWinner() {
		return emailWinner;
	}



	public void setEmailWinner(String emailWinner) {
		this.emailWinner = emailWinner;
	}
	
	
}
