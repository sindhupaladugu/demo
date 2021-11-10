package com.ibm.test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.ibm.entity.Department;
import com.ibm.entity.Employee;
import com.ibm.repo.EmpDeptRepo;
import com.ibm.repo.TestEmpDeptRepo;



public class TestEmpDeptRepo {
	
	private static EmpDeptRepo repo;
	
	@BeforeAll
	public static void init()
	{
		repo = new EmpDeptRepo();
	}
	
	
	@Test
	public void testSaveDepartment() {
		Department dept = new Department();
		dept.setDeptName("Sales");
		dept.setDeptno(23);
		repo.saveDept(dept);
		
	}
	
	@Test
	public void testSaveEmployee() {
		Employee emp = new Employee();
		emp.setEmpNo(201);
		emp.setEmpName("Lili");
		emp.setSalary(8000);
		repo.saveEmp(emp,20);
	}
	
	@Test
	public void TestGetDept()
	{
		Department dept = repo.getDept(20);
		System.out.println("Department: "+dept.getDeptno()+ " - "+dept.getDeptName());
		dept.getEmp();
		
	} 
	
	
}