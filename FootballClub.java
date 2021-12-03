import java.util.ArrayList;
import java.util.Arrays;

public class FootballClub {
    private String name;
    private final int maxSquadSize = 25;
    private ArrayList<Player> squad = new ArrayList<Player>();

    public FootballClub(String chelsea) {
        this.name = chelsea;
    }
    // 자바의 모든 클래스는 object를 상속하는데 얘는기본적으로 tostring을 가지고 있다. 가지고 있는 정보나 값을 문자열로 만들어리턴
    // 그걸 재정의해서 문자열의 배열로 표현하려고함.
    @Override
    public String toString(){
        //int hashCode = super.hashCode();
        String msg = "FootballClub Name: " + name + " Player Count: " + squad.size() + "\n" ;
        for (int i = 0; i < squad.size(); i++){
            msg += "\t" + squad.get(i).show() + " \n";
        }
        return msg;
    }

    public void addPlayer(Player newPlayer) {
        squad.add(newPlayer);
    }

    public void removeAllPlayer() {
        squad.clear();
    }

    public Player findPlayer(String playerFirstName, int jerseyNumber) {
        Player p = new Player(playerFirstName,null, jerseyNumber);
        for (int i = 0; i < squad.size(); i++){
            boolean find = squad.get(i).equals(p);
            if(find == true){
                Player fp = new Player(squad.get(i).getFirstName(), squad.get(i).getLastName(), squad.get(i).getJerseyNumber());
                System.out.println(fp.show());
                return fp;
            }
        }
        return null;
    }
}
