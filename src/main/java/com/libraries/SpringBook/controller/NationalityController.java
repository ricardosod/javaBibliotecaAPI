package com.libraries.SpringBook.controller;


import com.libraries.SpringBook.dto.NationalityRequestCreate;
import com.libraries.SpringBook.dto.NationalityRequestUpDate;
import com.libraries.SpringBook.dto.NationalityResponse;
import com.libraries.SpringBook.entities.Authors;
import com.libraries.SpringBook.entities.Nationality;
import com.libraries.SpringBook.service.NationalityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/nationality")
public class NationalityController {

    @Autowired
    private NationalityService nationalityService;


    @GetMapping
    public List<Nationality> findAll(){
        List<Nationality> nationalities = nationalityService.findAll();
        return nationalities;

    }

    @PostMapping
    public ResponseEntity<NationalityResponse> insert(@Validated @RequestBody NationalityRequestCreate nationalityRequestCreate){
        var nationalResponse = nationalityService.saveNationality(nationalityRequestCreate);
        return new ResponseEntity<>(nationalResponse, HttpStatus.CREATED);

    }

    @PutMapping(value = "/{id}")
    public ResponseEntity<NationalityResponse> upDateNationality(@PathVariable Long id, @RequestBody NationalityRequestUpDate nationalityRequestUpDate){
        var nationalResponse = nationalityService.upDateNationality(id, nationalityRequestUpDate);
        return ResponseEntity.ok(nationalResponse);



    }


    @GetMapping(value = "/{id}")
    public ResponseEntity<NationalityResponse> findById(@PathVariable Long id){
        var national = nationalityService.findById(id);
        return ResponseEntity.ok(national);

    }

    @DeleteMapping("/{id}")
    public ResponseEntity<NationalityResponse> delete(@PathVariable Long id) {
       nationalityService.deleteNationality(id);

        return ResponseEntity.noContent().build();
    }

}
