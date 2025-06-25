package org.Component_Value_Annotations;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Employee{


    private  int    employeeID;
    private  String firstNAME;
    private  String lastNAME;

    public Employee(@Value("#{1}") int employeeID,@Value("Suvro") String firstNAME,@Value("Halder") String lastNAME, @Value( "#{400*300}") int salary) {
        this.employeeID = employeeID;
        this.firstNAME = firstNAME;
        this.lastNAME = lastNAME;
        Salary = salary;
    }


    private  int Salary;

    public int getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    public String getFirstNAME() {
        return firstNAME;
    }

    public void setFirstNAME(String firstNAME) {
        this.firstNAME = firstNAME;
    }

    public String getLastNAME() {
        return lastNAME;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeID=" + employeeID +
                ", firstNAME='" + firstNAME + '\'' +
                ", lastNAME='" + lastNAME + '\'' +
                ", Salary=" + Salary +
                '}';
    }

    public void setLastNAME(String lastNAME) {
        this.lastNAME = lastNAME;
    }

    public int getSalary() {
        return Salary;
    }

    public void setSalary(int salary) {
        Salary = salary;
    }
}
