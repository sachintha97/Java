package iit.tutorial3_2.sachintha;

public class Teacher extends Person {

    private double salary;  // teacher's salary
    private String subject; // teacher's subject


    Teacher(String name , int age, String gender , String subject, double salary){
        super(name ,age, gender);
        this.subject = subject;
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                super.toString()+
                "salary=" + salary +
                ", subject='" + subject + '\'' +
                "} " ;
    }
}
