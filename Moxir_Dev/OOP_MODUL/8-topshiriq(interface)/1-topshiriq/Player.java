public abstract class Player implements information{
    private String NameOfPlayer;
    private String SportType;
    private int NumberPosition;
    private String teamName;
    public Player(String nameOfPlayer, String sportType, int numberPosition, String teamName) {
        this.NameOfPlayer = nameOfPlayer;
        this.SportType = sportType;
        this.NumberPosition = numberPosition;
        this.teamName = teamName;
    }
    public String getNameOfPlayer() {
        return NameOfPlayer;
    }
    public String getSportType() {
        return SportType;
    }
    public int getNumberPosition() {
        return NumberPosition;
    }
    public String GetTeamName(){
        return teamName;
    }
    @Override
    public abstract void getInfo();
    @Override
    public void getTeamName(){
        System.out.println(teamName);
    }
}
