package com.jdc04.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Address {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int productid;
	private String productnumber;
	private String producraddress;
	private String productaddrees1;
	private String productcity;
	private String state;
	private String postecode;

	public int getProductid() {
		return productid;
	}

	public void setProductid(int productid) {
		this.productid = productid;
	}

	public String getProductnumber() {
		return productnumber;
	}

	public void setProductnumber(String productnumber) {
		this.productnumber = productnumber;
	}

	public String getProducraddress() {
		return producraddress;
	}

	public void setProducraddress(String producraddress) {
		this.producraddress = producraddress;
	}

	public String getProductaddrees1() {
		return productaddrees1;
	}

	public void setProductaddrees1(String productaddrees1) {
		this.productaddrees1 = productaddrees1;
	}

	public String getProductcity() {
		return productcity;
	}

	public void setProductcity(String productcity) {
		this.productcity = productcity;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getPostecode() {
		return postecode;
	}

	public void setPostecode(String postecode) {
		this.postecode = postecode;
	}

	public Address(int productid, String productnumber, String producraddress, String productaddrees1,
			String productcity, String state, String postecode) {
		super();
		this.productid = productid;
		this.productnumber = productnumber;
		this.producraddress = producraddress;
		this.productaddrees1 = productaddrees1;
		this.productcity = productcity;
		this.state = state;
		this.postecode = postecode;
	}

	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Address [productid=" + productid + ", productnumber=" + productnumber + ", producraddress="
				+ producraddress + ", productaddrees1=" + productaddrees1 + ", productcity=" + productcity + ", state="
				+ state + ", postecode=" + postecode + "]";
	}

}
