import org.junit.Before;
import org.junit.Test;
import techStaff.Developer;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {

    Developer developer;

    @Before
    public void before(){
        developer = new Developer("John", "AH3926", 26000);
    }

    @Test
    public void canGetName(){
        assertEquals("John", developer.getName());
    }

    @Test
    public void canGetNInumber(){
        assertEquals("AH3926", developer.getNINum());
    }

    @Test
    public void cangetSalary(){
        assertEquals(26000, developer.getSalary());
    }

    @Test
    public void canRaiseSalary(){
        developer.raiseSalary(3000);
        assertEquals(29000, developer.getSalary());
    }

    @Test
    public void canPayBonus(){
        assertEquals(260, developer.payBonus());
    }

}
