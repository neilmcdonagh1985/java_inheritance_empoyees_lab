import management.Manager;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

    Manager manager;

    @Before
    public void before(){
        manager = new Manager("Andy", "JH95643", 30000, "IT");
    }

    @Test
    public void canGetName(){
        assertEquals("Andy", manager.getName());
    }

    @Test
    public void canGetNINumber(){
        assertEquals("JH95643", manager.getNINum());
    }

    @Test
    public void canGetSalary(){
        assertEquals(30000, manager.getSalary());
    }

    @Test
    public void canGetDeptName(){
        assertEquals("IT", manager.getDeptName());
    }

    @Test
    public void canRaiseSalary(){
        manager.raiseSalary(2000);
        assertEquals(32000, manager.getSalary());
    }

    @Test
    public void canPayBonus(){
        assertEquals(300, manager.payBonus());
    }


}
