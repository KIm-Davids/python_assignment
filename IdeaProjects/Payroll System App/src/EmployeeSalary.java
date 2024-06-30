public class EmployeeSalary extends EmployeeStatus {

    Account employeeAccount = new Account();

    public void calculateWeekly(int salary){
        if(salary > 25000 && salary <= 100000){
            String level = "LOWER LEVEL EMPLOYEE";
        }
        if(salary > 50000 && salary <= 100000){
            String level = "MID LEVEL EMPLOYEE";
        }
        if(salary > 75000 && salary <= 100000){
            String level = "AVERAGE LEVEL EMPLOYEE";
        }
        if(salary == 100000){
            String level = "MANAGERIAL LEVEL EMPLOYEE";
        }

        employeeAccount.balance(salary);
    }

}
