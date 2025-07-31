public class PointGround extends BasketballPlayer {
    private int CoundOfGround;
    public PointGround(String nameOfPlayer, String sportType, int numberPosition, String teamName, long numberOfGoal, int coundOfGround) {
        super(nameOfPlayer, sportType, numberPosition, teamName, numberOfGoal);
        CoundOfGround = coundOfGround;
    }
    public int getCoundOfGround() {
        return CoundOfGround;
    }
    @Override
    public void getTeamName(){
        System.out.println(GetTeamName());
    }
    @Override
    public void getInfo(){
        System.out.println("Player Name -> " + getNameOfPlayer());
        System.out.println("Sport Type -> " + getSportType());
        System.out.println("Number Position -> " + getNumberPosition());
        System.out.print("Team Name -> ");
        getTeamName();
        System.out.println("Number Of Goal -> " + getNumberOfGoal());
        System.out.println("Cound Of Ground -> "+getCoundOfGround());
    }
}

