public class Teacher {
    private String name;
    private String speciality;
    
    public void setname(String name) {
        this.name = name;
    }
    public String getname() {
        return name;
    }
    public void setspeciality(String speciality) {
        this.speciality = speciality;
    }
    public String getspeciality() {
        return speciality;
    }

    public Teacher(){
        name = "";
        speciality = "";
    }
    public Teacher(String name, String speciality) {
        this.name = name;
        this.speciality = speciality;
    }
}
