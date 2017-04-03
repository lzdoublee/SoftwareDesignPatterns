/**
 * Created by L.z Double E on 4/3/2017.
 */
public class Sedan extends CarTypePaint{
    Paint paint;
    Sedan(Paint paintColour)
    {
        super(paintColour);
    }

    public void colourIt() {
        System.out.print("Sedan Car is sprayed with ");
        paint.sprayPaint();
    }

}
