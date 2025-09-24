public class Student {
    private String name;
    private int age;
    private Course course;

    public Student() {}
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public Student(String name, int age, Course course) {
        this.name = name;
        this.age = age;
        this.course = course;
    }

    public void setname(String name) {
        this.name = name;
    }
    public String getname() {
        return name;
    }
    public void setage(int age) {
        this.age = age;
    }
    public int getage() {
        return age;
    }
    public void setcourse(Course course) {
        this.course = course;
    }
    public Course getcourse() {
        return course;
    }

    public void datashow() {
        System.out.println("Student: " + name + " | Age: " + age);
        System.out.println("-------------------------");
        if(course==null) {
            System.out.println("No associeted course.");
        }
        else {
            System.out.println("Course: " + course.getname() + " | Timework: " + course.getTimework() + "h");
            Teacher teacher = course.getTeacher();
            System.out.println("Teacher: " + teacher.getname());
            System.out.println("Speciality: " + teacher.getspeciality());
        }
        System.out.println("-------------------------");
    }
}
