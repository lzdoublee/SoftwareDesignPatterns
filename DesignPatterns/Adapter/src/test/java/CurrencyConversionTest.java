import DesignPatterns.CurrencyConversionInPounds;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by L.z Double E on 4/3/2017.
 */
public class CurrencyConversionTest {


    CurrencyConversionInPounds pound;
    CurrencyConversionInPounds rand;

    @Before
    public void setUp() throws Exception {
        pound = ConversionToPounds.getInstanceOfPound();
        rand   = ConversionToRands.getInstanceOfRand();
    }

    @Test
    public void testCurrencyD() throws Exception {

        pound.setPoundCurrency(500);
        Assert.assertEquals(pound.getRandCurrency(),50,50);
    }
    @Test
    public void testCurrencyR() throws Exception {

        rand.setRandCurrency(50);
        Assert.assertEquals(rand.getPoundCurrency(),500,500);
    }

}
