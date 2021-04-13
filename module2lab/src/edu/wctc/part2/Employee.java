package edu.wctc.part2;


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


/**
 * In this lab focus on METHOD encapsulation and fix/add code as necessary.
 * Pay special attention to the following issues:
 *
 * 1. Not all methods need to be public
 *
 * 2. When methods need to be called in a certain order you can do this
 * by creating a parent method that calls the other, helper methods.
 *
 * 3. There is some duplicate code used that violates the D.R.Y. principle.
 * Eliminate that by encapsulating the duplicate code in a new method
 * and then call that method in place of the duplicate code.
 *
 * 4. All method parameters should be validated (except booleans).
 *
 * Review the tips in the document Encapsulation Checklist if needed.
 */
public class Employee {
    private String firstName;
    private String lastName;
    private String ssn;
    private boolean metWithHr;
    private boolean metDeptStaff;
    private boolean reviewedDeptPolicies;
    private boolean movedIn;
    private String cubeId;
    private LocalDate orientationDate;
    private final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("M/d/yy");

    public Employee(String firstName, String lastName, String ssn) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.ssn = ssn;
    }

    public void meetAndReview(String cubeId){
        meetWithHrForBenefitAndSalaryInfo();
        meetDepartmentStaff();
        reviewDeptPolicies();
        moveIntoCubicle(cubeId);
    }

    // Assume this must be performed first, and assume that an employee
    // would only do this once, upon being hired.
    private void meetWithHrForBenefitAndSalaryInfo() {
        metWithHr = true;
        String fmtDate = formatter.format(orientationDate);
        System.out.println(firstName + " " + lastName + " met with HR on "
                + fmtDate);
    }

    // Assume this must be performed second, and assume that an employee
    // would only do this once, upon being hired.
    private void meetDepartmentStaff() {
        metDeptStaff = true;
        String fmtDate = formatter.format(orientationDate);
        System.out.println(firstName + " " + lastName + " met with dept staff on "
                + fmtDate);
    }

    // Assume this must be performed third. And assume that because department
    // policies may change that this method may need to be called 
    // independently from other classes.
    private void reviewDeptPolicies() {
        reviewedDeptPolicies = true;
        String fmtDate = formatter.format(orientationDate);
        System.out.println(firstName + " " + lastName + " reviewed dept policies on "
                + fmtDate);
    }

    // Assume this must be performed fourth. And assume that because employees
    // sometimes change office locations that this method may need to be called 
    // independently from other classes.
    private void moveIntoCubicle(String cubeId) {
        this.cubeId = cubeId;
        this.movedIn = true;
        String fmtDate = formatter.format(orientationDate);
        System.out.println(firstName + " " + lastName + " moved into cubicle "
                + cubeId + " on " + fmtDate);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        if(firstName==null||firstName.length()==0){
            throw new IllegalArgumentException("Your first name can't be nothing.");
        } else {this.firstName = firstName;}
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        if(firstName==null||firstName.length()==0){
            throw new IllegalArgumentException("Your last name can't be nothing.");
        } else {this.lastName = lastName;}
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        if(SSN.length()!=ssnLength){
            throw new IllegalArgumentException("Your SSN has to be 9 numbers separated by dashed lines.");
        } else{this.ssn = ssn;}
    }

    public boolean isMetWithHr() {
        return metWithHr;
    }

    public void setMetWithHr(boolean metWithHr) {
        this.metWithHr = metWithHr;
    }

    public boolean isMetDeptStaff() {
        return metDeptStaff;
    }

    public void setMetDeptStaff(boolean metDeptStaff) {
        this.metDeptStaff = metDeptStaff;
    }

    public boolean isReviewedDeptPolicies() {
        return reviewedDeptPolicies;
    }

    public void setReviewedDeptPolicies(boolean reviewedDeptPolicies) {
        this.reviewedDeptPolicies = reviewedDeptPolicies;
    }

    public boolean isMovedIn() {
        return movedIn;
    }

    public void setMovedIn(boolean movedIn) {
        this.movedIn = movedIn;
    }

    public String getCubeId() {
        
        return cubeId;
    }

    public void setCubeId(String cubeId) {
        if(cubeId.length()==0||cubeId==null){
            throw new IllegalArgumentException("Please input the cube Id");
        } else{this.cubeId = cubeId;}
    }

    public LocalDate getOrientationDate() {
        return orientationDate;
    }

    public void setOrientationDate(LocalDate orientationDate) {
        if(orientationDate.length()==0||orientationDate==null){
            throw new IllegalArgumentException("Please input the orientation date.");
        } else{this.orientationDate = orientationDate;}
    }
}
