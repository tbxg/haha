package com.example.demo.models;

import java.sql.Date;

public class ElectionDetails {
	private int electionId;
	private String electionName;
	private int clientId;
	private Date requestDate;
	private String cardPhoto;
	private String condition;
	private int isAgree;
	private Date receivedDate;
	private int numberOfVotes;
	public ElectionDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ElectionDetails(int electionId, String electionName, int clientId, Date requestDate, String cardPhoto,
			String condition, int isAgree, Date receivedDate, int clientVoter, int numberOfVotes) {
		super();
		this.electionId = electionId;
		this.electionName = electionName;
		this.clientId = clientId;
		this.requestDate = requestDate;
		this.cardPhoto = cardPhoto;
		this.condition = condition;
		this.isAgree = isAgree;
		this.receivedDate = receivedDate;
		this.numberOfVotes = numberOfVotes;
	}
	public int getElectionId() {
		return electionId;
	}
	public void setElectionId(int electionId) {
		this.electionId = electionId;
	}
	public String getElectionName() {
		return electionName;
	}
	public void setElectionName(String electionName) {
		this.electionName = electionName;
	}
	public int getClientId() {
		return clientId;
	}
	public void setClientId(int clientId) {
		this.clientId = clientId;
	}
	public Date getRequestDate() {
		return requestDate;
	}
	public void setRequestDate(Date requestDate) {
		this.requestDate = requestDate;
	}
	public String getCardPhoto() {
		return cardPhoto;
	}
	public void setCardPhoto(String cardPhoto) {
		this.cardPhoto = cardPhoto;
	}
	public String getCondition() {
		return condition;
	}
	public void setCondition(String condition) {
		this.condition = condition;
	}
	public int getIsAgree() {
		return isAgree;
	}
	public void setIsAgree(int isAgree) {
		this.isAgree = isAgree;
	}
	public Date getReceivedDate() {
		return receivedDate;
	}
	public void setReceivedDate(Date receivedDate) {
		this.receivedDate = receivedDate;
	}
	public int getNumberOfVotes() {
		return numberOfVotes;
	}
	public void setNumberOfVotes(int numberOfVotes) {
		this.numberOfVotes = numberOfVotes;
	}
	
	
	
}
