public class Main {
    public static void main(String[] args) {
        Teacher teacher1 = new Teacher();
        teacher1.setname("David Malan");
        teacher1.setspeciality("Computer Science");

        Course course1 = new Course();
        course1.setTeacher(teacher1);
        course1.setname("CS50X");
        course1.setTimework(30);
        
        Student student1 = new Student();
        student1.setname("Thiago Medeiros");
        student1.setage(21);
        student1.setcourse(course1);

        Student student2 = new Student();
        student2.setname("Larissa queiroz");
        student2.setage(21);
        

        student1.datashow();
        System.out.println();
        student2.datashow();
    }
}
