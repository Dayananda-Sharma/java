package ManytoMany;

public class InstituteRunner {
    public static void main(String[] args) {
        CollegeId collegeId=new CollegeId(101);
        StudentId studentId=new StudentId(1);
        Library library=new Library("IIT",collegeId,studentId);
        College college=new College("IIT",collegeId,studentId);
        college.displayCollege();
        library.displayLibrary();
    }
}
