package com.project.onlineAdminisionSystem.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.onlineAdminisionSystem.entity.Program;

@Repository
public interface IProgramRepository  extends JpaRepository<Program , Integer> {

	Optional<Program> findByprogramName(String programName);

	void deleteByprogramName(String programName);

	List<Program> findByprogramEligibility(String programEligibility);

	

	List<Program> findBycollege(int id);

	

}
