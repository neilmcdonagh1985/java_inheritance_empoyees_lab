import org.junit.Before;
import org.junit.Test;
import techStaff.DataBaseAdmin;

import static org.junit.Assert.assertEquals;

public class DataBaseAdminTest {

    DataBaseAdmin dataBaseAdmin;

    @Before
    public void before(){
        dataBaseAdmin = new DataBaseAdmin("Laura", "JH22545", 27000);
    }

    @Test
    public void getName(){
        assertEquals("Laura", dataBaseAdmin.getName());
    }

    @Test
    public void getNINum(){
        assertEquals("JH22545", dataBaseAdmin.getNINum());
    }

    @Test
    public void getSalary(){
        assertEquals(27000, dataBaseAdmin.getSalary());
    }

    @Test
    public void canRaiseSalary(){
        dataBaseAdmin.raiseSalary(2000);
        assertEquals(29000, dataBaseAdmin.getSalary());
    }

    @Test
    public void canPayBonus(){
        assertEquals(270, dataBaseAdmin.payBonus());
    }
}
