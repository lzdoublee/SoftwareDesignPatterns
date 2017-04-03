import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by L.z Double E on 4/3/2017.
 */
public class AbstractFactoryTest {

    AbstractFactory abstractFactory;
    ModuleFactory modFactory;
    Module mod;
    @Before
    public void setUp() throws Exception {
        abstractFactory = new AbstractFactory();
        modFactory = abstractFactory.getSubjectYear("second");
        mod = modFactory.getSubjectName("IRP200S");
    }

    @Test
    public void ThirdYearTest() throws Exception {

        Assert.assertEquals(mod.getSubjectName(),"Internet Programming II");
    }
}
