package com.project.onlineAdminisionSystem.controller;



import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.onlineAdminisionSystem.entity.Program;
import com.project.onlineAdminisionSystem.service.IProgramService;


@RestController
@RequestMapping("/program")

public class ProgramController {
	@Autowired
	private IProgramService service;


	@PostMapping("/addProgram")
	public Program addProgram(@RequestBody Program program) {

		return service.addProgram(program);
	}
	
	@DeleteMapping("/deleteProgram/{id}")
	public void deleteProgramById(@PathVariable("id") int id) {
		service.deleteProgramById(id);
	}
	
@GetMapping("/getAllPrograms")
public List<Program> getAllPrograms() {

	return service.viewAllProgramDetails();
}
@GetMapping("/getProgramByName/{collegeName}")
public Optional<Program> getProgramByName(@PathVariable("ProgramName") String name) {

	return service.getProgramDetailsByName(name);
}

@GetMapping("/getProgrameByCollegeId/{id}")
public List<Program> getProgramByName(@PathVariable("id") int id) {

	return service.getProgramsByCollegeId(id);
}
}
