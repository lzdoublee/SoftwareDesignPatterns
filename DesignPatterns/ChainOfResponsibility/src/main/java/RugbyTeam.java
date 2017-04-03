/**
 * Created by L.z Double E on 4/3/2017.
 */
public abstract class RugbyTeam {
    RugbyTeam rugbyTeam;

    public RugbyTeam() {
    }

    public void setRugbyTeam(RugbyTeam team) {
        this.rugbyTeam = team;
    }

    public abstract String team(PositionsInRugby pos1);
}

