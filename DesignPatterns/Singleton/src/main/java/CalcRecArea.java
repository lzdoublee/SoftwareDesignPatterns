/**
 * Created by L.z Double E on 4/3/2017.
 */
public class CalcRecArea {
    private static CalcRecArea ourInstance = new CalcRecArea();

    public static CalcRecArea getInstance() {

        if(ourInstance == null){
            ourInstance = new CalcRecArea();
        }
        return ourInstance;
    }

    private CalcRecArea() {
    }

    public double calculate(double width, double length)
    {
        return width*length;
    }


}
