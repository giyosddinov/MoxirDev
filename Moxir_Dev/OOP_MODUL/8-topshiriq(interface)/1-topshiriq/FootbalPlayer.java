public class FootbalPlayer extends Player{
    private int CoundOfYellowCard;
    private int CoundOfRedCard;
    private int CoundOfGoal;
    public FootbalPlayer(String nameOfPlayer, String sportType, int numberPosition, String teamName,int CoundOfRedCard,int CoundOfYellowCard,int CoundOfGoal){
        super(nameOfPlayer,sportType,numberPosition,teamName);
        this.CoundOfYellowCard =CoundOfYellowCard;
        this.CoundOfRedCard = CoundOfRedCard;
        this.CoundOfGoal = CoundOfGoal;
    }
    public int getCoundOfYellowCard() {
        return CoundOfYellowCard;
    }
    public int getCoundOfRedCard() {
        return CoundOfRedCard;
    }
    public int getCoundOfGoal() {
        return CoundOfGoal;
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
    }
}