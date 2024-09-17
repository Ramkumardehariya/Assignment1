package Assignment1.practice;
class Student{
    private String studentId;
    private String name;
    private int age;
    private char grade;

    public void setStudent(String studentId, String name, int age, char grade){
        this.studentId = studentId;
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
    
    public String getStudentId(){
        return studentId;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public char getGrade(){
        return grade;
    }
}


public class Program8 {
    public static void main(String[] args) {
        Student s = new Student();
        s.setStudent("A134", "Ram", 12, 'A');

        System.out.println("studentId = "+s.getStudentId());
        System.out.println("studentName = "+s.getName());
        System.out.println("studentAge = "+s.getAge());
        System.out.println("STudentId = "+s.getGrade());
    }
}
