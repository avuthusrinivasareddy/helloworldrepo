package com.wawa.workloadmanagement.model;

import java.util.List;

public class Order {
	Integer orderId;
	List<OrderLineItem> orderLineItems;
	Double price;
	OrderState state;
	public Integer getOrderId() {
		return orderId;
	}
	public void setOrderId(Integer orderId) {
		
		this.orderId = orderId;
	}
	public List<OrderLineItem> getOrderLineItems() {
		return orderLineItems;
	}
	public void setOrderLineItems(List<OrderLineItem> orderLineItems) {
		this.orderLineItems = orderLineItems;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public OrderState getState() {
		return state;
	}
	public void setState(OrderState state) {
		this.state = state;
	}
}