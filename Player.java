public class Player {
    private String firstName;
    private String lastName;
    private int jerseyNumber;

    public Player(String playerFirstName, String playerLastName, int jerseyNumber){
        this.firstName = playerFirstName;
        this.lastName = playerLastName;
        this.jerseyNumber = jerseyNumber;
    }
    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public int getJerseyNumber(){
        return jerseyNumber;
    }

    public String show(){
        return "[" + firstName + ", " + lastName + " " + jerseyNumber + "]";
    }

    public boolean equals(Player p){
        Player player = p;
        if(player.firstName == this.firstName || player.jerseyNumber == this.jerseyNumber){
            return true;
        }
        else
            return false;
    }
}
