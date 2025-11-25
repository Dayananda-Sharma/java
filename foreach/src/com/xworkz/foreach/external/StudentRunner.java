package com.xworkz.foreach.external;

import com.xworkz.foreach.dto.StudentDto;

import java.util.ArrayList;
import java.util.List;

public class StudentRunner {
    public static void main(String[] args) {
        List<StudentDto> list=new ArrayList<>();
        StudentDto studentDto=new StudentDto("Kiran",1,776655889,12,'A',30000,true,"Chitradurga",35,1000.0);
        StudentDto studentDto1  = new StudentDto("Kiran",1,776655889L,12,'A',30000,true,"Chitradurga",35,1000.0);
        StudentDto studentDto2  = new StudentDto("Arun",2,9876543210L,10,'B',28000,true,"Bangalore",16,950.5);
        StudentDto studentDto3  = new StudentDto("Meena",3,9123456789L,9,'A',25000,false,"Mysore",15,870.0);
        StudentDto studentDto4  = new StudentDto("Ravi",4,9012345678L,11,'C',32000,true,"Hubli",17,910.0);
        StudentDto studentDto5  = new StudentDto("Anita",5,9345678123L,8,'A',22000,true,"Davanagere",14,860.2);

        StudentDto studentDto6  = new StudentDto("Suresh",6,9988776655L,7,'D',21000,false,"Shivamogga",13,780.0);
        StudentDto studentDto7  = new StudentDto("Divya",7,9876501234L,12,'B',30500,true,"Mandya",18,990.5);
        StudentDto studentDto8  = new StudentDto("Harish",8,9033445566L,10,'A',27500,true,"Tumkur",16,940.0);
        StudentDto studentDto9  = new StudentDto("Pushpa",9,7896541230L,9,'C',23000,true,"Gadag",15,880.0);
        StudentDto studentDto10 = new StudentDto("Lokesh",10,9123409876L,11,'A',31000,false,"Bidar",17,920.0);

        StudentDto studentDto11 = new StudentDto("Pooja",11,9988221133L,8,'B',24000,true,"Udupi",14,890.0);
        StudentDto studentDto12 = new StudentDto("Gaurav",12,9776655443L,7,'A',20000,true,"Mangalore",13,750.0);
        StudentDto studentDto13 = new StudentDto("Sahana",13,9345217890L,12,'D',33000,true,"Hassan",18,970.0);
        StudentDto studentDto14 = new StudentDto("Vikram",14,9012765432L,10,'C',26000,false,"Bellary",16,860.5);
        StudentDto studentDto15 = new StudentDto("Neha",15,9556677889L,9,'B',24500,true,"Bijapur",15,840.0);

        StudentDto studentDto16 = new StudentDto("Manoj",16,9090919191L,11,'A',29500,true,"Raichur",17,915.0);
        StudentDto studentDto17 = new StudentDto("Kavya",17,9321654987L,12,'A',32500,true,"Koppal",18,995.0);
        StudentDto studentDto18 = new StudentDto("Tarun",18,9201345687L,10,'B',27500,false,"Karwar",16,855.0);
        StudentDto studentDto19 = new StudentDto("Shruthi",19,9812345089L,8,'C',21500,true,"Chikkamagaluru",14,830.0);
        StudentDto studentDto20 = new StudentDto("Deepak",20,9955322100L,9,'A',23000,true,"Ramanagara",15,845.0);

        StudentDto studentDto21 = new StudentDto("Namratha",21,9877001122L,7,'D',20500,true,"Bengaluru Rural",13,760.0);
        StudentDto studentDto22 = new StudentDto("Rohan",22,9044221133L,12,'B',31000,true,"Haveri",18,980.0);
        StudentDto studentDto23 = new StudentDto("Sunita",23,9344588990L,10,'A',27000,false,"Bagalkot",16,865.0);
        StudentDto studentDto24 = new StudentDto("Mahesh",24,9986612345L,11,'C',29000,true,"Kodagu",17,905.0);
        StudentDto studentDto25 = new StudentDto("Shweta",25,9332211445L,8,'B',24000,true,"Chamarajanagar",14,875.0);

        StudentDto studentDto26 = new StudentDto("Naveen",26,9765432180L,9,'D',22000,false,"Yadgir",15,810.0);
        StudentDto studentDto27 = new StudentDto("Aishwarya",27,9887766554L,10,'A',26500,true,"Kolar",16,930.0);
        StudentDto studentDto28 = new StudentDto("Praveen",28,9009988776L,12,'C',33000,true,"Belagavi",18,990.0);
        StudentDto studentDto29 = new StudentDto("Geetha",29,9098765432L,11,'B',28500,true,"Kalaburagi",17,915.0);
        StudentDto studentDto30 = new StudentDto("Ajay",30,9123456780L,7,'A',21000,true,"Mysuru",13,780.5);

        list.add(studentDto);
        list.add(studentDto1);
        list.add(studentDto2);
        list.add(studentDto3);
        list.add(studentDto4);
        list.add(studentDto5);

        list.add(studentDto6);
        list.add(studentDto7);
        list.add(studentDto8);
        list.add(studentDto9);
        list.add(studentDto10);

        list.add(studentDto11);
        list.add(studentDto12);
        list.add(studentDto13);
        list.add(studentDto14);
        list.add(studentDto15);

        list.add(studentDto16);
        list.add(studentDto17);
        list.add(studentDto18);
        list.add(studentDto19);
        list.add(studentDto20);

        list.add(studentDto21);
        list.add(studentDto22);
        list.add(studentDto23);
        list.add(studentDto24);
        list.add(studentDto25);

        list.add(studentDto26);
        list.add(studentDto27);
        list.add(studentDto28);
        list.add(studentDto29);
        list.add(studentDto30);
      for (StudentDto name: list){
          System.out.println(name);
      }
      list.forEach(n-> System.out.println(n));
    }
}
