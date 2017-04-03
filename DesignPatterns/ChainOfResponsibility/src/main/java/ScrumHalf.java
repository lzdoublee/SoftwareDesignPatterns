/**
 * Created by L.z Double E on 4/3/2017.
 */
public class ScrumHalf extends RugbyTeam{
    RugbyTeam team;

    public ScrumHalf() {
    }

    public String team(PositionsInRugby pos) {
        String str = null;
        if(pos == PositionsInRugby.SCRUMHALF) {
            return "Scrum Half";
        } else {
            if(this.team != null) {
                str = this.team.team(pos);
            }

            return "Not Scrum Half " + str;
        }
    }
    public String toString(String string) {
        return string;
    }
}
