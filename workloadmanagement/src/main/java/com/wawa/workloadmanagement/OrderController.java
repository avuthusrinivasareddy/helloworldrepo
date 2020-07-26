package com.wawa.workloadmanagement;

import java.util.Random;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wawa.workloadmanagement.model.Order;

@RestController
public class OrderController {
	
	@RequestMapping("/createOrder")
    public Order createOrder(Order order) {
		//1. generate orderId
		//2. placing it in the queue
		Random rand = new Random();
		Integer orderId = rand.nextInt();
		order.setOrderId(orderId);
		
		
		return order;
	}
	
	
}
