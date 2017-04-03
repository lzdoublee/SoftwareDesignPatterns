import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by L.z Double E on 4/3/2017.
 */
public class CalcRecAreaTest {
    CalcRecArea area;

    @Before
    public void setUp() throws Exception {
        area = CalcRecArea.getInstance();
    }

    @Test
    public void AreaTest() throws Exception {
        Assert.assertEquals(area.calculate(5.3, 3.6) , area.calculate(5.3, 3.6));
    }
}