public  class VolleyballPlayer extends Player{
    private int numberPoind;
    public VolleyballPlayer(String nameOfPlayer, String sportType, int numberPosition, String teamName, int numberPoind) {
        super(nameOfPlayer, sportType, numberPosition, teamName);
        this.numberPoind = numberPoind;
    }
    public int getNumberPoind() {
        return numberPoind;
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
    }
}
