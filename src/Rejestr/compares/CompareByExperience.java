package ProgramowanieObiektowe.Zadanie5Pracownicy.compares;

import ProgramowanieObiektowe.Zadanie5Pracownicy.workers.Employee;

import java.util.Comparator;

public class CompareByExperience implements Comparator<Employee> {

    @Override
    public int compare(Employee employee, Employee t1) {
        return employee.compareTo(t1);
    }
}
