package com.cajang.myserver.swamitra;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;


@Service
public class SwamitraServiceImplement implements SwamitraService{


    @Override
    public List<Swamitra> getAllSwamitra() {
        Swamitra costumer1 = new Swamitra();
        costumer1.setId(2L);
        costumer1.setName("Naura");

        Swamitra costumer2 = new Swamitra(1L, "David");

        List<Swamitra> listswamitra = new ArrayList<>();
        listswamitra.add(costumer1);
        listswamitra.add(costumer2);

        return listswamitra;
    }


    
    
}
