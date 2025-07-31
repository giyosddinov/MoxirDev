public abstract class Animals {
    private String name;
    public Animals(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public abstract void Sound();
}