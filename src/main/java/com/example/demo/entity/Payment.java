package com.example.demo.entity;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@DynamicInsert
@DynamicUpdate
public class Payment {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	//@NotEmpty(message="Input fields cannot be empty")
	private int transactionId;
	@Column(name = "Trans_date")
	@JsonFormat(pattern ="yyyy-MM-DD")
	//@NotEmpty(message="Invalid Date")
	private Date transactionDate;
	//@NotEmpty(message="Amount cannot be 0")
	private double AmountPaid;
	
	public double getAmountPaid() {
		return AmountPaid;
	}
	public void setAmountPaid(double amountPaid) {
		AmountPaid = amountPaid;
	}
	public int getTransactionId() {
		return transactionId;
	}
	public void setTransactionId(int transactionId) {
		this.transactionId = transactionId;
	}
	public Date getTransactionDate() {
		return transactionDate;
	}
	public void setTransactionDate(Date transactionDate) {
		this.transactionDate = transactionDate;
	}
	@Override
	public String toString() {
		return "Payment [transactionId=" + transactionId + ", transactionDate=" + transactionDate + ", Amount="
				+ AmountPaid + "]";
	}
	
}
