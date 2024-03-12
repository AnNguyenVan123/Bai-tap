public class Officer {
     private String full_name ;
     private int age ;
     private String add_dress;
     private String gender ;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFull_name() {
        return full_name;
    }

    public void setFull_name(String full_name) {
        this.full_name = full_name;
    }

    public String getAdd_dress() {
        return add_dress;
    }

    public void setAdd_dress(String add_dress) {
        this.add_dress = add_dress;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Officer() {
    }
    public Officer(String full_name, int age, String add_dress, String gender) {
        this.full_name = full_name;
        this.age = age;
        this.add_dress = add_dress;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Officer{" +
                "full_name='" + full_name + '\'' +
                ", age=" + age +
                ", add_dress='" + add_dress + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }
}
