
import java.text.DecimalFormat;

public class GradeReport {

    private String studentId;
    private String courseId;
    private int studentCt;
    private int courseCt;
    private Student[] studentArray;
    private Course[] courseArray;

    GradeReport() {

    }

    GradeReport(Student[] studentArray, Course[] courseArray, int numberOfStudent, int numberOfCourse) {
        this.studentArray = studentArray.clone();
        this.courseArray = courseArray.clone();
        studentCt = numberOfStudent;
        courseCt = numberOfCourse;
    }

    public String getGradesOfCourse(String courseId) {
        DecimalFormat decimalFormat = new DecimalFormat("0.00");
        String Name = "";
        double k = 0;
        double sum = 0.0, avg = 1.0;
        String myString = "Grades for Course Id: " + courseId;
        boolean l = false;

        for (int s = 0; s < courseArray.length; s++) {
            if (courseArray[s] != null) {
                if (courseArray[s].getCourseId().equalsIgnoreCase(courseId)) {
                    String z = courseArray[s].getStudentId();
                    for (int i = 0; i < studentArray.length; i++) {
                        if (studentArray[i].getStudentId().equalsIgnoreCase(z)) {


                            Name = studentArray[i].getStudentName();
                            k++;
                            break;
                        }
                    }
                    myString = myString + "\n" + "Student Name: " + Name + ", Grade: " + courseArray[s].getStudentGrade();
                    sum += courseArray[s].getStudentGrade();
                }
            }
        }
        avg = sum / k;
        return myString + "\nThe Average of the Student: " + decimalFormat.format(avg);

    }

    public String getGradesOfStudent(String ID) {
        DecimalFormat decimalFormat = new DecimalFormat("0.00");
        String Name = "";
        double k = 0;
        double sum = 0.0, avg = 1.0;
        String Sa = "Grades of Student Id: " + ID;
        boolean l = false;

        for (int i = 0; i < studentArray.length; i++) {
            String x = studentArray[i].getStudentId();
            if (x.equals(ID)) {


                Name = studentArray[i].getStudentName();
                break;
            }
        }

        for (int j = 0; j < courseArray.length; j++) {

            if (courseArray[j] != null) {
                String y = courseArray[j].getStudentId();

                if (y.equalsIgnoreCase(ID)) {

                    sum += courseArray[j].getStudentGrade();
                    Sa = Sa + "\n" + "Student Name: " + Name + ", Grade: " + courseArray[j].getStudentGrade() + ", Course: " + courseArray[j].getCourseId();
                    k++;
                    l = true;

                }
            }
        }
        avg = sum / k;

        if (l == false) {
            return "There are No Grades for Student Id: " + ID;
        }
        return Sa + "\nThe Average of the Student: " + decimalFormat.format(avg);
    }

    public String toString() {

        String myString = "Complete Listing of Courses";
        for (int i = 0; i < courseArray.length; i++) {


            if (courseArray[i] != null) {
                myString += "\n" + "Student Id: " + courseArray[i].getStudentId() + " Grade: " + courseArray[i].getStudentGrade() + "Course: " + courseArray[i].getCourseId();


            }
        }
        return myString;
    }
}


