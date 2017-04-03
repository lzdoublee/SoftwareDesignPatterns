/**
 * Created by L.z Double E on 4/3/2017.
 */
public class FullBack extends RugbyTeam{

    RugbyTeam team;
    public FullBack() {
    }

    public String team(PositionsInRugby pos)
    {
        String str = null;
        if(pos == PositionsInRugby.FULLBACK)
        {
            return "FullBack ";
        } else {
            if(this.team != null) {
                str = this.team.team(pos);
            }

            return "Not Fullback " + str;
        }
    }

    public String toString(String string) {
        return string;
    }
}
