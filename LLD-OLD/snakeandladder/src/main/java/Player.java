public class Player {


    Integer id;
    int score;

    Player(int playerid, int currentscore){
        id=playerid;
        score=currentscore;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }


}
