import staff.Employee;
import org.junit.Before;
import org.junit.Test;
import staff.management.Manager;

import static org.junit.Assert.assertEquals;


public class EmployeeTest {

    Employee employee;

    @Before
    public void before() {
        employee = new Manager("Tim", "JS 12345 D", 32000.00, "Testing");
    }

    @Test
    public void hasName() {
        assertEquals("Tim", employee.getName());
    }

    @Test
    public void hasNi() {
        assertEquals("JS 12345 D", employee.getNi());
    }

    @Test
    public void hasSalary() {
        assertEquals(32000.00, employee.getSalary(), 0.01);
    }

    @Test
    public void canRaiseSalary() {
        assertEquals(32320.00, employee.raiseSalary(0.01), 0.01);
    }

    @Test
    public void cannotRaiseSalary() throws Exception {
        employee.raiseSalary(-5);
    }

    @Test
    public void canPayBonus() {
        assertEquals(320, employee.payBonus(), 0.01);
    }
}