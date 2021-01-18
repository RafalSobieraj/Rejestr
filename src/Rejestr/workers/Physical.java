package ProgramowanieObiektowe.Zadanie5Pracownicy.workers;

import java.util.Objects;

public class Physical extends Employee {
    private int Strength;

    public Physical() {

    }

    @Override
    public String toString() {
        return super.toString() + "\n"  +
                "Siła: " + Strength + '\n' +
                "Wartość dla korporacji: " + getPhysicalValue();
    }

    public Physical(String employeeFirstName, String employeeLastName, int employeeAge,
                    int employeeExperience, String workplaceAddress, String workplaceTown,
                    int workplaceBuildingNumber, int workplaceLocalNumber, int strength, int employeeIdentityNumber)
    {
        super(employeeIdentityNumber, employeeFirstName, employeeLastName,
                employeeAge, employeeExperience, workplaceAddress, workplaceTown,
                workplaceBuildingNumber, workplaceLocalNumber);
        Strength = strength;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Physical)) return false;
        if (!super.equals(o)) return false;
        Physical physical = (Physical) o;
        return getStrength() == physical.getStrength();
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getStrength());
    }

    public int getPhysicalValue(){
         return (this.getEmployeeExperience() * this.getStrength()) / this.getEmployeeAge();
    }

    public int getStrength() {
        return Strength;
    }

    public void setStrength(int strength) {
        Strength = strength;
    }
}
