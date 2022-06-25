import model.Student;
public class index {
    public static void main(String[] args){
        Student student = new Student("Zoey Zhuo",21,"female","123456");
        System.out.println(student.getName());
        System.out.println(student.getAge());
        System.out.println(student.getGender());
        System.out.println(student.getIdNo());
    }
}
