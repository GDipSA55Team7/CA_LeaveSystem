package sg.nus.iss.leavesystem.ca.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import sg.nus.iss.leavesystem.ca.model.OvertimeApplication;

public interface OverTimeApplicationRepository extends JpaRepository<OvertimeApplication, Long>{

}