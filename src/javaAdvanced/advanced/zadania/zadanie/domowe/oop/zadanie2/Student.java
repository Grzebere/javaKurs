package javaAdvanced.advanced.zadania.zadanie.domowe.oop.zadanie2;

public class Student extends Person {
    String courseType;
    int courseYear;
    double courseCost;

    public Student(String courseType, int courseYear, double courseCost) {
        this.courseType = courseType;
        this.courseYear = courseYear;
        this.courseCost = courseCost;
    }

    public Student(String name, String address, String courseType, int courseYear, double courseCost) {
        super(name, address);
        this.courseType = courseType;
        this.courseYear = courseYear;
        this.courseCost = courseCost;
    }

    public String getCourseType() {
        return courseType;
    }

    public void setCourseType(String courseType) {
        this.courseType = courseType;
    }

    public int getCourseYear() {
        return courseYear;
    }

    public void setCourseYear(int courseYear) {
        this.courseYear = courseYear;
    }

    public double getCourseCost() {
        return courseCost;
    }

    public void setCourseCost(double courseCost) {
        this.courseCost = courseCost;
    }


    @Override
    public String toString() {
        return "Student{" +
                "courseType='" + courseType + '\'' +
                ", courseYear=" + courseYear +
                ", courseCost=" + courseCost +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
