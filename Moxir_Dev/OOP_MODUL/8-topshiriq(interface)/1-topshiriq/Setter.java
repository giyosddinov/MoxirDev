public class Setter extends VolleyballPlayer{
    private int Coundset;
    public Setter(String nameOfPlayer, String sportType, int numberPosition, String teamName, int numberPoind, int coundset) {
        super(nameOfPlayer, sportType, numberPosition, teamName, numberPoind);
        this.Coundset = coundset;
    }
    public int getCoundset() {
        return Coundset;
    }
    @Override
    public void getTeamName(){
        System.out.println(GetTeamName());
    }
    @Override
    public void getInfo(){
        System.out.println("Player Name -> "+getNameOfPlayer());
        System.out.println("Sport Type -> "+getSportType());
        System.out.println("Number Position -> "+getNumberPosition());
        System.out.print("Team Name -> ");getTeamName();
        System.out.println("Number Poind -> "+getNumberPoind());
        System.out.println("Cound Ste -> "+getCoundset());
    }
}
