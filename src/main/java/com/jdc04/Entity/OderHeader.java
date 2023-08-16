package com.jdc04.Entity;

import java.time.LocalDate;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

@Entity
public class OderHeader {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private Long id;
	private String username;
	private String userMob;
	private String userEmail;
	private Long purchaseOderNumber;
	@CreationTimestamp
	private LocalDate purchaseOderDate;
	@OneToOne
	private String OderItems;
	@OneToOne
	private String Address;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getUserMob() {
		return userMob;
	}
	public void setUserMob(String userMob) {
		this.userMob = userMob;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	public Long getPurchaseOderNumber() {
		return purchaseOderNumber;
	}
	public void setPurchaseOderNumber(Long purchaseOderNumber) {
		this.purchaseOderNumber = purchaseOderNumber;
	}
	public LocalDate getPurchaseOderDate() {
		return purchaseOderDate;
	}
	public void setPurchaseOderDate(LocalDate purchaseOderDate) {
		this.purchaseOderDate = purchaseOderDate;
	}
	public String getOderItems() {
		return OderItems;
	}
	public void setOderItems(String oderItems) {
		OderItems = oderItems;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public OderHeader(Long id, String username, String userMob, String userEmail, Long purchaseOderNumber,
			LocalDate purchaseOderDate, String oderItems, String address) {
		super();
		this.id = id;
		this.username = username;
		this.userMob = userMob;
		this.userEmail = userEmail;
		this.purchaseOderNumber = purchaseOderNumber;
		this.purchaseOderDate = purchaseOderDate;
		OderItems = oderItems;
		Address = address;
	}
	public OderHeader() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "OrderHeader [id=" + id + ", username=" + username + ", userMob=" + userMob + ", userEmail=" + userEmail
				+ ", purchaseOderNumber=" + purchaseOderNumber + ", purchaseOderDate=" + purchaseOderDate
				+ ", OderItems=" + OderItems + ", Address=" + Address + "]";
	}

	

}
