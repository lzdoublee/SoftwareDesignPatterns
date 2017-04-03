import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by L.z Double E on 4/2/2017.
 */
public class CalculationsTest {
    Context add,divide;

    @Before
    public void setUp() throws Exception {
        add = Context.getInstanceVar(new Addition());
        divide = Context.getInstanceVar(new Division());
    }

    @Test
    public void testCalc() throws Exception {
        Assert.assertEquals(divide.calculations(10,2),add.calculations(11,1));
    }
}
