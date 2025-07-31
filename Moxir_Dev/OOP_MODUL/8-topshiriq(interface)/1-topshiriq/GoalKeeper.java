public class GoalKeeper extends FootbalPlayer{
    private int save;
    public GoalKeeper(String nameOfPlayer, String sportType, int numberPosition, String teamName, int CoundOfRedCard, int CoundOfYellowCard, int CoundOfGoal, int save) {
        super(nameOfPlayer, sportType, numberPosition, teamName, CoundOfRedCard, CoundOfYellowCard, CoundOfGoal);
        this.save = save;
    }
    public int getSave() {
        return save;
    }
    @Override
    public void getTeamName() {
        System.out.println(GetTeamName());
    }
    @Override
    public void getInfo() {
        System.out.println("Player Name -> "+getNameOfPlayer());
        System.out.println("Sport Type -> "+getSportType());
        System.out.println("Number Position -> "+getNumberPosition());
        System.out.print("Team Name -> ");getTeamName();
        System.out.println("Cound Of Yellow Card -> "+getCoundOfYellowCard());
        System.out.println("Cound Of Red Card -> "+getCoundOfRedCard());
        System.out.println("Cound Of Goals -> "+getCoundOfGoal());
        System.out.println("Cound Save -> "+getSave());
    }
}
