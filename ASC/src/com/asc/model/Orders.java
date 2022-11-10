package com.asc.model;

import java.util.Date;

public class Orders {
	
	private int orderId;
	private Date orderDate;
	private Date deliveryDate;
	private int total_order_amount;
	public Orders() {
		super();
	}
	public Orders(int orderId, Date orderDate, Date deliveryDate, int total_order_amount) {
		super();
		this.orderId = orderId;
		this.orderDate = orderDate;
		this.deliveryDate = deliveryDate;
		this.total_order_amount = total_order_amount;
	}
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public Date getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}
	public Date getDeliveryDate() {
		return deliveryDate;
	}
	public void setDeliveryDate(Date deliveryDate) {
		this.deliveryDate = deliveryDate;
	}
	public int getTotal_order_amount() {
		return total_order_amount;
	}
	public void setTotal_order_amount(int total_order_amount) {
		this.total_order_amount = total_order_amount;
	}
	@Override
	public String toString() {
		return "Orders [orderId=" + orderId + ", orderDate=" + orderDate + ", deliveryDate=" + deliveryDate
				+ ", total_order_amount=" + total_order_amount + "]";
	}
	
	
}
