public class Worker extends Officer {
    private int level ;

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public Worker(int level) {
        this.level = level;
    }

    public Worker(String full_name, int age, String add_dress, String gender, int level) {
        super(full_name, age, add_dress, gender);
        this.level = level;
    }
    @Override
    public String toString() {
        return super.toString() + "  level is " + this.getLevel();
    }
}
