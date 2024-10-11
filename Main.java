public class Main
{
    public static void main(String[] args)
    {
        String info;
        Scoreboard game = new Scoreboard("Red", "Blue");


        game.recordPlay(1);
        game.recordPlay(0);
        game.recordPlay(3);
        game.recordPlay(1);
        game.recordPlay(0);
        game.recordPlay(0);
        game.recordPlay(4);
        game.recordPlay(0);


        info = game.getScore();
        System.out.println(info);

        String infoTwo;
        Scoreboard match = new Scoreboard("Lions", "Tigers");

        //match.recordPlay(1);
        //match.recordPlay(0);
        //match.recordPlay(3);
        //match.recordPlay(1);
        //match.recordPlay(0);
        //match.recordPlay(0);
        //match.recordPlay(4);
        //match.recordPlay(0);

        infoTwo = match.getScore();
        System.out.println(infoTwo);



    }

}
