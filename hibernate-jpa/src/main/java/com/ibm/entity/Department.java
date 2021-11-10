package com.ibm.entity;
import java.util.List;
public class Department {
private int deptNo;
private String deptName;
private List<Employee> emps;
public int getDeptNo() {
	return deptNo;
}
public void setDeptNo(int deptNo) {
	this.deptNo = deptNo;
}
public String getDeptName() {
	return deptName;
}
public void setDeptName(String deptName) {
	this.deptName = deptName;
}
public List<Employee> getEmps() {
	return emps;
}
public void setEmps(List<Employee> emps) {
	this.emps = emps;
}


}
