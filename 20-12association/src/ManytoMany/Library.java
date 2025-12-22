package ManytoMany;

public class Library {
    String collegeName;
    CollegeId collegeId;
    StudentId studentId;
    public Library(String collegeName,CollegeId collegeId,StudentId studentId){
        this.collegeName=collegeName;
        this.collegeId=collegeId;
        this.studentId=studentId;
    }
    public void displayLibrary(){
        System.out.println(collegeName);
        System.out.println(collegeId.id);
        System.out.println(studentId.id);
    }
}
