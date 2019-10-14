import management.Director;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DirectorTest {

    Director director;

    @Before
    public void before(){
        director = new Director("Michael", "JH67281", 40000, "HR", 10000);
    }

    @Test
    public void canGetName(){
        assertEquals("Michael", director.getName());
    }

    @Test
    public void canGetNINumber(){
        assertEquals("JH67281", director.getNINum());
    }

    @Test
    public void canGetSalary(){
        assertEquals(40000, director.getSalary());
    }

    @Test
    public void canGetDepartment(){
        assertEquals("HR", director.getDeptName());
    }

    @Test public void canGetBudget(){
        assertEquals(10000, director.getBudget());
    }

    @Test
    public void canRaiseSalary(){
        director.raiseSalary(5000);
        assertEquals(45000, director.getSalary());
    }

    @Test
    public void canFailToRaiseSalary(){
        director.raiseSalary(-5000);
        assertEquals(40000, director.getSalary());
    }


    @Test
    public void canPayBonus(){
        assertEquals(800, director.payBonus());
    }


}
