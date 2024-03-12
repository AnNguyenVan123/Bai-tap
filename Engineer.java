public class Engineer extends Officer{
    private String major ;

    public Engineer(String major) {
        this.major = major;
    }

    public Engineer(String full_name, int age, String add_dress, String gender, String major) {
        super(full_name, age, add_dress, gender);
        this.major = major;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }
    @Override
    public String toString() {
        return super.toString() + "  major is " + this.getMajor();
    }
}
