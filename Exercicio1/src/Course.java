public class Course {
    private String name;
    private int timework;
    private Teacher teacher;

    public Course(){}
    public Course(String name, int timework, Teacher teacher) {
        this.name = name;
        this.timework = timework;
        this.teacher = teacher;
    }

    public void setname(String name) {
        this.name = name;
    }
    public String getname() {
        return name;
    }
    public void setTimework(int timework) {
        this.timework = timework;
    }
    public int getTimework() {
        return timework;
    }
    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }
    public Teacher getTeacher() {
        return teacher;
    }
}
