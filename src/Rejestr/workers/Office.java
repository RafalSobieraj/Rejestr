package ProgramowanieObiektowe.Zadanie5Pracownicy.workers;

import java.util.Objects;

public class Office extends Employee {
    private int Intellect;
    private int officeIdentityNumber;

    public Office() {

    }

    @Override
    public String toString() {
        return super.toString() + '\n' +
                "Intelekt: " + Intellect + '\n' +
                "Identyfikator stanowiska biurowego: " + officeIdentityNumber + '\n' +
                "Wartość dla korporacji: " + getOfficeValue();
    }

    public Office(String employeeFirstName, String employeeLastName, int employeeAge,
                  int employeeExperience, String workplaceAddress, String workplaceTown, int workplaceBuildingNumber,
                  int workplaceLocalNumber, int intellect, int employeeIdentityNumber, int officeIdentityNumber)
    {
        super(employeeIdentityNumber, employeeFirstName, employeeLastName, employeeAge,
                employeeExperience, workplaceAddress, workplaceTown,
                workplaceBuildingNumber, workplaceLocalNumber);
        Intellect = intellect;
        this.officeIdentityNumber = officeIdentityNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Office)) return false;
        if (!super.equals(o)) return false;
        Office office = (Office) o;
        return getIntellect() == office.getIntellect() &&
                getOfficeIdentityNumber() == office.getOfficeIdentityNumber();
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getIntellect(), getOfficeIdentityNumber());
    }

    public int getOfficeValue() {
        return this.getEmployeeExperience()*this.getIntellect();
    }

    public int getIntellect() {
        return Intellect;
    }

    public void setIntellect(int intellect) {
        Intellect = intellect;
    }

    public int getOfficeIdentityNumber() {
        return officeIdentityNumber;
    }

    public void setOfficeIdentityNumber(int officeIdentityNumber) {
        this.officeIdentityNumber = officeIdentityNumber;
    }
}
