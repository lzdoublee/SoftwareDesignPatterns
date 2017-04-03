import DesignPatterns.CurrencyConversionInPounds;

/**
 * Created by L.z Double E on 4/3/2017.
 */
public class ConversionToRands extends CurrencyConversion implements CurrencyConversionInPounds
{

    private static ConversionToRands toRand=null;

    public static ConversionToRands getInstanceOfRand()
    {
        if(toRand==null){
            return  new ConversionToRands();
        }
        else
            return  toRand;
    }
    private double poundsToRands(double amount){
        return amount*10;
    }
    private double randsToPound(double amount){
        return amount/10;
    }


    @Override
    public void setPoundCurrency(double currency) {
        this.currency =currency;
    }
    @Override
    public void setRandCurrency(double currency) {
        this.currency = currency;

    }

    @Override
    public double getRandCurrency() {
        return randsToPound(currency);
    }
    @Override
    public double getPoundCurrency() {
        return poundsToRands(currency);
    }

}
