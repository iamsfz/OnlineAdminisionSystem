package com.project.onlineAdminisionSystem.service;
import com.project.onlineAdminisionSystem.entity.Program;


import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


public interface IProgramService {
	public Program addProgram(Program program);

	public  ArrayList<Program> getApplicationDetailsByCollegeName(String collegeName);
	public  Optional<Program> getProgramDetailsByName(String programName);

	public void deleteProgramById(int programId);
	public void deleteProgramByName(String programName);
	public Optional<Program> getProgramById(int programId);
	public Program  updateProgramStatus(Program program);

	List<Program> viewAllProgramDetails();
	List<Program> getProgramByCollegeId(int id);
	List<Program> getProgramByEligibility(String programEligibility);
}
