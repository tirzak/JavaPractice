public class Student{

    //Variables
    private String studentName;
    private String studentEmail;
    private String studentId;

    Student(){

    }
    //Student Constructor
    Student(String name, String email, String id){
        studentEmail=email;
        studentName=name;
        studentId= id;


    }

    //Getter methods

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
    //Setter methods
    public void setStudentEmail(String electronic){
        studentEmail=electronic;

    }
    public void setStudentId(String identity){
        studentId=identity;

    }

    //Returns a formatted String by overriding the toString() method
    public String toString(){
        return "Student Name:  "+studentName + "\n"+ "Student Email: " +studentEmail+ "\n" +"Student Id:    " + studentId;
    }

}
