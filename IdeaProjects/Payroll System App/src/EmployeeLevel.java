import java.util.ArrayList;

import static java.lang.Integer.parseInt;

public class EmployeeLevel extends EmployeeStatus{

    private Account employeeAccount = new Account();
    private int dailySalary;
    String employeeLevel = Account.salaryAmount();
    int employeeSalary = parseInt(employeeLevel);
    ArrayList<Integer> storeCalculation = new ArrayList<>();

    public void checkLevel() {

        if (employeeSalary >= 100000 || employeeSalary <= 250000) {
            String employeeLevel_ = "EMPLOYEE";
        }

        if (employeeSalary >= 250000 || employeeSalary <= 500000) {
            String employeeLevel_ = "SEMI-LEVEL EMPLOYEE";
        }

        if (employeeSalary >= 500000 || employeeSalary <= 750000) {
            String employeeLevel_ = "MID-LEVEL EMPLOYEE";
        }
        if (employeeSalary >= 750000 || employeeSalary <= 1000000) {
            String employeeLevel_ = "MANAGERIAL LEVEL";
        }
    }
    public void weeklyCalculation(){
            storeCalculation.add(employeeSalary / 7);
            storeCalculation.add(employeeSalary * 4);
            storeCalculation.add(employeeSalary * 52);

    }

    public void monthlyCalculation(int collectInput) {
        storeCalculation.add(employeeSalary / 30);
        storeCalculation.add(employeeSalary / 4);
        storeCalculation.add(employeeSalary * 12);
    }

    public void yearlyCalculation(int collectInput) {
        storeCalculation.add(employeeSalary * 365);
        storeCalculation.add(employeeSalary / 52);
        storeCalculation.add(employeeSalary /12);
    }

    public ArrayList<Integer> getWeeklyCalculation(){
        return storeCalculation;
    }

    public String getEmployeeProfile(){
        return String.valueOf(storeCalculation);
    }
}
