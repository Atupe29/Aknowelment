package com.jdc04.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class OderItems {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int productid;
	private String productname;
	private String productdescrition;
	private int productoty;
	private int productprice;

	public int getProductid() {
		return productid;
	}

	public void setProductid(int productid) {
		this.productid = productid;
	}

	public String getProductname() {
		return productname;
	}

	public void setProductname(String productname) {
		this.productname = productname;
	}

	public String getProductdescrition() {
		return productdescrition;
	}

	public void setProductdescrition(String productdescrition) {
		this.productdescrition = productdescrition;
	}

	public int getProductoty() {
		return productoty;
	}

	public void setProductoty(int productoty) {
		this.productoty = productoty;
	}

	public int getProductprice() {
		return productprice;
	}

	public void setProductprice(int productprice) {
		this.productprice = productprice;
	}

	public OderItems(int productid, String productname, String productdescrition, int productoty, int productprice) {
		super();
		this.productid = productid;
		this.productname = productname;
		this.productdescrition = productdescrition;
		this.productoty = productoty;
		this.productprice = productprice;
	}

	public OderItems() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "OderItems [productid=" + productid + ", productname=" + productname + ", productdescrition="
				+ productdescrition + ", productoty=" + productoty + ", productprice=" + productprice + "]";
	}

}
