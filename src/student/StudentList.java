package student;

public class StudentList {
    public static void main(String[]args) {
       // Student s1 = new Student ("sl","ronak");
        Student [] studentList = new Student [3];
        studentList[0] = new Student ("sl","ronak");
        studentList[1] = new Student ("s2","Jhn");
        studentList[2] = new Student ("s3","abc");
        
        for (int i = 0; i < studentList.length ; i++){
            System.out.println(studentList[i].getStudentName());
        }
    }
}
