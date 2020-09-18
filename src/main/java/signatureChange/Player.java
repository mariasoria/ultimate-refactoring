package signatureChange;

public class Player {
    private String name;
    private int score;
    private Role role;

    public Player(Role role, String name){
        this.role = role;
        this.name = name;
        this.score = 0;
    }

    public Player(Role role, String name, int score){
        this.role = role;
        this.name = name;
        this.score = score;
    }

    public void play(){
        if (role == Role.Dragon){
            score += 20;
        }
        else {
            score = score - 10;
        }
    }

    public int getScore(){
        return score;
    }
}
