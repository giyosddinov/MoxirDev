public class Course {
    private int id;
    private String title;
    private int credit;

    public Course(int id, String title, int credit) {
        this.id = id;
        this.title = title;
        this.credit = credit;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getCredit() {
        return credit;
    }

    public void setCredit(int credit) {
        this.credit = credit;
    }

    @Override
    public String toString(){
        return getTitle()+"-"+getId()+"-"+getCredit();
    }

}
