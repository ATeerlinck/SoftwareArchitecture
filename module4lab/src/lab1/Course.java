package lab1;

public abstract class Course {
    String courseNumber;
    String courseName;
    double credits;

    public abstract String getCourseNumber();
    public abstract void setCourseNumber();
    public abstract String getCourseName();
    public abstract void setCourseName();
    public abstract double getCredits();
    public abstract void setCredits();
}