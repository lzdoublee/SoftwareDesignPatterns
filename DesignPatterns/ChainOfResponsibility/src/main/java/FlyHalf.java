/**
 * Created by L.z Double E on 4/3/2017.
 */
public class FlyHalf {
    RugbyTeam team;

    public FlyHalf() {
    }

    public String team(PositionsInRugby pos) {
        String str = null;
        if (pos == PositionsInRugby.FLYHALF) {
            return "Fly Half ";
        } else {
            if (this.team != null) {
                str = this.team.team(pos);
            }

            return "Not Fly Half " + str;
        }
    }

    public String toString(String string) {
        return string;
    }
}
