class RegDataRunner{

  public static void main (String [] args){
  
  RegData regData = new RegData();
  StudentData studentData =new StudentData(11,"daya");
  StudentData studentData1 = new StudentData(12,"kiran");
  StudentData studentData2 = new StudentData(13,"meghu");
  
  StudentData [] Student={studentData,studentData1,studentData2};
  regData.regDetalies(Student);
  }
} 