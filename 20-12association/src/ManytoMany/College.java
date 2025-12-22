package ManytoMany;

public class College {
    String collegeName;
    CollegeId collegeId;
    StudentId studentId;
    public College(String collegeName,CollegeId collegeId,StudentId studentId){
        this.collegeName=collegeName;
        this.collegeId=collegeId;
        this.studentId=studentId;
    }
    public void displayCollege(){
        System.out.println(collegeName);
        System.out.println(collegeId.id);
        System.out.println(studentId.id);
    }
}
