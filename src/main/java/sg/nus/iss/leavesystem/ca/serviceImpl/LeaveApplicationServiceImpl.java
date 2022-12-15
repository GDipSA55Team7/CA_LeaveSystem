package sg.nus.iss.leavesystem.ca.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sg.nus.iss.leavesystem.ca.model.LeaveApplication;
import sg.nus.iss.leavesystem.ca.repository.LeaveApplicationRepository;
import sg.nus.iss.leavesystem.ca.service.LeaveApplicationService;

@Service
public class LeaveApplicationServiceImpl implements LeaveApplicationService{

	@Autowired
	private LeaveApplicationRepository leaveAppRepo;
	
	@Override
	public List<LeaveApplication> getAllLeaveApps() {
		return leaveAppRepo.findAll();
	}

	@Override
	public List<LeaveApplication> getPendingLeaveApps(Long managerId) {
		return null;
	}

	@Override
	public List<LeaveApplication> getPendingOTApps(Long managerId) {
		return null;
	}
	
	
}
