package com.wawa.workloadmanagement;

import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

import org.springframework.stereotype.Service;

import com.wawa.workloadmanagement.model.Order;
import com.wawa.workloadmanagement.model.OrderLineItem;

@Service
public class OrderQueueService {
	private Map<Integer, Queue<OrderLineItem>> orderQueueByProductGroupIdMap = new HashMap<>();
	
	public boolean pushOrder(Order order) {
		for(OrderLineItem orderItem : order.getOrderLineItems()) {
			Integer productGroupId = orderItem.getProduct().getProductGropId();
			if(!orderQueueByProductGroupIdMap.containsKey(productGroupId)) {
				orderQueueByProductGroupIdMap.put(productGroupId, new LinkedBlockingQueue<>());
			}
			orderQueueByProductGroupIdMap.get(productGroupId).add(orderItem);
		}
		return true;
	}
	
	public OrderLineItem receiveNextOrderLineItem(Integer productGroupId) {
		Queue<OrderLineItem> lineItemQueue = orderQueueByProductGroupIdMap.get(productGroupId);
		
		if(lineItemQueue == null || lineItemQueue.isEmpty()) {
			return null;
		}
		return lineItemQueue.remove();
	}
}