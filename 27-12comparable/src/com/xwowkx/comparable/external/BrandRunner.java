package com.xwowkx.comparable.external;

import com.xwowkx.comparable.dto.BrandDto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BrandRunner {
    public static void main(String[] args) {
        BrandDto brandDto=new BrandDto("hp",10000000,1200.0);
        BrandDto brandDto1=new BrandDto("hp",10000000,1200.0);
        BrandDto brandDto2=new BrandDto("hp",10000000,1200.0);

        List<BrandDto>list=new ArrayList<>();
        list.add(brandDto);
        list.add(brandDto1);
        list.add(brandDto2);

        Collections.sort(list);
        list.forEach(n-> System.out.println(n));
    }
}
