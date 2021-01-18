package ProgramowanieObiektowe.Zadanie5Pracownicy;

import ProgramowanieObiektowe.Zadanie5Pracownicy.workers.Employee;
import ProgramowanieObiektowe.Zadanie5Pracownicy.workers.Office;
import ProgramowanieObiektowe.Zadanie5Pracownicy.workers.Physical;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class testPracownicy {

    private final Employee employee = new Employee();
    private final Office office = new Office();
    private final Physical physical = new Physical();


    @Test
    public void testEmployeeName()
    {
        String input;
        employee.setEmployeeFirstName("Radek");
        input = employee.getEmployeeFirstName();
        assertEquals("Radek", input);
    }

    @Test
    public void testEmployeeLastName()
    {
        String input;
        employee.setEmployeeFirstName("Kowal");
        input = employee.getEmployeeFirstName();
        assertEquals("Kowal", input);
    }

    @Test
    public void testIntellect()
    {
        int input = 0;
        office.setIntellect(80);
        input = office.getIntellect();
        assertEquals(80, input);

    }

    @Test
    public void testPhysicalValue()
    {
        int input = 0;
        physical.setEmployeeExperience(14);
        physical.setEmployeeAge(47);
        physical.setStrength(88);
        input = physical.getPhysicalValue();
        assertEquals(26, input);
    }

    @Test
    public void testOfficeValue()
    {
        int input = 0;
        office.setEmployeeExperience(14);
        office.setIntellect(47);
        input = office.getOfficeValue();
        assertEquals(658, input);
    }

}
