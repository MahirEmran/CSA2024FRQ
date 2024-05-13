public class Scoreboard {
    private String t1;
    private String t2;
    private String activeTeam;
    private int t1Score = 0;
    private int t2Score = 0;
    
    public Scoreboard(String team1, String team2) {
        t1 = team1;
        t2 = team2;
        activeTeam = team1;
    }

    public void recordPlay(int n) {
        if(n == 0) {
            if(activeTeam.equals(t1)) {
                activeTeam = t2;
            } else {
                activeTeam = t1;
            }
        } else {
            if(activeTeam.equals(t1)) {
                t1Score += n;
            } else {
               t2Score += n;
            }
        }
    }

    public String getScore() {
        return t1Score + "-" + t2Score + "-" + activeTeam;
    }
}