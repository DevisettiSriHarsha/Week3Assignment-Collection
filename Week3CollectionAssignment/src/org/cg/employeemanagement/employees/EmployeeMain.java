package org.cg.employeemanagement.employees;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Scanner;
import org.cg.employeemanagement.model.EmpAddress;
import org.cg.employeemanagement.model.EmpDepartment;
import org.cg.employeemanagement.model.EmployeeDetails;
import org.cg.employeemanagement.repository.Repository;
import org.cg.employeemanagement.service.EmployeeDetailsValidation;

public class EmployeeMain {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		Repository repository = new Repository();
		EmployeeDetailsValidation val = new EmployeeDetailsValidation();
		//Map<EmployeeDetails, String> tmap = new TreeMap<EmployeeDetails, String>();
		HashSet<EmpAddress> adresses = new HashSet<EmpAddress>();

		while (true) {
			System.out.println("Enter your choice: " + "\n 1.Add Employee" + "\n 2.Sort by empid"
					+ "\n 3.Sort by first name" + "\n 4.Sort by last name" + "\n 5.Sort by salary"
					+ "\n 6.Sort by department" + "\n 8.Exit ");

			int choice = scanner.nextInt();
			switch (choice) {
			case 1:

				EmployeeDetails employee = new EmployeeDetails();
				EmpDepartment empDepartment=new EmpDepartment(); 
				System.out.println("Enter Employee ID (12345_FS):");
				while (true) {
					String empId = scanner.next();
					if (val.idValidation(empId)) {
						employee.setEmployeeId(empId);
						break;

					} else {
						System.out.println("enter valid employee id");
					}
				}

				System.out.println("enter first name");
				while (true) {
					String empFname = scanner.next();
					if (val.nameValidation(empFname)) {
						employee.setFirstName(empFname);
						break;
					} else
						System.out.println("enter name in alphabets");
				}

				System.out.println("enter last name");
				while (true) {
					String empLname = scanner.next();
					if (val.nameValidation(empLname)) {
						employee.setLastName(empLname);
						break;
					} else
						System.out.println("enter name in alphabets");
				}

				System.out.println("Enter salary (must be in range of 20000 to 500000) : ");
				while (true) {
					double empSalary = scanner.nextDouble();
					if (val.salaryValidation(empSalary)) {
						employee.setSalary(empSalary);
						break;
					} else
						System.out.println("enter salary between 20000 and 500000");
				}

				System.out.println("Enter the date of joining");
				String doj = scanner.next();
				if (val.dateValidation(doj)) {
					employee.setDateOfJoining(doj);

				} else {
					System.out.println("dates are not allowed");
					break;
				}
				

				System.out.println("enter department id");
				empDepartment.setDepartmentId(scanner.nextInt());

				System.out.println("enter department name");
				empDepartment.setDepartmentName(scanner.next());

				System.out.println("enter location");
				empDepartment.setLocation(scanner.next());

				System.out.println("Enter the no. of address");
				int n = scanner.nextInt();
				for (int i = 0; i < n; i++) {
					EmpAddress add = new EmpAddress();
					System.out.println("Enter address Id : ");
					add.setAddressId(scanner.nextInt());
					System.out.println("Enter address line1 : ");
					add.setAdressLine1(scanner.next());
					System.out.println("Enter city : ");
					add.setCity(scanner.next());
					System.out.println("Enter state : ");
					add.setState(scanner.next());
					adresses.add(add);
				}

				employee.setAdresses(adresses);
				;

				repository.setEmployees(employee);
				System.out.println("employee created" + repository.getEmployees());

				break;
			case 2:
				System.out.println("Sort By EmployeeId");
				Comparator<EmployeeDetails> sortById = new Comparator<EmployeeDetails>() {
					
					@Override
					public int compare(EmployeeDetails e1, EmployeeDetails e2) {
						return e1.getEmployeeId().compareTo(e2.getEmployeeId());
					}
				};


				Collections.sort(repository.getEmployees(),sortById);
				for(EmployeeDetails emp : repository.getEmployees())
					System.out.println(emp);
				break;
			case 3:
				System.out.println("Sort By Employee First Name");
				Comparator<EmployeeDetails> sortByName = new Comparator<EmployeeDetails>() {
					
					@Override
					public int compare(EmployeeDetails e1, EmployeeDetails e2) {
						return e1.getFirstName().compareTo(e2.getFirstName());
					}
				};
				Collections.sort(repository.getEmployees(),sortByName);
				for(EmployeeDetails emp : repository.getEmployees())
					System.out.println(emp);
				break;
			case 4:
				System.out.println("Sort By Employee Last Name");
				Comparator<EmployeeDetails> sortByLastName = new Comparator<EmployeeDetails>() {
				
					@Override
					public int compare(EmployeeDetails o1, EmployeeDetails o2) {
						return o1.getLastName().compareToIgnoreCase(o2.getLastName());
					}
				};
				Collections.sort(repository.getEmployees(),sortByLastName);
				for(EmployeeDetails emp : repository.getEmployees())
					System.out.println(emp);
				break;
			case 5:
				System.out.println("Sort By Employee Salary");
				Comparator<EmployeeDetails> sortBySal = new Comparator<EmployeeDetails>() {
					public int compare(EmployeeDetails o1, EmployeeDetails o2) {
						return o1.getSalary().compareTo(o2.getSalary());
					}
				};
				Collections.sort(repository.getEmployees(), sortBySal);
				for(EmployeeDetails emp : repository.getEmployees())
					System.out.println(emp);
				break;
			case 6:
				System.out.println("Sort By Employee Department Id");
				Comparator<EmployeeDetails>  sortByDep= new Comparator<EmployeeDetails>() {
					public int compare(EmployeeDetails e1, EmployeeDetails e2) {
						return e1.getEmpDepartment().getDepartmentId().compareTo(e2.getEmpDepartment().getDepartmentId());
					}
				};
				Collections.sort(repository.getEmployees(),sortByDep);
				for(EmployeeDetails emp : repository.getEmployees())
					System.out.println(emp);
				break;

			/*
			 * case 2: System.out.println("Sort by EmployeeeID"); List<EmployeeDetails>
			 * empIdList=new ArrayList<EmployeeDetails>(tmap.keySet());
			 * //Collections.sort(empIdList,
			 * Comparator.comparing(EmployeeDetails::getEmployeeId));
			 * Collections.sort(empIdList, EmployeeDetailsSorting.COMPARE_BY_EMP_ID);
			 * empIdList.forEach(System.out::println); break; case 3:
			 * System.out.println("Sort by Employeee First Name"); List<EmployeeDetails>
			 * empFnameList=new ArrayList<EmployeeDetails>(tmap.keySet());
			 * //Collections.sort(empFnameList,Comparator.comparing(EmployeeDetails::
			 * getFirstName)); Collections.sort(empFnameList,
			 * EmployeeDetailsSorting.COMPARE_BY_EMP_FIRST_NAME);
			 * empFnameList.forEach(System.out::println); break; case 4:
			 * System.out.println("Sort by Employeee Last Name"); List<EmployeeDetails>
			 * empLnameList=new ArrayList<EmployeeDetails>(tmap.keySet());
			 * //Collections.sort(empLnameList,Comparator.comparing(EmployeeDetails::
			 * getLastName)); Collections.sort(empLnameList,
			 * EmployeeDetailsSorting.COMPARE_BY_EMP_LAST_NAME);
			 * empLnameList.forEach(System.out::println); break; case 5:
			 * System.out.println("Sort by Employeee salary"); List<EmployeeDetails>
			 * empSalaryList=new ArrayList<EmployeeDetails>(tmap.keySet());
			 * //Collections.sort(empSalaryList,Comparator.comparing(EmployeeDetails::
			 * getSalary)); Collections.sort(empSalaryList,
			 * EmployeeDetailsSorting.COMPARE_BY_EMP_SALARY);
			 * empSalaryList.forEach(System.out::println); break; case 6:
			 * System.out.println("Sort by Employeee department");
			 * 
			 * Comparator<EmployeeDetails> sortByDeptId = new Comparator<EmployeeDetails>()
			 * {
			 * 
			 * @Override public int compare(EmployeeDetails o1, EmployeeDetails o2) {
			 * 
			 * return
			 * o1.getEmpDepartment().getDepartmentId().compareTo(o2.getEmpDepartment().
			 * getDepartmentId()); } };
			 * 
			 * List<EmployeeDetails> empDeptlist = new
			 * ArrayList<EmployeeDetails>(tmap.keySet()); //Collections.sort(empDeptlist,
			 * sortByDeptId); Collections.sort(empDeptlist,
			 * EmployeeDetailsSorting.COMPARE_BY_EMP_DEPARTMENT);
			 * empDeptlist.forEach(System.out::println); break; case 7:
			 * System.out.println("Sort by address"); List<EmpAddress> empAddrList=new
			 * ArrayList<EmpAddress>();
			 * //Collections.sort(empList6,Comparator.comparing(EmpAddress::getAddressId));
			 * Collections.sort(empAddrList, EmployeeDetailsSorting.COMPARE_BY_EMP_ADDRESS);
			 * empAddrList.forEach(System.out::println); break;
			 */
				
			case 7:
				System.out.println("Thank you for using our Application.");
				System.exit(0);
				break;

			default:
				System.out.println("Choose the valid Action");
				break;
			}

		}

	}

}
