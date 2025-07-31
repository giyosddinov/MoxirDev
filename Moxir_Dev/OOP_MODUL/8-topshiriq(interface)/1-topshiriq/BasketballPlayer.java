public class BasketballPlayer extends Player {
    private long numberOfGoal;
    public BasketballPlayer(String nameOfPlayer, String sportType, int numberPosition, String teamName, long numberOfGoal) {
        super(nameOfPlayer, sportType, numberPosition, teamName);
        this.numberOfGoal = numberOfGoal;
    }
    public long getNumberOfGoal() {
        return numberOfGoal;
    }
    @Override
    public void getTeamName() {
        System.out.println(GetTeamName());
    }
    @Override
    public void getInfo() {
        System.out.println("Player Name -> " + getNameOfPlayer());
        System.out.println("Sport Type -> " + getSportType());
        System.out.println("Number Position -> " + getNumberPosition());
        System.out.print("Team Name -> ");
        getTeamName();
        System.out.println("Number Of Goal -> " + getNumberOfGoal());
    }
}
