package ProgramowanieObiektowe.Zadanie5Pracownicy.compares;

import ProgramowanieObiektowe.Zadanie5Pracownicy.workers.Employee;

import java.util.Comparator;

public class CompareByAge implements Comparator<Employee> {

    @Override
    public int compare(Employee employee, Employee t1) {
        return Integer.compare(employee.getEmployeeAge(), t1.getEmployeeAge());

    }
}
