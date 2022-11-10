package com.asc.model;

public class Payments {
	
	private int paymentId;
	private String payment_Type;
	private String allowed;
	public Payments(int paymentId, String payment_Type, String allowed) {
		super();
		this.paymentId = paymentId;
		this.payment_Type = payment_Type;
		this.allowed = allowed;
	}
	public Payments() {
		super();
	}
	public int getPaymentId() {
		return paymentId;
	}
	public void setPaymentId(int paymentId) {
		this.paymentId = paymentId;
	}
	public String getPayment_Type() {
		return payment_Type;
	}
	public void setPayment_Type(String payment_Type) {
		this.payment_Type = payment_Type;
	}
	public String getAllowed() {
		return allowed;
	}
	public void setAllowed(String allowed) {
		this.allowed = allowed;
	}
	@Override
	public String toString() {
		return "Payments [paymentId=" + paymentId + ", payment_Type=" + payment_Type + ", allowed=" + allowed + "]";
	}
	
	

}
