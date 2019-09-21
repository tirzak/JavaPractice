public class Course {
    private String courseName;
    private String courseId;
    private String studentId;
    private int studentGrade;

    //Constructor
    Course(){}

    //Constructor with 4 parameters
    Course(String CNAME, String cID, String iden, int stuG){
        courseName=CNAME;
        courseId= cID;
        studentId=iden;
       studentGrade=stuG;

    }
    //Getter methods
    public String getCourseName(){
        return courseName;
    }
    public String getStudentId(){
        return studentId;
    }
    public String getCourseId(){
        return courseId;
    }
    public int getStudentGrade(){
        return studentGrade;
    }

    //Setter methods
    public void setCourseName(String nomen){
        courseName=nomen;

    }

    public void setCourseId(String electronic){
        courseId=electronic;

    }
    public void setStudentId(String identity){
        studentId=identity;

    }
    public void setStudentGrade(int grades){
        studentGrade=grades;

    }

    //Returns a formatted String by overriding the toString() method
    public String toString(){
       return  "Course Name:   "+courseName+"\n"+
                "Course Number: "+ courseId+"\n"+
                "Student Id:    "+ studentId+ "\n"+
                "Student Grade: "+ studentGrade;
    }




}
