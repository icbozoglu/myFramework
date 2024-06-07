package com.example.demo.api;

import com.example.demo.dto.impl.PersonelDto;
import com.example.demo.service.impl.PersonelService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/personel")
public class PersonelController {

    private PersonelService personelService;

    public PersonelController(PersonelService personelService) {
        this.personelService = personelService;
    }

    @GetMapping
    public List<PersonelDto> getAll(){
        return personelService.getAll();
    }

}
