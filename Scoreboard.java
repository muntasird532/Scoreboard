public class Scoreboard
{
    private String teamOne;
    private String teamTwo;
    private int oneScore;
    private int twoScore;
    private String activeTeam;

    public Scoreboard(String one, String two)
    {
        teamOne = one;
        teamTwo = two;
        activeTeam = teamOne;
    }

    public String getScore()
    {
        return oneScore + "-" + twoScore + "-" + activeTeam;
    }

    public void recordPlay(int score)
    {
        if (teamOne.equals(activeTeam))
        {
            oneScore += score;
        }

        if (teamTwo.equals(activeTeam))
        {
            twoScore += score;
        }

        if (score == 0)
        {
            if (teamOne.equals(activeTeam)) activeTeam = teamTwo;
                    else if (teamTwo.equals(activeTeam)) activeTeam = teamOne;
        }
    }


}

