/**
 * Created by L.z Double E on 4/3/2017.
 */
public class CurrencyConversion {
    double currency;
    private static CurrencyConversion curr=null;

    public static CurrencyConversion getInstanceOfCurrency(){
        if(curr==null){
            return new CurrencyConversion();
        }
        else
            return curr;
    }
    public CurrencyConversion() {
    }

    public double getCurrency() {
        return currency;
    }

    public void setCurrency(double cur) {
        this.currency = cur;
    }
}
