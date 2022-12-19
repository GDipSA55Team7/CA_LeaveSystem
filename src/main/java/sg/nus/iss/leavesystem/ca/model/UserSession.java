package sg.nus.iss.leavesystem.ca.model;

<<<<<<< HEAD
import java.util.ArrayList;
import java.util.List;

=======
>>>>>>> Manager
public class UserSession {
	
    private long staffId;

    private String userName;
<<<<<<< HEAD
    
    private List<String> userRoles = new ArrayList<>();

    public List<String> getUserRoles() {
		return userRoles;
	}

	public void setUserRoles(List<Role> userRoles) {
		for(Role role: userRoles) {
			this.userRoles.add(role.getRoleName());
		}
	}

	public long getStaffId() {
=======

    public long getStaffId() {
>>>>>>> Manager
        return staffId;
    }

    public void setStaffId(long staffId) {
        this.staffId = staffId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

}
