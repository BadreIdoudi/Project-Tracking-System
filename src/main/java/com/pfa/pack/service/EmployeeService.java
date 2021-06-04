package com.pfa.pack.service;

import java.util.List;

import com.pfa.pack.model.collection.EmployeesCollection;
import com.pfa.pack.model.dto.EmployeeAssignedProjectDto;
import com.pfa.pack.model.entity.Employee;

public interface EmployeeService {
	
	public abstract EmployeesCollection findAll();
	public abstract Employee findById(final Integer employeeId);
	public abstract Employee save(final Employee employee);
	public abstract Employee update(final Employee employee);
	public abstract void delete(final Integer employeeId);
	public abstract List<Employee> findByDepartmentId(final Integer departmentId);
	public abstract List<Employee> findByManagerId(final Integer managerId);
	public abstract List<EmployeeAssignedProjectDto> findByManagerIdAndProjectId(final Integer managerId, final Integer projectId);
	public abstract List<Employee> findAllManagers();
	
}
