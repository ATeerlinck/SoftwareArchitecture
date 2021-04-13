package edu.wctc.part1;

import java.time.LocalDate;

/**
 * Fix the code in this class to do PROPERTY encapsulation correctly. Also
 * consider if any of the properties should be mandatory and use a constructor
 * to enforce that. Review the tips in the document Encapsulation Checklist if
 * needed.
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
    public final int ssnLength = 11;

    public Employee(String FirstName, String LastName, String SSN){
        if(firstName==null||firstName.length()==0){
            throw new IllegalArgumentException("Your first name can't be nothing.");
        } else {firstName = FirstName;}
        if(firstName==null||firstName.length()==0){
            throw new IllegalArgumentException("Your last name can't be nothing.");
        } else {lastName = LastName;}
        if(SSN.length()!=ssnLength){
            throw new IllegalArgumentException("Your SSN has to be 9 numbers separated by dashed lines.");
        } else{ssn = SSN;}
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
