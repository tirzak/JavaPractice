
import java.text.DecimalFormat;

public class GradeReport {

    private String studentId;
    private String courseId;
    private int studentCt;
    private int courseCt;

    //Two objects
    private Student[] studentArray;
    private Course[] courseArray;

    GradeReport() {

    }

    //Constructor
    GradeReport(Student[] studentArray, Course[] courseArray, int numberOfStudent, int numberOfCourse) {
        this.studentArray = studentArray.clone();
        this.courseArray = courseArray.clone();
        studentCt = numberOfStudent;
        courseCt = numberOfCourse;
    }


    //This method returns a string with grades of students and their names for a particular course
    public String getGradesOfCourse(String courseId) {
        DecimalFormat decimalFormat = new DecimalFormat("0.00");
        String Name = "";
        double k = 0;
        double sum = 0.0, avg = 1.0;
        String myString = "Grades for Course Id: " + courseId;


        for (int s = 0; s < courseArray.length; s++) {

            //to counter null elements
            if (courseArray[s] != null) {

                //Checks if the courseId is in the heap
                if (courseArray[s].getCourseId().equalsIgnoreCase(courseId)) {
                    //Gets the student Id of the student
                    String z = courseArray[s].getStudentId();
                    for (int i = 0; i < studentArray.length; i++) {
                        if (studentArray[i].getStudentId().equalsIgnoreCase(z)) {

                            //Stores the name of the student
                            Name = studentArray[i].getStudentName();
                            k++;
                            //Break because for a single course there will be one name only
                            break;
                        }
                    }

                    //formatted string
                    myString = myString + "\n" + "Student Name: " + Name + ", Grade: " + courseArray[s].getStudentGrade();
                    sum += courseArray[s].getStudentGrade();
                }
            }
        }
        avg = sum / k;
        return myString + "\nThe Average of the Student: " + decimalFormat.format(avg);

    }


    //Returns all the grades obtained by a student
    public String getGradesOfStudent(String ID) {
        DecimalFormat decimalFormat = new DecimalFormat("0.00");
        String Name = "";
        double k = 0;
        double sum = 0.0, avg = 1.0;
        String Sa = "Grades of Student Id: " + ID;
        boolean l = false; /*boolean to handle the fact that the if/else statement in for loop will go to an ID that does not match and return that it did not find anything i.e. execute
        the statements inside else
*/
        //Gets the name of the student
        for (int i = 0; i < studentArray.length; i++) {

            if (studentArray[i] != null) {
                String x = studentArray[i].getStudentId();
                if (x.equals(ID)) {
                    Name = studentArray[i].getStudentName();
                    break; // Name is found
                }
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


    //Returns a formatted String by overriding the toString() method
    public String toString() {

        String myString = "Complete Listing of Courses";
        for (int i = 0; i < courseArray.length; i++) {


            if (courseArray[i] != null) {
                myString += "\n" + "Student Id: " + courseArray[i].getStudentId() + ", Grade: " + courseArray[i].getStudentGrade() + ", Course: " + courseArray[i].getCourseId();


            }
        }
        return myString;
    }
}


