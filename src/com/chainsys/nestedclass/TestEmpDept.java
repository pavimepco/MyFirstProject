package com.chainsys.nestedclass;

public class TestEmpDept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			Employees emp=new Employees();
			emp.id=101;
			emp.name="Pavi";
			emp.dept=new Dept();
			emp.dept.id=1001;
			emp.dept.name="IT";		
			System.out.println(emp.id+""+emp.name+""+emp.dept.id+""+emp.dept.name);
		}
	}

//Employees emp=new Employees();
//emp.dept=dept;