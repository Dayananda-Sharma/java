class Student{
 public Student(){
   this(18);
  }
  public Student(int studentId){
   this(18,"Raj");
   }
  public Student(int studentId,String studentName){
   this(18,"Raj",77760988);
   }
  public Student(int studentId,String studentName,long phoneNumber){
   this(18,"Raj",77900977,"Devanahalli");
   }
  public Student(int studentId,String studentName,long phoneNumber,String areaName){
   System.out.println(studentId);
   System.out.println(studentName);
   System.out.println(phoneNumber);
   System.out.println(areaName);
   }
 }  