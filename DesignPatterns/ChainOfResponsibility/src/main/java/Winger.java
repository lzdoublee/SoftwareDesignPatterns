/**
 * Created by L.z Double E on 4/3/2017.
 */
public class Winger extends RugbyTeam{
    RugbyTeam team;

    public Winger()
    {
    }

    public String team(PositionsInRugby position) {
        String str = null;
        if(position == PositionsInRugby.WINGER)
        {
            return "Winger";
        } else
            {
            if(this.team != null)
            {
                str = this.team.team(position);
            }
            return "Not a Winger " + str;
        }
    }

    public String toString(String string) {
        return string;
    }
}
