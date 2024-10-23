import java.util.*;

import EmployeeProject.Department;
import EmployeeProject.SalariedEmployee;
import EmployeeProject.HourlyEmployee;
import EmployeeProject.Commission_Employee;
import EmployeeProject.Employee;

public class EmployeeProject {
    public static void main(String[] args) throws Exception {
       
 Department d1= new Department(1,"Information Systems");
 
 SalariedEmployee se = new SalariedEmployee(2000, 500, 50, "Ahmed", "Riyadh", 1200, Employee.Gender.male);

 d1.add_employee(se);
 HourlyEmployee he = new HourlyEmployee(100, 6, "Mohamed","Kharj", 1500, Employee.Gender.male);
 
 d1.add_employee(he);
 
 Commission_Employee ce = new Commission_Employee(15000, 0.25, "Fatema", "Riyadh", 1200, Employee.Gender.female);
 
 d1.add_employee(ce);
 
System.out.println( d1.getemployeecount());
    
  d1.print_basic_data();
    
 d1.print_All_details();
                
    }}
            
        
        

