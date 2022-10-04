package com.cajang.myserver.swamitra;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/v1/swamitra")
public class SwamitraController {
    // CRUD SWAMITRA
    SwamitraServiceImplement swamitraServiceImplement;
    
    @Autowired
    public SwamitraController(SwamitraServiceImplement swamitraServiceImplement) {
        this.swamitraServiceImplement = swamitraServiceImplement;
    }

    @GetMapping()
    public List<Swamitra> getAllSwamitra(){
        return swamitraServiceImplement.getAllSwamitra();
    }
}
