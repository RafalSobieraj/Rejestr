package ProgramowanieObiektowe.Zadanie5Pracownicy.workers;

import java.util.Objects;

public class Employee implements Comparable<Employee>{
    private int employeeIdentityNumber;
    private String employeeFirstName;
    private String employeeLastName;
    private int employeeAge;
    private int employeeExperience;
    private String workplaceAddress;
    private String workplaceTown;
    private int workplaceBuildingNumber;
    private int workplaceLocalNumber;

    public Employee(int employeeIdentityNumber,
                    String employeeFirstName,
                    String employeeLastName,
                    int employeeAge,
                    int employeeExperience,
                    String workplaceAddress,
                    String workplaceTown,
                    int workplaceBuildingNumber,
                    int workplaceLocalNumber) {
        this.employeeIdentityNumber = employeeIdentityNumber;
        this.employeeFirstName = employeeFirstName;
        this.employeeLastName = employeeLastName;
        this.employeeAge = employeeAge;
        this.employeeExperience = employeeExperience;
        this.workplaceAddress = workplaceAddress;
        this.workplaceTown = workplaceTown;
        this.workplaceBuildingNumber = workplaceBuildingNumber;
        this.workplaceLocalNumber = workplaceLocalNumber;
    }

    public Employee() {

    }

    public int getWorkplaceBuildingNumber() {
        return workplaceBuildingNumber;
    }

    public void setWorkplaceBuildingNumber(int workplaceBuildingNumber) {
        this.workplaceBuildingNumber = workplaceBuildingNumber;
    }

    public int getWorkplaceLocalNumber() {
        return workplaceLocalNumber;
    }

    public void setWorkplaceLocalNumber(int workplaceLocalNumber) {
        this.workplaceLocalNumber = workplaceLocalNumber;
    }

    public String getWorkplaceAddress() {
        return workplaceAddress;
    }

    public void setWorkplaceAddress(String workplaceAddress) {
        this.workplaceAddress = workplaceAddress;
    }

    public int getEmployeeExperience() {
        return employeeExperience;
    }

    public void setEmployeeExperience(int employeeExperience) {
        this.employeeExperience = employeeExperience;
    }

    public int getEmployeeAge() {
        return employeeAge;
    }

    public void setEmployeeAge(int employeeAge) {
        this.employeeAge = employeeAge;
    }

    public String getWorkplaceTown() {
        return workplaceTown;
    }

    public void setWorkplaceTown(String workplaceTown) {
        this.workplaceTown = workplaceTown;
    }

    public String getEmployeeLastName() {
        return employeeLastName;
    }

    public void setEmployeeLastName(String employeeLastName) {
        this.employeeLastName = employeeLastName;
    }

    public String getEmployeeFirstName() {
        return employeeFirstName;
    }

    public void setEmployeeFirstName(String employeeFirstName) {
        this.employeeFirstName = employeeFirstName;
    }

    public int getEmployeeIdentityNumber() {
        return employeeIdentityNumber;
    }

    public void setEmployeeIdentityNumber(int employeeIdentityNumber) {
        this.employeeIdentityNumber = employeeIdentityNumber;
    }

    @Override
    public int compareTo(Employee employee) {
        int compareByExperience = ((Employee) employee).getEmployeeExperience();
        return compareByExperience - this.employeeExperience;
    }

    public int compare1(Employee employee){
        int compareByAge = ((Employee) employee).getEmployeeAge();
        return compareByAge - this.employeeAge;
    }
    public int compare(Employee employee){

        return employee.employeeLastName.compareToIgnoreCase(this.employeeLastName);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee)) return false;
        Employee employee = (Employee) o;
        return getEmployeeIdentityNumber() == employee.getEmployeeIdentityNumber() &&
                getEmployeeAge() == employee.getEmployeeAge() &&
                getEmployeeExperience() == employee.getEmployeeExperience() &&
                getWorkplaceBuildingNumber() == employee.getWorkplaceBuildingNumber() &&
                getWorkplaceLocalNumber() == employee.getWorkplaceLocalNumber() &&
                Objects.equals(getEmployeeFirstName(), employee.getEmployeeFirstName()) &&
                Objects.equals(getEmployeeLastName(), employee.getEmployeeLastName()) &&
                Objects.equals(getWorkplaceAddress(), employee.getWorkplaceAddress()) &&
                Objects.equals(getWorkplaceTown(), employee.getWorkplaceTown());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getEmployeeIdentityNumber(), getEmployeeFirstName(), getEmployeeLastName(),
                getEmployeeAge(), getEmployeeExperience(), getWorkplaceAddress(), getWorkplaceTown(),
                getWorkplaceBuildingNumber(), getWorkplaceLocalNumber());
    }

    @Override
    public String toString() {
        return "Numer Identyfikacyjny: " + employeeIdentityNumber + "\n" +
                "Imię: " + employeeFirstName + '\n' +
                "Nazwisko: " + employeeLastName + '\n' +
                "Wiek: " + employeeAge + '\n' +
                "Lata doświadczenia: " + employeeExperience;
    }
}
