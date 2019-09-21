public class Course {
    private String courseName;
    private String courseId;
    private String studentId;
    private int studentGrade;

    Course(){}
    Course(String CNAME, String cID, String iden, int stuG){
        courseName=CNAME;
        courseId= cID;
        studentId=iden;
       studentGrade=stuG;

    }
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
    public String toString(){
       return  "Course Name:   "+courseName+"\n"+
                "Course Number: "+ courseId+"\n"+
                "Student Id:    "+ studentId+ "\n"+
                "Student Grade: "+ studentGrade;
    }




}
