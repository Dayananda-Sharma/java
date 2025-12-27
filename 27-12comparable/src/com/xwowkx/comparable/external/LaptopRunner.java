package com.xwowkx.comparable.external;

import com.xwowkx.comparable.dto.LoptopDto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LaptopRunner {
    public static void main(String[] args) {
        LoptopDto loptopDto=new LoptopDto("HP",101,5667787.0);
        LoptopDto loptopDto1=new LoptopDto("HP",101,5667787.0);
        LoptopDto loptopDto2=new LoptopDto("HP",101,5667787.0);
        LoptopDto loptopDto3=new LoptopDto("HP",101,5667787.0);

        List<LoptopDto>list=new ArrayList<>();
        list.add(loptopDto1);
        list.add(loptopDto);
        list.add(loptopDto2);
        list.add(loptopDto3);

        Collections.sort(list);
        list.forEach(n-> System.out.println(n));

    }
}
