public class Student{

    private String studentName;
    private String studentEmail;
    private String studentId;

    Student(){

    }
    Student(String name, String email, String id){
        studentEmail=email;
        studentName=name;
        studentId= id;


    }

    public String getStudentName(){
        return studentName;
    }
    public String getStudentId(){
        return studentId;
    }
    public String getStudentEmail(){
        return studentEmail;
    }

    public void setStudentName(String nomen){
        studentName=nomen;

    }
    public void setStudentEmail(String electronic){
        studentEmail=electronic;

    }
    public void setStudentId(String identity){
        studentId=identity;

    }

    public String toString(){
        return "Student Name:  "+studentName + "\n"+ "Student Email: " +studentEmail+ "\n" +"Student Id:    " + studentId;
    }

}
