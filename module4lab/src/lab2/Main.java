package lab2;

public class Main {
    public static void main(String args[]){
        List<Course> courses = new ArrayList<>();
        Course introJ = new IntroJavaCourse("Introduction to Java", "J188");
        Course introP = new IntroToProgrammingCourse("Introduction to Java", "P181");
        Course advJ = new AdvancedJavaCourse("Introduction to Java", "A288");
        
        for (Coures c : courses){
            System.out.println(c.getCourseNumber());
        }
    }
}
