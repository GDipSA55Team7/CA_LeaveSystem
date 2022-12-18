package sg.nus.iss.leavesystem.ca.service;

import java.util.List;

import org.springframework.stereotype.Service;

import sg.nus.iss.leavesystem.ca.model.Staff;
import sg.nus.iss.leavesystem.ca.model.dto.StaffForm;

@Service
public interface StaffService {
	Staff createStaff(Staff staff);

	List<Staff> findAllStaff();

	Staff findStaffByID(String id);
	
    Staff FindByUserId(long userId);

	List<Staff> findAllManagers();

	List<StaffForm> getStaffList();

	List<StaffForm> getStaffFormManagers();

}
