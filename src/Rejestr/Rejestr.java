package ProgramowanieObiektowe.Zadanie5Pracownicy;

import ProgramowanieObiektowe.Zadanie5Pracownicy.compares.CompareByAge;
import ProgramowanieObiektowe.Zadanie5Pracownicy.compares.CompareByExperience;
import ProgramowanieObiektowe.Zadanie5Pracownicy.compares.CompareByName;
import ProgramowanieObiektowe.Zadanie5Pracownicy.workers.Employee;
import ProgramowanieObiektowe.Zadanie5Pracownicy.workers.Office;
import ProgramowanieObiektowe.Zadanie5Pracownicy.workers.Physical;
import ProgramowanieObiektowe.Zadanie5Pracownicy.workers.Trader;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import static ProgramowanieObiektowe.Zadanie5Pracownicy.TraderEffectivnes.*;

public class Rejestr {

    public static void getWorkersByCity(Set<Employee> treeSet, String city) {
        List<Employee> foundedEmployess = new ArrayList<>();
        for (Employee employee : treeSet) {
            if (employee.getWorkplaceTown().equals(city)) {
                foundedEmployess.add(employee);

            }
        }
        for (Employee employee : foundedEmployess) {
            System.out.println(employee.toString() + '\n');
        }
    }

    public void getValueOfTrader( Trader trader) {
            if (trader.getEffectiveness().equals(NISKA)) {
                trader.getEffectiveness().getValue();
            } else if (trader.getEffectiveness().equals(ŚREDNIA)) {
                trader.getEffectiveness().getValue();
            } else if (trader.getEffectiveness().equals(WYSOKA)) {
                trader.getEffectiveness().getValue();
            }
        }

    public int getWorkerValue(Employee employee) {
        if (employee instanceof Physical) {
            Physical physicalEmployee = (Physical) employee;
            return physicalEmployee.getPhysicalValue();
        } else if (employee instanceof Trader) {
            Trader traderEmployee = (Trader) employee;
            return traderEmployee.getTraderValue();
        } else if (employee instanceof Office) {
            Office officeEmployee = (Office) employee;
            return officeEmployee.getOfficeValue();
        }
        else
            return 1;
    }


    public static TreeSet<Employee> workerSortByExperience(Set<Employee> treeSet) {
        CompareByExperience compareByExperience = new CompareByExperience();
        TreeSet<Employee> employees = new TreeSet<>(compareByExperience);
        employees.addAll(treeSet);
        return employees;
    }

    public static TreeSet<Employee> workerSortByAge(Set<Employee> treeSet) {
        CompareByAge compareByAge = new CompareByAge();;
        TreeSet<Employee> employees = new TreeSet<>(compareByAge);
        employees.addAll(treeSet);
        return employees;
    }

    public static TreeSet<Employee> workerSortByName(Set<Employee> treeSet) {
        CompareByName compareByName = new CompareByName();
        TreeSet<Employee> employees = new TreeSet<>(compareByName);
        employees.addAll(treeSet);
        return employees;
    }
}
