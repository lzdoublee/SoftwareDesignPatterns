/**
 * Created by L.z Double E on 4/3/2017.
 */
public class HatchBack extends CarTypePaint{

    Paint paint;

    HatchBack(Paint paintColour) {
        super(paintColour);
    }


    public void colourIt() {
        System.out.print("The Hatchback car is sprayed with ");
        paint.sprayPaint();
    }
}
