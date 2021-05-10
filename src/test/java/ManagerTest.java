
import org.junit.Before;
import org.junit.Test;
import staff.management.Manager;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

    Manager manager;

    @Before
    public void before() {
        manager = new Manager("Tim", "JS 12345 D", 32000.00, "Testing");
    }

    @Test
    public void hasDeptName() {
        assertEquals("Testing", manager.getDeptName());
    }

    @Test
    public void canSetDeptName() {
        manager.setDeptName("Admin");
        assertEquals("Admin", manager.getDeptName());
        }
    }