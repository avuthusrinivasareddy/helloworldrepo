package com.wawa.workloadmanagement;

import java.util.List;

import org.springframework.stereotype.Service;

import com.wawa.workloadmanagement.model.WawaStation;

@Service
public class StationManagerService {
	private List<WawaStation> stations;
	
	OrderQueueService orderQueueService;
	
	public boolean employyeLogin() {
		return true;
	}
	
	public void employyeLogout() {
		
	}
	
	public void processOrder() {
		//1. get item from queue
		//2. iterate each Line Item and check which WawaStation can handle it
		//3. 
	}

}
