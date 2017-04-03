/**
 * Created by L.z Double E on 4/3/2017.
 */
public abstract class CarTypePaint {
    Paint colour;
    CarTypePaint(Paint paintColour)
    {
        this.colour = paintColour;
    }
    public abstract void colourIt();
}
