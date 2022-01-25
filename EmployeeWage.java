
public class EmployeeWage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println("WELCOME TO EMPLOYEE WAGE COMPUTATION PROGRAM");
        int EmpratePerHr = 20;
    	int EmpHr = 8;
    	int EmpPartTimeHr = 4;
        int WorkingDayMonth = 20;    	
        int rand = (int) (Math.random() * 3);
        switch(rand) {
        case 0:
        		{
        	System.out.println("Employee is present");
        	int salary = (EmpratePerHr*EmpHr);
        	System.out.println("The salary of Employee"  +salary);
        	int MonthSalary = (salary*WorkingDayMonth);
        	System.out.println("The salary of Employee for Month"  +MonthSalary);
        	break;
        }
        case 1:
        {
        	System.out.println("Employee is PartTime");
        	int salary=(EmpratePerHr*EmpPartTimeHr);
        	System.out.println("The salary of Employee"  +salary);
        	int MonthSalary = (salary*WorkingDayMonth);
        	System.out.println("The salary of Employee for Month"  +MonthSalary);
            break;
        }
        
        default:System.out.println("Employee is absent");
        
        }
    }
}


