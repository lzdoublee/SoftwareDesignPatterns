/**
 * Created by L.z Double E on 4/2/2017.
 */
public class Context {

    private static Context ourInstanceVar = null;
    private ICalculator calc;

    public static Context getInstanceVar(ICalculator calc) {
        if(ourInstanceVar==null)
            return  new  Context(calc);
        else
            return ourInstanceVar;
    }

    private Context(ICalculator calc) {
        this.calc = calc;
    }

    public int calculations(int a, int b){
        return calc.calculate(a,b);
    }
}
