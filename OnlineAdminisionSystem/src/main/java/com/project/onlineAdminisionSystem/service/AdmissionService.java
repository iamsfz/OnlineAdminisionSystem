package com.project.onlineAdminisionSystem.service;
import java.util.List;
import java.util.Optional;
import com.project.onlineAdminisionSystem.entity.Admission;

public interface AdmissionService {
	
	public Admission addAdmission(Admission admission);
	public void deleteAdmissionById(int applicationId);
	public Admission updateAdmission(Admission admission);
	public Optional<Admission> getAdmissionbyId(int admissionId);
	public List<Admission>viewAllAdmissions();
}
