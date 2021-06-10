package com.project.onlineAdminisionSystem.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.onlineAdminisionSystem.entity.Program;
import com.project.onlineAdminisionSystem.repository.IProgramRepository;
@Service	
public class ProgramServiceImpl implements IProgramService{
@Autowired
private IProgramRepository repo;
	@Override
	public Program addProgram(Program program) {
	
		return repo.save(program);
	}

	
	@Override
	public List<Program> viewAllProgramDetails() {

		return repo.findAll();
	}

	@Override
	public ArrayList<Program> getApplicationDetailsByCollegeName(String collegeName) {
	
		return null;
	}

	@Override
	public Optional<Program> getProgramDetailsByName(String programName) {

		return repo.findByprogramName(programName);
	}

	@Override
	
	public List<Program> getProgramByEligibility(String programEligibility) {
	
		return repo.findByprogramEligibility(programEligibility);
	}

	@Override
	public void deleteProgramById(int programId) {

		repo.deleteById(programId);
	}

	@Override
	public void deleteProgramByName(String programName) {

		repo.deleteByprogramName(programName);
	}

	@Override
	public Optional<Program> getProgramById(int programId) {
	
		return repo.findById(programId);
	}

	@Override
	public Program updateProgramStatus(Program program) {
		Program program1 = repo.findById(program.getProgramId()).orElseThrow();
		program1.setDegreeOffered(program.getDegreeOffered());
		program1.setProgramDescription(program.getProgramDescription());
		program1.setProgramDuration(program.getProgramDuration());
		program1.setProgramEligibility(program.getProgramEligibility());
		program1.setProgramName(program.getProgramName());
		
		return repo.save(program1);
	}





	@Override
	public List<Program> getProgramsByCollegeId(int collegeId) {

		return repo.findByCollegeId(collegeId);
	}


	@Override
	public List<Integer> getCollegeByProgramName(String programName) {
	
		return repo.findCollegeByProgramName(programName);
	}

}
