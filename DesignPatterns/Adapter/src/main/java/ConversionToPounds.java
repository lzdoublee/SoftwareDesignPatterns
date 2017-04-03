import DesignPatterns.CurrencyConversionInPounds;

/**
 * Created by L.z Double E on 4/3/2017.
 */
public class ConversionToPounds implements CurrencyConversionInPounds {

    private static ConversionToPounds conv2Pound = null;
    CurrencyConversion curr;

    private ConversionToPounds() {
        curr = CurrencyConversion.getInstanceOfCurrency();
    }

    public static ConversionToPounds getInstanceOfPound() {
        if (conv2Pound == null) {
            return new ConversionToPounds();
        } else
            return conv2Pound;
    }

    private double poundsToRandsConv(double pound) {
        return pound * 16.81;
    }

    private double randsToPoundsConv(double rand) {
        return rand / 16.81;
    }

    @Override
    public void setRandCurrency(double currency) {
        curr.setCurrency(currency);
    }

    @Override
    public void setPoundCurrency(double currency) {
        curr.setCurrency(currency);
    }


    @Override
    public double getRandCurrency() {
        return randsToPoundsConv(curr.getCurrency());
    }

    @Override
    public double getPoundCurrency() {
        return poundsToRandsConv(curr.getCurrency());
    }
}
