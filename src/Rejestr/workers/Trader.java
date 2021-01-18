package ProgramowanieObiektowe.Zadanie5Pracownicy.workers;

import ProgramowanieObiektowe.Zadanie5Pracownicy.TraderEffectivnes;

import java.util.Objects;

public class Trader extends Employee{
    private TraderEffectivnes Effectiveness;
    private int Commission;

    @Override
    public String toString() {
        return super.toString() + '\n' +
                "Skuteczność: " + Effectiveness + '\n' +
                "Wysokość prowizji: " + Commission + '\n' +
                "Wartość dla korporacji: " + getTraderValue();
    }

    public Trader(String employeeFirstName, String employeeLastName, int employeeAge, int employeeExperience,
                  String workplaceAddress, String workplaceTown, int workplaceBuildingNumber,
                  int workplaceLocalNumber, int employeeIdentityNumber, TraderEffectivnes effectiveness, int commission)
    {
        super(employeeIdentityNumber,
                employeeFirstName,
                employeeLastName,
                employeeAge,
                employeeExperience, workplaceAddress, workplaceTown,
                workplaceBuildingNumber, workplaceLocalNumber);
        Effectiveness = effectiveness;
        Commission = commission;
    }

    public TraderEffectivnes getEffectiveness() {
        return Effectiveness;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Trader)) return false;
        if (!super.equals(o)) return false;
        Trader trader = (Trader) o;
        return getCommission() == trader.getCommission() &&
                getEffectiveness() == trader.getEffectiveness();
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getEffectiveness(), getCommission());
    }

    public int getTraderValue(){
        return this.getEmployeeExperience() * this.getEffectiveness().getValue();
    }

    public void setEffectiveness(TraderEffectivnes effectiveness) {
        Effectiveness = effectiveness;
    }

    public int getCommission() {
        return Commission;
    }

    public void setCommission(int commission) {
        Commission = commission;
    }
}
