public class Staff extends  Officer{
    private  String work ;

    public Staff(String work) {
        this.work = work;
    }

    public Staff(String full_name, int age, String add_dress, String gender, String work) {
        super(full_name, age, add_dress, gender);
        this.work = work;
    }

    public String getWork() {
        return work;
    }

    public void setWork(String work) {
        this.work = work;
    }

    @Override
    public String toString() {
        return super.toString() + "  work is " + this.getWork();
    }
}
