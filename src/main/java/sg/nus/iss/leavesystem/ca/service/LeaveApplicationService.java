package sg.nus.iss.leavesystem.ca.service;

import java.util.List;

import org.springframework.stereotype.Service;

import sg.nus.iss.leavesystem.ca.model.LeaveApplication;


public interface LeaveApplicationService {

	List<LeaveApplication> getAllLeaveApps();
	List<LeaveApplication> getPendingLeaveApps(Long managerId);
	List<LeaveApplication> getPendingOTApps(Long managerId);
	
	
}
