package com.xworkz.foreach.external;

import com.xworkz.foreach.dto.MoviesDto;

import java.util.ArrayList;
import java.util.List;

public class MoviesRunner {
    public static void main(String[] args) {
        List<MoviesDto> list= new ArrayList<>();
        MoviesDto moviesDto =new MoviesDto("Max",1000,1500,200,12,"RajajiNagar",'A',true,563544,200);
        MoviesDto moviesDto1  = new MoviesDto("Max",1000,1500,200,12,"RajajiNagar",'A',true,563544,200);
        MoviesDto moviesDto2  = new MoviesDto("PVR",900,1800,250,10,"Malleshwaram",'B',true,560003,180);
        MoviesDto moviesDto3  = new MoviesDto("INOX",850,1700,220,11,"Koramangala",'A',false,560095,190);
        MoviesDto moviesDto4  = new MoviesDto("Cinepolis",950,1600,300,14,"Whitefield",'C',true,560066,175);
        MoviesDto moviesDto5  = new MoviesDto("RockCinema",700,1400,180,8,"Hebbal",'B',true,560024,160);

        MoviesDto moviesDto6  = new MoviesDto("Galaxy",1000,2000,350,15,"Indiranagar",'A',false,560038,210);
        MoviesDto moviesDto7  = new MoviesDto("StarMovies",750,1300,170,9,"Yelahanka",'D',true,560063,150);
        MoviesDto moviesDto8  = new MoviesDto("Urvashi",600,1200,160,7,"Shivajinagar",'C',true,560051,145);
        MoviesDto moviesDto9  = new MoviesDto("Navarang",650,1100,140,6,"Rajajinagar",'B',false,560010,130);
        MoviesDto moviesDto10 = new MoviesDto("Lakshmi",800,1550,210,10,"Basavanagudi",'A',true,560004,185);

        MoviesDto moviesDto11 = new MoviesDto("OrionCine",900,1900,280,12,"RajajiNagar",'A',true,560055,195);
        MoviesDto moviesDto12 = new MoviesDto("VRMallCine",950,1850,260,11,"KR Puram",'C',false,560036,170);
        MoviesDto moviesDto13 = new MoviesDto("CineMax",700,1300,150,8,"BTM Layout",'B',true,560076,135);
        MoviesDto moviesDto14 = new MoviesDto("FunCinema",850,1650,240,9,"Hosur Road",'A',true,560068,188);
        MoviesDto moviesDto15 = new MoviesDto("GoldCine",1200,2200,350,15,"MG Road",'A',true,560001,220);

        MoviesDto moviesDto16 = new MoviesDto("ClassicCine",650,1250,160,8,"Jayanagar",'C',false,560011,140);
        MoviesDto moviesDto17 = new MoviesDto("PrimeCine",900,1750,230,10,"Banashankari",'B',true,560070,165);
        MoviesDto moviesDto18 = new MoviesDto("UltraMovies",1000,2100,400,16,"Electronic City",'A',true,560100,230);
        MoviesDto moviesDto19 = new MoviesDto("BigScreen",750,1350,180,7,"Nagarabhavi",'C',true,560072,150);
        MoviesDto moviesDto20 = new MoviesDto("TheaterX",850,1600,210,9,"Kengeri",'B',false,560060,170);

        MoviesDto moviesDto21 = new MoviesDto("CinemaWorld",700,1450,170,8,"HBR Layout",'D',true,560043,142);
        MoviesDto moviesDto22 = new MoviesDto("DreamMovies",900,1800,260,12,"RT Nagar",'A',true,560032,178);
        MoviesDto moviesDto23 = new MoviesDto("MegaMovies",950,1750,240,10,"Kumaraswamy Layout",'B',false,560078,160);
        MoviesDto moviesDto24 = new MoviesDto("PhoenixCine",1000,2200,380,15,"Mahadevapura",'A',true,560048,215);
        MoviesDto moviesDto25 = new MoviesDto("VistaCine",800,1500,190,8,"Kadubeesanahalli",'C',true,560103,155);

        MoviesDto moviesDto26 = new MoviesDto("LuxCine",700,1300,160,7,"JP Nagar",'B',false,560078,140);
        MoviesDto moviesDto27 = new MoviesDto("RoyalCine",850,1700,220,10,"Banerghatta Road",'A',true,560076,185);
        MoviesDto moviesDto28 = new MoviesDto("FocusCine",600,1100,140,6,"Peenya",'D',true,560058,130);
        MoviesDto moviesDto29 = new MoviesDto("ZenMovies",950,1850,260,11,"Hennur",'C',false,560077,165);
        MoviesDto moviesDto30 = new MoviesDto("SkyCinema",1000,2100,340,14,"Devanahalli",'A',true,562110,205);

        list.add(moviesDto);
        list.add(moviesDto1);
        list.add(moviesDto2);
        list.add(moviesDto3);
        list.add(moviesDto4);
        list.add(moviesDto5);

        list.add(moviesDto6);
        list.add(moviesDto7);
        list.add(moviesDto8);
        list.add(moviesDto9);
        list.add(moviesDto10);

        list.add(moviesDto11);
        list.add(moviesDto12);
        list.add(moviesDto13);
        list.add(moviesDto14);
        list.add(moviesDto15);

        list.add(moviesDto16);
        list.add(moviesDto17);
        list.add(moviesDto18);
        list.add(moviesDto19);
        list.add(moviesDto20);

        list.add(moviesDto21);
        list.add(moviesDto22);
        list.add(moviesDto23);
        list.add(moviesDto24);
        list.add(moviesDto25);

        list.add(moviesDto26);
        list.add(moviesDto27);
        list.add(moviesDto28);
        list.add(moviesDto29);
        list.add(moviesDto30);
        for (MoviesDto name: list){
            System.out.println(name);
        }
        list.forEach(n-> System.out.println(n));
    }
}
