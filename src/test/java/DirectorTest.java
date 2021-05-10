import org.junit.Before;
import org.junit.Test;
import staff.management.Director;

import static org.junit.Assert.assertEquals;


public class DirectorTest {

    Director director;

    @Before
    public void before() {
        director = new Director("Tim", "JS 12345 D", 100000.00, "Testing", 100000);
    }

    @Test
    public void canGetBudget(){
        assertEquals(100000, director.getBudget(), 0.01);
    }

    @Test
    public void setBudget(){
        director.setBudget(50000);
        assertEquals(50000, director.getBudget(), 0.01);
    }

    @Test
    public void canPayBonus(){
        assertEquals(2000, director.payBonus(),0.01);
    }
}