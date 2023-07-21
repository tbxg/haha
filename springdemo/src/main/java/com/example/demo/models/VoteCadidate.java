package com.example.demo.models;

public class VoteCadidate {
	private int idElecDetail;
	private int electionId;
	private int clientId;
	private String clientName;
	private int idVoter;
	private int vote;
	public VoteCadidate() {
		super();
		// TODO Auto-generated constructor stub
	}
	public VoteCadidate(int idElecDetail, int electionId, int clientId, int idVoter, int vote) {
		super();
		this.idElecDetail = idElecDetail;
		this.electionId = electionId;
		this.clientId = clientId;
		this.clientName = clientName;
		this.idVoter = idVoter;
		this.vote = vote;
	}
	public int getIdElecDetail() {
		return idElecDetail;
	}
	public void setIdElecDetail(int idElecDetail) {
		this.idElecDetail = idElecDetail;
	}
	public int getElectionId() {
		return electionId;
	}
	public void setElectionId(int electionId) {
		this.electionId = electionId;
	}
	public int getClientId() {
		return clientId;
	}
	public void setClientId(int clientId) {
		this.clientId = clientId;
	}
	public String getClientName() {
		return clientName;
	}
	public void setClientName(String clientName) {
		this.clientName = clientName;
	}
	public int getIdVoter() {
		return idVoter;
	}
	public void setIdVoter(int idVoter) {
		this.idVoter = idVoter;
	}
	public int getVote() {
		return vote;
	}
	public void setVote(int vote) {
		this.vote = vote;
	}
	
	
}
