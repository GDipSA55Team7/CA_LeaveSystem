package sg.nus.iss.leavesystem.ca.service;

import java.util.List;

import org.springframework.stereotype.Service;

import sg.nus.iss.leavesystem.ca.model.Staff;
import sg.nus.iss.leavesystem.ca.model.dto.StaffForm;
import sg.nus.iss.leavesystem.ca.model.dto.UserStaffForm;

@Service
public interface StaffService {
	Staff createStaff(Staff staff);

	Staff editStaff(String id, UserStaffForm userStaffForm);

	List<Staff> findAllStaff();

	Staff findStaffByID(Long id);

	Staff findStaffByID(String id);
	
    Staff FindByUserId(long userId);

	List<Staff> findAllManagers();

	List<StaffForm> getStaffList();

	List<StaffForm> getStaffFormManagers();

	Boolean deactivateStaff(Staff staff);
	
	Boolean activateStaff(Staff staff);

	void modifyCompensationLeaveBalance(Staff staff, double hours);

}
