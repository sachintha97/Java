package lk.iit.lecture03;

public class Student extends Person implements Father { //implements Child, Sibling , Spouse , Father

    private String studentID;
    private String course;

    public Student(String fName, String lName, String dob, String phoneNo, String address, String emailId,
                   String studentID,String course){
        super(fName,lName,dob,phoneNo,address,emailId);
        this.studentID = studentID;
        this.course = course;

    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentID='" + studentID + '\'' +
                ", course='" + course + '\'' +" toString='"+super.toString()+
                '}';
    }
}

//return type same as the superclass returntype
//when overriding access modifier