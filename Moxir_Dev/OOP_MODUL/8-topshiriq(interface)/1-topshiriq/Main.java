public class Main {
    public static void main(String[] args) {
        System.out.println("Footbal classi!");
        Player footbalplayer = new FootbalPlayer("Ronaldo","Footbal",7,"AlNasr",12,45,934);
        footbalplayer.getInfo();
        System.out.println("\nGoalKeepers classi!");
        FootbalPlayer goalkeepers = new GoalKeeper("Onana","footbal",1,"MYU",4,15,155,-999);
        goalkeepers.getInfo();
        System.out.println("\nVoleybal Player");
        Player volley = new VolleyballPlayer("Mark","VolleyBall",5,"volleyTeam",2100);
        volley.getInfo();
        System.out.println("\nSetter classi!");
        VolleyballPlayer setter = new Setter("name","Volleyball",2,"Team",2100,2000);
        setter.getInfo();
        System.out.println("\nBasketballPlayer classi!");
        Player basketball = new BasketballPlayer("Javoxir","Basketball",7,"Maxalla",100);
        basketball.getInfo();
        System.out.println("\nPoint Ground classi!");
        Player pointground = new PointGround("JAvoxir","BAsketball",7,"Maxalla",1200,1200);
        pointground.getInfo();

    }
}
